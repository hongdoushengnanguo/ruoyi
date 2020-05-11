package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.JiangxuejinMapper;
import com.ruoyi.system.domain.Jiangxuejin;
import com.ruoyi.system.service.IJiangxuejinService;
import com.ruoyi.common.core.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-05-10
 */
@Service
public class JiangxuejinServiceImpl implements IJiangxuejinService 
{
    @Autowired
    private JiangxuejinMapper jiangxuejinMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public Jiangxuejin selectJiangxuejinById(String id)
    {
        return jiangxuejinMapper.selectJiangxuejinById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param jiangxuejin 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Jiangxuejin> selectJiangxuejinList(Jiangxuejin jiangxuejin)
    {
        return jiangxuejinMapper.selectJiangxuejinList(jiangxuejin);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param jiangxuejin 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertJiangxuejin(Jiangxuejin jiangxuejin)
    {
        return jiangxuejinMapper.insertJiangxuejin(jiangxuejin);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param jiangxuejin 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateJiangxuejin(Jiangxuejin jiangxuejin)
    {
        return jiangxuejinMapper.updateJiangxuejin(jiangxuejin);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteJiangxuejinByIds(String ids)
    {
        return jiangxuejinMapper.deleteJiangxuejinByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteJiangxuejinById(String id)
    {
        return jiangxuejinMapper.deleteJiangxuejinById(id);
    }
}
