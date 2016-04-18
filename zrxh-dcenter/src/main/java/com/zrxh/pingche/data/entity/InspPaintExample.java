package com.zrxh.pingche.data.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InspPaintExample implements java.io.Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InspPaintExample() {
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

        public Criteria andLeftpostaIsNull() {
            addCriterion("leftPostA is null");
            return (Criteria) this;
        }

        public Criteria andLeftpostaIsNotNull() {
            addCriterion("leftPostA is not null");
            return (Criteria) this;
        }

        public Criteria andLeftpostaEqualTo(String value) {
            addCriterion("leftPostA =", value, "leftposta");
            return (Criteria) this;
        }

        public Criteria andLeftpostaNotEqualTo(String value) {
            addCriterion("leftPostA <>", value, "leftposta");
            return (Criteria) this;
        }

        public Criteria andLeftpostaGreaterThan(String value) {
            addCriterion("leftPostA >", value, "leftposta");
            return (Criteria) this;
        }

        public Criteria andLeftpostaGreaterThanOrEqualTo(String value) {
            addCriterion("leftPostA >=", value, "leftposta");
            return (Criteria) this;
        }

        public Criteria andLeftpostaLessThan(String value) {
            addCriterion("leftPostA <", value, "leftposta");
            return (Criteria) this;
        }

        public Criteria andLeftpostaLessThanOrEqualTo(String value) {
            addCriterion("leftPostA <=", value, "leftposta");
            return (Criteria) this;
        }

        public Criteria andLeftpostaLike(String value) {
            addCriterion("leftPostA like", value, "leftposta");
            return (Criteria) this;
        }

        public Criteria andLeftpostaNotLike(String value) {
            addCriterion("leftPostA not like", value, "leftposta");
            return (Criteria) this;
        }

        public Criteria andLeftpostaIn(List<String> values) {
            addCriterion("leftPostA in", values, "leftposta");
            return (Criteria) this;
        }

        public Criteria andLeftpostaNotIn(List<String> values) {
            addCriterion("leftPostA not in", values, "leftposta");
            return (Criteria) this;
        }

        public Criteria andLeftpostaBetween(String value1, String value2) {
            addCriterion("leftPostA between", value1, value2, "leftposta");
            return (Criteria) this;
        }

        public Criteria andLeftpostaNotBetween(String value1, String value2) {
            addCriterion("leftPostA not between", value1, value2, "leftposta");
            return (Criteria) this;
        }

        public Criteria andLeftpostbIsNull() {
            addCriterion("leftPostB is null");
            return (Criteria) this;
        }

        public Criteria andLeftpostbIsNotNull() {
            addCriterion("leftPostB is not null");
            return (Criteria) this;
        }

        public Criteria andLeftpostbEqualTo(String value) {
            addCriterion("leftPostB =", value, "leftpostb");
            return (Criteria) this;
        }

        public Criteria andLeftpostbNotEqualTo(String value) {
            addCriterion("leftPostB <>", value, "leftpostb");
            return (Criteria) this;
        }

        public Criteria andLeftpostbGreaterThan(String value) {
            addCriterion("leftPostB >", value, "leftpostb");
            return (Criteria) this;
        }

        public Criteria andLeftpostbGreaterThanOrEqualTo(String value) {
            addCriterion("leftPostB >=", value, "leftpostb");
            return (Criteria) this;
        }

        public Criteria andLeftpostbLessThan(String value) {
            addCriterion("leftPostB <", value, "leftpostb");
            return (Criteria) this;
        }

        public Criteria andLeftpostbLessThanOrEqualTo(String value) {
            addCriterion("leftPostB <=", value, "leftpostb");
            return (Criteria) this;
        }

        public Criteria andLeftpostbLike(String value) {
            addCriterion("leftPostB like", value, "leftpostb");
            return (Criteria) this;
        }

        public Criteria andLeftpostbNotLike(String value) {
            addCriterion("leftPostB not like", value, "leftpostb");
            return (Criteria) this;
        }

        public Criteria andLeftpostbIn(List<String> values) {
            addCriterion("leftPostB in", values, "leftpostb");
            return (Criteria) this;
        }

        public Criteria andLeftpostbNotIn(List<String> values) {
            addCriterion("leftPostB not in", values, "leftpostb");
            return (Criteria) this;
        }

        public Criteria andLeftpostbBetween(String value1, String value2) {
            addCriterion("leftPostB between", value1, value2, "leftpostb");
            return (Criteria) this;
        }

        public Criteria andLeftpostbNotBetween(String value1, String value2) {
            addCriterion("leftPostB not between", value1, value2, "leftpostb");
            return (Criteria) this;
        }

        public Criteria andLeftpostcIsNull() {
            addCriterion("leftPostC is null");
            return (Criteria) this;
        }

        public Criteria andLeftpostcIsNotNull() {
            addCriterion("leftPostC is not null");
            return (Criteria) this;
        }

        public Criteria andLeftpostcEqualTo(String value) {
            addCriterion("leftPostC =", value, "leftpostc");
            return (Criteria) this;
        }

        public Criteria andLeftpostcNotEqualTo(String value) {
            addCriterion("leftPostC <>", value, "leftpostc");
            return (Criteria) this;
        }

        public Criteria andLeftpostcGreaterThan(String value) {
            addCriterion("leftPostC >", value, "leftpostc");
            return (Criteria) this;
        }

        public Criteria andLeftpostcGreaterThanOrEqualTo(String value) {
            addCriterion("leftPostC >=", value, "leftpostc");
            return (Criteria) this;
        }

        public Criteria andLeftpostcLessThan(String value) {
            addCriterion("leftPostC <", value, "leftpostc");
            return (Criteria) this;
        }

        public Criteria andLeftpostcLessThanOrEqualTo(String value) {
            addCriterion("leftPostC <=", value, "leftpostc");
            return (Criteria) this;
        }

        public Criteria andLeftpostcLike(String value) {
            addCriterion("leftPostC like", value, "leftpostc");
            return (Criteria) this;
        }

        public Criteria andLeftpostcNotLike(String value) {
            addCriterion("leftPostC not like", value, "leftpostc");
            return (Criteria) this;
        }

        public Criteria andLeftpostcIn(List<String> values) {
            addCriterion("leftPostC in", values, "leftpostc");
            return (Criteria) this;
        }

        public Criteria andLeftpostcNotIn(List<String> values) {
            addCriterion("leftPostC not in", values, "leftpostc");
            return (Criteria) this;
        }

        public Criteria andLeftpostcBetween(String value1, String value2) {
            addCriterion("leftPostC between", value1, value2, "leftpostc");
            return (Criteria) this;
        }

        public Criteria andLeftpostcNotBetween(String value1, String value2) {
            addCriterion("leftPostC not between", value1, value2, "leftpostc");
            return (Criteria) this;
        }

        public Criteria andRightpostaIsNull() {
            addCriterion("rightPostA is null");
            return (Criteria) this;
        }

        public Criteria andRightpostaIsNotNull() {
            addCriterion("rightPostA is not null");
            return (Criteria) this;
        }

        public Criteria andRightpostaEqualTo(String value) {
            addCriterion("rightPostA =", value, "rightposta");
            return (Criteria) this;
        }

        public Criteria andRightpostaNotEqualTo(String value) {
            addCriterion("rightPostA <>", value, "rightposta");
            return (Criteria) this;
        }

        public Criteria andRightpostaGreaterThan(String value) {
            addCriterion("rightPostA >", value, "rightposta");
            return (Criteria) this;
        }

        public Criteria andRightpostaGreaterThanOrEqualTo(String value) {
            addCriterion("rightPostA >=", value, "rightposta");
            return (Criteria) this;
        }

        public Criteria andRightpostaLessThan(String value) {
            addCriterion("rightPostA <", value, "rightposta");
            return (Criteria) this;
        }

        public Criteria andRightpostaLessThanOrEqualTo(String value) {
            addCriterion("rightPostA <=", value, "rightposta");
            return (Criteria) this;
        }

        public Criteria andRightpostaLike(String value) {
            addCriterion("rightPostA like", value, "rightposta");
            return (Criteria) this;
        }

        public Criteria andRightpostaNotLike(String value) {
            addCriterion("rightPostA not like", value, "rightposta");
            return (Criteria) this;
        }

        public Criteria andRightpostaIn(List<String> values) {
            addCriterion("rightPostA in", values, "rightposta");
            return (Criteria) this;
        }

        public Criteria andRightpostaNotIn(List<String> values) {
            addCriterion("rightPostA not in", values, "rightposta");
            return (Criteria) this;
        }

        public Criteria andRightpostaBetween(String value1, String value2) {
            addCriterion("rightPostA between", value1, value2, "rightposta");
            return (Criteria) this;
        }

        public Criteria andRightpostaNotBetween(String value1, String value2) {
            addCriterion("rightPostA not between", value1, value2, "rightposta");
            return (Criteria) this;
        }

        public Criteria andRightpostbIsNull() {
            addCriterion("rightPostB is null");
            return (Criteria) this;
        }

        public Criteria andRightpostbIsNotNull() {
            addCriterion("rightPostB is not null");
            return (Criteria) this;
        }

        public Criteria andRightpostbEqualTo(String value) {
            addCriterion("rightPostB =", value, "rightpostb");
            return (Criteria) this;
        }

        public Criteria andRightpostbNotEqualTo(String value) {
            addCriterion("rightPostB <>", value, "rightpostb");
            return (Criteria) this;
        }

        public Criteria andRightpostbGreaterThan(String value) {
            addCriterion("rightPostB >", value, "rightpostb");
            return (Criteria) this;
        }

        public Criteria andRightpostbGreaterThanOrEqualTo(String value) {
            addCriterion("rightPostB >=", value, "rightpostb");
            return (Criteria) this;
        }

        public Criteria andRightpostbLessThan(String value) {
            addCriterion("rightPostB <", value, "rightpostb");
            return (Criteria) this;
        }

        public Criteria andRightpostbLessThanOrEqualTo(String value) {
            addCriterion("rightPostB <=", value, "rightpostb");
            return (Criteria) this;
        }

        public Criteria andRightpostbLike(String value) {
            addCriterion("rightPostB like", value, "rightpostb");
            return (Criteria) this;
        }

        public Criteria andRightpostbNotLike(String value) {
            addCriterion("rightPostB not like", value, "rightpostb");
            return (Criteria) this;
        }

        public Criteria andRightpostbIn(List<String> values) {
            addCriterion("rightPostB in", values, "rightpostb");
            return (Criteria) this;
        }

        public Criteria andRightpostbNotIn(List<String> values) {
            addCriterion("rightPostB not in", values, "rightpostb");
            return (Criteria) this;
        }

        public Criteria andRightpostbBetween(String value1, String value2) {
            addCriterion("rightPostB between", value1, value2, "rightpostb");
            return (Criteria) this;
        }

        public Criteria andRightpostbNotBetween(String value1, String value2) {
            addCriterion("rightPostB not between", value1, value2, "rightpostb");
            return (Criteria) this;
        }

        public Criteria andRightpostcIsNull() {
            addCriterion("rightPostC is null");
            return (Criteria) this;
        }

        public Criteria andRightpostcIsNotNull() {
            addCriterion("rightPostC is not null");
            return (Criteria) this;
        }

        public Criteria andRightpostcEqualTo(String value) {
            addCriterion("rightPostC =", value, "rightpostc");
            return (Criteria) this;
        }

        public Criteria andRightpostcNotEqualTo(String value) {
            addCriterion("rightPostC <>", value, "rightpostc");
            return (Criteria) this;
        }

        public Criteria andRightpostcGreaterThan(String value) {
            addCriterion("rightPostC >", value, "rightpostc");
            return (Criteria) this;
        }

        public Criteria andRightpostcGreaterThanOrEqualTo(String value) {
            addCriterion("rightPostC >=", value, "rightpostc");
            return (Criteria) this;
        }

        public Criteria andRightpostcLessThan(String value) {
            addCriterion("rightPostC <", value, "rightpostc");
            return (Criteria) this;
        }

        public Criteria andRightpostcLessThanOrEqualTo(String value) {
            addCriterion("rightPostC <=", value, "rightpostc");
            return (Criteria) this;
        }

        public Criteria andRightpostcLike(String value) {
            addCriterion("rightPostC like", value, "rightpostc");
            return (Criteria) this;
        }

        public Criteria andRightpostcNotLike(String value) {
            addCriterion("rightPostC not like", value, "rightpostc");
            return (Criteria) this;
        }

        public Criteria andRightpostcIn(List<String> values) {
            addCriterion("rightPostC in", values, "rightpostc");
            return (Criteria) this;
        }

        public Criteria andRightpostcNotIn(List<String> values) {
            addCriterion("rightPostC not in", values, "rightpostc");
            return (Criteria) this;
        }

        public Criteria andRightpostcBetween(String value1, String value2) {
            addCriterion("rightPostC between", value1, value2, "rightpostc");
            return (Criteria) this;
        }

        public Criteria andRightpostcNotBetween(String value1, String value2) {
            addCriterion("rightPostC not between", value1, value2, "rightpostc");
            return (Criteria) this;
        }

        public Criteria andFrontguardIsNull() {
            addCriterion("frontGuard is null");
            return (Criteria) this;
        }

        public Criteria andFrontguardIsNotNull() {
            addCriterion("frontGuard is not null");
            return (Criteria) this;
        }

        public Criteria andFrontguardEqualTo(String value) {
            addCriterion("frontGuard =", value, "frontguard");
            return (Criteria) this;
        }

        public Criteria andFrontguardNotEqualTo(String value) {
            addCriterion("frontGuard <>", value, "frontguard");
            return (Criteria) this;
        }

        public Criteria andFrontguardGreaterThan(String value) {
            addCriterion("frontGuard >", value, "frontguard");
            return (Criteria) this;
        }

        public Criteria andFrontguardGreaterThanOrEqualTo(String value) {
            addCriterion("frontGuard >=", value, "frontguard");
            return (Criteria) this;
        }

        public Criteria andFrontguardLessThan(String value) {
            addCriterion("frontGuard <", value, "frontguard");
            return (Criteria) this;
        }

        public Criteria andFrontguardLessThanOrEqualTo(String value) {
            addCriterion("frontGuard <=", value, "frontguard");
            return (Criteria) this;
        }

        public Criteria andFrontguardLike(String value) {
            addCriterion("frontGuard like", value, "frontguard");
            return (Criteria) this;
        }

        public Criteria andFrontguardNotLike(String value) {
            addCriterion("frontGuard not like", value, "frontguard");
            return (Criteria) this;
        }

        public Criteria andFrontguardIn(List<String> values) {
            addCriterion("frontGuard in", values, "frontguard");
            return (Criteria) this;
        }

        public Criteria andFrontguardNotIn(List<String> values) {
            addCriterion("frontGuard not in", values, "frontguard");
            return (Criteria) this;
        }

        public Criteria andFrontguardBetween(String value1, String value2) {
            addCriterion("frontGuard between", value1, value2, "frontguard");
            return (Criteria) this;
        }

        public Criteria andFrontguardNotBetween(String value1, String value2) {
            addCriterion("frontGuard not between", value1, value2, "frontguard");
            return (Criteria) this;
        }

        public Criteria andRearguardIsNull() {
            addCriterion("rearGuard is null");
            return (Criteria) this;
        }

        public Criteria andRearguardIsNotNull() {
            addCriterion("rearGuard is not null");
            return (Criteria) this;
        }

        public Criteria andRearguardEqualTo(String value) {
            addCriterion("rearGuard =", value, "rearguard");
            return (Criteria) this;
        }

        public Criteria andRearguardNotEqualTo(String value) {
            addCriterion("rearGuard <>", value, "rearguard");
            return (Criteria) this;
        }

        public Criteria andRearguardGreaterThan(String value) {
            addCriterion("rearGuard >", value, "rearguard");
            return (Criteria) this;
        }

        public Criteria andRearguardGreaterThanOrEqualTo(String value) {
            addCriterion("rearGuard >=", value, "rearguard");
            return (Criteria) this;
        }

        public Criteria andRearguardLessThan(String value) {
            addCriterion("rearGuard <", value, "rearguard");
            return (Criteria) this;
        }

        public Criteria andRearguardLessThanOrEqualTo(String value) {
            addCriterion("rearGuard <=", value, "rearguard");
            return (Criteria) this;
        }

        public Criteria andRearguardLike(String value) {
            addCriterion("rearGuard like", value, "rearguard");
            return (Criteria) this;
        }

        public Criteria andRearguardNotLike(String value) {
            addCriterion("rearGuard not like", value, "rearguard");
            return (Criteria) this;
        }

        public Criteria andRearguardIn(List<String> values) {
            addCriterion("rearGuard in", values, "rearguard");
            return (Criteria) this;
        }

        public Criteria andRearguardNotIn(List<String> values) {
            addCriterion("rearGuard not in", values, "rearguard");
            return (Criteria) this;
        }

        public Criteria andRearguardBetween(String value1, String value2) {
            addCriterion("rearGuard between", value1, value2, "rearguard");
            return (Criteria) this;
        }

        public Criteria andRearguardNotBetween(String value1, String value2) {
            addCriterion("rearGuard not between", value1, value2, "rearguard");
            return (Criteria) this;
        }

        public Criteria andEnginehatchIsNull() {
            addCriterion("engineHatch is null");
            return (Criteria) this;
        }

        public Criteria andEnginehatchIsNotNull() {
            addCriterion("engineHatch is not null");
            return (Criteria) this;
        }

        public Criteria andEnginehatchEqualTo(String value) {
            addCriterion("engineHatch =", value, "enginehatch");
            return (Criteria) this;
        }

        public Criteria andEnginehatchNotEqualTo(String value) {
            addCriterion("engineHatch <>", value, "enginehatch");
            return (Criteria) this;
        }

        public Criteria andEnginehatchGreaterThan(String value) {
            addCriterion("engineHatch >", value, "enginehatch");
            return (Criteria) this;
        }

        public Criteria andEnginehatchGreaterThanOrEqualTo(String value) {
            addCriterion("engineHatch >=", value, "enginehatch");
            return (Criteria) this;
        }

        public Criteria andEnginehatchLessThan(String value) {
            addCriterion("engineHatch <", value, "enginehatch");
            return (Criteria) this;
        }

        public Criteria andEnginehatchLessThanOrEqualTo(String value) {
            addCriterion("engineHatch <=", value, "enginehatch");
            return (Criteria) this;
        }

        public Criteria andEnginehatchLike(String value) {
            addCriterion("engineHatch like", value, "enginehatch");
            return (Criteria) this;
        }

        public Criteria andEnginehatchNotLike(String value) {
            addCriterion("engineHatch not like", value, "enginehatch");
            return (Criteria) this;
        }

        public Criteria andEnginehatchIn(List<String> values) {
            addCriterion("engineHatch in", values, "enginehatch");
            return (Criteria) this;
        }

        public Criteria andEnginehatchNotIn(List<String> values) {
            addCriterion("engineHatch not in", values, "enginehatch");
            return (Criteria) this;
        }

        public Criteria andEnginehatchBetween(String value1, String value2) {
            addCriterion("engineHatch between", value1, value2, "enginehatch");
            return (Criteria) this;
        }

        public Criteria andEnginehatchNotBetween(String value1, String value2) {
            addCriterion("engineHatch not between", value1, value2, "enginehatch");
            return (Criteria) this;
        }

        public Criteria andTrunkhatchIsNull() {
            addCriterion("trunkHatch is null");
            return (Criteria) this;
        }

        public Criteria andTrunkhatchIsNotNull() {
            addCriterion("trunkHatch is not null");
            return (Criteria) this;
        }

        public Criteria andTrunkhatchEqualTo(String value) {
            addCriterion("trunkHatch =", value, "trunkhatch");
            return (Criteria) this;
        }

        public Criteria andTrunkhatchNotEqualTo(String value) {
            addCriterion("trunkHatch <>", value, "trunkhatch");
            return (Criteria) this;
        }

        public Criteria andTrunkhatchGreaterThan(String value) {
            addCriterion("trunkHatch >", value, "trunkhatch");
            return (Criteria) this;
        }

        public Criteria andTrunkhatchGreaterThanOrEqualTo(String value) {
            addCriterion("trunkHatch >=", value, "trunkhatch");
            return (Criteria) this;
        }

        public Criteria andTrunkhatchLessThan(String value) {
            addCriterion("trunkHatch <", value, "trunkhatch");
            return (Criteria) this;
        }

        public Criteria andTrunkhatchLessThanOrEqualTo(String value) {
            addCriterion("trunkHatch <=", value, "trunkhatch");
            return (Criteria) this;
        }

        public Criteria andTrunkhatchLike(String value) {
            addCriterion("trunkHatch like", value, "trunkhatch");
            return (Criteria) this;
        }

        public Criteria andTrunkhatchNotLike(String value) {
            addCriterion("trunkHatch not like", value, "trunkhatch");
            return (Criteria) this;
        }

        public Criteria andTrunkhatchIn(List<String> values) {
            addCriterion("trunkHatch in", values, "trunkhatch");
            return (Criteria) this;
        }

        public Criteria andTrunkhatchNotIn(List<String> values) {
            addCriterion("trunkHatch not in", values, "trunkhatch");
            return (Criteria) this;
        }

        public Criteria andTrunkhatchBetween(String value1, String value2) {
            addCriterion("trunkHatch between", value1, value2, "trunkhatch");
            return (Criteria) this;
        }

        public Criteria andTrunkhatchNotBetween(String value1, String value2) {
            addCriterion("trunkHatch not between", value1, value2, "trunkhatch");
            return (Criteria) this;
        }

        public Criteria andCarroofIsNull() {
            addCriterion("carRoof is null");
            return (Criteria) this;
        }

        public Criteria andCarroofIsNotNull() {
            addCriterion("carRoof is not null");
            return (Criteria) this;
        }

        public Criteria andCarroofEqualTo(String value) {
            addCriterion("carRoof =", value, "carroof");
            return (Criteria) this;
        }

        public Criteria andCarroofNotEqualTo(String value) {
            addCriterion("carRoof <>", value, "carroof");
            return (Criteria) this;
        }

        public Criteria andCarroofGreaterThan(String value) {
            addCriterion("carRoof >", value, "carroof");
            return (Criteria) this;
        }

        public Criteria andCarroofGreaterThanOrEqualTo(String value) {
            addCriterion("carRoof >=", value, "carroof");
            return (Criteria) this;
        }

        public Criteria andCarroofLessThan(String value) {
            addCriterion("carRoof <", value, "carroof");
            return (Criteria) this;
        }

        public Criteria andCarroofLessThanOrEqualTo(String value) {
            addCriterion("carRoof <=", value, "carroof");
            return (Criteria) this;
        }

        public Criteria andCarroofLike(String value) {
            addCriterion("carRoof like", value, "carroof");
            return (Criteria) this;
        }

        public Criteria andCarroofNotLike(String value) {
            addCriterion("carRoof not like", value, "carroof");
            return (Criteria) this;
        }

        public Criteria andCarroofIn(List<String> values) {
            addCriterion("carRoof in", values, "carroof");
            return (Criteria) this;
        }

        public Criteria andCarroofNotIn(List<String> values) {
            addCriterion("carRoof not in", values, "carroof");
            return (Criteria) this;
        }

        public Criteria andCarroofBetween(String value1, String value2) {
            addCriterion("carRoof between", value1, value2, "carroof");
            return (Criteria) this;
        }

        public Criteria andCarroofNotBetween(String value1, String value2) {
            addCriterion("carRoof not between", value1, value2, "carroof");
            return (Criteria) this;
        }

        public Criteria andLeftfrontfenderIsNull() {
            addCriterion("leftFrontFender is null");
            return (Criteria) this;
        }

        public Criteria andLeftfrontfenderIsNotNull() {
            addCriterion("leftFrontFender is not null");
            return (Criteria) this;
        }

        public Criteria andLeftfrontfenderEqualTo(String value) {
            addCriterion("leftFrontFender =", value, "leftfrontfender");
            return (Criteria) this;
        }

        public Criteria andLeftfrontfenderNotEqualTo(String value) {
            addCriterion("leftFrontFender <>", value, "leftfrontfender");
            return (Criteria) this;
        }

        public Criteria andLeftfrontfenderGreaterThan(String value) {
            addCriterion("leftFrontFender >", value, "leftfrontfender");
            return (Criteria) this;
        }

        public Criteria andLeftfrontfenderGreaterThanOrEqualTo(String value) {
            addCriterion("leftFrontFender >=", value, "leftfrontfender");
            return (Criteria) this;
        }

        public Criteria andLeftfrontfenderLessThan(String value) {
            addCriterion("leftFrontFender <", value, "leftfrontfender");
            return (Criteria) this;
        }

        public Criteria andLeftfrontfenderLessThanOrEqualTo(String value) {
            addCriterion("leftFrontFender <=", value, "leftfrontfender");
            return (Criteria) this;
        }

        public Criteria andLeftfrontfenderLike(String value) {
            addCriterion("leftFrontFender like", value, "leftfrontfender");
            return (Criteria) this;
        }

        public Criteria andLeftfrontfenderNotLike(String value) {
            addCriterion("leftFrontFender not like", value, "leftfrontfender");
            return (Criteria) this;
        }

        public Criteria andLeftfrontfenderIn(List<String> values) {
            addCriterion("leftFrontFender in", values, "leftfrontfender");
            return (Criteria) this;
        }

        public Criteria andLeftfrontfenderNotIn(List<String> values) {
            addCriterion("leftFrontFender not in", values, "leftfrontfender");
            return (Criteria) this;
        }

        public Criteria andLeftfrontfenderBetween(String value1, String value2) {
            addCriterion("leftFrontFender between", value1, value2, "leftfrontfender");
            return (Criteria) this;
        }

        public Criteria andLeftfrontfenderNotBetween(String value1, String value2) {
            addCriterion("leftFrontFender not between", value1, value2, "leftfrontfender");
            return (Criteria) this;
        }

        public Criteria andRightfrontfenderIsNull() {
            addCriterion("rightFrontFender is null");
            return (Criteria) this;
        }

        public Criteria andRightfrontfenderIsNotNull() {
            addCriterion("rightFrontFender is not null");
            return (Criteria) this;
        }

        public Criteria andRightfrontfenderEqualTo(String value) {
            addCriterion("rightFrontFender =", value, "rightfrontfender");
            return (Criteria) this;
        }

        public Criteria andRightfrontfenderNotEqualTo(String value) {
            addCriterion("rightFrontFender <>", value, "rightfrontfender");
            return (Criteria) this;
        }

        public Criteria andRightfrontfenderGreaterThan(String value) {
            addCriterion("rightFrontFender >", value, "rightfrontfender");
            return (Criteria) this;
        }

        public Criteria andRightfrontfenderGreaterThanOrEqualTo(String value) {
            addCriterion("rightFrontFender >=", value, "rightfrontfender");
            return (Criteria) this;
        }

        public Criteria andRightfrontfenderLessThan(String value) {
            addCriterion("rightFrontFender <", value, "rightfrontfender");
            return (Criteria) this;
        }

        public Criteria andRightfrontfenderLessThanOrEqualTo(String value) {
            addCriterion("rightFrontFender <=", value, "rightfrontfender");
            return (Criteria) this;
        }

        public Criteria andRightfrontfenderLike(String value) {
            addCriterion("rightFrontFender like", value, "rightfrontfender");
            return (Criteria) this;
        }

        public Criteria andRightfrontfenderNotLike(String value) {
            addCriterion("rightFrontFender not like", value, "rightfrontfender");
            return (Criteria) this;
        }

        public Criteria andRightfrontfenderIn(List<String> values) {
            addCriterion("rightFrontFender in", values, "rightfrontfender");
            return (Criteria) this;
        }

        public Criteria andRightfrontfenderNotIn(List<String> values) {
            addCriterion("rightFrontFender not in", values, "rightfrontfender");
            return (Criteria) this;
        }

        public Criteria andRightfrontfenderBetween(String value1, String value2) {
            addCriterion("rightFrontFender between", value1, value2, "rightfrontfender");
            return (Criteria) this;
        }

        public Criteria andRightfrontfenderNotBetween(String value1, String value2) {
            addCriterion("rightFrontFender not between", value1, value2, "rightfrontfender");
            return (Criteria) this;
        }

        public Criteria andLeftfrontdoorIsNull() {
            addCriterion("leftFrontDoor is null");
            return (Criteria) this;
        }

        public Criteria andLeftfrontdoorIsNotNull() {
            addCriterion("leftFrontDoor is not null");
            return (Criteria) this;
        }

        public Criteria andLeftfrontdoorEqualTo(String value) {
            addCriterion("leftFrontDoor =", value, "leftfrontdoor");
            return (Criteria) this;
        }

        public Criteria andLeftfrontdoorNotEqualTo(String value) {
            addCriterion("leftFrontDoor <>", value, "leftfrontdoor");
            return (Criteria) this;
        }

        public Criteria andLeftfrontdoorGreaterThan(String value) {
            addCriterion("leftFrontDoor >", value, "leftfrontdoor");
            return (Criteria) this;
        }

        public Criteria andLeftfrontdoorGreaterThanOrEqualTo(String value) {
            addCriterion("leftFrontDoor >=", value, "leftfrontdoor");
            return (Criteria) this;
        }

        public Criteria andLeftfrontdoorLessThan(String value) {
            addCriterion("leftFrontDoor <", value, "leftfrontdoor");
            return (Criteria) this;
        }

        public Criteria andLeftfrontdoorLessThanOrEqualTo(String value) {
            addCriterion("leftFrontDoor <=", value, "leftfrontdoor");
            return (Criteria) this;
        }

        public Criteria andLeftfrontdoorLike(String value) {
            addCriterion("leftFrontDoor like", value, "leftfrontdoor");
            return (Criteria) this;
        }

        public Criteria andLeftfrontdoorNotLike(String value) {
            addCriterion("leftFrontDoor not like", value, "leftfrontdoor");
            return (Criteria) this;
        }

        public Criteria andLeftfrontdoorIn(List<String> values) {
            addCriterion("leftFrontDoor in", values, "leftfrontdoor");
            return (Criteria) this;
        }

        public Criteria andLeftfrontdoorNotIn(List<String> values) {
            addCriterion("leftFrontDoor not in", values, "leftfrontdoor");
            return (Criteria) this;
        }

        public Criteria andLeftfrontdoorBetween(String value1, String value2) {
            addCriterion("leftFrontDoor between", value1, value2, "leftfrontdoor");
            return (Criteria) this;
        }

        public Criteria andLeftfrontdoorNotBetween(String value1, String value2) {
            addCriterion("leftFrontDoor not between", value1, value2, "leftfrontdoor");
            return (Criteria) this;
        }

        public Criteria andRightfrontdoorIsNull() {
            addCriterion("rightFrontDoor is null");
            return (Criteria) this;
        }

        public Criteria andRightfrontdoorIsNotNull() {
            addCriterion("rightFrontDoor is not null");
            return (Criteria) this;
        }

        public Criteria andRightfrontdoorEqualTo(String value) {
            addCriterion("rightFrontDoor =", value, "rightfrontdoor");
            return (Criteria) this;
        }

        public Criteria andRightfrontdoorNotEqualTo(String value) {
            addCriterion("rightFrontDoor <>", value, "rightfrontdoor");
            return (Criteria) this;
        }

        public Criteria andRightfrontdoorGreaterThan(String value) {
            addCriterion("rightFrontDoor >", value, "rightfrontdoor");
            return (Criteria) this;
        }

        public Criteria andRightfrontdoorGreaterThanOrEqualTo(String value) {
            addCriterion("rightFrontDoor >=", value, "rightfrontdoor");
            return (Criteria) this;
        }

        public Criteria andRightfrontdoorLessThan(String value) {
            addCriterion("rightFrontDoor <", value, "rightfrontdoor");
            return (Criteria) this;
        }

        public Criteria andRightfrontdoorLessThanOrEqualTo(String value) {
            addCriterion("rightFrontDoor <=", value, "rightfrontdoor");
            return (Criteria) this;
        }

        public Criteria andRightfrontdoorLike(String value) {
            addCriterion("rightFrontDoor like", value, "rightfrontdoor");
            return (Criteria) this;
        }

        public Criteria andRightfrontdoorNotLike(String value) {
            addCriterion("rightFrontDoor not like", value, "rightfrontdoor");
            return (Criteria) this;
        }

        public Criteria andRightfrontdoorIn(List<String> values) {
            addCriterion("rightFrontDoor in", values, "rightfrontdoor");
            return (Criteria) this;
        }

        public Criteria andRightfrontdoorNotIn(List<String> values) {
            addCriterion("rightFrontDoor not in", values, "rightfrontdoor");
            return (Criteria) this;
        }

        public Criteria andRightfrontdoorBetween(String value1, String value2) {
            addCriterion("rightFrontDoor between", value1, value2, "rightfrontdoor");
            return (Criteria) this;
        }

        public Criteria andRightfrontdoorNotBetween(String value1, String value2) {
            addCriterion("rightFrontDoor not between", value1, value2, "rightfrontdoor");
            return (Criteria) this;
        }

        public Criteria andLeftbackdoorIsNull() {
            addCriterion("leftBackDoor is null");
            return (Criteria) this;
        }

        public Criteria andLeftbackdoorIsNotNull() {
            addCriterion("leftBackDoor is not null");
            return (Criteria) this;
        }

        public Criteria andLeftbackdoorEqualTo(String value) {
            addCriterion("leftBackDoor =", value, "leftbackdoor");
            return (Criteria) this;
        }

        public Criteria andLeftbackdoorNotEqualTo(String value) {
            addCriterion("leftBackDoor <>", value, "leftbackdoor");
            return (Criteria) this;
        }

        public Criteria andLeftbackdoorGreaterThan(String value) {
            addCriterion("leftBackDoor >", value, "leftbackdoor");
            return (Criteria) this;
        }

        public Criteria andLeftbackdoorGreaterThanOrEqualTo(String value) {
            addCriterion("leftBackDoor >=", value, "leftbackdoor");
            return (Criteria) this;
        }

        public Criteria andLeftbackdoorLessThan(String value) {
            addCriterion("leftBackDoor <", value, "leftbackdoor");
            return (Criteria) this;
        }

        public Criteria andLeftbackdoorLessThanOrEqualTo(String value) {
            addCriterion("leftBackDoor <=", value, "leftbackdoor");
            return (Criteria) this;
        }

        public Criteria andLeftbackdoorLike(String value) {
            addCriterion("leftBackDoor like", value, "leftbackdoor");
            return (Criteria) this;
        }

        public Criteria andLeftbackdoorNotLike(String value) {
            addCriterion("leftBackDoor not like", value, "leftbackdoor");
            return (Criteria) this;
        }

        public Criteria andLeftbackdoorIn(List<String> values) {
            addCriterion("leftBackDoor in", values, "leftbackdoor");
            return (Criteria) this;
        }

        public Criteria andLeftbackdoorNotIn(List<String> values) {
            addCriterion("leftBackDoor not in", values, "leftbackdoor");
            return (Criteria) this;
        }

        public Criteria andLeftbackdoorBetween(String value1, String value2) {
            addCriterion("leftBackDoor between", value1, value2, "leftbackdoor");
            return (Criteria) this;
        }

        public Criteria andLeftbackdoorNotBetween(String value1, String value2) {
            addCriterion("leftBackDoor not between", value1, value2, "leftbackdoor");
            return (Criteria) this;
        }

        public Criteria andRightbackdoorIsNull() {
            addCriterion("rightBackDoor is null");
            return (Criteria) this;
        }

        public Criteria andRightbackdoorIsNotNull() {
            addCriterion("rightBackDoor is not null");
            return (Criteria) this;
        }

        public Criteria andRightbackdoorEqualTo(String value) {
            addCriterion("rightBackDoor =", value, "rightbackdoor");
            return (Criteria) this;
        }

        public Criteria andRightbackdoorNotEqualTo(String value) {
            addCriterion("rightBackDoor <>", value, "rightbackdoor");
            return (Criteria) this;
        }

        public Criteria andRightbackdoorGreaterThan(String value) {
            addCriterion("rightBackDoor >", value, "rightbackdoor");
            return (Criteria) this;
        }

        public Criteria andRightbackdoorGreaterThanOrEqualTo(String value) {
            addCriterion("rightBackDoor >=", value, "rightbackdoor");
            return (Criteria) this;
        }

        public Criteria andRightbackdoorLessThan(String value) {
            addCriterion("rightBackDoor <", value, "rightbackdoor");
            return (Criteria) this;
        }

        public Criteria andRightbackdoorLessThanOrEqualTo(String value) {
            addCriterion("rightBackDoor <=", value, "rightbackdoor");
            return (Criteria) this;
        }

        public Criteria andRightbackdoorLike(String value) {
            addCriterion("rightBackDoor like", value, "rightbackdoor");
            return (Criteria) this;
        }

        public Criteria andRightbackdoorNotLike(String value) {
            addCriterion("rightBackDoor not like", value, "rightbackdoor");
            return (Criteria) this;
        }

        public Criteria andRightbackdoorIn(List<String> values) {
            addCriterion("rightBackDoor in", values, "rightbackdoor");
            return (Criteria) this;
        }

        public Criteria andRightbackdoorNotIn(List<String> values) {
            addCriterion("rightBackDoor not in", values, "rightbackdoor");
            return (Criteria) this;
        }

        public Criteria andRightbackdoorBetween(String value1, String value2) {
            addCriterion("rightBackDoor between", value1, value2, "rightbackdoor");
            return (Criteria) this;
        }

        public Criteria andRightbackdoorNotBetween(String value1, String value2) {
            addCriterion("rightBackDoor not between", value1, value2, "rightbackdoor");
            return (Criteria) this;
        }

        public Criteria andLeftbackfenderIsNull() {
            addCriterion("leftBackFender is null");
            return (Criteria) this;
        }

        public Criteria andLeftbackfenderIsNotNull() {
            addCriterion("leftBackFender is not null");
            return (Criteria) this;
        }

        public Criteria andLeftbackfenderEqualTo(String value) {
            addCriterion("leftBackFender =", value, "leftbackfender");
            return (Criteria) this;
        }

        public Criteria andLeftbackfenderNotEqualTo(String value) {
            addCriterion("leftBackFender <>", value, "leftbackfender");
            return (Criteria) this;
        }

        public Criteria andLeftbackfenderGreaterThan(String value) {
            addCriterion("leftBackFender >", value, "leftbackfender");
            return (Criteria) this;
        }

        public Criteria andLeftbackfenderGreaterThanOrEqualTo(String value) {
            addCriterion("leftBackFender >=", value, "leftbackfender");
            return (Criteria) this;
        }

        public Criteria andLeftbackfenderLessThan(String value) {
            addCriterion("leftBackFender <", value, "leftbackfender");
            return (Criteria) this;
        }

        public Criteria andLeftbackfenderLessThanOrEqualTo(String value) {
            addCriterion("leftBackFender <=", value, "leftbackfender");
            return (Criteria) this;
        }

        public Criteria andLeftbackfenderLike(String value) {
            addCriterion("leftBackFender like", value, "leftbackfender");
            return (Criteria) this;
        }

        public Criteria andLeftbackfenderNotLike(String value) {
            addCriterion("leftBackFender not like", value, "leftbackfender");
            return (Criteria) this;
        }

        public Criteria andLeftbackfenderIn(List<String> values) {
            addCriterion("leftBackFender in", values, "leftbackfender");
            return (Criteria) this;
        }

        public Criteria andLeftbackfenderNotIn(List<String> values) {
            addCriterion("leftBackFender not in", values, "leftbackfender");
            return (Criteria) this;
        }

        public Criteria andLeftbackfenderBetween(String value1, String value2) {
            addCriterion("leftBackFender between", value1, value2, "leftbackfender");
            return (Criteria) this;
        }

        public Criteria andLeftbackfenderNotBetween(String value1, String value2) {
            addCriterion("leftBackFender not between", value1, value2, "leftbackfender");
            return (Criteria) this;
        }

        public Criteria andRightbackfenderIsNull() {
            addCriterion("rightBackFender is null");
            return (Criteria) this;
        }

        public Criteria andRightbackfenderIsNotNull() {
            addCriterion("rightBackFender is not null");
            return (Criteria) this;
        }

        public Criteria andRightbackfenderEqualTo(String value) {
            addCriterion("rightBackFender =", value, "rightbackfender");
            return (Criteria) this;
        }

        public Criteria andRightbackfenderNotEqualTo(String value) {
            addCriterion("rightBackFender <>", value, "rightbackfender");
            return (Criteria) this;
        }

        public Criteria andRightbackfenderGreaterThan(String value) {
            addCriterion("rightBackFender >", value, "rightbackfender");
            return (Criteria) this;
        }

        public Criteria andRightbackfenderGreaterThanOrEqualTo(String value) {
            addCriterion("rightBackFender >=", value, "rightbackfender");
            return (Criteria) this;
        }

        public Criteria andRightbackfenderLessThan(String value) {
            addCriterion("rightBackFender <", value, "rightbackfender");
            return (Criteria) this;
        }

        public Criteria andRightbackfenderLessThanOrEqualTo(String value) {
            addCriterion("rightBackFender <=", value, "rightbackfender");
            return (Criteria) this;
        }

        public Criteria andRightbackfenderLike(String value) {
            addCriterion("rightBackFender like", value, "rightbackfender");
            return (Criteria) this;
        }

        public Criteria andRightbackfenderNotLike(String value) {
            addCriterion("rightBackFender not like", value, "rightbackfender");
            return (Criteria) this;
        }

        public Criteria andRightbackfenderIn(List<String> values) {
            addCriterion("rightBackFender in", values, "rightbackfender");
            return (Criteria) this;
        }

        public Criteria andRightbackfenderNotIn(List<String> values) {
            addCriterion("rightBackFender not in", values, "rightbackfender");
            return (Criteria) this;
        }

        public Criteria andRightbackfenderBetween(String value1, String value2) {
            addCriterion("rightBackFender between", value1, value2, "rightbackfender");
            return (Criteria) this;
        }

        public Criteria andRightbackfenderNotBetween(String value1, String value2) {
            addCriterion("rightBackFender not between", value1, value2, "rightbackfender");
            return (Criteria) this;
        }

        public Criteria andCarpartnameIsNull() {
            addCriterion("carPartName is null");
            return (Criteria) this;
        }

        public Criteria andCarpartnameIsNotNull() {
            addCriterion("carPartName is not null");
            return (Criteria) this;
        }

        public Criteria andCarpartnameEqualTo(String value) {
            addCriterion("carPartName =", value, "carpartname");
            return (Criteria) this;
        }

        public Criteria andCarpartnameNotEqualTo(String value) {
            addCriterion("carPartName <>", value, "carpartname");
            return (Criteria) this;
        }

        public Criteria andCarpartnameGreaterThan(String value) {
            addCriterion("carPartName >", value, "carpartname");
            return (Criteria) this;
        }

        public Criteria andCarpartnameGreaterThanOrEqualTo(String value) {
            addCriterion("carPartName >=", value, "carpartname");
            return (Criteria) this;
        }

        public Criteria andCarpartnameLessThan(String value) {
            addCriterion("carPartName <", value, "carpartname");
            return (Criteria) this;
        }

        public Criteria andCarpartnameLessThanOrEqualTo(String value) {
            addCriterion("carPartName <=", value, "carpartname");
            return (Criteria) this;
        }

        public Criteria andCarpartnameLike(String value) {
            addCriterion("carPartName like", value, "carpartname");
            return (Criteria) this;
        }

        public Criteria andCarpartnameNotLike(String value) {
            addCriterion("carPartName not like", value, "carpartname");
            return (Criteria) this;
        }

        public Criteria andCarpartnameIn(List<String> values) {
            addCriterion("carPartName in", values, "carpartname");
            return (Criteria) this;
        }

        public Criteria andCarpartnameNotIn(List<String> values) {
            addCriterion("carPartName not in", values, "carpartname");
            return (Criteria) this;
        }

        public Criteria andCarpartnameBetween(String value1, String value2) {
            addCriterion("carPartName between", value1, value2, "carpartname");
            return (Criteria) this;
        }

        public Criteria andCarpartnameNotBetween(String value1, String value2) {
            addCriterion("carPartName not between", value1, value2, "carpartname");
            return (Criteria) this;
        }

        public Criteria andIscarpaintIsNull() {
            addCriterion("isCarPaint is null");
            return (Criteria) this;
        }

        public Criteria andIscarpaintIsNotNull() {
            addCriterion("isCarPaint is not null");
            return (Criteria) this;
        }

        public Criteria andIscarpaintEqualTo(String value) {
            addCriterion("isCarPaint =", value, "iscarpaint");
            return (Criteria) this;
        }

        public Criteria andIscarpaintNotEqualTo(String value) {
            addCriterion("isCarPaint <>", value, "iscarpaint");
            return (Criteria) this;
        }

        public Criteria andIscarpaintGreaterThan(String value) {
            addCriterion("isCarPaint >", value, "iscarpaint");
            return (Criteria) this;
        }

        public Criteria andIscarpaintGreaterThanOrEqualTo(String value) {
            addCriterion("isCarPaint >=", value, "iscarpaint");
            return (Criteria) this;
        }

        public Criteria andIscarpaintLessThan(String value) {
            addCriterion("isCarPaint <", value, "iscarpaint");
            return (Criteria) this;
        }

        public Criteria andIscarpaintLessThanOrEqualTo(String value) {
            addCriterion("isCarPaint <=", value, "iscarpaint");
            return (Criteria) this;
        }

        public Criteria andIscarpaintLike(String value) {
            addCriterion("isCarPaint like", value, "iscarpaint");
            return (Criteria) this;
        }

        public Criteria andIscarpaintNotLike(String value) {
            addCriterion("isCarPaint not like", value, "iscarpaint");
            return (Criteria) this;
        }

        public Criteria andIscarpaintIn(List<String> values) {
            addCriterion("isCarPaint in", values, "iscarpaint");
            return (Criteria) this;
        }

        public Criteria andIscarpaintNotIn(List<String> values) {
            addCriterion("isCarPaint not in", values, "iscarpaint");
            return (Criteria) this;
        }

        public Criteria andIscarpaintBetween(String value1, String value2) {
            addCriterion("isCarPaint between", value1, value2, "iscarpaint");
            return (Criteria) this;
        }

        public Criteria andIscarpaintNotBetween(String value1, String value2) {
            addCriterion("isCarPaint not between", value1, value2, "iscarpaint");
            return (Criteria) this;
        }

        public Criteria andXIsNull() {
            addCriterion("x is null");
            return (Criteria) this;
        }

        public Criteria andXIsNotNull() {
            addCriterion("x is not null");
            return (Criteria) this;
        }

        public Criteria andXEqualTo(Integer value) {
            addCriterion("x =", value, "x");
            return (Criteria) this;
        }

        public Criteria andXNotEqualTo(Integer value) {
            addCriterion("x <>", value, "x");
            return (Criteria) this;
        }

        public Criteria andXGreaterThan(Integer value) {
            addCriterion("x >", value, "x");
            return (Criteria) this;
        }

        public Criteria andXGreaterThanOrEqualTo(Integer value) {
            addCriterion("x >=", value, "x");
            return (Criteria) this;
        }

        public Criteria andXLessThan(Integer value) {
            addCriterion("x <", value, "x");
            return (Criteria) this;
        }

        public Criteria andXLessThanOrEqualTo(Integer value) {
            addCriterion("x <=", value, "x");
            return (Criteria) this;
        }

        public Criteria andXIn(List<Integer> values) {
            addCriterion("x in", values, "x");
            return (Criteria) this;
        }

        public Criteria andXNotIn(List<Integer> values) {
            addCriterion("x not in", values, "x");
            return (Criteria) this;
        }

        public Criteria andXBetween(Integer value1, Integer value2) {
            addCriterion("x between", value1, value2, "x");
            return (Criteria) this;
        }

        public Criteria andXNotBetween(Integer value1, Integer value2) {
            addCriterion("x not between", value1, value2, "x");
            return (Criteria) this;
        }

        public Criteria andYIsNull() {
            addCriterion("y is null");
            return (Criteria) this;
        }

        public Criteria andYIsNotNull() {
            addCriterion("y is not null");
            return (Criteria) this;
        }

        public Criteria andYEqualTo(Integer value) {
            addCriterion("y =", value, "y");
            return (Criteria) this;
        }

        public Criteria andYNotEqualTo(Integer value) {
            addCriterion("y <>", value, "y");
            return (Criteria) this;
        }

        public Criteria andYGreaterThan(Integer value) {
            addCriterion("y >", value, "y");
            return (Criteria) this;
        }

        public Criteria andYGreaterThanOrEqualTo(Integer value) {
            addCriterion("y >=", value, "y");
            return (Criteria) this;
        }

        public Criteria andYLessThan(Integer value) {
            addCriterion("y <", value, "y");
            return (Criteria) this;
        }

        public Criteria andYLessThanOrEqualTo(Integer value) {
            addCriterion("y <=", value, "y");
            return (Criteria) this;
        }

        public Criteria andYIn(List<Integer> values) {
            addCriterion("y in", values, "y");
            return (Criteria) this;
        }

        public Criteria andYNotIn(List<Integer> values) {
            addCriterion("y not in", values, "y");
            return (Criteria) this;
        }

        public Criteria andYBetween(Integer value1, Integer value2) {
            addCriterion("y between", value1, value2, "y");
            return (Criteria) this;
        }

        public Criteria andYNotBetween(Integer value1, Integer value2) {
            addCriterion("y not between", value1, value2, "y");
            return (Criteria) this;
        }

        public Criteria andViewidIsNull() {
            addCriterion("viewId is null");
            return (Criteria) this;
        }

        public Criteria andViewidIsNotNull() {
            addCriterion("viewId is not null");
            return (Criteria) this;
        }

        public Criteria andViewidEqualTo(Integer value) {
            addCriterion("viewId =", value, "viewid");
            return (Criteria) this;
        }

        public Criteria andViewidNotEqualTo(Integer value) {
            addCriterion("viewId <>", value, "viewid");
            return (Criteria) this;
        }

        public Criteria andViewidGreaterThan(Integer value) {
            addCriterion("viewId >", value, "viewid");
            return (Criteria) this;
        }

        public Criteria andViewidGreaterThanOrEqualTo(Integer value) {
            addCriterion("viewId >=", value, "viewid");
            return (Criteria) this;
        }

        public Criteria andViewidLessThan(Integer value) {
            addCriterion("viewId <", value, "viewid");
            return (Criteria) this;
        }

        public Criteria andViewidLessThanOrEqualTo(Integer value) {
            addCriterion("viewId <=", value, "viewid");
            return (Criteria) this;
        }

        public Criteria andViewidIn(List<Integer> values) {
            addCriterion("viewId in", values, "viewid");
            return (Criteria) this;
        }

        public Criteria andViewidNotIn(List<Integer> values) {
            addCriterion("viewId not in", values, "viewid");
            return (Criteria) this;
        }

        public Criteria andViewidBetween(Integer value1, Integer value2) {
            addCriterion("viewId between", value1, value2, "viewid");
            return (Criteria) this;
        }

        public Criteria andViewidNotBetween(Integer value1, Integer value2) {
            addCriterion("viewId not between", value1, value2, "viewid");
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