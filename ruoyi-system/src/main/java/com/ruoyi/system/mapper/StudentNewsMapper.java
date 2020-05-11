package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.StudentNews;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2020-05-10
 */
public interface StudentNewsMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public StudentNews selectStudentNewsById(String id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param studentNews 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<StudentNews> selectStudentNewsList(StudentNews studentNews);

    /**
     * 新增【请填写功能名称】
     * 
     * @param studentNews 【请填写功能名称】
     * @return 结果
     */
    public int insertStudentNews(StudentNews studentNews);

    /**
     * 修改【请填写功能名称】
     * 
     * @param studentNews 【请填写功能名称】
     * @return 结果
     */
    public int updateStudentNews(StudentNews studentNews);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteStudentNewsById(String id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteStudentNewsByIds(String[] ids);
}
