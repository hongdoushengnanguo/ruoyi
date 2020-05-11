package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Jiangxuejin;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2020-05-10
 */
public interface JiangxuejinMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public Jiangxuejin selectJiangxuejinById(String id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param jiangxuejin 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Jiangxuejin> selectJiangxuejinList(Jiangxuejin jiangxuejin);

    /**
     * 新增【请填写功能名称】
     * 
     * @param jiangxuejin 【请填写功能名称】
     * @return 结果
     */
    public int insertJiangxuejin(Jiangxuejin jiangxuejin);

    /**
     * 修改【请填写功能名称】
     * 
     * @param jiangxuejin 【请填写功能名称】
     * @return 结果
     */
    public int updateJiangxuejin(Jiangxuejin jiangxuejin);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteJiangxuejinById(String id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteJiangxuejinByIds(String[] ids);
}
