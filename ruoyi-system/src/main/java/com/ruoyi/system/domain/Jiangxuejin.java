package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 jiangxuejin
 * 
 * @author ruoyi
 * @date 2020-05-10
 */
public class Jiangxuejin extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private String id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String name;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String className;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String col;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long isWrong;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String jiangxuejinDengji;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setClassName(String className)
    {
        this.className = className;
    }

    public String getClassName()
    {
        return className;
    }
    public void setCol(String col) 
    {
        this.col = col;
    }

    public String getCol() 
    {
        return col;
    }
    public void setIsWrong(Long isWrong) 
    {
        this.isWrong = isWrong;
    }

    public Long getIsWrong() 
    {
        return isWrong;
    }
    public void setJiangxuejinDengji(String jiangxuejinDengji) 
    {
        this.jiangxuejinDengji = jiangxuejinDengji;
    }

    public String getJiangxuejinDengji() 
    {
        return jiangxuejinDengji;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("class", getClass())
            .append("col", getCol())
            .append("isWrong", getIsWrong())
            .append("jiangxuejinDengji", getJiangxuejinDengji())
            .toString();
    }
}
