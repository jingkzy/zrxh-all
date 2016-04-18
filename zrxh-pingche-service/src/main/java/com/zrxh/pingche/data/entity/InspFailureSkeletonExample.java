package com.zrxh.pingche.data.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InspFailureSkeletonExample implements java.io.Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InspFailureSkeletonExample() {
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

        public Criteria andPartcodeIsNull() {
            addCriterion("partCode is null");
            return (Criteria) this;
        }

        public Criteria andPartcodeIsNotNull() {
            addCriterion("partCode is not null");
            return (Criteria) this;
        }

        public Criteria andPartcodeEqualTo(String value) {
            addCriterion("partCode =", value, "partcode");
            return (Criteria) this;
        }

        public Criteria andPartcodeNotEqualTo(String value) {
            addCriterion("partCode <>", value, "partcode");
            return (Criteria) this;
        }

        public Criteria andPartcodeGreaterThan(String value) {
            addCriterion("partCode >", value, "partcode");
            return (Criteria) this;
        }

        public Criteria andPartcodeGreaterThanOrEqualTo(String value) {
            addCriterion("partCode >=", value, "partcode");
            return (Criteria) this;
        }

        public Criteria andPartcodeLessThan(String value) {
            addCriterion("partCode <", value, "partcode");
            return (Criteria) this;
        }

        public Criteria andPartcodeLessThanOrEqualTo(String value) {
            addCriterion("partCode <=", value, "partcode");
            return (Criteria) this;
        }

        public Criteria andPartcodeLike(String value) {
            addCriterion("partCode like", value, "partcode");
            return (Criteria) this;
        }

        public Criteria andPartcodeNotLike(String value) {
            addCriterion("partCode not like", value, "partcode");
            return (Criteria) this;
        }

        public Criteria andPartcodeIn(List<String> values) {
            addCriterion("partCode in", values, "partcode");
            return (Criteria) this;
        }

        public Criteria andPartcodeNotIn(List<String> values) {
            addCriterion("partCode not in", values, "partcode");
            return (Criteria) this;
        }

        public Criteria andPartcodeBetween(String value1, String value2) {
            addCriterion("partCode between", value1, value2, "partcode");
            return (Criteria) this;
        }

        public Criteria andPartcodeNotBetween(String value1, String value2) {
            addCriterion("partCode not between", value1, value2, "partcode");
            return (Criteria) this;
        }

        public Criteria andPartnameIsNull() {
            addCriterion("partName is null");
            return (Criteria) this;
        }

        public Criteria andPartnameIsNotNull() {
            addCriterion("partName is not null");
            return (Criteria) this;
        }

        public Criteria andPartnameEqualTo(String value) {
            addCriterion("partName =", value, "partname");
            return (Criteria) this;
        }

        public Criteria andPartnameNotEqualTo(String value) {
            addCriterion("partName <>", value, "partname");
            return (Criteria) this;
        }

        public Criteria andPartnameGreaterThan(String value) {
            addCriterion("partName >", value, "partname");
            return (Criteria) this;
        }

        public Criteria andPartnameGreaterThanOrEqualTo(String value) {
            addCriterion("partName >=", value, "partname");
            return (Criteria) this;
        }

        public Criteria andPartnameLessThan(String value) {
            addCriterion("partName <", value, "partname");
            return (Criteria) this;
        }

        public Criteria andPartnameLessThanOrEqualTo(String value) {
            addCriterion("partName <=", value, "partname");
            return (Criteria) this;
        }

        public Criteria andPartnameLike(String value) {
            addCriterion("partName like", value, "partname");
            return (Criteria) this;
        }

        public Criteria andPartnameNotLike(String value) {
            addCriterion("partName not like", value, "partname");
            return (Criteria) this;
        }

        public Criteria andPartnameIn(List<String> values) {
            addCriterion("partName in", values, "partname");
            return (Criteria) this;
        }

        public Criteria andPartnameNotIn(List<String> values) {
            addCriterion("partName not in", values, "partname");
            return (Criteria) this;
        }

        public Criteria andPartnameBetween(String value1, String value2) {
            addCriterion("partName between", value1, value2, "partname");
            return (Criteria) this;
        }

        public Criteria andPartnameNotBetween(String value1, String value2) {
            addCriterion("partName not between", value1, value2, "partname");
            return (Criteria) this;
        }

        public Criteria andCrashbeamIsNull() {
            addCriterion("crashBeam is null");
            return (Criteria) this;
        }

        public Criteria andCrashbeamIsNotNull() {
            addCriterion("crashBeam is not null");
            return (Criteria) this;
        }

        public Criteria andCrashbeamEqualTo(String value) {
            addCriterion("crashBeam =", value, "crashbeam");
            return (Criteria) this;
        }

        public Criteria andCrashbeamNotEqualTo(String value) {
            addCriterion("crashBeam <>", value, "crashbeam");
            return (Criteria) this;
        }

        public Criteria andCrashbeamGreaterThan(String value) {
            addCriterion("crashBeam >", value, "crashbeam");
            return (Criteria) this;
        }

        public Criteria andCrashbeamGreaterThanOrEqualTo(String value) {
            addCriterion("crashBeam >=", value, "crashbeam");
            return (Criteria) this;
        }

        public Criteria andCrashbeamLessThan(String value) {
            addCriterion("crashBeam <", value, "crashbeam");
            return (Criteria) this;
        }

        public Criteria andCrashbeamLessThanOrEqualTo(String value) {
            addCriterion("crashBeam <=", value, "crashbeam");
            return (Criteria) this;
        }

        public Criteria andCrashbeamLike(String value) {
            addCriterion("crashBeam like", value, "crashbeam");
            return (Criteria) this;
        }

        public Criteria andCrashbeamNotLike(String value) {
            addCriterion("crashBeam not like", value, "crashbeam");
            return (Criteria) this;
        }

        public Criteria andCrashbeamIn(List<String> values) {
            addCriterion("crashBeam in", values, "crashbeam");
            return (Criteria) this;
        }

        public Criteria andCrashbeamNotIn(List<String> values) {
            addCriterion("crashBeam not in", values, "crashbeam");
            return (Criteria) this;
        }

        public Criteria andCrashbeamBetween(String value1, String value2) {
            addCriterion("crashBeam between", value1, value2, "crashbeam");
            return (Criteria) this;
        }

        public Criteria andCrashbeamNotBetween(String value1, String value2) {
            addCriterion("crashBeam not between", value1, value2, "crashbeam");
            return (Criteria) this;
        }

        public Criteria andDamagedegreeIsNull() {
            addCriterion("damageDegree is null");
            return (Criteria) this;
        }

        public Criteria andDamagedegreeIsNotNull() {
            addCriterion("damageDegree is not null");
            return (Criteria) this;
        }

        public Criteria andDamagedegreeEqualTo(String value) {
            addCriterion("damageDegree =", value, "damagedegree");
            return (Criteria) this;
        }

        public Criteria andDamagedegreeNotEqualTo(String value) {
            addCriterion("damageDegree <>", value, "damagedegree");
            return (Criteria) this;
        }

        public Criteria andDamagedegreeGreaterThan(String value) {
            addCriterion("damageDegree >", value, "damagedegree");
            return (Criteria) this;
        }

        public Criteria andDamagedegreeGreaterThanOrEqualTo(String value) {
            addCriterion("damageDegree >=", value, "damagedegree");
            return (Criteria) this;
        }

        public Criteria andDamagedegreeLessThan(String value) {
            addCriterion("damageDegree <", value, "damagedegree");
            return (Criteria) this;
        }

        public Criteria andDamagedegreeLessThanOrEqualTo(String value) {
            addCriterion("damageDegree <=", value, "damagedegree");
            return (Criteria) this;
        }

        public Criteria andDamagedegreeLike(String value) {
            addCriterion("damageDegree like", value, "damagedegree");
            return (Criteria) this;
        }

        public Criteria andDamagedegreeNotLike(String value) {
            addCriterion("damageDegree not like", value, "damagedegree");
            return (Criteria) this;
        }

        public Criteria andDamagedegreeIn(List<String> values) {
            addCriterion("damageDegree in", values, "damagedegree");
            return (Criteria) this;
        }

        public Criteria andDamagedegreeNotIn(List<String> values) {
            addCriterion("damageDegree not in", values, "damagedegree");
            return (Criteria) this;
        }

        public Criteria andDamagedegreeBetween(String value1, String value2) {
            addCriterion("damageDegree between", value1, value2, "damagedegree");
            return (Criteria) this;
        }

        public Criteria andDamagedegreeNotBetween(String value1, String value2) {
            addCriterion("damageDegree not between", value1, value2, "damagedegree");
            return (Criteria) this;
        }

        public Criteria andCaridIsNull() {
            addCriterion("carID is null");
            return (Criteria) this;
        }

        public Criteria andCaridIsNotNull() {
            addCriterion("carID is not null");
            return (Criteria) this;
        }

        public Criteria andCaridEqualTo(Integer value) {
            addCriterion("carID =", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotEqualTo(Integer value) {
            addCriterion("carID <>", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridGreaterThan(Integer value) {
            addCriterion("carID >", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridGreaterThanOrEqualTo(Integer value) {
            addCriterion("carID >=", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridLessThan(Integer value) {
            addCriterion("carID <", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridLessThanOrEqualTo(Integer value) {
            addCriterion("carID <=", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridIn(List<Integer> values) {
            addCriterion("carID in", values, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotIn(List<Integer> values) {
            addCriterion("carID not in", values, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridBetween(Integer value1, Integer value2) {
            addCriterion("carID between", value1, value2, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotBetween(Integer value1, Integer value2) {
            addCriterion("carID not between", value1, value2, "carid");
            return (Criteria) this;
        }

        public Criteria andXaxisIsNull() {
            addCriterion("XAxis is null");
            return (Criteria) this;
        }

        public Criteria andXaxisIsNotNull() {
            addCriterion("XAxis is not null");
            return (Criteria) this;
        }

        public Criteria andXaxisEqualTo(Integer value) {
            addCriterion("XAxis =", value, "xaxis");
            return (Criteria) this;
        }

        public Criteria andXaxisNotEqualTo(Integer value) {
            addCriterion("XAxis <>", value, "xaxis");
            return (Criteria) this;
        }

        public Criteria andXaxisGreaterThan(Integer value) {
            addCriterion("XAxis >", value, "xaxis");
            return (Criteria) this;
        }

        public Criteria andXaxisGreaterThanOrEqualTo(Integer value) {
            addCriterion("XAxis >=", value, "xaxis");
            return (Criteria) this;
        }

        public Criteria andXaxisLessThan(Integer value) {
            addCriterion("XAxis <", value, "xaxis");
            return (Criteria) this;
        }

        public Criteria andXaxisLessThanOrEqualTo(Integer value) {
            addCriterion("XAxis <=", value, "xaxis");
            return (Criteria) this;
        }

        public Criteria andXaxisIn(List<Integer> values) {
            addCriterion("XAxis in", values, "xaxis");
            return (Criteria) this;
        }

        public Criteria andXaxisNotIn(List<Integer> values) {
            addCriterion("XAxis not in", values, "xaxis");
            return (Criteria) this;
        }

        public Criteria andXaxisBetween(Integer value1, Integer value2) {
            addCriterion("XAxis between", value1, value2, "xaxis");
            return (Criteria) this;
        }

        public Criteria andXaxisNotBetween(Integer value1, Integer value2) {
            addCriterion("XAxis not between", value1, value2, "xaxis");
            return (Criteria) this;
        }

        public Criteria andYaxisIsNull() {
            addCriterion("YAxis is null");
            return (Criteria) this;
        }

        public Criteria andYaxisIsNotNull() {
            addCriterion("YAxis is not null");
            return (Criteria) this;
        }

        public Criteria andYaxisEqualTo(Integer value) {
            addCriterion("YAxis =", value, "yaxis");
            return (Criteria) this;
        }

        public Criteria andYaxisNotEqualTo(Integer value) {
            addCriterion("YAxis <>", value, "yaxis");
            return (Criteria) this;
        }

        public Criteria andYaxisGreaterThan(Integer value) {
            addCriterion("YAxis >", value, "yaxis");
            return (Criteria) this;
        }

        public Criteria andYaxisGreaterThanOrEqualTo(Integer value) {
            addCriterion("YAxis >=", value, "yaxis");
            return (Criteria) this;
        }

        public Criteria andYaxisLessThan(Integer value) {
            addCriterion("YAxis <", value, "yaxis");
            return (Criteria) this;
        }

        public Criteria andYaxisLessThanOrEqualTo(Integer value) {
            addCriterion("YAxis <=", value, "yaxis");
            return (Criteria) this;
        }

        public Criteria andYaxisIn(List<Integer> values) {
            addCriterion("YAxis in", values, "yaxis");
            return (Criteria) this;
        }

        public Criteria andYaxisNotIn(List<Integer> values) {
            addCriterion("YAxis not in", values, "yaxis");
            return (Criteria) this;
        }

        public Criteria andYaxisBetween(Integer value1, Integer value2) {
            addCriterion("YAxis between", value1, value2, "yaxis");
            return (Criteria) this;
        }

        public Criteria andYaxisNotBetween(Integer value1, Integer value2) {
            addCriterion("YAxis not between", value1, value2, "yaxis");
            return (Criteria) this;
        }

        public Criteria andColorIsNull() {
            addCriterion("Color is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("Color is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("Color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("Color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("Color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("Color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("Color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("Color <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("Color like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("Color not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("Color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("Color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("Color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("Color not between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andPartNameIsNull() {
            addCriterion("Part_name is null");
            return (Criteria) this;
        }

        public Criteria andPartNameIsNotNull() {
            addCriterion("Part_name is not null");
            return (Criteria) this;
        }

        public Criteria andPartNameEqualTo(String value) {
            addCriterion("Part_name =", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameNotEqualTo(String value) {
            addCriterion("Part_name <>", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameGreaterThan(String value) {
            addCriterion("Part_name >", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameGreaterThanOrEqualTo(String value) {
            addCriterion("Part_name >=", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameLessThan(String value) {
            addCriterion("Part_name <", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameLessThanOrEqualTo(String value) {
            addCriterion("Part_name <=", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameLike(String value) {
            addCriterion("Part_name like", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameNotLike(String value) {
            addCriterion("Part_name not like", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameIn(List<String> values) {
            addCriterion("Part_name in", values, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameNotIn(List<String> values) {
            addCriterion("Part_name not in", values, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameBetween(String value1, String value2) {
            addCriterion("Part_name between", value1, value2, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameNotBetween(String value1, String value2) {
            addCriterion("Part_name not between", value1, value2, "partName");
            return (Criteria) this;
        }

        public Criteria andSkeletonboxIsNull() {
            addCriterion("SkeletonBox is null");
            return (Criteria) this;
        }

        public Criteria andSkeletonboxIsNotNull() {
            addCriterion("SkeletonBox is not null");
            return (Criteria) this;
        }

        public Criteria andSkeletonboxEqualTo(String value) {
            addCriterion("SkeletonBox =", value, "skeletonbox");
            return (Criteria) this;
        }

        public Criteria andSkeletonboxNotEqualTo(String value) {
            addCriterion("SkeletonBox <>", value, "skeletonbox");
            return (Criteria) this;
        }

        public Criteria andSkeletonboxGreaterThan(String value) {
            addCriterion("SkeletonBox >", value, "skeletonbox");
            return (Criteria) this;
        }

        public Criteria andSkeletonboxGreaterThanOrEqualTo(String value) {
            addCriterion("SkeletonBox >=", value, "skeletonbox");
            return (Criteria) this;
        }

        public Criteria andSkeletonboxLessThan(String value) {
            addCriterion("SkeletonBox <", value, "skeletonbox");
            return (Criteria) this;
        }

        public Criteria andSkeletonboxLessThanOrEqualTo(String value) {
            addCriterion("SkeletonBox <=", value, "skeletonbox");
            return (Criteria) this;
        }

        public Criteria andSkeletonboxLike(String value) {
            addCriterion("SkeletonBox like", value, "skeletonbox");
            return (Criteria) this;
        }

        public Criteria andSkeletonboxNotLike(String value) {
            addCriterion("SkeletonBox not like", value, "skeletonbox");
            return (Criteria) this;
        }

        public Criteria andSkeletonboxIn(List<String> values) {
            addCriterion("SkeletonBox in", values, "skeletonbox");
            return (Criteria) this;
        }

        public Criteria andSkeletonboxNotIn(List<String> values) {
            addCriterion("SkeletonBox not in", values, "skeletonbox");
            return (Criteria) this;
        }

        public Criteria andSkeletonboxBetween(String value1, String value2) {
            addCriterion("SkeletonBox between", value1, value2, "skeletonbox");
            return (Criteria) this;
        }

        public Criteria andSkeletonboxNotBetween(String value1, String value2) {
            addCriterion("SkeletonBox not between", value1, value2, "skeletonbox");
            return (Criteria) this;
        }

        public Criteria andPhotourlIsNull() {
            addCriterion("PhotoUrl is null");
            return (Criteria) this;
        }

        public Criteria andPhotourlIsNotNull() {
            addCriterion("PhotoUrl is not null");
            return (Criteria) this;
        }

        public Criteria andPhotourlEqualTo(String value) {
            addCriterion("PhotoUrl =", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlNotEqualTo(String value) {
            addCriterion("PhotoUrl <>", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlGreaterThan(String value) {
            addCriterion("PhotoUrl >", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlGreaterThanOrEqualTo(String value) {
            addCriterion("PhotoUrl >=", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlLessThan(String value) {
            addCriterion("PhotoUrl <", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlLessThanOrEqualTo(String value) {
            addCriterion("PhotoUrl <=", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlLike(String value) {
            addCriterion("PhotoUrl like", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlNotLike(String value) {
            addCriterion("PhotoUrl not like", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlIn(List<String> values) {
            addCriterion("PhotoUrl in", values, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlNotIn(List<String> values) {
            addCriterion("PhotoUrl not in", values, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlBetween(String value1, String value2) {
            addCriterion("PhotoUrl between", value1, value2, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlNotBetween(String value1, String value2) {
            addCriterion("PhotoUrl not between", value1, value2, "photourl");
            return (Criteria) this;
        }

        public Criteria andEnglishpartNameIsNull() {
            addCriterion("EnglishPart_name is null");
            return (Criteria) this;
        }

        public Criteria andEnglishpartNameIsNotNull() {
            addCriterion("EnglishPart_name is not null");
            return (Criteria) this;
        }

        public Criteria andEnglishpartNameEqualTo(String value) {
            addCriterion("EnglishPart_name =", value, "englishpartName");
            return (Criteria) this;
        }

        public Criteria andEnglishpartNameNotEqualTo(String value) {
            addCriterion("EnglishPart_name <>", value, "englishpartName");
            return (Criteria) this;
        }

        public Criteria andEnglishpartNameGreaterThan(String value) {
            addCriterion("EnglishPart_name >", value, "englishpartName");
            return (Criteria) this;
        }

        public Criteria andEnglishpartNameGreaterThanOrEqualTo(String value) {
            addCriterion("EnglishPart_name >=", value, "englishpartName");
            return (Criteria) this;
        }

        public Criteria andEnglishpartNameLessThan(String value) {
            addCriterion("EnglishPart_name <", value, "englishpartName");
            return (Criteria) this;
        }

        public Criteria andEnglishpartNameLessThanOrEqualTo(String value) {
            addCriterion("EnglishPart_name <=", value, "englishpartName");
            return (Criteria) this;
        }

        public Criteria andEnglishpartNameLike(String value) {
            addCriterion("EnglishPart_name like", value, "englishpartName");
            return (Criteria) this;
        }

        public Criteria andEnglishpartNameNotLike(String value) {
            addCriterion("EnglishPart_name not like", value, "englishpartName");
            return (Criteria) this;
        }

        public Criteria andEnglishpartNameIn(List<String> values) {
            addCriterion("EnglishPart_name in", values, "englishpartName");
            return (Criteria) this;
        }

        public Criteria andEnglishpartNameNotIn(List<String> values) {
            addCriterion("EnglishPart_name not in", values, "englishpartName");
            return (Criteria) this;
        }

        public Criteria andEnglishpartNameBetween(String value1, String value2) {
            addCriterion("EnglishPart_name between", value1, value2, "englishpartName");
            return (Criteria) this;
        }

        public Criteria andEnglishpartNameNotBetween(String value1, String value2) {
            addCriterion("EnglishPart_name not between", value1, value2, "englishpartName");
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