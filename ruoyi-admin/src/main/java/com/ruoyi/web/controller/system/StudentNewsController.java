package com.ruoyi.web.controller.system;

import java.util.List;
import java.util.UUID;

import com.ruoyi.framework.util.ShiroUtils;
import com.ruoyi.system.domain.Jiangxuejin;
import com.ruoyi.system.domain.StudentNews;
import com.ruoyi.system.domain.SysUser;
import com.ruoyi.system.service.IJiangxuejinService;
import com.ruoyi.system.service.IStudentNewsService;
import com.ruoyi.web.controller.Until.DengJiUntil;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2020-05-10
 */
@Controller
@RequestMapping("/system/news")
public class StudentNewsController extends BaseController
{
    private String prefix = "system/news";

    @Autowired
    private IStudentNewsService studentNewsService;
    @Autowired
    private IJiangxuejinService jiangxuejinService;

    @RequiresPermissions("system:news:view")
    @GetMapping()
    public String news()
    {
        return prefix + "/news";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("system:news:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(StudentNews studentNews)
    {
        startPage();
        SysUser sysUser = ShiroUtils.getSysUser();

        if(sysUser.isAdmin()){
            List<StudentNews> list = studentNewsService.selectStudentNewsList(studentNews);
            return getDataTable(list);
        }else {
         studentNews.setStudentName(sysUser.getUserName());
            List<StudentNews> list = studentNewsService.selectStudentNewsList(studentNews);
            return getDataTable(list);
        }
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("system:news:export")
    @Log(title = "综合评价情况", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(StudentNews studentNews)
    {
        List<StudentNews> list = studentNewsService.selectStudentNewsList(studentNews);
        ExcelUtil<StudentNews> util = new ExcelUtil<StudentNews>(StudentNews.class);
        return util.exportExcel(list, "news");
    }

    /**
     * 新增【请填写功能名称】
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存【请填写功能名称】
     */
    @RequiresPermissions("system:news:add")
    @Log(title = "保存综合评价", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(StudentNews studentNews)
    {
        System.out.println(studentNews+"____________________________________________________________________________________");
        studentNews.setId(UUID.randomUUID().toString().replace("-", "").toLowerCase());
        studentNews.setDeyuNumber((studentNews.getDeyuChengxinNumber()+(studentNews.getDeyuChengxinAdd()+studentNews.getDeyuChengxinSub()))/2+(studentNews.getDeyuSizhengNumber()+(studentNews.getDeyuSizhengAdd()+studentNews.getDeyuSizhengSub()))/2);
        studentNews.setDeyuDengji(DengJiUntil.numberChangeString(studentNews.getDeyuNumber()));
        studentNews.setZhiyuNumber((studentNews.getZhiyuJibenjinengNumber()+(studentNews.getZhiyuJibenjinengAdd()+studentNews.getZhiyuJibenjinengSub()))/2+(studentNews.getZhiyuKejichuangxinNumber()+(studentNews.getZhiyuKejichuangxinAdd()+studentNews.getZhiyuKejichuangxinSub()))/2);
        studentNews.setTuyuNumber(studentNews.getTiyuKewaiAdd()+studentNews.getTiyuZaocaoAdd()+studentNews.getTiyuZaocaoSub()+studentNews.getTuyuKewaiSub());
        studentNews.setZongNumber(studentNews.getDeyuNumber()/3+studentNews.getZhiyuNumber()/3+studentNews.getTuyuNumber()/3);
        int a=studentNewsService.insertStudentNews(studentNews);
        jiangxuejin(1);
        return toAjax(a);
    }
    public  void jiangxuejin(int c){
        StudentNews studentNews=new StudentNews();
        List<StudentNews> list =studentNewsService.selectStudentNewsList(studentNews);
        System.out.println(list.size()+"++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        for(int a=0;a<list.size();a++){
            if(a<5){
                list.get(a).setJiangxuejinDengji("一等奖学金");
                studentNewsService.updateStudentNews(list.get(a));
                jiangxuejin(list,a,c);
            }else if (5<=a&&a<10){
                list.get(a).setJiangxuejinDengji("二等奖学金");
                studentNewsService.updateStudentNews(list.get(a));
                jiangxuejin(list,a,c);
            }else if (10<=a&&a<20){
                list.get(a).setJiangxuejinDengji("三等奖学金");
                studentNewsService.updateStudentNews(list.get(a));
                jiangxuejin(list,a,c);
            }else{
                Jiangxuejin jiangxuejin=new Jiangxuejin();
                jiangxuejin.setName(list.get(a).getStudentName());
                List<Jiangxuejin> list1= jiangxuejinService.selectJiangxuejinList(jiangxuejin);
                if(list1.size()>0){
                    jiangxuejinService.deleteJiangxuejinById(list1.get(0).getId());
                }
                if ( list.get(a).getJiangxuejinDengji()==null|| list.get(a).getJiangxuejinDengji()==""){
                    return;
                }
                list.get(a).setJiangxuejinDengji("");
                studentNewsService.updateStudentNews(list.get(a));

            }

        }
    }
 public void  jiangxuejin( List<StudentNews> list,Integer a ,Integer c){
        if(c==1) {
            Jiangxuejin jiangxuejin = new Jiangxuejin();
            jiangxuejin.setId(UUID.randomUUID().toString().replace("-", "").toLowerCase());
            jiangxuejin.setClassName(list.get(a).getStudentClass());
            jiangxuejin.setCol(list.get(a).getStudentNumber());
            jiangxuejin.setName(list.get(a).getStudentName());
            jiangxuejin.setJiangxuejinDengji(list.get(a).getJiangxuejinDengji());
            jiangxuejin.setIsWrong(list.get(a).getIsWrong());
            jiangxuejinService.insertJiangxuejin(jiangxuejin);
        }
 }




    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap)
    {
        StudentNews studentNews = studentNewsService.selectStudentNewsById(id);
        mmap.put("studentNews", studentNews);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("system:news:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(StudentNews studentNews)
    {
        studentNews.setDeyuNumber((studentNews.getDeyuChengxinNumber()+(studentNews.getDeyuChengxinAdd()+studentNews.getDeyuChengxinSub()))/2+(studentNews.getDeyuSizhengNumber()+(studentNews.getDeyuSizhengAdd()+studentNews.getDeyuSizhengSub()))/2);
        studentNews.setDeyuDengji(DengJiUntil.numberChangeString(studentNews.getDeyuNumber()));
        studentNews.setZhiyuNumber((studentNews.getZhiyuJibenjinengNumber()+(studentNews.getZhiyuJibenjinengAdd()+studentNews.getZhiyuJibenjinengSub()))/2+(studentNews.getZhiyuKejichuangxinNumber()+(studentNews.getZhiyuKejichuangxinAdd()+studentNews.getZhiyuKejichuangxinSub()))/2);
        studentNews.setTuyuNumber(studentNews.getTiyuKewaiAdd()+studentNews.getTiyuZaocaoAdd()+studentNews.getTiyuZaocaoSub()+studentNews.getTuyuKewaiSub());
        studentNews.setZongNumber(studentNews.getDeyuNumber()/3+studentNews.getZhiyuNumber()/3+studentNews.getTuyuNumber()/3);
       int a=studentNewsService.updateStudentNews(studentNews);
        jiangxuejin(2 );
        return toAjax(a);
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("system:news:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(studentNewsService.deleteStudentNewsByIds(ids));
    }
}
