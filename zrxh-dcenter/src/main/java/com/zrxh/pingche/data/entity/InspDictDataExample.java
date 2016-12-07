package com.zrxh.pingche.data.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InspDictDataExample implements java.io.Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InspDictDataExample() {
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

        public Criteria andDatakeyIsNull() {
            addCriterion("datakey is null");
            return (Criteria) this;
        }

        public Criteria andDatakeyIsNotNull() {
            addCriterion("datakey is not null");
            return (Criteria) this;
        }

        public Criteria andDatakeyEqualTo(String value) {
            addCriterion("datakey =", value, "datakey");
            return (Criteria) this;
        }

        public Criteria andDatakeyNotEqualTo(String value) {
            addCriterion("datakey <>", value, "datakey");
            return (Criteria) this;
        }

        public Criteria andDatakeyGreaterThan(String value) {
            addCriterion("datakey >", value, "datakey");
            return (Criteria) this;
        }

        public Criteria andDatakeyGreaterThanOrEqualTo(String value) {
            addCriterion("datakey >=", value, "datakey");
            return (Criteria) this;
        }

        public Criteria andDatakeyLessThan(String value) {
            addCriterion("datakey <", value, "datakey");
            return (Criteria) this;
        }

        public Criteria andDatakeyLessThanOrEqualTo(String value) {
            addCriterion("datakey <=", value, "datakey");
            return (Criteria) this;
        }

        public Criteria andDatakeyLike(String value) {
            addCriterion("datakey like", value, "datakey");
            return (Criteria) this;
        }

        public Criteria andDatakeyNotLike(String value) {
            addCriterion("datakey not like", value, "datakey");
            return (Criteria) this;
        }

        public Criteria andDatakeyIn(List<String> values) {
            addCriterion("datakey in", values, "datakey");
            return (Criteria) this;
        }

        public Criteria andDatakeyNotIn(List<String> values) {
            addCriterion("datakey not in", values, "datakey");
            return (Criteria) this;
        }

        public Criteria andDatakeyBetween(String value1, String value2) {
            addCriterion("datakey between", value1, value2, "datakey");
            return (Criteria) this;
        }

        public Criteria andDatakeyNotBetween(String value1, String value2) {
            addCriterion("datakey not between", value1, value2, "datakey");
            return (Criteria) this;
        }

        public Criteria andDatavalueIsNull() {
            addCriterion("datavalue is null");
            return (Criteria) this;
        }

        public Criteria andDatavalueIsNotNull() {
            addCriterion("datavalue is not null");
            return (Criteria) this;
        }

        public Criteria andDatavalueEqualTo(String value) {
            addCriterion("datavalue =", value, "datavalue");
            return (Criteria) this;
        }

        public Criteria andDatavalueNotEqualTo(String value) {
            addCriterion("datavalue <>", value, "datavalue");
            return (Criteria) this;
        }

        public Criteria andDatavalueGreaterThan(String value) {
            addCriterion("datavalue >", value, "datavalue");
            return (Criteria) this;
        }

        public Criteria andDatavalueGreaterThanOrEqualTo(String value) {
            addCriterion("datavalue >=", value, "datavalue");
            return (Criteria) this;
        }

        public Criteria andDatavalueLessThan(String value) {
            addCriterion("datavalue <", value, "datavalue");
            return (Criteria) this;
        }

        public Criteria andDatavalueLessThanOrEqualTo(String value) {
            addCriterion("datavalue <=", value, "datavalue");
            return (Criteria) this;
        }

        public Criteria andDatavalueLike(String value) {
            addCriterion("datavalue like", value, "datavalue");
            return (Criteria) this;
        }

        public Criteria andDatavalueNotLike(String value) {
            addCriterion("datavalue not like", value, "datavalue");
            return (Criteria) this;
        }

        public Criteria andDatavalueIn(List<String> values) {
            addCriterion("datavalue in", values, "datavalue");
            return (Criteria) this;
        }

        public Criteria andDatavalueNotIn(List<String> values) {
            addCriterion("datavalue not in", values, "datavalue");
            return (Criteria) this;
        }

        public Criteria andDatavalueBetween(String value1, String value2) {
            addCriterion("datavalue between", value1, value2, "datavalue");
            return (Criteria) this;
        }

        public Criteria andDatavalueNotBetween(String value1, String value2) {
            addCriterion("datavalue not between", value1, value2, "datavalue");
            return (Criteria) this;
        }

        public Criteria andEnablestatusIsNull() {
            addCriterion("enablestatus is null");
            return (Criteria) this;
        }

        public Criteria andEnablestatusIsNotNull() {
            addCriterion("enablestatus is not null");
            return (Criteria) this;
        }

        public Criteria andEnablestatusEqualTo(Integer value) {
            addCriterion("enablestatus =", value, "enablestatus");
            return (Criteria) this;
        }

        public Criteria andEnablestatusNotEqualTo(Integer value) {
            addCriterion("enablestatus <>", value, "enablestatus");
            return (Criteria) this;
        }

        public Criteria andEnablestatusGreaterThan(Integer value) {
            addCriterion("enablestatus >", value, "enablestatus");
            return (Criteria) this;
        }

        public Criteria andEnablestatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("enablestatus >=", value, "enablestatus");
            return (Criteria) this;
        }

        public Criteria andEnablestatusLessThan(Integer value) {
            addCriterion("enablestatus <", value, "enablestatus");
            return (Criteria) this;
        }

        public Criteria andEnablestatusLessThanOrEqualTo(Integer value) {
            addCriterion("enablestatus <=", value, "enablestatus");
            return (Criteria) this;
        }

        public Criteria andEnablestatusIn(List<Integer> values) {
            addCriterion("enablestatus in", values, "enablestatus");
            return (Criteria) this;
        }

        public Criteria andEnablestatusNotIn(List<Integer> values) {
            addCriterion("enablestatus not in", values, "enablestatus");
            return (Criteria) this;
        }

        public Criteria andEnablestatusBetween(Integer value1, Integer value2) {
            addCriterion("enablestatus between", value1, value2, "enablestatus");
            return (Criteria) this;
        }

        public Criteria andEnablestatusNotBetween(Integer value1, Integer value2) {
            addCriterion("enablestatus not between", value1, value2, "enablestatus");
            return (Criteria) this;
        }

        public Criteria andDictidIsNull() {
            addCriterion("dictid is null");
            return (Criteria) this;
        }

        public Criteria andDictidIsNotNull() {
            addCriterion("dictid is not null");
            return (Criteria) this;
        }

        public Criteria andDictidEqualTo(Integer value) {
            addCriterion("dictid =", value, "dictid");
            return (Criteria) this;
        }

        public Criteria andDictidNotEqualTo(Integer value) {
            addCriterion("dictid <>", value, "dictid");
            return (Criteria) this;
        }

        public Criteria andDictidGreaterThan(Integer value) {
            addCriterion("dictid >", value, "dictid");
            return (Criteria) this;
        }

        public Criteria andDictidGreaterThanOrEqualTo(Integer value) {
            addCriterion("dictid >=", value, "dictid");
            return (Criteria) this;
        }

        public Criteria andDictidLessThan(Integer value) {
            addCriterion("dictid <", value, "dictid");
            return (Criteria) this;
        }

        public Criteria andDictidLessThanOrEqualTo(Integer value) {
            addCriterion("dictid <=", value, "dictid");
            return (Criteria) this;
        }

        public Criteria andDictidIn(List<Integer> values) {
            addCriterion("dictid in", values, "dictid");
            return (Criteria) this;
        }

        public Criteria andDictidNotIn(List<Integer> values) {
            addCriterion("dictid not in", values, "dictid");
            return (Criteria) this;
        }

        public Criteria andDictidBetween(Integer value1, Integer value2) {
            addCriterion("dictid between", value1, value2, "dictid");
            return (Criteria) this;
        }

        public Criteria andDictidNotBetween(Integer value1, Integer value2) {
            addCriterion("dictid not between", value1, value2, "dictid");
            return (Criteria) this;
        }

        public Criteria andDictcodeIsNull() {
            addCriterion("dictcode is null");
            return (Criteria) this;
        }

        public Criteria andDictcodeIsNotNull() {
            addCriterion("dictcode is not null");
            return (Criteria) this;
        }

        public Criteria andDictcodeEqualTo(String value) {
            addCriterion("dictcode =", value, "dictcode");
            return (Criteria) this;
        }

        public Criteria andDictcodeNotEqualTo(String value) {
            addCriterion("dictcode <>", value, "dictcode");
            return (Criteria) this;
        }

        public Criteria andDictcodeGreaterThan(String value) {
            addCriterion("dictcode >", value, "dictcode");
            return (Criteria) this;
        }

        public Criteria andDictcodeGreaterThanOrEqualTo(String value) {
            addCriterion("dictcode >=", value, "dictcode");
            return (Criteria) this;
        }

        public Criteria andDictcodeLessThan(String value) {
            addCriterion("dictcode <", value, "dictcode");
            return (Criteria) this;
        }

        public Criteria andDictcodeLessThanOrEqualTo(String value) {
            addCriterion("dictcode <=", value, "dictcode");
            return (Criteria) this;
        }

        public Criteria andDictcodeLike(String value) {
            addCriterion("dictcode like", value, "dictcode");
            return (Criteria) this;
        }

        public Criteria andDictcodeNotLike(String value) {
            addCriterion("dictcode not like", value, "dictcode");
            return (Criteria) this;
        }

        public Criteria andDictcodeIn(List<String> values) {
            addCriterion("dictcode in", values, "dictcode");
            return (Criteria) this;
        }

        public Criteria andDictcodeNotIn(List<String> values) {
            addCriterion("dictcode not in", values, "dictcode");
            return (Criteria) this;
        }

        public Criteria andDictcodeBetween(String value1, String value2) {
            addCriterion("dictcode between", value1, value2, "dictcode");
            return (Criteria) this;
        }

        public Criteria andDictcodeNotBetween(String value1, String value2) {
            addCriterion("dictcode not between", value1, value2, "dictcode");
            return (Criteria) this;
        }

        public Criteria andDictnameIsNull() {
            addCriterion("dictname is null");
            return (Criteria) this;
        }

        public Criteria andDictnameIsNotNull() {
            addCriterion("dictname is not null");
            return (Criteria) this;
        }

        public Criteria andDictnameEqualTo(String value) {
            addCriterion("dictname =", value, "dictname");
            return (Criteria) this;
        }

        public Criteria andDictnameNotEqualTo(String value) {
            addCriterion("dictname <>", value, "dictname");
            return (Criteria) this;
        }

        public Criteria andDictnameGreaterThan(String value) {
            addCriterion("dictname >", value, "dictname");
            return (Criteria) this;
        }

        public Criteria andDictnameGreaterThanOrEqualTo(String value) {
            addCriterion("dictname >=", value, "dictname");
            return (Criteria) this;
        }

        public Criteria andDictnameLessThan(String value) {
            addCriterion("dictname <", value, "dictname");
            return (Criteria) this;
        }

        public Criteria andDictnameLessThanOrEqualTo(String value) {
            addCriterion("dictname <=", value, "dictname");
            return (Criteria) this;
        }

        public Criteria andDictnameLike(String value) {
            addCriterion("dictname like", value, "dictname");
            return (Criteria) this;
        }

        public Criteria andDictnameNotLike(String value) {
            addCriterion("dictname not like", value, "dictname");
            return (Criteria) this;
        }

        public Criteria andDictnameIn(List<String> values) {
            addCriterion("dictname in", values, "dictname");
            return (Criteria) this;
        }

        public Criteria andDictnameNotIn(List<String> values) {
            addCriterion("dictname not in", values, "dictname");
            return (Criteria) this;
        }

        public Criteria andDictnameBetween(String value1, String value2) {
            addCriterion("dictname between", value1, value2, "dictname");
            return (Criteria) this;
        }

        public Criteria andDictnameNotBetween(String value1, String value2) {
            addCriterion("dictname not between", value1, value2, "dictname");
            return (Criteria) this;
        }

        public Criteria andCreateuserIsNull() {
            addCriterion("createuser is null");
            return (Criteria) this;
        }

        public Criteria andCreateuserIsNotNull() {
            addCriterion("createuser is not null");
            return (Criteria) this;
        }

        public Criteria andCreateuserEqualTo(String value) {
            addCriterion("createuser =", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotEqualTo(String value) {
            addCriterion("createuser <>", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserGreaterThan(String value) {
            addCriterion("createuser >", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserGreaterThanOrEqualTo(String value) {
            addCriterion("createuser >=", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLessThan(String value) {
            addCriterion("createuser <", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLessThanOrEqualTo(String value) {
            addCriterion("createuser <=", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLike(String value) {
            addCriterion("createuser like", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotLike(String value) {
            addCriterion("createuser not like", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserIn(List<String> values) {
            addCriterion("createuser in", values, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotIn(List<String> values) {
            addCriterion("createuser not in", values, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserBetween(String value1, String value2) {
            addCriterion("createuser between", value1, value2, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotBetween(String value1, String value2) {
            addCriterion("createuser not between", value1, value2, "createuser");
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

        public Criteria andUpdateuserIsNull() {
            addCriterion("updateuser is null");
            return (Criteria) this;
        }

        public Criteria andUpdateuserIsNotNull() {
            addCriterion("updateuser is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateuserEqualTo(String value) {
            addCriterion("updateuser =", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserNotEqualTo(String value) {
            addCriterion("updateuser <>", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserGreaterThan(String value) {
            addCriterion("updateuser >", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserGreaterThanOrEqualTo(String value) {
            addCriterion("updateuser >=", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserLessThan(String value) {
            addCriterion("updateuser <", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserLessThanOrEqualTo(String value) {
            addCriterion("updateuser <=", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserLike(String value) {
            addCriterion("updateuser like", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserNotLike(String value) {
            addCriterion("updateuser not like", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserIn(List<String> values) {
            addCriterion("updateuser in", values, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserNotIn(List<String> values) {
            addCriterion("updateuser not in", values, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserBetween(String value1, String value2) {
            addCriterion("updateuser between", value1, value2, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserNotBetween(String value1, String value2) {
            addCriterion("updateuser not between", value1, value2, "updateuser");
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