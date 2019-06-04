package com.warren.pojo;

import java.util.Date;
import java.util.List;

public class category {
    /**
     * 类目ID
     * 表字段 : w_category.id
     */
    private Integer id;

    /**
     * 父类目ID=0时，代表的是一级的类目
     * 表字段 : w_category.pid
     */
    private Integer pid;

    /**
     * 类目名称
     * 表字段 : w_category.name
     */
    private String name;

    /**
     * 
     * 表字段 : w_category.english
     */
    private String english;

    /**
     * 
     * 表字段 : w_category.pic
     */
    private String pic;

    /**
     * 排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数
     * 表字段 : w_category.sort
     */
    private Integer sort;

    /**
     * 该类目是否为父类目，1为true，0为false
     * 表字段 : w_category.is_parent
     */
    private Integer isParent;

    /**
     * 创建时间
     * 表字段 : w_category.created
     */
    private Date created;

    /**
     * 更新时间
     * 表字段 : w_category.updated
     */
    private Date updated;

    /**
     * 状态:0(启用),1(禁用),-1(删除)
     * 表字段 : w_category.status
     */
    private Integer status;

    private List<goods> goodss;

    /**
     * 获取 类目ID 字段:w_category.id
     *
     * @return w_category.id, 类目ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置 类目ID 字段:w_category.id
     *
     * @param id the value for w_category.id, 类目ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 父类目ID=0时，代表的是一级的类目 字段:w_category.pid
     *
     * @return w_category.pid, 父类目ID=0时，代表的是一级的类目
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * 设置 父类目ID=0时，代表的是一级的类目 字段:w_category.pid
     *
     * @param pid the value for w_category.pid, 父类目ID=0时，代表的是一级的类目
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * 获取 类目名称 字段:w_category.name
     *
     * @return w_category.name, 类目名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置 类目名称 字段:w_category.name
     *
     * @param name the value for w_category.name, 类目名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取  字段:w_category.english
     *
     * @return w_category.english, 
     */
    public String getEnglish() {
        return english;
    }

    /**
     * 设置  字段:w_category.english
     *
     * @param english the value for w_category.english, 
     */
    public void setEnglish(String english) {
        this.english = english == null ? null : english.trim();
    }

    /**
     * 获取  字段:w_category.pic
     *
     * @return w_category.pic, 
     */
    public String getPic() {
        return pic;
    }

    /**
     * 设置  字段:w_category.pic
     *
     * @param pic the value for w_category.pic, 
     */
    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    /**
     * 获取 排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数 字段:w_category.sort
     *
     * @return w_category.sort, 排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置 排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数 字段:w_category.sort
     *
     * @param sort the value for w_category.sort, 排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取 该类目是否为父类目，1为true，0为false 字段:w_category.is_parent
     *
     * @return w_category.is_parent, 该类目是否为父类目，1为true，0为false
     */
    public Integer getIsParent() {
        return isParent;
    }

    /**
     * 设置 该类目是否为父类目，1为true，0为false 字段:w_category.is_parent
     *
     * @param isParent the value for w_category.is_parent, 该类目是否为父类目，1为true，0为false
     */
    public void setIsParent(Integer isParent) {
        this.isParent = isParent;
    }

    /**
     * 获取 创建时间 字段:w_category.created
     *
     * @return w_category.created, 创建时间
     */
    public Date getCreated() {
        return created;
    }

    /**
     * 设置 创建时间 字段:w_category.created
     *
     * @param created the value for w_category.created, 创建时间
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * 获取 更新时间 字段:w_category.updated
     *
     * @return w_category.updated, 更新时间
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * 设置 更新时间 字段:w_category.updated
     *
     * @param updated the value for w_category.updated, 更新时间
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    /**
     * 获取 状态:0(启用),1(禁用),-1(删除) 字段:w_category.status
     *
     * @return w_category.status, 状态:0(启用),1(禁用),-1(删除)
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置 状态:0(启用),1(禁用),-1(删除) 字段:w_category.status
     *
     * @param status the value for w_category.status, 状态:0(启用),1(禁用),-1(删除)
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<goods> getgoodss() {
        return goodss;
    }

    public void setgoodss(List<goods> goodss) {
        this.goodss=goodss;
    }
}