package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.StudentNewsMapper;
import com.ruoyi.system.domain.StudentNews;
import com.ruoyi.system.service.IStudentNewsService;
import com.ruoyi.common.core.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-05-10
 */
@Service
public class StudentNewsServiceImpl implements IStudentNewsService 
{
    @Autowired
    private StudentNewsMapper studentNewsMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public StudentNews selectStudentNewsById(String id)
    {
        return studentNewsMapper.selectStudentNewsById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param studentNews 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<StudentNews> selectStudentNewsList(StudentNews studentNews)
    {
        return studentNewsMapper.selectStudentNewsList(studentNews);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param studentNews 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertStudentNews(StudentNews studentNews)
    {
        return studentNewsMapper.insertStudentNews(studentNews);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param studentNews 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateStudentNews(StudentNews studentNews)
    {
        return studentNewsMapper.updateStudentNews(studentNews);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteStudentNewsByIds(String ids)
    {
        return studentNewsMapper.deleteStudentNewsByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteStudentNewsById(String id)
    {
        return studentNewsMapper.deleteStudentNewsById(id);
    }
}
