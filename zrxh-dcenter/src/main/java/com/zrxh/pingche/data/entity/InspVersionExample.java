package com.zrxh.pingche.data.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InspVersionExample implements java.io.Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InspVersionExample() {
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

        public Criteria andClientversionIsNull() {
            addCriterion("clientversion is null");
            return (Criteria) this;
        }

        public Criteria andClientversionIsNotNull() {
            addCriterion("clientversion is not null");
            return (Criteria) this;
        }

        public Criteria andClientversionEqualTo(String value) {
            addCriterion("clientversion =", value, "clientversion");
            return (Criteria) this;
        }

        public Criteria andClientversionNotEqualTo(String value) {
            addCriterion("clientversion <>", value, "clientversion");
            return (Criteria) this;
        }

        public Criteria andClientversionGreaterThan(String value) {
            addCriterion("clientversion >", value, "clientversion");
            return (Criteria) this;
        }

        public Criteria andClientversionGreaterThanOrEqualTo(String value) {
            addCriterion("clientversion >=", value, "clientversion");
            return (Criteria) this;
        }

        public Criteria andClientversionLessThan(String value) {
            addCriterion("clientversion <", value, "clientversion");
            return (Criteria) this;
        }

        public Criteria andClientversionLessThanOrEqualTo(String value) {
            addCriterion("clientversion <=", value, "clientversion");
            return (Criteria) this;
        }

        public Criteria andClientversionLike(String value) {
            addCriterion("clientversion like", value, "clientversion");
            return (Criteria) this;
        }

        public Criteria andClientversionNotLike(String value) {
            addCriterion("clientversion not like", value, "clientversion");
            return (Criteria) this;
        }

        public Criteria andClientversionIn(List<String> values) {
            addCriterion("clientversion in", values, "clientversion");
            return (Criteria) this;
        }

        public Criteria andClientversionNotIn(List<String> values) {
            addCriterion("clientversion not in", values, "clientversion");
            return (Criteria) this;
        }

        public Criteria andClientversionBetween(String value1, String value2) {
            addCriterion("clientversion between", value1, value2, "clientversion");
            return (Criteria) this;
        }

        public Criteria andClientversionNotBetween(String value1, String value2) {
            addCriterion("clientversion not between", value1, value2, "clientversion");
            return (Criteria) this;
        }

        public Criteria andClientcodeIsNull() {
            addCriterion("clientcode is null");
            return (Criteria) this;
        }

        public Criteria andClientcodeIsNotNull() {
            addCriterion("clientcode is not null");
            return (Criteria) this;
        }

        public Criteria andClientcodeEqualTo(Integer value) {
            addCriterion("clientcode =", value, "clientcode");
            return (Criteria) this;
        }

        public Criteria andClientcodeNotEqualTo(Integer value) {
            addCriterion("clientcode <>", value, "clientcode");
            return (Criteria) this;
        }

        public Criteria andClientcodeGreaterThan(Integer value) {
            addCriterion("clientcode >", value, "clientcode");
            return (Criteria) this;
        }

        public Criteria andClientcodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("clientcode >=", value, "clientcode");
            return (Criteria) this;
        }

        public Criteria andClientcodeLessThan(Integer value) {
            addCriterion("clientcode <", value, "clientcode");
            return (Criteria) this;
        }

        public Criteria andClientcodeLessThanOrEqualTo(Integer value) {
            addCriterion("clientcode <=", value, "clientcode");
            return (Criteria) this;
        }

        public Criteria andClientcodeIn(List<Integer> values) {
            addCriterion("clientcode in", values, "clientcode");
            return (Criteria) this;
        }

        public Criteria andClientcodeNotIn(List<Integer> values) {
            addCriterion("clientcode not in", values, "clientcode");
            return (Criteria) this;
        }

        public Criteria andClientcodeBetween(Integer value1, Integer value2) {
            addCriterion("clientcode between", value1, value2, "clientcode");
            return (Criteria) this;
        }

        public Criteria andClientcodeNotBetween(Integer value1, Integer value2) {
            addCriterion("clientcode not between", value1, value2, "clientcode");
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

        public Criteria andDownurlIsNull() {
            addCriterion("downurl is null");
            return (Criteria) this;
        }

        public Criteria andDownurlIsNotNull() {
            addCriterion("downurl is not null");
            return (Criteria) this;
        }

        public Criteria andDownurlEqualTo(String value) {
            addCriterion("downurl =", value, "downurl");
            return (Criteria) this;
        }

        public Criteria andDownurlNotEqualTo(String value) {
            addCriterion("downurl <>", value, "downurl");
            return (Criteria) this;
        }

        public Criteria andDownurlGreaterThan(String value) {
            addCriterion("downurl >", value, "downurl");
            return (Criteria) this;
        }

        public Criteria andDownurlGreaterThanOrEqualTo(String value) {
            addCriterion("downurl >=", value, "downurl");
            return (Criteria) this;
        }

        public Criteria andDownurlLessThan(String value) {
            addCriterion("downurl <", value, "downurl");
            return (Criteria) this;
        }

        public Criteria andDownurlLessThanOrEqualTo(String value) {
            addCriterion("downurl <=", value, "downurl");
            return (Criteria) this;
        }

        public Criteria andDownurlLike(String value) {
            addCriterion("downurl like", value, "downurl");
            return (Criteria) this;
        }

        public Criteria andDownurlNotLike(String value) {
            addCriterion("downurl not like", value, "downurl");
            return (Criteria) this;
        }

        public Criteria andDownurlIn(List<String> values) {
            addCriterion("downurl in", values, "downurl");
            return (Criteria) this;
        }

        public Criteria andDownurlNotIn(List<String> values) {
            addCriterion("downurl not in", values, "downurl");
            return (Criteria) this;
        }

        public Criteria andDownurlBetween(String value1, String value2) {
            addCriterion("downurl between", value1, value2, "downurl");
            return (Criteria) this;
        }

        public Criteria andDownurlNotBetween(String value1, String value2) {
            addCriterion("downurl not between", value1, value2, "downurl");
            return (Criteria) this;
        }

        public Criteria andChangelistIsNull() {
            addCriterion("changelist is null");
            return (Criteria) this;
        }

        public Criteria andChangelistIsNotNull() {
            addCriterion("changelist is not null");
            return (Criteria) this;
        }

        public Criteria andChangelistEqualTo(String value) {
            addCriterion("changelist =", value, "changelist");
            return (Criteria) this;
        }

        public Criteria andChangelistNotEqualTo(String value) {
            addCriterion("changelist <>", value, "changelist");
            return (Criteria) this;
        }

        public Criteria andChangelistGreaterThan(String value) {
            addCriterion("changelist >", value, "changelist");
            return (Criteria) this;
        }

        public Criteria andChangelistGreaterThanOrEqualTo(String value) {
            addCriterion("changelist >=", value, "changelist");
            return (Criteria) this;
        }

        public Criteria andChangelistLessThan(String value) {
            addCriterion("changelist <", value, "changelist");
            return (Criteria) this;
        }

        public Criteria andChangelistLessThanOrEqualTo(String value) {
            addCriterion("changelist <=", value, "changelist");
            return (Criteria) this;
        }

        public Criteria andChangelistLike(String value) {
            addCriterion("changelist like", value, "changelist");
            return (Criteria) this;
        }

        public Criteria andChangelistNotLike(String value) {
            addCriterion("changelist not like", value, "changelist");
            return (Criteria) this;
        }

        public Criteria andChangelistIn(List<String> values) {
            addCriterion("changelist in", values, "changelist");
            return (Criteria) this;
        }

        public Criteria andChangelistNotIn(List<String> values) {
            addCriterion("changelist not in", values, "changelist");
            return (Criteria) this;
        }

        public Criteria andChangelistBetween(String value1, String value2) {
            addCriterion("changelist between", value1, value2, "changelist");
            return (Criteria) this;
        }

        public Criteria andChangelistNotBetween(String value1, String value2) {
            addCriterion("changelist not between", value1, value2, "changelist");
            return (Criteria) this;
        }

        public Criteria andUpdateinstallIsNull() {
            addCriterion("updateinstall is null");
            return (Criteria) this;
        }

        public Criteria andUpdateinstallIsNotNull() {
            addCriterion("updateinstall is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateinstallEqualTo(Integer value) {
            addCriterion("updateinstall =", value, "updateinstall");
            return (Criteria) this;
        }

        public Criteria andUpdateinstallNotEqualTo(Integer value) {
            addCriterion("updateinstall <>", value, "updateinstall");
            return (Criteria) this;
        }

        public Criteria andUpdateinstallGreaterThan(Integer value) {
            addCriterion("updateinstall >", value, "updateinstall");
            return (Criteria) this;
        }

        public Criteria andUpdateinstallGreaterThanOrEqualTo(Integer value) {
            addCriterion("updateinstall >=", value, "updateinstall");
            return (Criteria) this;
        }

        public Criteria andUpdateinstallLessThan(Integer value) {
            addCriterion("updateinstall <", value, "updateinstall");
            return (Criteria) this;
        }

        public Criteria andUpdateinstallLessThanOrEqualTo(Integer value) {
            addCriterion("updateinstall <=", value, "updateinstall");
            return (Criteria) this;
        }

        public Criteria andUpdateinstallIn(List<Integer> values) {
            addCriterion("updateinstall in", values, "updateinstall");
            return (Criteria) this;
        }

        public Criteria andUpdateinstallNotIn(List<Integer> values) {
            addCriterion("updateinstall not in", values, "updateinstall");
            return (Criteria) this;
        }

        public Criteria andUpdateinstallBetween(Integer value1, Integer value2) {
            addCriterion("updateinstall between", value1, value2, "updateinstall");
            return (Criteria) this;
        }

        public Criteria andUpdateinstallNotBetween(Integer value1, Integer value2) {
            addCriterion("updateinstall not between", value1, value2, "updateinstall");
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

        public Criteria andPlatformIsNull() {
            addCriterion("platform is null");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNotNull() {
            addCriterion("platform is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformEqualTo(String value) {
            addCriterion("platform =", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotEqualTo(String value) {
            addCriterion("platform <>", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThan(String value) {
            addCriterion("platform >", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThanOrEqualTo(String value) {
            addCriterion("platform >=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThan(String value) {
            addCriterion("platform <", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThanOrEqualTo(String value) {
            addCriterion("platform <=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLike(String value) {
            addCriterion("platform like", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotLike(String value) {
            addCriterion("platform not like", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformIn(List<String> values) {
            addCriterion("platform in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotIn(List<String> values) {
            addCriterion("platform not in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformBetween(String value1, String value2) {
            addCriterion("platform between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotBetween(String value1, String value2) {
            addCriterion("platform not between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNull() {
            addCriterion("filename is null");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNotNull() {
            addCriterion("filename is not null");
            return (Criteria) this;
        }

        public Criteria andFilenameEqualTo(String value) {
            addCriterion("filename =", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotEqualTo(String value) {
            addCriterion("filename <>", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThan(String value) {
            addCriterion("filename >", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("filename >=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThan(String value) {
            addCriterion("filename <", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThanOrEqualTo(String value) {
            addCriterion("filename <=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLike(String value) {
            addCriterion("filename like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotLike(String value) {
            addCriterion("filename not like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameIn(List<String> values) {
            addCriterion("filename in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotIn(List<String> values) {
            addCriterion("filename not in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameBetween(String value1, String value2) {
            addCriterion("filename between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotBetween(String value1, String value2) {
            addCriterion("filename not between", value1, value2, "filename");
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