package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 student_news
 * 
 * @author ruoyi
 * @date 2020-05-10
 */
public class StudentNews extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private String id;

    /** $column.columnComment */
    private String studentNumber;
    /** $column.columnComment */
    private String studentClass;
    /** $column.columnComment */
    private String studentName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long deyuSizhengAdd;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long deyuSizhengSub;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long deyuSizhengNumber;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long deyuChengxinAdd;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long deyuChengxinSub;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long deyuChengxinNumber;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long deyuNumber;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String deyuDengji;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long zhiyuJibenjinengAdd;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long zhiyuJibenjinengSub;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long zhiyuJibenjinengNumber;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long zhiyuKejichuangxinAdd;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long zhiyuKejichuangxinSub;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long zhiyuKejichuangxinNumber;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long zhiyuNumber;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long tiyuZaocaoAdd;
    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long isWrong;
    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long tiyuZaocaoSub;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long tiyuKewaiAdd;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long tuyuKewaiSub;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long tuyuNumber;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long zongNumber;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String jiangxuejinDengji;

    public StudentNews() {
    }

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setStudentNumber(String studentNumber) 
    {
        this.studentNumber = studentNumber;
    }

    public String getStudentNumber() 
    {
        return studentNumber;
    }
    public void setStudentName(String studentName) 
    {
        this.studentName = studentName;
    }

    public String getStudentName() 
    {
        return studentName;
    }
    public void setDeyuSizhengAdd(Long deyuSizhengAdd) 
    {
        this.deyuSizhengAdd = deyuSizhengAdd;
    }

    public Long getDeyuSizhengAdd() 
    {
        return deyuSizhengAdd;
    }
    public void setDeyuSizhengSub(Long deyuSizhengSub) 
    {
        this.deyuSizhengSub = deyuSizhengSub;
    }

    public Long getDeyuSizhengSub() 
    {
        return deyuSizhengSub;
    }
    public void setDeyuSizhengNumber(Long deyuSizhengNumber) 
    {
        this.deyuSizhengNumber = deyuSizhengNumber;
    }

    public Long getDeyuSizhengNumber() 
    {
        return deyuSizhengNumber;
    }
    public void setDeyuChengxinAdd(Long deyuChengxinAdd) 
    {
        this.deyuChengxinAdd = deyuChengxinAdd;
    }

    public Long getDeyuChengxinAdd() 
    {
        return deyuChengxinAdd;
    }
    public void setDeyuChengxinSub(Long deyuChengxinSub) 
    {
        this.deyuChengxinSub = deyuChengxinSub;
    }

    public Long getDeyuChengxinSub() 
    {
        return deyuChengxinSub;
    }
    public void setDeyuChengxinNumber(Long deyuChengxinNumber) 
    {
        this.deyuChengxinNumber = deyuChengxinNumber;
    }

    public Long getDeyuChengxinNumber() 
    {
        return deyuChengxinNumber;
    }
    public void setDeyuNumber(Long deyuNumber) 
    {
        this.deyuNumber = deyuNumber;
    }

    public Long getDeyuNumber()
    {
        return deyuNumber;
    }
    public void setDeyuDengji(String deyuDengji)
    {
        this.deyuDengji = deyuDengji;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public Long getIsWrong() {
        return isWrong;
    }

    public void setIsWrong(Long isWrong) {
        this.isWrong = isWrong;
    }

    public String getDeyuDengji()
    {
        return deyuDengji;
    }
    public void setZhiyuJibenjinengAdd(Long zhiyuJibenjinengAdd)
    {
        this.zhiyuJibenjinengAdd = zhiyuJibenjinengAdd;
    }

    public Long getZhiyuJibenjinengAdd() 
    {
        return zhiyuJibenjinengAdd;
    }
    public void setZhiyuJibenjinengSub(Long zhiyuJibenjinengSub) 
    {
        this.zhiyuJibenjinengSub = zhiyuJibenjinengSub;
    }

    public Long getZhiyuJibenjinengSub() 
    {
        return zhiyuJibenjinengSub;
    }
    public void setZhiyuJibenjinengNumber(Long zhiyuJibenjinengNumber) 
    {
        this.zhiyuJibenjinengNumber = zhiyuJibenjinengNumber;
    }

    public Long getZhiyuJibenjinengNumber() 
    {
        return zhiyuJibenjinengNumber;
    }
    public void setZhiyuKejichuangxinAdd(Long zhiyuKejichuangxinAdd) 
    {
        this.zhiyuKejichuangxinAdd = zhiyuKejichuangxinAdd;
    }

    public Long getZhiyuKejichuangxinAdd() 
    {
        return zhiyuKejichuangxinAdd;
    }
    public void setZhiyuKejichuangxinSub(Long zhiyuKejichuangxinSub) 
    {
        this.zhiyuKejichuangxinSub = zhiyuKejichuangxinSub;
    }

    public Long getZhiyuKejichuangxinSub() 
    {
        return zhiyuKejichuangxinSub;
    }
    public void setZhiyuKejichuangxinNumber(Long zhiyuKejichuangxinNumber) 
    {
        this.zhiyuKejichuangxinNumber = zhiyuKejichuangxinNumber;
    }

    public Long getZhiyuKejichuangxinNumber() 
    {
        return zhiyuKejichuangxinNumber;
    }
    public void setZhiyuNumber(Long zhiyuNumber) 
    {
        this.zhiyuNumber = zhiyuNumber;
    }

    public Long getZhiyuNumber() 
    {
        return zhiyuNumber;
    }
    public void setTiyuZaocaoAdd(Long tiyuZaocaoAdd) 
    {
        this.tiyuZaocaoAdd = tiyuZaocaoAdd;
    }

    public Long getTiyuZaocaoAdd() 
    {
        return tiyuZaocaoAdd;
    }
    public void setTiyuZaocaoSub(Long tiyuZaocaoSub) 
    {
        this.tiyuZaocaoSub = tiyuZaocaoSub;
    }

    public Long getTiyuZaocaoSub() 
    {
        return tiyuZaocaoSub;
    }
    public void setTiyuKewaiAdd(Long tiyuKewaiAdd) 
    {
        this.tiyuKewaiAdd = tiyuKewaiAdd;
    }

    public Long getTiyuKewaiAdd() 
    {
        return tiyuKewaiAdd;
    }
    public void setTuyuKewaiSub(Long tuyuKewaiSub) 
    {
        this.tuyuKewaiSub = tuyuKewaiSub;
    }

    public Long getTuyuKewaiSub() 
    {
        return tuyuKewaiSub;
    }
    public void setTuyuNumber(Long tuyuNumber) 
    {
        this.tuyuNumber = tuyuNumber;
    }

    public Long getTuyuNumber() 
    {
        return tuyuNumber;
    }
    public void setZongNumber(Long zongNumber) 
    {
        this.zongNumber = zongNumber;
    }

    public Long getZongNumber() 
    {
        return zongNumber;
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
            .append("studentNumber", getStudentNumber())
            .append("studentName", getStudentName())
            .append("deyuSizhengAdd", getDeyuSizhengAdd())
            .append("deyuSizhengSub", getDeyuSizhengSub())
            .append("deyuSizhengNumber", getDeyuSizhengNumber())
            .append("deyuChengxinAdd", getDeyuChengxinAdd())
            .append("deyuChengxinSub", getDeyuChengxinSub())
            .append("deyuChengxinNumber", getDeyuChengxinNumber())
            .append("deyuNumber", getDeyuNumber())
            .append("deyuDengji", getDeyuDengji())
            .append("zhiyuJibenjinengAdd", getZhiyuJibenjinengAdd())
            .append("zhiyuJibenjinengSub", getZhiyuJibenjinengSub())
            .append("zhiyuJibenjinengNumber", getZhiyuJibenjinengNumber())
            .append("zhiyuKejichuangxinAdd", getZhiyuKejichuangxinAdd())
            .append("zhiyuKejichuangxinSub", getZhiyuKejichuangxinSub())
            .append("zhiyuKejichuangxinNumber", getZhiyuKejichuangxinNumber())
            .append("zhiyuNumber", getZhiyuNumber())
            .append("tiyuZaocaoAdd", getTiyuZaocaoAdd())
            .append("tiyuZaocaoSub", getTiyuZaocaoSub())
            .append("tiyuKewaiAdd", getTiyuKewaiAdd())
            .append("tuyuKewaiSub", getTuyuKewaiSub())
            .append("tuyuNumber", getTuyuNumber())
            .append("zongNumber", getZongNumber())
            .append("jiangxuejinDengji", getJiangxuejinDengji())
            .toString();
    }
}
