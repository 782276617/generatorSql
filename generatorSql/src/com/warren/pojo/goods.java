package com.warren.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class goods {
    /**
     * id
     * 表字段 : w_goods.id
     */
    private Integer id;

    /**
     * 所属分类ID
     * 表字段 : w_goods.cId
     */
    private Long cid;

    /**
     * 商品名称
     * 表字段 : w_goods.name
     */
    private String name;

    /**
     * 产品代码
     * 表字段 : w_goods.code
     */
    private String code;

    /**
     * 产品说明
     * 表字段 : w_goods.explains
     */
    private String explains;

    /**
     * 产品颜色
     * 表字段 : w_goods.color
     */
    private String color;

    /**
     * 可选颜色代码
     * 表字段 : w_goods.colorCode
     */
    private String colorcode;

    /**
     * 产品特点
     * 表字段 : w_goods.trait
     */
    private String trait;

    /**
     * 商品规格
     * 表字段 : w_goods.specId
     */
    private Integer specid;

    /**
     * 商品图片
     * 表字段 : w_goods.pic
     */
    private String pic;

    /**
     * 商品价格
     * 表字段 : w_goods.price
     */
    private BigDecimal price;

    /**
     * 商品关键字
     * 表字段 : w_goods.gkeys
     */
    private String gkeys;

    /**
     * 商品点击数
     * 表字段 : w_goods.clickN
     */
    private Integer clickn;

    /**
     * 库存数
     * 表字段 : w_goods.stockN
     */
    private Integer stockn;

    /**
     * 商品下单数
     * 表字段 : w_goods.orderN
     */
    private Integer ordern;

    /**
     * 商品显示级别
     * 表字段 : w_goods.sort
     */
    private Integer sort;

    /**
     * 商品状态: 1-正常,2-下架,3-删除
     * 表字段 : w_goods.status
     */
    private Integer status;

    /**
     * 创建时间
     * 表字段 : w_goods.created
     */
    private Date created;

    /**
     * 更新时间
     * 表字段 : w_goods.updated
     */
    private Date updated;

    /**
     * 获取 id 字段:w_goods.id
     *
     * @return w_goods.id, id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置 id 字段:w_goods.id
     *
     * @param id the value for w_goods.id, id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 所属分类ID 字段:w_goods.cId
     *
     * @return w_goods.cId, 所属分类ID
     */
    public Long getCid() {
        return cid;
    }

    /**
     * 设置 所属分类ID 字段:w_goods.cId
     *
     * @param cid the value for w_goods.cId, 所属分类ID
     */
    public void setCid(Long cid) {
        this.cid = cid;
    }

    /**
     * 获取 商品名称 字段:w_goods.name
     *
     * @return w_goods.name, 商品名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置 商品名称 字段:w_goods.name
     *
     * @param name the value for w_goods.name, 商品名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取 产品代码 字段:w_goods.code
     *
     * @return w_goods.code, 产品代码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置 产品代码 字段:w_goods.code
     *
     * @param code the value for w_goods.code, 产品代码
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 获取 产品说明 字段:w_goods.explains
     *
     * @return w_goods.explains, 产品说明
     */
    public String getExplains() {
        return explains;
    }

    /**
     * 设置 产品说明 字段:w_goods.explains
     *
     * @param explains the value for w_goods.explains, 产品说明
     */
    public void setExplains(String explains) {
        this.explains = explains == null ? null : explains.trim();
    }

    /**
     * 获取 产品颜色 字段:w_goods.color
     *
     * @return w_goods.color, 产品颜色
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置 产品颜色 字段:w_goods.color
     *
     * @param color the value for w_goods.color, 产品颜色
     */
    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    /**
     * 获取 可选颜色代码 字段:w_goods.colorCode
     *
     * @return w_goods.colorCode, 可选颜色代码
     */
    public String getColorcode() {
        return colorcode;
    }

    /**
     * 设置 可选颜色代码 字段:w_goods.colorCode
     *
     * @param colorcode the value for w_goods.colorCode, 可选颜色代码
     */
    public void setColorcode(String colorcode) {
        this.colorcode = colorcode == null ? null : colorcode.trim();
    }

    /**
     * 获取 产品特点 字段:w_goods.trait
     *
     * @return w_goods.trait, 产品特点
     */
    public String getTrait() {
        return trait;
    }

    /**
     * 设置 产品特点 字段:w_goods.trait
     *
     * @param trait the value for w_goods.trait, 产品特点
     */
    public void setTrait(String trait) {
        this.trait = trait == null ? null : trait.trim();
    }

    /**
     * 获取 商品规格 字段:w_goods.specId
     *
     * @return w_goods.specId, 商品规格
     */
    public Integer getSpecid() {
        return specid;
    }

    /**
     * 设置 商品规格 字段:w_goods.specId
     *
     * @param specid the value for w_goods.specId, 商品规格
     */
    public void setSpecid(Integer specid) {
        this.specid = specid;
    }

    /**
     * 获取 商品图片 字段:w_goods.pic
     *
     * @return w_goods.pic, 商品图片
     */
    public String getPic() {
        return pic;
    }

    /**
     * 设置 商品图片 字段:w_goods.pic
     *
     * @param pic the value for w_goods.pic, 商品图片
     */
    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    /**
     * 获取 商品价格 字段:w_goods.price
     *
     * @return w_goods.price, 商品价格
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置 商品价格 字段:w_goods.price
     *
     * @param price the value for w_goods.price, 商品价格
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取 商品关键字 字段:w_goods.gkeys
     *
     * @return w_goods.gkeys, 商品关键字
     */
    public String getGkeys() {
        return gkeys;
    }

    /**
     * 设置 商品关键字 字段:w_goods.gkeys
     *
     * @param gkeys the value for w_goods.gkeys, 商品关键字
     */
    public void setGkeys(String gkeys) {
        this.gkeys = gkeys == null ? null : gkeys.trim();
    }

    /**
     * 获取 商品点击数 字段:w_goods.clickN
     *
     * @return w_goods.clickN, 商品点击数
     */
    public Integer getClickn() {
        return clickn;
    }

    /**
     * 设置 商品点击数 字段:w_goods.clickN
     *
     * @param clickn the value for w_goods.clickN, 商品点击数
     */
    public void setClickn(Integer clickn) {
        this.clickn = clickn;
    }

    /**
     * 获取 库存数 字段:w_goods.stockN
     *
     * @return w_goods.stockN, 库存数
     */
    public Integer getStockn() {
        return stockn;
    }

    /**
     * 设置 库存数 字段:w_goods.stockN
     *
     * @param stockn the value for w_goods.stockN, 库存数
     */
    public void setStockn(Integer stockn) {
        this.stockn = stockn;
    }

    /**
     * 获取 商品下单数 字段:w_goods.orderN
     *
     * @return w_goods.orderN, 商品下单数
     */
    public Integer getOrdern() {
        return ordern;
    }

    /**
     * 设置 商品下单数 字段:w_goods.orderN
     *
     * @param ordern the value for w_goods.orderN, 商品下单数
     */
    public void setOrdern(Integer ordern) {
        this.ordern = ordern;
    }

    /**
     * 获取 商品显示级别 字段:w_goods.sort
     *
     * @return w_goods.sort, 商品显示级别
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置 商品显示级别 字段:w_goods.sort
     *
     * @param sort the value for w_goods.sort, 商品显示级别
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取 商品状态: 1-正常,2-下架,3-删除 字段:w_goods.status
     *
     * @return w_goods.status, 商品状态: 1-正常,2-下架,3-删除
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置 商品状态: 1-正常,2-下架,3-删除 字段:w_goods.status
     *
     * @param status the value for w_goods.status, 商品状态: 1-正常,2-下架,3-删除
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取 创建时间 字段:w_goods.created
     *
     * @return w_goods.created, 创建时间
     */
    public Date getCreated() {
        return created;
    }

    /**
     * 设置 创建时间 字段:w_goods.created
     *
     * @param created the value for w_goods.created, 创建时间
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * 获取 更新时间 字段:w_goods.updated
     *
     * @return w_goods.updated, 更新时间
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * 设置 更新时间 字段:w_goods.updated
     *
     * @param updated the value for w_goods.updated, 更新时间
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}