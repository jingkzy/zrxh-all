package com.zrxh.pingche.data.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InspCarPhotoExample implements java.io.Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InspCarPhotoExample() {
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

        public Criteria andPartnumIsNull() {
            addCriterion("partNum is null");
            return (Criteria) this;
        }

        public Criteria andPartnumIsNotNull() {
            addCriterion("partNum is not null");
            return (Criteria) this;
        }

        public Criteria andPartnumEqualTo(String value) {
            addCriterion("partNum =", value, "partnum");
            return (Criteria) this;
        }

        public Criteria andPartnumNotEqualTo(String value) {
            addCriterion("partNum <>", value, "partnum");
            return (Criteria) this;
        }

        public Criteria andPartnumGreaterThan(String value) {
            addCriterion("partNum >", value, "partnum");
            return (Criteria) this;
        }

        public Criteria andPartnumGreaterThanOrEqualTo(String value) {
            addCriterion("partNum >=", value, "partnum");
            return (Criteria) this;
        }

        public Criteria andPartnumLessThan(String value) {
            addCriterion("partNum <", value, "partnum");
            return (Criteria) this;
        }

        public Criteria andPartnumLessThanOrEqualTo(String value) {
            addCriterion("partNum <=", value, "partnum");
            return (Criteria) this;
        }

        public Criteria andPartnumLike(String value) {
            addCriterion("partNum like", value, "partnum");
            return (Criteria) this;
        }

        public Criteria andPartnumNotLike(String value) {
            addCriterion("partNum not like", value, "partnum");
            return (Criteria) this;
        }

        public Criteria andPartnumIn(List<String> values) {
            addCriterion("partNum in", values, "partnum");
            return (Criteria) this;
        }

        public Criteria andPartnumNotIn(List<String> values) {
            addCriterion("partNum not in", values, "partnum");
            return (Criteria) this;
        }

        public Criteria andPartnumBetween(String value1, String value2) {
            addCriterion("partNum between", value1, value2, "partnum");
            return (Criteria) this;
        }

        public Criteria andPartnumNotBetween(String value1, String value2) {
            addCriterion("partNum not between", value1, value2, "partnum");
            return (Criteria) this;
        }

        public Criteria andPhotourlIsNull() {
            addCriterion("photoUrl is null");
            return (Criteria) this;
        }

        public Criteria andPhotourlIsNotNull() {
            addCriterion("photoUrl is not null");
            return (Criteria) this;
        }

        public Criteria andPhotourlEqualTo(String value) {
            addCriterion("photoUrl =", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlNotEqualTo(String value) {
            addCriterion("photoUrl <>", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlGreaterThan(String value) {
            addCriterion("photoUrl >", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlGreaterThanOrEqualTo(String value) {
            addCriterion("photoUrl >=", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlLessThan(String value) {
            addCriterion("photoUrl <", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlLessThanOrEqualTo(String value) {
            addCriterion("photoUrl <=", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlLike(String value) {
            addCriterion("photoUrl like", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlNotLike(String value) {
            addCriterion("photoUrl not like", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlIn(List<String> values) {
            addCriterion("photoUrl in", values, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlNotIn(List<String> values) {
            addCriterion("photoUrl not in", values, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlBetween(String value1, String value2) {
            addCriterion("photoUrl between", value1, value2, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlNotBetween(String value1, String value2) {
            addCriterion("photoUrl not between", value1, value2, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhototimeIsNull() {
            addCriterion("photoTime is null");
            return (Criteria) this;
        }

        public Criteria andPhototimeIsNotNull() {
            addCriterion("photoTime is not null");
            return (Criteria) this;
        }

        public Criteria andPhototimeEqualTo(Date value) {
            addCriterion("photoTime =", value, "phototime");
            return (Criteria) this;
        }

        public Criteria andPhototimeNotEqualTo(Date value) {
            addCriterion("photoTime <>", value, "phototime");
            return (Criteria) this;
        }

        public Criteria andPhototimeGreaterThan(Date value) {
            addCriterion("photoTime >", value, "phototime");
            return (Criteria) this;
        }

        public Criteria andPhototimeGreaterThanOrEqualTo(Date value) {
            addCriterion("photoTime >=", value, "phototime");
            return (Criteria) this;
        }

        public Criteria andPhototimeLessThan(Date value) {
            addCriterion("photoTime <", value, "phototime");
            return (Criteria) this;
        }

        public Criteria andPhototimeLessThanOrEqualTo(Date value) {
            addCriterion("photoTime <=", value, "phototime");
            return (Criteria) this;
        }

        public Criteria andPhototimeIn(List<Date> values) {
            addCriterion("photoTime in", values, "phototime");
            return (Criteria) this;
        }

        public Criteria andPhototimeNotIn(List<Date> values) {
            addCriterion("photoTime not in", values, "phototime");
            return (Criteria) this;
        }

        public Criteria andPhototimeBetween(Date value1, Date value2) {
            addCriterion("photoTime between", value1, value2, "phototime");
            return (Criteria) this;
        }

        public Criteria andPhototimeNotBetween(Date value1, Date value2) {
            addCriterion("photoTime not between", value1, value2, "phototime");
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

        public Criteria andAddnumberIsNull() {
            addCriterion("addNumber is null");
            return (Criteria) this;
        }

        public Criteria andAddnumberIsNotNull() {
            addCriterion("addNumber is not null");
            return (Criteria) this;
        }

        public Criteria andAddnumberEqualTo(String value) {
            addCriterion("addNumber =", value, "addnumber");
            return (Criteria) this;
        }

        public Criteria andAddnumberNotEqualTo(String value) {
            addCriterion("addNumber <>", value, "addnumber");
            return (Criteria) this;
        }

        public Criteria andAddnumberGreaterThan(String value) {
            addCriterion("addNumber >", value, "addnumber");
            return (Criteria) this;
        }

        public Criteria andAddnumberGreaterThanOrEqualTo(String value) {
            addCriterion("addNumber >=", value, "addnumber");
            return (Criteria) this;
        }

        public Criteria andAddnumberLessThan(String value) {
            addCriterion("addNumber <", value, "addnumber");
            return (Criteria) this;
        }

        public Criteria andAddnumberLessThanOrEqualTo(String value) {
            addCriterion("addNumber <=", value, "addnumber");
            return (Criteria) this;
        }

        public Criteria andAddnumberLike(String value) {
            addCriterion("addNumber like", value, "addnumber");
            return (Criteria) this;
        }

        public Criteria andAddnumberNotLike(String value) {
            addCriterion("addNumber not like", value, "addnumber");
            return (Criteria) this;
        }

        public Criteria andAddnumberIn(List<String> values) {
            addCriterion("addNumber in", values, "addnumber");
            return (Criteria) this;
        }

        public Criteria andAddnumberNotIn(List<String> values) {
            addCriterion("addNumber not in", values, "addnumber");
            return (Criteria) this;
        }

        public Criteria andAddnumberBetween(String value1, String value2) {
            addCriterion("addNumber between", value1, value2, "addnumber");
            return (Criteria) this;
        }

        public Criteria andAddnumberNotBetween(String value1, String value2) {
            addCriterion("addNumber not between", value1, value2, "addnumber");
            return (Criteria) this;
        }

        public Criteria andPhototypeIsNull() {
            addCriterion("phototype is null");
            return (Criteria) this;
        }

        public Criteria andPhototypeIsNotNull() {
            addCriterion("phototype is not null");
            return (Criteria) this;
        }

        public Criteria andPhototypeEqualTo(String value) {
            addCriterion("phototype =", value, "phototype");
            return (Criteria) this;
        }

        public Criteria andPhototypeNotEqualTo(String value) {
            addCriterion("phototype <>", value, "phototype");
            return (Criteria) this;
        }

        public Criteria andPhototypeGreaterThan(String value) {
            addCriterion("phototype >", value, "phototype");
            return (Criteria) this;
        }

        public Criteria andPhototypeGreaterThanOrEqualTo(String value) {
            addCriterion("phototype >=", value, "phototype");
            return (Criteria) this;
        }

        public Criteria andPhototypeLessThan(String value) {
            addCriterion("phototype <", value, "phototype");
            return (Criteria) this;
        }

        public Criteria andPhototypeLessThanOrEqualTo(String value) {
            addCriterion("phototype <=", value, "phototype");
            return (Criteria) this;
        }

        public Criteria andPhototypeLike(String value) {
            addCriterion("phototype like", value, "phototype");
            return (Criteria) this;
        }

        public Criteria andPhototypeNotLike(String value) {
            addCriterion("phototype not like", value, "phototype");
            return (Criteria) this;
        }

        public Criteria andPhototypeIn(List<String> values) {
            addCriterion("phototype in", values, "phototype");
            return (Criteria) this;
        }

        public Criteria andPhototypeNotIn(List<String> values) {
            addCriterion("phototype not in", values, "phototype");
            return (Criteria) this;
        }

        public Criteria andPhototypeBetween(String value1, String value2) {
            addCriterion("phototype between", value1, value2, "phototype");
            return (Criteria) this;
        }

        public Criteria andPhototypeNotBetween(String value1, String value2) {
            addCriterion("phototype not between", value1, value2, "phototype");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("location not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andConfigureidIsNull() {
            addCriterion("configureid is null");
            return (Criteria) this;
        }

        public Criteria andConfigureidIsNotNull() {
            addCriterion("configureid is not null");
            return (Criteria) this;
        }

        public Criteria andConfigureidEqualTo(String value) {
            addCriterion("configureid =", value, "configureid");
            return (Criteria) this;
        }

        public Criteria andConfigureidNotEqualTo(String value) {
            addCriterion("configureid <>", value, "configureid");
            return (Criteria) this;
        }

        public Criteria andConfigureidGreaterThan(String value) {
            addCriterion("configureid >", value, "configureid");
            return (Criteria) this;
        }

        public Criteria andConfigureidGreaterThanOrEqualTo(String value) {
            addCriterion("configureid >=", value, "configureid");
            return (Criteria) this;
        }

        public Criteria andConfigureidLessThan(String value) {
            addCriterion("configureid <", value, "configureid");
            return (Criteria) this;
        }

        public Criteria andConfigureidLessThanOrEqualTo(String value) {
            addCriterion("configureid <=", value, "configureid");
            return (Criteria) this;
        }

        public Criteria andConfigureidLike(String value) {
            addCriterion("configureid like", value, "configureid");
            return (Criteria) this;
        }

        public Criteria andConfigureidNotLike(String value) {
            addCriterion("configureid not like", value, "configureid");
            return (Criteria) this;
        }

        public Criteria andConfigureidIn(List<String> values) {
            addCriterion("configureid in", values, "configureid");
            return (Criteria) this;
        }

        public Criteria andConfigureidNotIn(List<String> values) {
            addCriterion("configureid not in", values, "configureid");
            return (Criteria) this;
        }

        public Criteria andConfigureidBetween(String value1, String value2) {
            addCriterion("configureid between", value1, value2, "configureid");
            return (Criteria) this;
        }

        public Criteria andConfigureidNotBetween(String value1, String value2) {
            addCriterion("configureid not between", value1, value2, "configureid");
            return (Criteria) this;
        }

        public Criteria andSeqIsNull() {
            addCriterion("seq is null");
            return (Criteria) this;
        }

        public Criteria andSeqIsNotNull() {
            addCriterion("seq is not null");
            return (Criteria) this;
        }

        public Criteria andSeqEqualTo(Integer value) {
            addCriterion("seq =", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotEqualTo(Integer value) {
            addCriterion("seq <>", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqGreaterThan(Integer value) {
            addCriterion("seq >", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqGreaterThanOrEqualTo(Integer value) {
            addCriterion("seq >=", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqLessThan(Integer value) {
            addCriterion("seq <", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqLessThanOrEqualTo(Integer value) {
            addCriterion("seq <=", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqIn(List<Integer> values) {
            addCriterion("seq in", values, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotIn(List<Integer> values) {
            addCriterion("seq not in", values, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqBetween(Integer value1, Integer value2) {
            addCriterion("seq between", value1, value2, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotBetween(Integer value1, Integer value2) {
            addCriterion("seq not between", value1, value2, "seq");
            return (Criteria) this;
        }

        public Criteria andIsdelIsNull() {
            addCriterion("isdel is null");
            return (Criteria) this;
        }

        public Criteria andIsdelIsNotNull() {
            addCriterion("isdel is not null");
            return (Criteria) this;
        }

        public Criteria andIsdelEqualTo(Boolean value) {
            addCriterion("isdel =", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotEqualTo(Boolean value) {
            addCriterion("isdel <>", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelGreaterThan(Boolean value) {
            addCriterion("isdel >", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isdel >=", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelLessThan(Boolean value) {
            addCriterion("isdel <", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelLessThanOrEqualTo(Boolean value) {
            addCriterion("isdel <=", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelIn(List<Boolean> values) {
            addCriterion("isdel in", values, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotIn(List<Boolean> values) {
            addCriterion("isdel not in", values, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelBetween(Boolean value1, Boolean value2) {
            addCriterion("isdel between", value1, value2, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isdel not between", value1, value2, "isdel");
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