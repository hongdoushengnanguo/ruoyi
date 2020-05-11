package com.ruoyi.web.controller.system;

import java.util.List;

import com.ruoyi.framework.util.ShiroUtils;
import com.ruoyi.system.domain.StudentNews;
import com.ruoyi.system.domain.SysUser;
import com.ruoyi.system.service.IStudentNewsService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
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
import com.ruoyi.system.domain.Jiangxuejin;
import com.ruoyi.system.service.IJiangxuejinService;
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
@RequestMapping("/system/jiangxuejin")
public class JiangxuejinController extends BaseController
{
    private String prefix = "system/jiangxuejin";

    @Autowired
    private IJiangxuejinService jiangxuejinService;
    @Autowired
    private IStudentNewsService studentNewsService;

    @RequiresPermissions("system:jiangxuejin:view")
    @GetMapping()
    public String jiangxuejin()
    {
        return prefix + "/jiangxuejin";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("system:jiangxuejin:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Jiangxuejin jiangxuejin)
    {
        SysUser sysUser = ShiroUtils.getSysUser();
        System.out.println(sysUser+"____________________________________________________________________________________");
        if(sysUser.getUserId()==2){
            startPage();
            jiangxuejin.setName(sysUser.getUserName());
            List<Jiangxuejin> list = jiangxuejinService.selectJiangxuejinList(jiangxuejin);
            return getDataTable(list);

        }else {
            startPage();
            List<Jiangxuejin> list = jiangxuejinService.selectJiangxuejinList(jiangxuejin);
            return getDataTable(list);
        }
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("system:jiangxuejin:export")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Jiangxuejin jiangxuejin)
    {
        List<Jiangxuejin> list = jiangxuejinService.selectJiangxuejinList(jiangxuejin);
        ExcelUtil<Jiangxuejin> util = new ExcelUtil<Jiangxuejin>(Jiangxuejin.class);
        return util.exportExcel(list, "jiangxuejin");
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
    @RequiresPermissions("system:jiangxuejin:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Jiangxuejin jiangxuejin)
    {
        return toAjax(jiangxuejinService.insertJiangxuejin(jiangxuejin));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap)
    {
        Jiangxuejin jiangxuejin = jiangxuejinService.selectJiangxuejinById(id);
        mmap.put("jiangxuejin", jiangxuejin);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("system:jiangxuejin:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Jiangxuejin jiangxuejin)
    {
        if (jiangxuejin.getIsWrong()==1){
            StudentNews studentNews=new StudentNews();
            studentNews.setStudentName(jiangxuejin.getName());
            studentNews.setId( studentNewsService.selectStudentNewsList(studentNews).get(0).getId());
            studentNews.setIsWrong(jiangxuejin.getIsWrong());
            studentNewsService.updateStudentNews(studentNews);
        }
        return toAjax(jiangxuejinService.updateJiangxuejin(jiangxuejin));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("system:jiangxuejin:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        StudentNews studentNews=new StudentNews();
        studentNews.setStudentName(jiangxuejinService.selectJiangxuejinById(ids).getName());
        if (studentNewsService.selectStudentNewsList(studentNews).size()==0){
            return toAjax(jiangxuejinService.deleteJiangxuejinByIds(ids));
        }else {
            return toAjax(false);
        }
    }
}
