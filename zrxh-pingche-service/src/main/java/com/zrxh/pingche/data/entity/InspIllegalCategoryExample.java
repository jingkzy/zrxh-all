package com.zrxh.pingche.data.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InspIllegalCategoryExample implements java.io.Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InspIllegalCategoryExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andLsprefixIsNull() {
            addCriterion("lsprefix is null");
            return (Criteria) this;
        }

        public Criteria andLsprefixIsNotNull() {
            addCriterion("lsprefix is not null");
            return (Criteria) this;
        }

        public Criteria andLsprefixEqualTo(String value) {
            addCriterion("lsprefix =", value, "lsprefix");
            return (Criteria) this;
        }

        public Criteria andLsprefixNotEqualTo(String value) {
            addCriterion("lsprefix <>", value, "lsprefix");
            return (Criteria) this;
        }

        public Criteria andLsprefixGreaterThan(String value) {
            addCriterion("lsprefix >", value, "lsprefix");
            return (Criteria) this;
        }

        public Criteria andLsprefixGreaterThanOrEqualTo(String value) {
            addCriterion("lsprefix >=", value, "lsprefix");
            return (Criteria) this;
        }

        public Criteria andLsprefixLessThan(String value) {
            addCriterion("lsprefix <", value, "lsprefix");
            return (Criteria) this;
        }

        public Criteria andLsprefixLessThanOrEqualTo(String value) {
            addCriterion("lsprefix <=", value, "lsprefix");
            return (Criteria) this;
        }

        public Criteria andLsprefixLike(String value) {
            addCriterion("lsprefix like", value, "lsprefix");
            return (Criteria) this;
        }

        public Criteria andLsprefixNotLike(String value) {
            addCriterion("lsprefix not like", value, "lsprefix");
            return (Criteria) this;
        }

        public Criteria andLsprefixIn(List<String> values) {
            addCriterion("lsprefix in", values, "lsprefix");
            return (Criteria) this;
        }

        public Criteria andLsprefixNotIn(List<String> values) {
            addCriterion("lsprefix not in", values, "lsprefix");
            return (Criteria) this;
        }

        public Criteria andLsprefixBetween(String value1, String value2) {
            addCriterion("lsprefix between", value1, value2, "lsprefix");
            return (Criteria) this;
        }

        public Criteria andLsprefixNotBetween(String value1, String value2) {
            addCriterion("lsprefix not between", value1, value2, "lsprefix");
            return (Criteria) this;
        }

        public Criteria andLsnumIsNull() {
            addCriterion("lsnum is null");
            return (Criteria) this;
        }

        public Criteria andLsnumIsNotNull() {
            addCriterion("lsnum is not null");
            return (Criteria) this;
        }

        public Criteria andLsnumEqualTo(String value) {
            addCriterion("lsnum =", value, "lsnum");
            return (Criteria) this;
        }

        public Criteria andLsnumNotEqualTo(String value) {
            addCriterion("lsnum <>", value, "lsnum");
            return (Criteria) this;
        }

        public Criteria andLsnumGreaterThan(String value) {
            addCriterion("lsnum >", value, "lsnum");
            return (Criteria) this;
        }

        public Criteria andLsnumGreaterThanOrEqualTo(String value) {
            addCriterion("lsnum >=", value, "lsnum");
            return (Criteria) this;
        }

        public Criteria andLsnumLessThan(String value) {
            addCriterion("lsnum <", value, "lsnum");
            return (Criteria) this;
        }

        public Criteria andLsnumLessThanOrEqualTo(String value) {
            addCriterion("lsnum <=", value, "lsnum");
            return (Criteria) this;
        }

        public Criteria andLsnumLike(String value) {
            addCriterion("lsnum like", value, "lsnum");
            return (Criteria) this;
        }

        public Criteria andLsnumNotLike(String value) {
            addCriterion("lsnum not like", value, "lsnum");
            return (Criteria) this;
        }

        public Criteria andLsnumIn(List<String> values) {
            addCriterion("lsnum in", values, "lsnum");
            return (Criteria) this;
        }

        public Criteria andLsnumNotIn(List<String> values) {
            addCriterion("lsnum not in", values, "lsnum");
            return (Criteria) this;
        }

        public Criteria andLsnumBetween(String value1, String value2) {
            addCriterion("lsnum between", value1, value2, "lsnum");
            return (Criteria) this;
        }

        public Criteria andLsnumNotBetween(String value1, String value2) {
            addCriterion("lsnum not between", value1, value2, "lsnum");
            return (Criteria) this;
        }

        public Criteria andCarorgIsNull() {
            addCriterion("carorg is null");
            return (Criteria) this;
        }

        public Criteria andCarorgIsNotNull() {
            addCriterion("carorg is not null");
            return (Criteria) this;
        }

        public Criteria andCarorgEqualTo(String value) {
            addCriterion("carorg =", value, "carorg");
            return (Criteria) this;
        }

        public Criteria andCarorgNotEqualTo(String value) {
            addCriterion("carorg <>", value, "carorg");
            return (Criteria) this;
        }

        public Criteria andCarorgGreaterThan(String value) {
            addCriterion("carorg >", value, "carorg");
            return (Criteria) this;
        }

        public Criteria andCarorgGreaterThanOrEqualTo(String value) {
            addCriterion("carorg >=", value, "carorg");
            return (Criteria) this;
        }

        public Criteria andCarorgLessThan(String value) {
            addCriterion("carorg <", value, "carorg");
            return (Criteria) this;
        }

        public Criteria andCarorgLessThanOrEqualTo(String value) {
            addCriterion("carorg <=", value, "carorg");
            return (Criteria) this;
        }

        public Criteria andCarorgLike(String value) {
            addCriterion("carorg like", value, "carorg");
            return (Criteria) this;
        }

        public Criteria andCarorgNotLike(String value) {
            addCriterion("carorg not like", value, "carorg");
            return (Criteria) this;
        }

        public Criteria andCarorgIn(List<String> values) {
            addCriterion("carorg in", values, "carorg");
            return (Criteria) this;
        }

        public Criteria andCarorgNotIn(List<String> values) {
            addCriterion("carorg not in", values, "carorg");
            return (Criteria) this;
        }

        public Criteria andCarorgBetween(String value1, String value2) {
            addCriterion("carorg between", value1, value2, "carorg");
            return (Criteria) this;
        }

        public Criteria andCarorgNotBetween(String value1, String value2) {
            addCriterion("carorg not between", value1, value2, "carorg");
            return (Criteria) this;
        }

        public Criteria andFramenoIsNull() {
            addCriterion("frameno is null");
            return (Criteria) this;
        }

        public Criteria andFramenoIsNotNull() {
            addCriterion("frameno is not null");
            return (Criteria) this;
        }

        public Criteria andFramenoEqualTo(String value) {
            addCriterion("frameno =", value, "frameno");
            return (Criteria) this;
        }

        public Criteria andFramenoNotEqualTo(String value) {
            addCriterion("frameno <>", value, "frameno");
            return (Criteria) this;
        }

        public Criteria andFramenoGreaterThan(String value) {
            addCriterion("frameno >", value, "frameno");
            return (Criteria) this;
        }

        public Criteria andFramenoGreaterThanOrEqualTo(String value) {
            addCriterion("frameno >=", value, "frameno");
            return (Criteria) this;
        }

        public Criteria andFramenoLessThan(String value) {
            addCriterion("frameno <", value, "frameno");
            return (Criteria) this;
        }

        public Criteria andFramenoLessThanOrEqualTo(String value) {
            addCriterion("frameno <=", value, "frameno");
            return (Criteria) this;
        }

        public Criteria andFramenoLike(String value) {
            addCriterion("frameno like", value, "frameno");
            return (Criteria) this;
        }

        public Criteria andFramenoNotLike(String value) {
            addCriterion("frameno not like", value, "frameno");
            return (Criteria) this;
        }

        public Criteria andFramenoIn(List<String> values) {
            addCriterion("frameno in", values, "frameno");
            return (Criteria) this;
        }

        public Criteria andFramenoNotIn(List<String> values) {
            addCriterion("frameno not in", values, "frameno");
            return (Criteria) this;
        }

        public Criteria andFramenoBetween(String value1, String value2) {
            addCriterion("frameno between", value1, value2, "frameno");
            return (Criteria) this;
        }

        public Criteria andFramenoNotBetween(String value1, String value2) {
            addCriterion("frameno not between", value1, value2, "frameno");
            return (Criteria) this;
        }

        public Criteria andEnginenoIsNull() {
            addCriterion("engineno is null");
            return (Criteria) this;
        }

        public Criteria andEnginenoIsNotNull() {
            addCriterion("engineno is not null");
            return (Criteria) this;
        }

        public Criteria andEnginenoEqualTo(String value) {
            addCriterion("engineno =", value, "engineno");
            return (Criteria) this;
        }

        public Criteria andEnginenoNotEqualTo(String value) {
            addCriterion("engineno <>", value, "engineno");
            return (Criteria) this;
        }

        public Criteria andEnginenoGreaterThan(String value) {
            addCriterion("engineno >", value, "engineno");
            return (Criteria) this;
        }

        public Criteria andEnginenoGreaterThanOrEqualTo(String value) {
            addCriterion("engineno >=", value, "engineno");
            return (Criteria) this;
        }

        public Criteria andEnginenoLessThan(String value) {
            addCriterion("engineno <", value, "engineno");
            return (Criteria) this;
        }

        public Criteria andEnginenoLessThanOrEqualTo(String value) {
            addCriterion("engineno <=", value, "engineno");
            return (Criteria) this;
        }

        public Criteria andEnginenoLike(String value) {
            addCriterion("engineno like", value, "engineno");
            return (Criteria) this;
        }

        public Criteria andEnginenoNotLike(String value) {
            addCriterion("engineno not like", value, "engineno");
            return (Criteria) this;
        }

        public Criteria andEnginenoIn(List<String> values) {
            addCriterion("engineno in", values, "engineno");
            return (Criteria) this;
        }

        public Criteria andEnginenoNotIn(List<String> values) {
            addCriterion("engineno not in", values, "engineno");
            return (Criteria) this;
        }

        public Criteria andEnginenoBetween(String value1, String value2) {
            addCriterion("engineno between", value1, value2, "engineno");
            return (Criteria) this;
        }

        public Criteria andEnginenoNotBetween(String value1, String value2) {
            addCriterion("engineno not between", value1, value2, "engineno");
            return (Criteria) this;
        }

        public Criteria andCitylevelIsNull() {
            addCriterion("citylevel is null");
            return (Criteria) this;
        }

        public Criteria andCitylevelIsNotNull() {
            addCriterion("citylevel is not null");
            return (Criteria) this;
        }

        public Criteria andCitylevelEqualTo(Integer value) {
            addCriterion("citylevel =", value, "citylevel");
            return (Criteria) this;
        }

        public Criteria andCitylevelNotEqualTo(Integer value) {
            addCriterion("citylevel <>", value, "citylevel");
            return (Criteria) this;
        }

        public Criteria andCitylevelGreaterThan(Integer value) {
            addCriterion("citylevel >", value, "citylevel");
            return (Criteria) this;
        }

        public Criteria andCitylevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("citylevel >=", value, "citylevel");
            return (Criteria) this;
        }

        public Criteria andCitylevelLessThan(Integer value) {
            addCriterion("citylevel <", value, "citylevel");
            return (Criteria) this;
        }

        public Criteria andCitylevelLessThanOrEqualTo(Integer value) {
            addCriterion("citylevel <=", value, "citylevel");
            return (Criteria) this;
        }

        public Criteria andCitylevelIn(List<Integer> values) {
            addCriterion("citylevel in", values, "citylevel");
            return (Criteria) this;
        }

        public Criteria andCitylevelNotIn(List<Integer> values) {
            addCriterion("citylevel not in", values, "citylevel");
            return (Criteria) this;
        }

        public Criteria andCitylevelBetween(Integer value1, Integer value2) {
            addCriterion("citylevel between", value1, value2, "citylevel");
            return (Criteria) this;
        }

        public Criteria andCitylevelNotBetween(Integer value1, Integer value2) {
            addCriterion("citylevel not between", value1, value2, "citylevel");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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