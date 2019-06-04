package com.warren.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class goodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     *  构造查询条件,w_goods
     */
    public goodsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *  设置排序字段,w_goods
     *
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *  获取排序字段,w_goods
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *  设置过滤重复数据,w_goods
     *
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *  是否过滤重复数据,w_goods
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *  获取当前的查询条件实例,w_goods
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * ,w_goods
     *
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * ,w_goods
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *  创建一个查询条件,w_goods
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *  内部构建查询条件对象,w_goods
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *  清除查询条件,w_goods
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 商品表;
     * GeneratedCriteria
     * 数据库表：w_goods
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCidIsNull() {
            addCriterion("cId is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cId is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Long value) {
            addCriterion("cId =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Long value) {
            addCriterion("cId <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Long value) {
            addCriterion("cId >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Long value) {
            addCriterion("cId >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Long value) {
            addCriterion("cId <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Long value) {
            addCriterion("cId <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Long> values) {
            addCriterion("cId in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Long> values) {
            addCriterion("cId not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Long value1, Long value2) {
            addCriterion("cId between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Long value1, Long value2) {
            addCriterion("cId not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andExplainsIsNull() {
            addCriterion("explains is null");
            return (Criteria) this;
        }

        public Criteria andExplainsIsNotNull() {
            addCriterion("explains is not null");
            return (Criteria) this;
        }

        public Criteria andExplainsEqualTo(String value) {
            addCriterion("explains =", value, "explains");
            return (Criteria) this;
        }

        public Criteria andExplainsNotEqualTo(String value) {
            addCriterion("explains <>", value, "explains");
            return (Criteria) this;
        }

        public Criteria andExplainsGreaterThan(String value) {
            addCriterion("explains >", value, "explains");
            return (Criteria) this;
        }

        public Criteria andExplainsGreaterThanOrEqualTo(String value) {
            addCriterion("explains >=", value, "explains");
            return (Criteria) this;
        }

        public Criteria andExplainsLessThan(String value) {
            addCriterion("explains <", value, "explains");
            return (Criteria) this;
        }

        public Criteria andExplainsLessThanOrEqualTo(String value) {
            addCriterion("explains <=", value, "explains");
            return (Criteria) this;
        }

        public Criteria andExplainsLike(String value) {
            addCriterion("explains like", value, "explains");
            return (Criteria) this;
        }

        public Criteria andExplainsNotLike(String value) {
            addCriterion("explains not like", value, "explains");
            return (Criteria) this;
        }

        public Criteria andExplainsIn(List<String> values) {
            addCriterion("explains in", values, "explains");
            return (Criteria) this;
        }

        public Criteria andExplainsNotIn(List<String> values) {
            addCriterion("explains not in", values, "explains");
            return (Criteria) this;
        }

        public Criteria andExplainsBetween(String value1, String value2) {
            addCriterion("explains between", value1, value2, "explains");
            return (Criteria) this;
        }

        public Criteria andExplainsNotBetween(String value1, String value2) {
            addCriterion("explains not between", value1, value2, "explains");
            return (Criteria) this;
        }

        public Criteria andColorIsNull() {
            addCriterion("color is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("color is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("color <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("color like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("color not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("color not between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorcodeIsNull() {
            addCriterion("colorCode is null");
            return (Criteria) this;
        }

        public Criteria andColorcodeIsNotNull() {
            addCriterion("colorCode is not null");
            return (Criteria) this;
        }

        public Criteria andColorcodeEqualTo(String value) {
            addCriterion("colorCode =", value, "colorcode");
            return (Criteria) this;
        }

        public Criteria andColorcodeNotEqualTo(String value) {
            addCriterion("colorCode <>", value, "colorcode");
            return (Criteria) this;
        }

        public Criteria andColorcodeGreaterThan(String value) {
            addCriterion("colorCode >", value, "colorcode");
            return (Criteria) this;
        }

        public Criteria andColorcodeGreaterThanOrEqualTo(String value) {
            addCriterion("colorCode >=", value, "colorcode");
            return (Criteria) this;
        }

        public Criteria andColorcodeLessThan(String value) {
            addCriterion("colorCode <", value, "colorcode");
            return (Criteria) this;
        }

        public Criteria andColorcodeLessThanOrEqualTo(String value) {
            addCriterion("colorCode <=", value, "colorcode");
            return (Criteria) this;
        }

        public Criteria andColorcodeLike(String value) {
            addCriterion("colorCode like", value, "colorcode");
            return (Criteria) this;
        }

        public Criteria andColorcodeNotLike(String value) {
            addCriterion("colorCode not like", value, "colorcode");
            return (Criteria) this;
        }

        public Criteria andColorcodeIn(List<String> values) {
            addCriterion("colorCode in", values, "colorcode");
            return (Criteria) this;
        }

        public Criteria andColorcodeNotIn(List<String> values) {
            addCriterion("colorCode not in", values, "colorcode");
            return (Criteria) this;
        }

        public Criteria andColorcodeBetween(String value1, String value2) {
            addCriterion("colorCode between", value1, value2, "colorcode");
            return (Criteria) this;
        }

        public Criteria andColorcodeNotBetween(String value1, String value2) {
            addCriterion("colorCode not between", value1, value2, "colorcode");
            return (Criteria) this;
        }

        public Criteria andTraitIsNull() {
            addCriterion("trait is null");
            return (Criteria) this;
        }

        public Criteria andTraitIsNotNull() {
            addCriterion("trait is not null");
            return (Criteria) this;
        }

        public Criteria andTraitEqualTo(String value) {
            addCriterion("trait =", value, "trait");
            return (Criteria) this;
        }

        public Criteria andTraitNotEqualTo(String value) {
            addCriterion("trait <>", value, "trait");
            return (Criteria) this;
        }

        public Criteria andTraitGreaterThan(String value) {
            addCriterion("trait >", value, "trait");
            return (Criteria) this;
        }

        public Criteria andTraitGreaterThanOrEqualTo(String value) {
            addCriterion("trait >=", value, "trait");
            return (Criteria) this;
        }

        public Criteria andTraitLessThan(String value) {
            addCriterion("trait <", value, "trait");
            return (Criteria) this;
        }

        public Criteria andTraitLessThanOrEqualTo(String value) {
            addCriterion("trait <=", value, "trait");
            return (Criteria) this;
        }

        public Criteria andTraitLike(String value) {
            addCriterion("trait like", value, "trait");
            return (Criteria) this;
        }

        public Criteria andTraitNotLike(String value) {
            addCriterion("trait not like", value, "trait");
            return (Criteria) this;
        }

        public Criteria andTraitIn(List<String> values) {
            addCriterion("trait in", values, "trait");
            return (Criteria) this;
        }

        public Criteria andTraitNotIn(List<String> values) {
            addCriterion("trait not in", values, "trait");
            return (Criteria) this;
        }

        public Criteria andTraitBetween(String value1, String value2) {
            addCriterion("trait between", value1, value2, "trait");
            return (Criteria) this;
        }

        public Criteria andTraitNotBetween(String value1, String value2) {
            addCriterion("trait not between", value1, value2, "trait");
            return (Criteria) this;
        }

        public Criteria andSpecidIsNull() {
            addCriterion("specId is null");
            return (Criteria) this;
        }

        public Criteria andSpecidIsNotNull() {
            addCriterion("specId is not null");
            return (Criteria) this;
        }

        public Criteria andSpecidEqualTo(Integer value) {
            addCriterion("specId =", value, "specid");
            return (Criteria) this;
        }

        public Criteria andSpecidNotEqualTo(Integer value) {
            addCriterion("specId <>", value, "specid");
            return (Criteria) this;
        }

        public Criteria andSpecidGreaterThan(Integer value) {
            addCriterion("specId >", value, "specid");
            return (Criteria) this;
        }

        public Criteria andSpecidGreaterThanOrEqualTo(Integer value) {
            addCriterion("specId >=", value, "specid");
            return (Criteria) this;
        }

        public Criteria andSpecidLessThan(Integer value) {
            addCriterion("specId <", value, "specid");
            return (Criteria) this;
        }

        public Criteria andSpecidLessThanOrEqualTo(Integer value) {
            addCriterion("specId <=", value, "specid");
            return (Criteria) this;
        }

        public Criteria andSpecidIn(List<Integer> values) {
            addCriterion("specId in", values, "specid");
            return (Criteria) this;
        }

        public Criteria andSpecidNotIn(List<Integer> values) {
            addCriterion("specId not in", values, "specid");
            return (Criteria) this;
        }

        public Criteria andSpecidBetween(Integer value1, Integer value2) {
            addCriterion("specId between", value1, value2, "specid");
            return (Criteria) this;
        }

        public Criteria andSpecidNotBetween(Integer value1, Integer value2) {
            addCriterion("specId not between", value1, value2, "specid");
            return (Criteria) this;
        }

        public Criteria andPicIsNull() {
            addCriterion("pic is null");
            return (Criteria) this;
        }

        public Criteria andPicIsNotNull() {
            addCriterion("pic is not null");
            return (Criteria) this;
        }

        public Criteria andPicEqualTo(String value) {
            addCriterion("pic =", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotEqualTo(String value) {
            addCriterion("pic <>", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThan(String value) {
            addCriterion("pic >", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThanOrEqualTo(String value) {
            addCriterion("pic >=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThan(String value) {
            addCriterion("pic <", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThanOrEqualTo(String value) {
            addCriterion("pic <=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLike(String value) {
            addCriterion("pic like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotLike(String value) {
            addCriterion("pic not like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicIn(List<String> values) {
            addCriterion("pic in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotIn(List<String> values) {
            addCriterion("pic not in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicBetween(String value1, String value2) {
            addCriterion("pic between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotBetween(String value1, String value2) {
            addCriterion("pic not between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andGkeysIsNull() {
            addCriterion("gkeys is null");
            return (Criteria) this;
        }

        public Criteria andGkeysIsNotNull() {
            addCriterion("gkeys is not null");
            return (Criteria) this;
        }

        public Criteria andGkeysEqualTo(String value) {
            addCriterion("gkeys =", value, "gkeys");
            return (Criteria) this;
        }

        public Criteria andGkeysNotEqualTo(String value) {
            addCriterion("gkeys <>", value, "gkeys");
            return (Criteria) this;
        }

        public Criteria andGkeysGreaterThan(String value) {
            addCriterion("gkeys >", value, "gkeys");
            return (Criteria) this;
        }

        public Criteria andGkeysGreaterThanOrEqualTo(String value) {
            addCriterion("gkeys >=", value, "gkeys");
            return (Criteria) this;
        }

        public Criteria andGkeysLessThan(String value) {
            addCriterion("gkeys <", value, "gkeys");
            return (Criteria) this;
        }

        public Criteria andGkeysLessThanOrEqualTo(String value) {
            addCriterion("gkeys <=", value, "gkeys");
            return (Criteria) this;
        }

        public Criteria andGkeysLike(String value) {
            addCriterion("gkeys like", value, "gkeys");
            return (Criteria) this;
        }

        public Criteria andGkeysNotLike(String value) {
            addCriterion("gkeys not like", value, "gkeys");
            return (Criteria) this;
        }

        public Criteria andGkeysIn(List<String> values) {
            addCriterion("gkeys in", values, "gkeys");
            return (Criteria) this;
        }

        public Criteria andGkeysNotIn(List<String> values) {
            addCriterion("gkeys not in", values, "gkeys");
            return (Criteria) this;
        }

        public Criteria andGkeysBetween(String value1, String value2) {
            addCriterion("gkeys between", value1, value2, "gkeys");
            return (Criteria) this;
        }

        public Criteria andGkeysNotBetween(String value1, String value2) {
            addCriterion("gkeys not between", value1, value2, "gkeys");
            return (Criteria) this;
        }

        public Criteria andClicknIsNull() {
            addCriterion("clickN is null");
            return (Criteria) this;
        }

        public Criteria andClicknIsNotNull() {
            addCriterion("clickN is not null");
            return (Criteria) this;
        }

        public Criteria andClicknEqualTo(Integer value) {
            addCriterion("clickN =", value, "clickn");
            return (Criteria) this;
        }

        public Criteria andClicknNotEqualTo(Integer value) {
            addCriterion("clickN <>", value, "clickn");
            return (Criteria) this;
        }

        public Criteria andClicknGreaterThan(Integer value) {
            addCriterion("clickN >", value, "clickn");
            return (Criteria) this;
        }

        public Criteria andClicknGreaterThanOrEqualTo(Integer value) {
            addCriterion("clickN >=", value, "clickn");
            return (Criteria) this;
        }

        public Criteria andClicknLessThan(Integer value) {
            addCriterion("clickN <", value, "clickn");
            return (Criteria) this;
        }

        public Criteria andClicknLessThanOrEqualTo(Integer value) {
            addCriterion("clickN <=", value, "clickn");
            return (Criteria) this;
        }

        public Criteria andClicknIn(List<Integer> values) {
            addCriterion("clickN in", values, "clickn");
            return (Criteria) this;
        }

        public Criteria andClicknNotIn(List<Integer> values) {
            addCriterion("clickN not in", values, "clickn");
            return (Criteria) this;
        }

        public Criteria andClicknBetween(Integer value1, Integer value2) {
            addCriterion("clickN between", value1, value2, "clickn");
            return (Criteria) this;
        }

        public Criteria andClicknNotBetween(Integer value1, Integer value2) {
            addCriterion("clickN not between", value1, value2, "clickn");
            return (Criteria) this;
        }

        public Criteria andStocknIsNull() {
            addCriterion("stockN is null");
            return (Criteria) this;
        }

        public Criteria andStocknIsNotNull() {
            addCriterion("stockN is not null");
            return (Criteria) this;
        }

        public Criteria andStocknEqualTo(Integer value) {
            addCriterion("stockN =", value, "stockn");
            return (Criteria) this;
        }

        public Criteria andStocknNotEqualTo(Integer value) {
            addCriterion("stockN <>", value, "stockn");
            return (Criteria) this;
        }

        public Criteria andStocknGreaterThan(Integer value) {
            addCriterion("stockN >", value, "stockn");
            return (Criteria) this;
        }

        public Criteria andStocknGreaterThanOrEqualTo(Integer value) {
            addCriterion("stockN >=", value, "stockn");
            return (Criteria) this;
        }

        public Criteria andStocknLessThan(Integer value) {
            addCriterion("stockN <", value, "stockn");
            return (Criteria) this;
        }

        public Criteria andStocknLessThanOrEqualTo(Integer value) {
            addCriterion("stockN <=", value, "stockn");
            return (Criteria) this;
        }

        public Criteria andStocknIn(List<Integer> values) {
            addCriterion("stockN in", values, "stockn");
            return (Criteria) this;
        }

        public Criteria andStocknNotIn(List<Integer> values) {
            addCriterion("stockN not in", values, "stockn");
            return (Criteria) this;
        }

        public Criteria andStocknBetween(Integer value1, Integer value2) {
            addCriterion("stockN between", value1, value2, "stockn");
            return (Criteria) this;
        }

        public Criteria andStocknNotBetween(Integer value1, Integer value2) {
            addCriterion("stockN not between", value1, value2, "stockn");
            return (Criteria) this;
        }

        public Criteria andOrdernIsNull() {
            addCriterion("orderN is null");
            return (Criteria) this;
        }

        public Criteria andOrdernIsNotNull() {
            addCriterion("orderN is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernEqualTo(Integer value) {
            addCriterion("orderN =", value, "ordern");
            return (Criteria) this;
        }

        public Criteria andOrdernNotEqualTo(Integer value) {
            addCriterion("orderN <>", value, "ordern");
            return (Criteria) this;
        }

        public Criteria andOrdernGreaterThan(Integer value) {
            addCriterion("orderN >", value, "ordern");
            return (Criteria) this;
        }

        public Criteria andOrdernGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderN >=", value, "ordern");
            return (Criteria) this;
        }

        public Criteria andOrdernLessThan(Integer value) {
            addCriterion("orderN <", value, "ordern");
            return (Criteria) this;
        }

        public Criteria andOrdernLessThanOrEqualTo(Integer value) {
            addCriterion("orderN <=", value, "ordern");
            return (Criteria) this;
        }

        public Criteria andOrdernIn(List<Integer> values) {
            addCriterion("orderN in", values, "ordern");
            return (Criteria) this;
        }

        public Criteria andOrdernNotIn(List<Integer> values) {
            addCriterion("orderN not in", values, "ordern");
            return (Criteria) this;
        }

        public Criteria andOrdernBetween(Integer value1, Integer value2) {
            addCriterion("orderN between", value1, value2, "ordern");
            return (Criteria) this;
        }

        public Criteria andOrdernNotBetween(Integer value1, Integer value2) {
            addCriterion("orderN not between", value1, value2, "ordern");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNull() {
            addCriterion("created is null");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNotNull() {
            addCriterion("created is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedEqualTo(Date value) {
            addCriterion("created =", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotEqualTo(Date value) {
            addCriterion("created <>", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThan(Date value) {
            addCriterion("created >", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("created >=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThan(Date value) {
            addCriterion("created <", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThanOrEqualTo(Date value) {
            addCriterion("created <=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedIn(List<Date> values) {
            addCriterion("created in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotIn(List<Date> values) {
            addCriterion("created not in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedBetween(Date value1, Date value2) {
            addCriterion("created between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotBetween(Date value1, Date value2) {
            addCriterion("created not between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andUpdatedIsNull() {
            addCriterion("updated is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedIsNotNull() {
            addCriterion("updated is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedEqualTo(Date value) {
            addCriterion("updated =", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotEqualTo(Date value) {
            addCriterion("updated <>", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedGreaterThan(Date value) {
            addCriterion("updated >", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterion("updated >=", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedLessThan(Date value) {
            addCriterion("updated <", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedLessThanOrEqualTo(Date value) {
            addCriterion("updated <=", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedIn(List<Date> values) {
            addCriterion("updated in", values, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotIn(List<Date> values) {
            addCriterion("updated not in", values, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedBetween(Date value1, Date value2) {
            addCriterion("updated between", value1, value2, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotBetween(Date value1, Date value2) {
            addCriterion("updated not between", value1, value2, "updated");
            return (Criteria) this;
        }
    }

    /**
     * 类注释
     * Criteria
     * 数据库表：w_goods
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 商品表;
     * Criterion
     * 数据库表：w_goods
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}