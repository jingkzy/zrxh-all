package com.zrxh.pingche.data.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InspCompreSituationExample implements java.io.Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InspCompreSituationExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCreateuserIsNull() {
            addCriterion("createUser is null");
            return (Criteria) this;
        }

        public Criteria andCreateuserIsNotNull() {
            addCriterion("createUser is not null");
            return (Criteria) this;
        }

        public Criteria andCreateuserEqualTo(String value) {
            addCriterion("createUser =", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotEqualTo(String value) {
            addCriterion("createUser <>", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserGreaterThan(String value) {
            addCriterion("createUser >", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserGreaterThanOrEqualTo(String value) {
            addCriterion("createUser >=", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLessThan(String value) {
            addCriterion("createUser <", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLessThanOrEqualTo(String value) {
            addCriterion("createUser <=", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLike(String value) {
            addCriterion("createUser like", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotLike(String value) {
            addCriterion("createUser not like", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserIn(List<String> values) {
            addCriterion("createUser in", values, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotIn(List<String> values) {
            addCriterion("createUser not in", values, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserBetween(String value1, String value2) {
            addCriterion("createUser between", value1, value2, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotBetween(String value1, String value2) {
            addCriterion("createUser not between", value1, value2, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreatedeptIsNull() {
            addCriterion("createDept is null");
            return (Criteria) this;
        }

        public Criteria andCreatedeptIsNotNull() {
            addCriterion("createDept is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedeptEqualTo(String value) {
            addCriterion("createDept =", value, "createdept");
            return (Criteria) this;
        }

        public Criteria andCreatedeptNotEqualTo(String value) {
            addCriterion("createDept <>", value, "createdept");
            return (Criteria) this;
        }

        public Criteria andCreatedeptGreaterThan(String value) {
            addCriterion("createDept >", value, "createdept");
            return (Criteria) this;
        }

        public Criteria andCreatedeptGreaterThanOrEqualTo(String value) {
            addCriterion("createDept >=", value, "createdept");
            return (Criteria) this;
        }

        public Criteria andCreatedeptLessThan(String value) {
            addCriterion("createDept <", value, "createdept");
            return (Criteria) this;
        }

        public Criteria andCreatedeptLessThanOrEqualTo(String value) {
            addCriterion("createDept <=", value, "createdept");
            return (Criteria) this;
        }

        public Criteria andCreatedeptLike(String value) {
            addCriterion("createDept like", value, "createdept");
            return (Criteria) this;
        }

        public Criteria andCreatedeptNotLike(String value) {
            addCriterion("createDept not like", value, "createdept");
            return (Criteria) this;
        }

        public Criteria andCreatedeptIn(List<String> values) {
            addCriterion("createDept in", values, "createdept");
            return (Criteria) this;
        }

        public Criteria andCreatedeptNotIn(List<String> values) {
            addCriterion("createDept not in", values, "createdept");
            return (Criteria) this;
        }

        public Criteria andCreatedeptBetween(String value1, String value2) {
            addCriterion("createDept between", value1, value2, "createdept");
            return (Criteria) this;
        }

        public Criteria andCreatedeptNotBetween(String value1, String value2) {
            addCriterion("createDept not between", value1, value2, "createdept");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdateuserIsNull() {
            addCriterion("updateUser is null");
            return (Criteria) this;
        }

        public Criteria andUpdateuserIsNotNull() {
            addCriterion("updateUser is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateuserEqualTo(String value) {
            addCriterion("updateUser =", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserNotEqualTo(String value) {
            addCriterion("updateUser <>", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserGreaterThan(String value) {
            addCriterion("updateUser >", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserGreaterThanOrEqualTo(String value) {
            addCriterion("updateUser >=", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserLessThan(String value) {
            addCriterion("updateUser <", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserLessThanOrEqualTo(String value) {
            addCriterion("updateUser <=", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserLike(String value) {
            addCriterion("updateUser like", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserNotLike(String value) {
            addCriterion("updateUser not like", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserIn(List<String> values) {
            addCriterion("updateUser in", values, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserNotIn(List<String> values) {
            addCriterion("updateUser not in", values, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserBetween(String value1, String value2) {
            addCriterion("updateUser between", value1, value2, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserNotBetween(String value1, String value2) {
            addCriterion("updateUser not between", value1, value2, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdatedeptIsNull() {
            addCriterion("updateDept is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedeptIsNotNull() {
            addCriterion("updateDept is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedeptEqualTo(String value) {
            addCriterion("updateDept =", value, "updatedept");
            return (Criteria) this;
        }

        public Criteria andUpdatedeptNotEqualTo(String value) {
            addCriterion("updateDept <>", value, "updatedept");
            return (Criteria) this;
        }

        public Criteria andUpdatedeptGreaterThan(String value) {
            addCriterion("updateDept >", value, "updatedept");
            return (Criteria) this;
        }

        public Criteria andUpdatedeptGreaterThanOrEqualTo(String value) {
            addCriterion("updateDept >=", value, "updatedept");
            return (Criteria) this;
        }

        public Criteria andUpdatedeptLessThan(String value) {
            addCriterion("updateDept <", value, "updatedept");
            return (Criteria) this;
        }

        public Criteria andUpdatedeptLessThanOrEqualTo(String value) {
            addCriterion("updateDept <=", value, "updatedept");
            return (Criteria) this;
        }

        public Criteria andUpdatedeptLike(String value) {
            addCriterion("updateDept like", value, "updatedept");
            return (Criteria) this;
        }

        public Criteria andUpdatedeptNotLike(String value) {
            addCriterion("updateDept not like", value, "updatedept");
            return (Criteria) this;
        }

        public Criteria andUpdatedeptIn(List<String> values) {
            addCriterion("updateDept in", values, "updatedept");
            return (Criteria) this;
        }

        public Criteria andUpdatedeptNotIn(List<String> values) {
            addCriterion("updateDept not in", values, "updatedept");
            return (Criteria) this;
        }

        public Criteria andUpdatedeptBetween(String value1, String value2) {
            addCriterion("updateDept between", value1, value2, "updatedept");
            return (Criteria) this;
        }

        public Criteria andUpdatedeptNotBetween(String value1, String value2) {
            addCriterion("updateDept not between", value1, value2, "updatedept");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andCarinfoidIsNull() {
            addCriterion("carInfoId is null");
            return (Criteria) this;
        }

        public Criteria andCarinfoidIsNotNull() {
            addCriterion("carInfoId is not null");
            return (Criteria) this;
        }

        public Criteria andCarinfoidEqualTo(String value) {
            addCriterion("carInfoId =", value, "carinfoid");
            return (Criteria) this;
        }

        public Criteria andCarinfoidNotEqualTo(String value) {
            addCriterion("carInfoId <>", value, "carinfoid");
            return (Criteria) this;
        }

        public Criteria andCarinfoidGreaterThan(String value) {
            addCriterion("carInfoId >", value, "carinfoid");
            return (Criteria) this;
        }

        public Criteria andCarinfoidGreaterThanOrEqualTo(String value) {
            addCriterion("carInfoId >=", value, "carinfoid");
            return (Criteria) this;
        }

        public Criteria andCarinfoidLessThan(String value) {
            addCriterion("carInfoId <", value, "carinfoid");
            return (Criteria) this;
        }

        public Criteria andCarinfoidLessThanOrEqualTo(String value) {
            addCriterion("carInfoId <=", value, "carinfoid");
            return (Criteria) this;
        }

        public Criteria andCarinfoidLike(String value) {
            addCriterion("carInfoId like", value, "carinfoid");
            return (Criteria) this;
        }

        public Criteria andCarinfoidNotLike(String value) {
            addCriterion("carInfoId not like", value, "carinfoid");
            return (Criteria) this;
        }

        public Criteria andCarinfoidIn(List<String> values) {
            addCriterion("carInfoId in", values, "carinfoid");
            return (Criteria) this;
        }

        public Criteria andCarinfoidNotIn(List<String> values) {
            addCriterion("carInfoId not in", values, "carinfoid");
            return (Criteria) this;
        }

        public Criteria andCarinfoidBetween(String value1, String value2) {
            addCriterion("carInfoId between", value1, value2, "carinfoid");
            return (Criteria) this;
        }

        public Criteria andCarinfoidNotBetween(String value1, String value2) {
            addCriterion("carInfoId not between", value1, value2, "carinfoid");
            return (Criteria) this;
        }

        public Criteria andIdleradioIsNull() {
            addCriterion("idleRadio is null");
            return (Criteria) this;
        }

        public Criteria andIdleradioIsNotNull() {
            addCriterion("idleRadio is not null");
            return (Criteria) this;
        }

        public Criteria andIdleradioEqualTo(String value) {
            addCriterion("idleRadio =", value, "idleradio");
            return (Criteria) this;
        }

        public Criteria andIdleradioNotEqualTo(String value) {
            addCriterion("idleRadio <>", value, "idleradio");
            return (Criteria) this;
        }

        public Criteria andIdleradioGreaterThan(String value) {
            addCriterion("idleRadio >", value, "idleradio");
            return (Criteria) this;
        }

        public Criteria andIdleradioGreaterThanOrEqualTo(String value) {
            addCriterion("idleRadio >=", value, "idleradio");
            return (Criteria) this;
        }

        public Criteria andIdleradioLessThan(String value) {
            addCriterion("idleRadio <", value, "idleradio");
            return (Criteria) this;
        }

        public Criteria andIdleradioLessThanOrEqualTo(String value) {
            addCriterion("idleRadio <=", value, "idleradio");
            return (Criteria) this;
        }

        public Criteria andIdleradioLike(String value) {
            addCriterion("idleRadio like", value, "idleradio");
            return (Criteria) this;
        }

        public Criteria andIdleradioNotLike(String value) {
            addCriterion("idleRadio not like", value, "idleradio");
            return (Criteria) this;
        }

        public Criteria andIdleradioIn(List<String> values) {
            addCriterion("idleRadio in", values, "idleradio");
            return (Criteria) this;
        }

        public Criteria andIdleradioNotIn(List<String> values) {
            addCriterion("idleRadio not in", values, "idleradio");
            return (Criteria) this;
        }

        public Criteria andIdleradioBetween(String value1, String value2) {
            addCriterion("idleRadio between", value1, value2, "idleradio");
            return (Criteria) this;
        }

        public Criteria andIdleradioNotBetween(String value1, String value2) {
            addCriterion("idleRadio not between", value1, value2, "idleradio");
            return (Criteria) this;
        }

        public Criteria andIdletextIsNull() {
            addCriterion("idleText is null");
            return (Criteria) this;
        }

        public Criteria andIdletextIsNotNull() {
            addCriterion("idleText is not null");
            return (Criteria) this;
        }

        public Criteria andIdletextEqualTo(String value) {
            addCriterion("idleText =", value, "idletext");
            return (Criteria) this;
        }

        public Criteria andIdletextNotEqualTo(String value) {
            addCriterion("idleText <>", value, "idletext");
            return (Criteria) this;
        }

        public Criteria andIdletextGreaterThan(String value) {
            addCriterion("idleText >", value, "idletext");
            return (Criteria) this;
        }

        public Criteria andIdletextGreaterThanOrEqualTo(String value) {
            addCriterion("idleText >=", value, "idletext");
            return (Criteria) this;
        }

        public Criteria andIdletextLessThan(String value) {
            addCriterion("idleText <", value, "idletext");
            return (Criteria) this;
        }

        public Criteria andIdletextLessThanOrEqualTo(String value) {
            addCriterion("idleText <=", value, "idletext");
            return (Criteria) this;
        }

        public Criteria andIdletextLike(String value) {
            addCriterion("idleText like", value, "idletext");
            return (Criteria) this;
        }

        public Criteria andIdletextNotLike(String value) {
            addCriterion("idleText not like", value, "idletext");
            return (Criteria) this;
        }

        public Criteria andIdletextIn(List<String> values) {
            addCriterion("idleText in", values, "idletext");
            return (Criteria) this;
        }

        public Criteria andIdletextNotIn(List<String> values) {
            addCriterion("idleText not in", values, "idletext");
            return (Criteria) this;
        }

        public Criteria andIdletextBetween(String value1, String value2) {
            addCriterion("idleText between", value1, value2, "idletext");
            return (Criteria) this;
        }

        public Criteria andIdletextNotBetween(String value1, String value2) {
            addCriterion("idleText not between", value1, value2, "idletext");
            return (Criteria) this;
        }

        public Criteria andIdleboxIsNull() {
            addCriterion("idleBox is null");
            return (Criteria) this;
        }

        public Criteria andIdleboxIsNotNull() {
            addCriterion("idleBox is not null");
            return (Criteria) this;
        }

        public Criteria andIdleboxEqualTo(String value) {
            addCriterion("idleBox =", value, "idlebox");
            return (Criteria) this;
        }

        public Criteria andIdleboxNotEqualTo(String value) {
            addCriterion("idleBox <>", value, "idlebox");
            return (Criteria) this;
        }

        public Criteria andIdleboxGreaterThan(String value) {
            addCriterion("idleBox >", value, "idlebox");
            return (Criteria) this;
        }

        public Criteria andIdleboxGreaterThanOrEqualTo(String value) {
            addCriterion("idleBox >=", value, "idlebox");
            return (Criteria) this;
        }

        public Criteria andIdleboxLessThan(String value) {
            addCriterion("idleBox <", value, "idlebox");
            return (Criteria) this;
        }

        public Criteria andIdleboxLessThanOrEqualTo(String value) {
            addCriterion("idleBox <=", value, "idlebox");
            return (Criteria) this;
        }

        public Criteria andIdleboxLike(String value) {
            addCriterion("idleBox like", value, "idlebox");
            return (Criteria) this;
        }

        public Criteria andIdleboxNotLike(String value) {
            addCriterion("idleBox not like", value, "idlebox");
            return (Criteria) this;
        }

        public Criteria andIdleboxIn(List<String> values) {
            addCriterion("idleBox in", values, "idlebox");
            return (Criteria) this;
        }

        public Criteria andIdleboxNotIn(List<String> values) {
            addCriterion("idleBox not in", values, "idlebox");
            return (Criteria) this;
        }

        public Criteria andIdleboxBetween(String value1, String value2) {
            addCriterion("idleBox between", value1, value2, "idlebox");
            return (Criteria) this;
        }

        public Criteria andIdleboxNotBetween(String value1, String value2) {
            addCriterion("idleBox not between", value1, value2, "idlebox");
            return (Criteria) this;
        }

        public Criteria andStartingradioIsNull() {
            addCriterion("startingRadio is null");
            return (Criteria) this;
        }

        public Criteria andStartingradioIsNotNull() {
            addCriterion("startingRadio is not null");
            return (Criteria) this;
        }

        public Criteria andStartingradioEqualTo(String value) {
            addCriterion("startingRadio =", value, "startingradio");
            return (Criteria) this;
        }

        public Criteria andStartingradioNotEqualTo(String value) {
            addCriterion("startingRadio <>", value, "startingradio");
            return (Criteria) this;
        }

        public Criteria andStartingradioGreaterThan(String value) {
            addCriterion("startingRadio >", value, "startingradio");
            return (Criteria) this;
        }

        public Criteria andStartingradioGreaterThanOrEqualTo(String value) {
            addCriterion("startingRadio >=", value, "startingradio");
            return (Criteria) this;
        }

        public Criteria andStartingradioLessThan(String value) {
            addCriterion("startingRadio <", value, "startingradio");
            return (Criteria) this;
        }

        public Criteria andStartingradioLessThanOrEqualTo(String value) {
            addCriterion("startingRadio <=", value, "startingradio");
            return (Criteria) this;
        }

        public Criteria andStartingradioLike(String value) {
            addCriterion("startingRadio like", value, "startingradio");
            return (Criteria) this;
        }

        public Criteria andStartingradioNotLike(String value) {
            addCriterion("startingRadio not like", value, "startingradio");
            return (Criteria) this;
        }

        public Criteria andStartingradioIn(List<String> values) {
            addCriterion("startingRadio in", values, "startingradio");
            return (Criteria) this;
        }

        public Criteria andStartingradioNotIn(List<String> values) {
            addCriterion("startingRadio not in", values, "startingradio");
            return (Criteria) this;
        }

        public Criteria andStartingradioBetween(String value1, String value2) {
            addCriterion("startingRadio between", value1, value2, "startingradio");
            return (Criteria) this;
        }

        public Criteria andStartingradioNotBetween(String value1, String value2) {
            addCriterion("startingRadio not between", value1, value2, "startingradio");
            return (Criteria) this;
        }

        public Criteria andStartingtextIsNull() {
            addCriterion("startingText is null");
            return (Criteria) this;
        }

        public Criteria andStartingtextIsNotNull() {
            addCriterion("startingText is not null");
            return (Criteria) this;
        }

        public Criteria andStartingtextEqualTo(String value) {
            addCriterion("startingText =", value, "startingtext");
            return (Criteria) this;
        }

        public Criteria andStartingtextNotEqualTo(String value) {
            addCriterion("startingText <>", value, "startingtext");
            return (Criteria) this;
        }

        public Criteria andStartingtextGreaterThan(String value) {
            addCriterion("startingText >", value, "startingtext");
            return (Criteria) this;
        }

        public Criteria andStartingtextGreaterThanOrEqualTo(String value) {
            addCriterion("startingText >=", value, "startingtext");
            return (Criteria) this;
        }

        public Criteria andStartingtextLessThan(String value) {
            addCriterion("startingText <", value, "startingtext");
            return (Criteria) this;
        }

        public Criteria andStartingtextLessThanOrEqualTo(String value) {
            addCriterion("startingText <=", value, "startingtext");
            return (Criteria) this;
        }

        public Criteria andStartingtextLike(String value) {
            addCriterion("startingText like", value, "startingtext");
            return (Criteria) this;
        }

        public Criteria andStartingtextNotLike(String value) {
            addCriterion("startingText not like", value, "startingtext");
            return (Criteria) this;
        }

        public Criteria andStartingtextIn(List<String> values) {
            addCriterion("startingText in", values, "startingtext");
            return (Criteria) this;
        }

        public Criteria andStartingtextNotIn(List<String> values) {
            addCriterion("startingText not in", values, "startingtext");
            return (Criteria) this;
        }

        public Criteria andStartingtextBetween(String value1, String value2) {
            addCriterion("startingText between", value1, value2, "startingtext");
            return (Criteria) this;
        }

        public Criteria andStartingtextNotBetween(String value1, String value2) {
            addCriterion("startingText not between", value1, value2, "startingtext");
            return (Criteria) this;
        }

        public Criteria andStartingboxIsNull() {
            addCriterion("startingBox is null");
            return (Criteria) this;
        }

        public Criteria andStartingboxIsNotNull() {
            addCriterion("startingBox is not null");
            return (Criteria) this;
        }

        public Criteria andStartingboxEqualTo(String value) {
            addCriterion("startingBox =", value, "startingbox");
            return (Criteria) this;
        }

        public Criteria andStartingboxNotEqualTo(String value) {
            addCriterion("startingBox <>", value, "startingbox");
            return (Criteria) this;
        }

        public Criteria andStartingboxGreaterThan(String value) {
            addCriterion("startingBox >", value, "startingbox");
            return (Criteria) this;
        }

        public Criteria andStartingboxGreaterThanOrEqualTo(String value) {
            addCriterion("startingBox >=", value, "startingbox");
            return (Criteria) this;
        }

        public Criteria andStartingboxLessThan(String value) {
            addCriterion("startingBox <", value, "startingbox");
            return (Criteria) this;
        }

        public Criteria andStartingboxLessThanOrEqualTo(String value) {
            addCriterion("startingBox <=", value, "startingbox");
            return (Criteria) this;
        }

        public Criteria andStartingboxLike(String value) {
            addCriterion("startingBox like", value, "startingbox");
            return (Criteria) this;
        }

        public Criteria andStartingboxNotLike(String value) {
            addCriterion("startingBox not like", value, "startingbox");
            return (Criteria) this;
        }

        public Criteria andStartingboxIn(List<String> values) {
            addCriterion("startingBox in", values, "startingbox");
            return (Criteria) this;
        }

        public Criteria andStartingboxNotIn(List<String> values) {
            addCriterion("startingBox not in", values, "startingbox");
            return (Criteria) this;
        }

        public Criteria andStartingboxBetween(String value1, String value2) {
            addCriterion("startingBox between", value1, value2, "startingbox");
            return (Criteria) this;
        }

        public Criteria andStartingboxNotBetween(String value1, String value2) {
            addCriterion("startingBox not between", value1, value2, "startingbox");
            return (Criteria) this;
        }

        public Criteria andSteeringradioIsNull() {
            addCriterion("steeringRadio is null");
            return (Criteria) this;
        }

        public Criteria andSteeringradioIsNotNull() {
            addCriterion("steeringRadio is not null");
            return (Criteria) this;
        }

        public Criteria andSteeringradioEqualTo(String value) {
            addCriterion("steeringRadio =", value, "steeringradio");
            return (Criteria) this;
        }

        public Criteria andSteeringradioNotEqualTo(String value) {
            addCriterion("steeringRadio <>", value, "steeringradio");
            return (Criteria) this;
        }

        public Criteria andSteeringradioGreaterThan(String value) {
            addCriterion("steeringRadio >", value, "steeringradio");
            return (Criteria) this;
        }

        public Criteria andSteeringradioGreaterThanOrEqualTo(String value) {
            addCriterion("steeringRadio >=", value, "steeringradio");
            return (Criteria) this;
        }

        public Criteria andSteeringradioLessThan(String value) {
            addCriterion("steeringRadio <", value, "steeringradio");
            return (Criteria) this;
        }

        public Criteria andSteeringradioLessThanOrEqualTo(String value) {
            addCriterion("steeringRadio <=", value, "steeringradio");
            return (Criteria) this;
        }

        public Criteria andSteeringradioLike(String value) {
            addCriterion("steeringRadio like", value, "steeringradio");
            return (Criteria) this;
        }

        public Criteria andSteeringradioNotLike(String value) {
            addCriterion("steeringRadio not like", value, "steeringradio");
            return (Criteria) this;
        }

        public Criteria andSteeringradioIn(List<String> values) {
            addCriterion("steeringRadio in", values, "steeringradio");
            return (Criteria) this;
        }

        public Criteria andSteeringradioNotIn(List<String> values) {
            addCriterion("steeringRadio not in", values, "steeringradio");
            return (Criteria) this;
        }

        public Criteria andSteeringradioBetween(String value1, String value2) {
            addCriterion("steeringRadio between", value1, value2, "steeringradio");
            return (Criteria) this;
        }

        public Criteria andSteeringradioNotBetween(String value1, String value2) {
            addCriterion("steeringRadio not between", value1, value2, "steeringradio");
            return (Criteria) this;
        }

        public Criteria andSteeringtextIsNull() {
            addCriterion("steeringText is null");
            return (Criteria) this;
        }

        public Criteria andSteeringtextIsNotNull() {
            addCriterion("steeringText is not null");
            return (Criteria) this;
        }

        public Criteria andSteeringtextEqualTo(String value) {
            addCriterion("steeringText =", value, "steeringtext");
            return (Criteria) this;
        }

        public Criteria andSteeringtextNotEqualTo(String value) {
            addCriterion("steeringText <>", value, "steeringtext");
            return (Criteria) this;
        }

        public Criteria andSteeringtextGreaterThan(String value) {
            addCriterion("steeringText >", value, "steeringtext");
            return (Criteria) this;
        }

        public Criteria andSteeringtextGreaterThanOrEqualTo(String value) {
            addCriterion("steeringText >=", value, "steeringtext");
            return (Criteria) this;
        }

        public Criteria andSteeringtextLessThan(String value) {
            addCriterion("steeringText <", value, "steeringtext");
            return (Criteria) this;
        }

        public Criteria andSteeringtextLessThanOrEqualTo(String value) {
            addCriterion("steeringText <=", value, "steeringtext");
            return (Criteria) this;
        }

        public Criteria andSteeringtextLike(String value) {
            addCriterion("steeringText like", value, "steeringtext");
            return (Criteria) this;
        }

        public Criteria andSteeringtextNotLike(String value) {
            addCriterion("steeringText not like", value, "steeringtext");
            return (Criteria) this;
        }

        public Criteria andSteeringtextIn(List<String> values) {
            addCriterion("steeringText in", values, "steeringtext");
            return (Criteria) this;
        }

        public Criteria andSteeringtextNotIn(List<String> values) {
            addCriterion("steeringText not in", values, "steeringtext");
            return (Criteria) this;
        }

        public Criteria andSteeringtextBetween(String value1, String value2) {
            addCriterion("steeringText between", value1, value2, "steeringtext");
            return (Criteria) this;
        }

        public Criteria andSteeringtextNotBetween(String value1, String value2) {
            addCriterion("steeringText not between", value1, value2, "steeringtext");
            return (Criteria) this;
        }

        public Criteria andSteeringboxIsNull() {
            addCriterion("steeringBox is null");
            return (Criteria) this;
        }

        public Criteria andSteeringboxIsNotNull() {
            addCriterion("steeringBox is not null");
            return (Criteria) this;
        }

        public Criteria andSteeringboxEqualTo(String value) {
            addCriterion("steeringBox =", value, "steeringbox");
            return (Criteria) this;
        }

        public Criteria andSteeringboxNotEqualTo(String value) {
            addCriterion("steeringBox <>", value, "steeringbox");
            return (Criteria) this;
        }

        public Criteria andSteeringboxGreaterThan(String value) {
            addCriterion("steeringBox >", value, "steeringbox");
            return (Criteria) this;
        }

        public Criteria andSteeringboxGreaterThanOrEqualTo(String value) {
            addCriterion("steeringBox >=", value, "steeringbox");
            return (Criteria) this;
        }

        public Criteria andSteeringboxLessThan(String value) {
            addCriterion("steeringBox <", value, "steeringbox");
            return (Criteria) this;
        }

        public Criteria andSteeringboxLessThanOrEqualTo(String value) {
            addCriterion("steeringBox <=", value, "steeringbox");
            return (Criteria) this;
        }

        public Criteria andSteeringboxLike(String value) {
            addCriterion("steeringBox like", value, "steeringbox");
            return (Criteria) this;
        }

        public Criteria andSteeringboxNotLike(String value) {
            addCriterion("steeringBox not like", value, "steeringbox");
            return (Criteria) this;
        }

        public Criteria andSteeringboxIn(List<String> values) {
            addCriterion("steeringBox in", values, "steeringbox");
            return (Criteria) this;
        }

        public Criteria andSteeringboxNotIn(List<String> values) {
            addCriterion("steeringBox not in", values, "steeringbox");
            return (Criteria) this;
        }

        public Criteria andSteeringboxBetween(String value1, String value2) {
            addCriterion("steeringBox between", value1, value2, "steeringbox");
            return (Criteria) this;
        }

        public Criteria andSteeringboxNotBetween(String value1, String value2) {
            addCriterion("steeringBox not between", value1, value2, "steeringbox");
            return (Criteria) this;
        }

        public Criteria andBrakeradioIsNull() {
            addCriterion("brakeRadio is null");
            return (Criteria) this;
        }

        public Criteria andBrakeradioIsNotNull() {
            addCriterion("brakeRadio is not null");
            return (Criteria) this;
        }

        public Criteria andBrakeradioEqualTo(String value) {
            addCriterion("brakeRadio =", value, "brakeradio");
            return (Criteria) this;
        }

        public Criteria andBrakeradioNotEqualTo(String value) {
            addCriterion("brakeRadio <>", value, "brakeradio");
            return (Criteria) this;
        }

        public Criteria andBrakeradioGreaterThan(String value) {
            addCriterion("brakeRadio >", value, "brakeradio");
            return (Criteria) this;
        }

        public Criteria andBrakeradioGreaterThanOrEqualTo(String value) {
            addCriterion("brakeRadio >=", value, "brakeradio");
            return (Criteria) this;
        }

        public Criteria andBrakeradioLessThan(String value) {
            addCriterion("brakeRadio <", value, "brakeradio");
            return (Criteria) this;
        }

        public Criteria andBrakeradioLessThanOrEqualTo(String value) {
            addCriterion("brakeRadio <=", value, "brakeradio");
            return (Criteria) this;
        }

        public Criteria andBrakeradioLike(String value) {
            addCriterion("brakeRadio like", value, "brakeradio");
            return (Criteria) this;
        }

        public Criteria andBrakeradioNotLike(String value) {
            addCriterion("brakeRadio not like", value, "brakeradio");
            return (Criteria) this;
        }

        public Criteria andBrakeradioIn(List<String> values) {
            addCriterion("brakeRadio in", values, "brakeradio");
            return (Criteria) this;
        }

        public Criteria andBrakeradioNotIn(List<String> values) {
            addCriterion("brakeRadio not in", values, "brakeradio");
            return (Criteria) this;
        }

        public Criteria andBrakeradioBetween(String value1, String value2) {
            addCriterion("brakeRadio between", value1, value2, "brakeradio");
            return (Criteria) this;
        }

        public Criteria andBrakeradioNotBetween(String value1, String value2) {
            addCriterion("brakeRadio not between", value1, value2, "brakeradio");
            return (Criteria) this;
        }

        public Criteria andBraketextIsNull() {
            addCriterion("brakeText is null");
            return (Criteria) this;
        }

        public Criteria andBraketextIsNotNull() {
            addCriterion("brakeText is not null");
            return (Criteria) this;
        }

        public Criteria andBraketextEqualTo(String value) {
            addCriterion("brakeText =", value, "braketext");
            return (Criteria) this;
        }

        public Criteria andBraketextNotEqualTo(String value) {
            addCriterion("brakeText <>", value, "braketext");
            return (Criteria) this;
        }

        public Criteria andBraketextGreaterThan(String value) {
            addCriterion("brakeText >", value, "braketext");
            return (Criteria) this;
        }

        public Criteria andBraketextGreaterThanOrEqualTo(String value) {
            addCriterion("brakeText >=", value, "braketext");
            return (Criteria) this;
        }

        public Criteria andBraketextLessThan(String value) {
            addCriterion("brakeText <", value, "braketext");
            return (Criteria) this;
        }

        public Criteria andBraketextLessThanOrEqualTo(String value) {
            addCriterion("brakeText <=", value, "braketext");
            return (Criteria) this;
        }

        public Criteria andBraketextLike(String value) {
            addCriterion("brakeText like", value, "braketext");
            return (Criteria) this;
        }

        public Criteria andBraketextNotLike(String value) {
            addCriterion("brakeText not like", value, "braketext");
            return (Criteria) this;
        }

        public Criteria andBraketextIn(List<String> values) {
            addCriterion("brakeText in", values, "braketext");
            return (Criteria) this;
        }

        public Criteria andBraketextNotIn(List<String> values) {
            addCriterion("brakeText not in", values, "braketext");
            return (Criteria) this;
        }

        public Criteria andBraketextBetween(String value1, String value2) {
            addCriterion("brakeText between", value1, value2, "braketext");
            return (Criteria) this;
        }

        public Criteria andBraketextNotBetween(String value1, String value2) {
            addCriterion("brakeText not between", value1, value2, "braketext");
            return (Criteria) this;
        }

        public Criteria andBrakeboxIsNull() {
            addCriterion("brakeBox is null");
            return (Criteria) this;
        }

        public Criteria andBrakeboxIsNotNull() {
            addCriterion("brakeBox is not null");
            return (Criteria) this;
        }

        public Criteria andBrakeboxEqualTo(String value) {
            addCriterion("brakeBox =", value, "brakebox");
            return (Criteria) this;
        }

        public Criteria andBrakeboxNotEqualTo(String value) {
            addCriterion("brakeBox <>", value, "brakebox");
            return (Criteria) this;
        }

        public Criteria andBrakeboxGreaterThan(String value) {
            addCriterion("brakeBox >", value, "brakebox");
            return (Criteria) this;
        }

        public Criteria andBrakeboxGreaterThanOrEqualTo(String value) {
            addCriterion("brakeBox >=", value, "brakebox");
            return (Criteria) this;
        }

        public Criteria andBrakeboxLessThan(String value) {
            addCriterion("brakeBox <", value, "brakebox");
            return (Criteria) this;
        }

        public Criteria andBrakeboxLessThanOrEqualTo(String value) {
            addCriterion("brakeBox <=", value, "brakebox");
            return (Criteria) this;
        }

        public Criteria andBrakeboxLike(String value) {
            addCriterion("brakeBox like", value, "brakebox");
            return (Criteria) this;
        }

        public Criteria andBrakeboxNotLike(String value) {
            addCriterion("brakeBox not like", value, "brakebox");
            return (Criteria) this;
        }

        public Criteria andBrakeboxIn(List<String> values) {
            addCriterion("brakeBox in", values, "brakebox");
            return (Criteria) this;
        }

        public Criteria andBrakeboxNotIn(List<String> values) {
            addCriterion("brakeBox not in", values, "brakebox");
            return (Criteria) this;
        }

        public Criteria andBrakeboxBetween(String value1, String value2) {
            addCriterion("brakeBox between", value1, value2, "brakebox");
            return (Criteria) this;
        }

        public Criteria andBrakeboxNotBetween(String value1, String value2) {
            addCriterion("brakeBox not between", value1, value2, "brakebox");
            return (Criteria) this;
        }

        public Criteria andEngineradioIsNull() {
            addCriterion("engineRadio is null");
            return (Criteria) this;
        }

        public Criteria andEngineradioIsNotNull() {
            addCriterion("engineRadio is not null");
            return (Criteria) this;
        }

        public Criteria andEngineradioEqualTo(String value) {
            addCriterion("engineRadio =", value, "engineradio");
            return (Criteria) this;
        }

        public Criteria andEngineradioNotEqualTo(String value) {
            addCriterion("engineRadio <>", value, "engineradio");
            return (Criteria) this;
        }

        public Criteria andEngineradioGreaterThan(String value) {
            addCriterion("engineRadio >", value, "engineradio");
            return (Criteria) this;
        }

        public Criteria andEngineradioGreaterThanOrEqualTo(String value) {
            addCriterion("engineRadio >=", value, "engineradio");
            return (Criteria) this;
        }

        public Criteria andEngineradioLessThan(String value) {
            addCriterion("engineRadio <", value, "engineradio");
            return (Criteria) this;
        }

        public Criteria andEngineradioLessThanOrEqualTo(String value) {
            addCriterion("engineRadio <=", value, "engineradio");
            return (Criteria) this;
        }

        public Criteria andEngineradioLike(String value) {
            addCriterion("engineRadio like", value, "engineradio");
            return (Criteria) this;
        }

        public Criteria andEngineradioNotLike(String value) {
            addCriterion("engineRadio not like", value, "engineradio");
            return (Criteria) this;
        }

        public Criteria andEngineradioIn(List<String> values) {
            addCriterion("engineRadio in", values, "engineradio");
            return (Criteria) this;
        }

        public Criteria andEngineradioNotIn(List<String> values) {
            addCriterion("engineRadio not in", values, "engineradio");
            return (Criteria) this;
        }

        public Criteria andEngineradioBetween(String value1, String value2) {
            addCriterion("engineRadio between", value1, value2, "engineradio");
            return (Criteria) this;
        }

        public Criteria andEngineradioNotBetween(String value1, String value2) {
            addCriterion("engineRadio not between", value1, value2, "engineradio");
            return (Criteria) this;
        }

        public Criteria andEnginetextIsNull() {
            addCriterion("engineText is null");
            return (Criteria) this;
        }

        public Criteria andEnginetextIsNotNull() {
            addCriterion("engineText is not null");
            return (Criteria) this;
        }

        public Criteria andEnginetextEqualTo(String value) {
            addCriterion("engineText =", value, "enginetext");
            return (Criteria) this;
        }

        public Criteria andEnginetextNotEqualTo(String value) {
            addCriterion("engineText <>", value, "enginetext");
            return (Criteria) this;
        }

        public Criteria andEnginetextGreaterThan(String value) {
            addCriterion("engineText >", value, "enginetext");
            return (Criteria) this;
        }

        public Criteria andEnginetextGreaterThanOrEqualTo(String value) {
            addCriterion("engineText >=", value, "enginetext");
            return (Criteria) this;
        }

        public Criteria andEnginetextLessThan(String value) {
            addCriterion("engineText <", value, "enginetext");
            return (Criteria) this;
        }

        public Criteria andEnginetextLessThanOrEqualTo(String value) {
            addCriterion("engineText <=", value, "enginetext");
            return (Criteria) this;
        }

        public Criteria andEnginetextLike(String value) {
            addCriterion("engineText like", value, "enginetext");
            return (Criteria) this;
        }

        public Criteria andEnginetextNotLike(String value) {
            addCriterion("engineText not like", value, "enginetext");
            return (Criteria) this;
        }

        public Criteria andEnginetextIn(List<String> values) {
            addCriterion("engineText in", values, "enginetext");
            return (Criteria) this;
        }

        public Criteria andEnginetextNotIn(List<String> values) {
            addCriterion("engineText not in", values, "enginetext");
            return (Criteria) this;
        }

        public Criteria andEnginetextBetween(String value1, String value2) {
            addCriterion("engineText between", value1, value2, "enginetext");
            return (Criteria) this;
        }

        public Criteria andEnginetextNotBetween(String value1, String value2) {
            addCriterion("engineText not between", value1, value2, "enginetext");
            return (Criteria) this;
        }

        public Criteria andEngineboxIsNull() {
            addCriterion("engineBox is null");
            return (Criteria) this;
        }

        public Criteria andEngineboxIsNotNull() {
            addCriterion("engineBox is not null");
            return (Criteria) this;
        }

        public Criteria andEngineboxEqualTo(String value) {
            addCriterion("engineBox =", value, "enginebox");
            return (Criteria) this;
        }

        public Criteria andEngineboxNotEqualTo(String value) {
            addCriterion("engineBox <>", value, "enginebox");
            return (Criteria) this;
        }

        public Criteria andEngineboxGreaterThan(String value) {
            addCriterion("engineBox >", value, "enginebox");
            return (Criteria) this;
        }

        public Criteria andEngineboxGreaterThanOrEqualTo(String value) {
            addCriterion("engineBox >=", value, "enginebox");
            return (Criteria) this;
        }

        public Criteria andEngineboxLessThan(String value) {
            addCriterion("engineBox <", value, "enginebox");
            return (Criteria) this;
        }

        public Criteria andEngineboxLessThanOrEqualTo(String value) {
            addCriterion("engineBox <=", value, "enginebox");
            return (Criteria) this;
        }

        public Criteria andEngineboxLike(String value) {
            addCriterion("engineBox like", value, "enginebox");
            return (Criteria) this;
        }

        public Criteria andEngineboxNotLike(String value) {
            addCriterion("engineBox not like", value, "enginebox");
            return (Criteria) this;
        }

        public Criteria andEngineboxIn(List<String> values) {
            addCriterion("engineBox in", values, "enginebox");
            return (Criteria) this;
        }

        public Criteria andEngineboxNotIn(List<String> values) {
            addCriterion("engineBox not in", values, "enginebox");
            return (Criteria) this;
        }

        public Criteria andEngineboxBetween(String value1, String value2) {
            addCriterion("engineBox between", value1, value2, "enginebox");
            return (Criteria) this;
        }

        public Criteria andEngineboxNotBetween(String value1, String value2) {
            addCriterion("engineBox not between", value1, value2, "enginebox");
            return (Criteria) this;
        }

        public Criteria andTransmissionradioIsNull() {
            addCriterion("transmissionRadio is null");
            return (Criteria) this;
        }

        public Criteria andTransmissionradioIsNotNull() {
            addCriterion("transmissionRadio is not null");
            return (Criteria) this;
        }

        public Criteria andTransmissionradioEqualTo(String value) {
            addCriterion("transmissionRadio =", value, "transmissionradio");
            return (Criteria) this;
        }

        public Criteria andTransmissionradioNotEqualTo(String value) {
            addCriterion("transmissionRadio <>", value, "transmissionradio");
            return (Criteria) this;
        }

        public Criteria andTransmissionradioGreaterThan(String value) {
            addCriterion("transmissionRadio >", value, "transmissionradio");
            return (Criteria) this;
        }

        public Criteria andTransmissionradioGreaterThanOrEqualTo(String value) {
            addCriterion("transmissionRadio >=", value, "transmissionradio");
            return (Criteria) this;
        }

        public Criteria andTransmissionradioLessThan(String value) {
            addCriterion("transmissionRadio <", value, "transmissionradio");
            return (Criteria) this;
        }

        public Criteria andTransmissionradioLessThanOrEqualTo(String value) {
            addCriterion("transmissionRadio <=", value, "transmissionradio");
            return (Criteria) this;
        }

        public Criteria andTransmissionradioLike(String value) {
            addCriterion("transmissionRadio like", value, "transmissionradio");
            return (Criteria) this;
        }

        public Criteria andTransmissionradioNotLike(String value) {
            addCriterion("transmissionRadio not like", value, "transmissionradio");
            return (Criteria) this;
        }

        public Criteria andTransmissionradioIn(List<String> values) {
            addCriterion("transmissionRadio in", values, "transmissionradio");
            return (Criteria) this;
        }

        public Criteria andTransmissionradioNotIn(List<String> values) {
            addCriterion("transmissionRadio not in", values, "transmissionradio");
            return (Criteria) this;
        }

        public Criteria andTransmissionradioBetween(String value1, String value2) {
            addCriterion("transmissionRadio between", value1, value2, "transmissionradio");
            return (Criteria) this;
        }

        public Criteria andTransmissionradioNotBetween(String value1, String value2) {
            addCriterion("transmissionRadio not between", value1, value2, "transmissionradio");
            return (Criteria) this;
        }

        public Criteria andTransmissiontextIsNull() {
            addCriterion("transmissionText is null");
            return (Criteria) this;
        }

        public Criteria andTransmissiontextIsNotNull() {
            addCriterion("transmissionText is not null");
            return (Criteria) this;
        }

        public Criteria andTransmissiontextEqualTo(String value) {
            addCriterion("transmissionText =", value, "transmissiontext");
            return (Criteria) this;
        }

        public Criteria andTransmissiontextNotEqualTo(String value) {
            addCriterion("transmissionText <>", value, "transmissiontext");
            return (Criteria) this;
        }

        public Criteria andTransmissiontextGreaterThan(String value) {
            addCriterion("transmissionText >", value, "transmissiontext");
            return (Criteria) this;
        }

        public Criteria andTransmissiontextGreaterThanOrEqualTo(String value) {
            addCriterion("transmissionText >=", value, "transmissiontext");
            return (Criteria) this;
        }

        public Criteria andTransmissiontextLessThan(String value) {
            addCriterion("transmissionText <", value, "transmissiontext");
            return (Criteria) this;
        }

        public Criteria andTransmissiontextLessThanOrEqualTo(String value) {
            addCriterion("transmissionText <=", value, "transmissiontext");
            return (Criteria) this;
        }

        public Criteria andTransmissiontextLike(String value) {
            addCriterion("transmissionText like", value, "transmissiontext");
            return (Criteria) this;
        }

        public Criteria andTransmissiontextNotLike(String value) {
            addCriterion("transmissionText not like", value, "transmissiontext");
            return (Criteria) this;
        }

        public Criteria andTransmissiontextIn(List<String> values) {
            addCriterion("transmissionText in", values, "transmissiontext");
            return (Criteria) this;
        }

        public Criteria andTransmissiontextNotIn(List<String> values) {
            addCriterion("transmissionText not in", values, "transmissiontext");
            return (Criteria) this;
        }

        public Criteria andTransmissiontextBetween(String value1, String value2) {
            addCriterion("transmissionText between", value1, value2, "transmissiontext");
            return (Criteria) this;
        }

        public Criteria andTransmissiontextNotBetween(String value1, String value2) {
            addCriterion("transmissionText not between", value1, value2, "transmissiontext");
            return (Criteria) this;
        }

        public Criteria andTransmissionboxIsNull() {
            addCriterion("transmissionBox is null");
            return (Criteria) this;
        }

        public Criteria andTransmissionboxIsNotNull() {
            addCriterion("transmissionBox is not null");
            return (Criteria) this;
        }

        public Criteria andTransmissionboxEqualTo(String value) {
            addCriterion("transmissionBox =", value, "transmissionbox");
            return (Criteria) this;
        }

        public Criteria andTransmissionboxNotEqualTo(String value) {
            addCriterion("transmissionBox <>", value, "transmissionbox");
            return (Criteria) this;
        }

        public Criteria andTransmissionboxGreaterThan(String value) {
            addCriterion("transmissionBox >", value, "transmissionbox");
            return (Criteria) this;
        }

        public Criteria andTransmissionboxGreaterThanOrEqualTo(String value) {
            addCriterion("transmissionBox >=", value, "transmissionbox");
            return (Criteria) this;
        }

        public Criteria andTransmissionboxLessThan(String value) {
            addCriterion("transmissionBox <", value, "transmissionbox");
            return (Criteria) this;
        }

        public Criteria andTransmissionboxLessThanOrEqualTo(String value) {
            addCriterion("transmissionBox <=", value, "transmissionbox");
            return (Criteria) this;
        }

        public Criteria andTransmissionboxLike(String value) {
            addCriterion("transmissionBox like", value, "transmissionbox");
            return (Criteria) this;
        }

        public Criteria andTransmissionboxNotLike(String value) {
            addCriterion("transmissionBox not like", value, "transmissionbox");
            return (Criteria) this;
        }

        public Criteria andTransmissionboxIn(List<String> values) {
            addCriterion("transmissionBox in", values, "transmissionbox");
            return (Criteria) this;
        }

        public Criteria andTransmissionboxNotIn(List<String> values) {
            addCriterion("transmissionBox not in", values, "transmissionbox");
            return (Criteria) this;
        }

        public Criteria andTransmissionboxBetween(String value1, String value2) {
            addCriterion("transmissionBox between", value1, value2, "transmissionbox");
            return (Criteria) this;
        }

        public Criteria andTransmissionboxNotBetween(String value1, String value2) {
            addCriterion("transmissionBox not between", value1, value2, "transmissionbox");
            return (Criteria) this;
        }

        public Criteria andClutchradioIsNull() {
            addCriterion("clutchRadio is null");
            return (Criteria) this;
        }

        public Criteria andClutchradioIsNotNull() {
            addCriterion("clutchRadio is not null");
            return (Criteria) this;
        }

        public Criteria andClutchradioEqualTo(String value) {
            addCriterion("clutchRadio =", value, "clutchradio");
            return (Criteria) this;
        }

        public Criteria andClutchradioNotEqualTo(String value) {
            addCriterion("clutchRadio <>", value, "clutchradio");
            return (Criteria) this;
        }

        public Criteria andClutchradioGreaterThan(String value) {
            addCriterion("clutchRadio >", value, "clutchradio");
            return (Criteria) this;
        }

        public Criteria andClutchradioGreaterThanOrEqualTo(String value) {
            addCriterion("clutchRadio >=", value, "clutchradio");
            return (Criteria) this;
        }

        public Criteria andClutchradioLessThan(String value) {
            addCriterion("clutchRadio <", value, "clutchradio");
            return (Criteria) this;
        }

        public Criteria andClutchradioLessThanOrEqualTo(String value) {
            addCriterion("clutchRadio <=", value, "clutchradio");
            return (Criteria) this;
        }

        public Criteria andClutchradioLike(String value) {
            addCriterion("clutchRadio like", value, "clutchradio");
            return (Criteria) this;
        }

        public Criteria andClutchradioNotLike(String value) {
            addCriterion("clutchRadio not like", value, "clutchradio");
            return (Criteria) this;
        }

        public Criteria andClutchradioIn(List<String> values) {
            addCriterion("clutchRadio in", values, "clutchradio");
            return (Criteria) this;
        }

        public Criteria andClutchradioNotIn(List<String> values) {
            addCriterion("clutchRadio not in", values, "clutchradio");
            return (Criteria) this;
        }

        public Criteria andClutchradioBetween(String value1, String value2) {
            addCriterion("clutchRadio between", value1, value2, "clutchradio");
            return (Criteria) this;
        }

        public Criteria andClutchradioNotBetween(String value1, String value2) {
            addCriterion("clutchRadio not between", value1, value2, "clutchradio");
            return (Criteria) this;
        }

        public Criteria andClutchtextIsNull() {
            addCriterion("clutchText is null");
            return (Criteria) this;
        }

        public Criteria andClutchtextIsNotNull() {
            addCriterion("clutchText is not null");
            return (Criteria) this;
        }

        public Criteria andClutchtextEqualTo(String value) {
            addCriterion("clutchText =", value, "clutchtext");
            return (Criteria) this;
        }

        public Criteria andClutchtextNotEqualTo(String value) {
            addCriterion("clutchText <>", value, "clutchtext");
            return (Criteria) this;
        }

        public Criteria andClutchtextGreaterThan(String value) {
            addCriterion("clutchText >", value, "clutchtext");
            return (Criteria) this;
        }

        public Criteria andClutchtextGreaterThanOrEqualTo(String value) {
            addCriterion("clutchText >=", value, "clutchtext");
            return (Criteria) this;
        }

        public Criteria andClutchtextLessThan(String value) {
            addCriterion("clutchText <", value, "clutchtext");
            return (Criteria) this;
        }

        public Criteria andClutchtextLessThanOrEqualTo(String value) {
            addCriterion("clutchText <=", value, "clutchtext");
            return (Criteria) this;
        }

        public Criteria andClutchtextLike(String value) {
            addCriterion("clutchText like", value, "clutchtext");
            return (Criteria) this;
        }

        public Criteria andClutchtextNotLike(String value) {
            addCriterion("clutchText not like", value, "clutchtext");
            return (Criteria) this;
        }

        public Criteria andClutchtextIn(List<String> values) {
            addCriterion("clutchText in", values, "clutchtext");
            return (Criteria) this;
        }

        public Criteria andClutchtextNotIn(List<String> values) {
            addCriterion("clutchText not in", values, "clutchtext");
            return (Criteria) this;
        }

        public Criteria andClutchtextBetween(String value1, String value2) {
            addCriterion("clutchText between", value1, value2, "clutchtext");
            return (Criteria) this;
        }

        public Criteria andClutchtextNotBetween(String value1, String value2) {
            addCriterion("clutchText not between", value1, value2, "clutchtext");
            return (Criteria) this;
        }

        public Criteria andClutchboxIsNull() {
            addCriterion("clutchBox is null");
            return (Criteria) this;
        }

        public Criteria andClutchboxIsNotNull() {
            addCriterion("clutchBox is not null");
            return (Criteria) this;
        }

        public Criteria andClutchboxEqualTo(String value) {
            addCriterion("clutchBox =", value, "clutchbox");
            return (Criteria) this;
        }

        public Criteria andClutchboxNotEqualTo(String value) {
            addCriterion("clutchBox <>", value, "clutchbox");
            return (Criteria) this;
        }

        public Criteria andClutchboxGreaterThan(String value) {
            addCriterion("clutchBox >", value, "clutchbox");
            return (Criteria) this;
        }

        public Criteria andClutchboxGreaterThanOrEqualTo(String value) {
            addCriterion("clutchBox >=", value, "clutchbox");
            return (Criteria) this;
        }

        public Criteria andClutchboxLessThan(String value) {
            addCriterion("clutchBox <", value, "clutchbox");
            return (Criteria) this;
        }

        public Criteria andClutchboxLessThanOrEqualTo(String value) {
            addCriterion("clutchBox <=", value, "clutchbox");
            return (Criteria) this;
        }

        public Criteria andClutchboxLike(String value) {
            addCriterion("clutchBox like", value, "clutchbox");
            return (Criteria) this;
        }

        public Criteria andClutchboxNotLike(String value) {
            addCriterion("clutchBox not like", value, "clutchbox");
            return (Criteria) this;
        }

        public Criteria andClutchboxIn(List<String> values) {
            addCriterion("clutchBox in", values, "clutchbox");
            return (Criteria) this;
        }

        public Criteria andClutchboxNotIn(List<String> values) {
            addCriterion("clutchBox not in", values, "clutchbox");
            return (Criteria) this;
        }

        public Criteria andClutchboxBetween(String value1, String value2) {
            addCriterion("clutchBox between", value1, value2, "clutchbox");
            return (Criteria) this;
        }

        public Criteria andClutchboxNotBetween(String value1, String value2) {
            addCriterion("clutchBox not between", value1, value2, "clutchbox");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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