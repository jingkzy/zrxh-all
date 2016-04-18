package com.zrxh.pingche.data.entity;

import java.util.ArrayList;
import java.util.List;

public class InspPhotoresultExample implements java.io.Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InspPhotoresultExample() {
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

        public Criteria andPaintphotourlIsNull() {
            addCriterion("paintphotoUrl is null");
            return (Criteria) this;
        }

        public Criteria andPaintphotourlIsNotNull() {
            addCriterion("paintphotoUrl is not null");
            return (Criteria) this;
        }

        public Criteria andPaintphotourlEqualTo(String value) {
            addCriterion("paintphotoUrl =", value, "paintphotourl");
            return (Criteria) this;
        }

        public Criteria andPaintphotourlNotEqualTo(String value) {
            addCriterion("paintphotoUrl <>", value, "paintphotourl");
            return (Criteria) this;
        }

        public Criteria andPaintphotourlGreaterThan(String value) {
            addCriterion("paintphotoUrl >", value, "paintphotourl");
            return (Criteria) this;
        }

        public Criteria andPaintphotourlGreaterThanOrEqualTo(String value) {
            addCriterion("paintphotoUrl >=", value, "paintphotourl");
            return (Criteria) this;
        }

        public Criteria andPaintphotourlLessThan(String value) {
            addCriterion("paintphotoUrl <", value, "paintphotourl");
            return (Criteria) this;
        }

        public Criteria andPaintphotourlLessThanOrEqualTo(String value) {
            addCriterion("paintphotoUrl <=", value, "paintphotourl");
            return (Criteria) this;
        }

        public Criteria andPaintphotourlLike(String value) {
            addCriterion("paintphotoUrl like", value, "paintphotourl");
            return (Criteria) this;
        }

        public Criteria andPaintphotourlNotLike(String value) {
            addCriterion("paintphotoUrl not like", value, "paintphotourl");
            return (Criteria) this;
        }

        public Criteria andPaintphotourlIn(List<String> values) {
            addCriterion("paintphotoUrl in", values, "paintphotourl");
            return (Criteria) this;
        }

        public Criteria andPaintphotourlNotIn(List<String> values) {
            addCriterion("paintphotoUrl not in", values, "paintphotourl");
            return (Criteria) this;
        }

        public Criteria andPaintphotourlBetween(String value1, String value2) {
            addCriterion("paintphotoUrl between", value1, value2, "paintphotourl");
            return (Criteria) this;
        }

        public Criteria andPaintphotourlNotBetween(String value1, String value2) {
            addCriterion("paintphotoUrl not between", value1, value2, "paintphotourl");
            return (Criteria) this;
        }

        public Criteria andSkeletonleftphotourlIsNull() {
            addCriterion("skeletonLeftphotoUrl is null");
            return (Criteria) this;
        }

        public Criteria andSkeletonleftphotourlIsNotNull() {
            addCriterion("skeletonLeftphotoUrl is not null");
            return (Criteria) this;
        }

        public Criteria andSkeletonleftphotourlEqualTo(String value) {
            addCriterion("skeletonLeftphotoUrl =", value, "skeletonleftphotourl");
            return (Criteria) this;
        }

        public Criteria andSkeletonleftphotourlNotEqualTo(String value) {
            addCriterion("skeletonLeftphotoUrl <>", value, "skeletonleftphotourl");
            return (Criteria) this;
        }

        public Criteria andSkeletonleftphotourlGreaterThan(String value) {
            addCriterion("skeletonLeftphotoUrl >", value, "skeletonleftphotourl");
            return (Criteria) this;
        }

        public Criteria andSkeletonleftphotourlGreaterThanOrEqualTo(String value) {
            addCriterion("skeletonLeftphotoUrl >=", value, "skeletonleftphotourl");
            return (Criteria) this;
        }

        public Criteria andSkeletonleftphotourlLessThan(String value) {
            addCriterion("skeletonLeftphotoUrl <", value, "skeletonleftphotourl");
            return (Criteria) this;
        }

        public Criteria andSkeletonleftphotourlLessThanOrEqualTo(String value) {
            addCriterion("skeletonLeftphotoUrl <=", value, "skeletonleftphotourl");
            return (Criteria) this;
        }

        public Criteria andSkeletonleftphotourlLike(String value) {
            addCriterion("skeletonLeftphotoUrl like", value, "skeletonleftphotourl");
            return (Criteria) this;
        }

        public Criteria andSkeletonleftphotourlNotLike(String value) {
            addCriterion("skeletonLeftphotoUrl not like", value, "skeletonleftphotourl");
            return (Criteria) this;
        }

        public Criteria andSkeletonleftphotourlIn(List<String> values) {
            addCriterion("skeletonLeftphotoUrl in", values, "skeletonleftphotourl");
            return (Criteria) this;
        }

        public Criteria andSkeletonleftphotourlNotIn(List<String> values) {
            addCriterion("skeletonLeftphotoUrl not in", values, "skeletonleftphotourl");
            return (Criteria) this;
        }

        public Criteria andSkeletonleftphotourlBetween(String value1, String value2) {
            addCriterion("skeletonLeftphotoUrl between", value1, value2, "skeletonleftphotourl");
            return (Criteria) this;
        }

        public Criteria andSkeletonleftphotourlNotBetween(String value1, String value2) {
            addCriterion("skeletonLeftphotoUrl not between", value1, value2, "skeletonleftphotourl");
            return (Criteria) this;
        }

        public Criteria andSkeletonrightphotourlIsNull() {
            addCriterion("skeletonRightphotoUrl is null");
            return (Criteria) this;
        }

        public Criteria andSkeletonrightphotourlIsNotNull() {
            addCriterion("skeletonRightphotoUrl is not null");
            return (Criteria) this;
        }

        public Criteria andSkeletonrightphotourlEqualTo(String value) {
            addCriterion("skeletonRightphotoUrl =", value, "skeletonrightphotourl");
            return (Criteria) this;
        }

        public Criteria andSkeletonrightphotourlNotEqualTo(String value) {
            addCriterion("skeletonRightphotoUrl <>", value, "skeletonrightphotourl");
            return (Criteria) this;
        }

        public Criteria andSkeletonrightphotourlGreaterThan(String value) {
            addCriterion("skeletonRightphotoUrl >", value, "skeletonrightphotourl");
            return (Criteria) this;
        }

        public Criteria andSkeletonrightphotourlGreaterThanOrEqualTo(String value) {
            addCriterion("skeletonRightphotoUrl >=", value, "skeletonrightphotourl");
            return (Criteria) this;
        }

        public Criteria andSkeletonrightphotourlLessThan(String value) {
            addCriterion("skeletonRightphotoUrl <", value, "skeletonrightphotourl");
            return (Criteria) this;
        }

        public Criteria andSkeletonrightphotourlLessThanOrEqualTo(String value) {
            addCriterion("skeletonRightphotoUrl <=", value, "skeletonrightphotourl");
            return (Criteria) this;
        }

        public Criteria andSkeletonrightphotourlLike(String value) {
            addCriterion("skeletonRightphotoUrl like", value, "skeletonrightphotourl");
            return (Criteria) this;
        }

        public Criteria andSkeletonrightphotourlNotLike(String value) {
            addCriterion("skeletonRightphotoUrl not like", value, "skeletonrightphotourl");
            return (Criteria) this;
        }

        public Criteria andSkeletonrightphotourlIn(List<String> values) {
            addCriterion("skeletonRightphotoUrl in", values, "skeletonrightphotourl");
            return (Criteria) this;
        }

        public Criteria andSkeletonrightphotourlNotIn(List<String> values) {
            addCriterion("skeletonRightphotoUrl not in", values, "skeletonrightphotourl");
            return (Criteria) this;
        }

        public Criteria andSkeletonrightphotourlBetween(String value1, String value2) {
            addCriterion("skeletonRightphotoUrl between", value1, value2, "skeletonrightphotourl");
            return (Criteria) this;
        }

        public Criteria andSkeletonrightphotourlNotBetween(String value1, String value2) {
            addCriterion("skeletonRightphotoUrl not between", value1, value2, "skeletonrightphotourl");
            return (Criteria) this;
        }

        public Criteria andExteriorupurlIsNull() {
            addCriterion("exteriorUpUrl is null");
            return (Criteria) this;
        }

        public Criteria andExteriorupurlIsNotNull() {
            addCriterion("exteriorUpUrl is not null");
            return (Criteria) this;
        }

        public Criteria andExteriorupurlEqualTo(String value) {
            addCriterion("exteriorUpUrl =", value, "exteriorupurl");
            return (Criteria) this;
        }

        public Criteria andExteriorupurlNotEqualTo(String value) {
            addCriterion("exteriorUpUrl <>", value, "exteriorupurl");
            return (Criteria) this;
        }

        public Criteria andExteriorupurlGreaterThan(String value) {
            addCriterion("exteriorUpUrl >", value, "exteriorupurl");
            return (Criteria) this;
        }

        public Criteria andExteriorupurlGreaterThanOrEqualTo(String value) {
            addCriterion("exteriorUpUrl >=", value, "exteriorupurl");
            return (Criteria) this;
        }

        public Criteria andExteriorupurlLessThan(String value) {
            addCriterion("exteriorUpUrl <", value, "exteriorupurl");
            return (Criteria) this;
        }

        public Criteria andExteriorupurlLessThanOrEqualTo(String value) {
            addCriterion("exteriorUpUrl <=", value, "exteriorupurl");
            return (Criteria) this;
        }

        public Criteria andExteriorupurlLike(String value) {
            addCriterion("exteriorUpUrl like", value, "exteriorupurl");
            return (Criteria) this;
        }

        public Criteria andExteriorupurlNotLike(String value) {
            addCriterion("exteriorUpUrl not like", value, "exteriorupurl");
            return (Criteria) this;
        }

        public Criteria andExteriorupurlIn(List<String> values) {
            addCriterion("exteriorUpUrl in", values, "exteriorupurl");
            return (Criteria) this;
        }

        public Criteria andExteriorupurlNotIn(List<String> values) {
            addCriterion("exteriorUpUrl not in", values, "exteriorupurl");
            return (Criteria) this;
        }

        public Criteria andExteriorupurlBetween(String value1, String value2) {
            addCriterion("exteriorUpUrl between", value1, value2, "exteriorupurl");
            return (Criteria) this;
        }

        public Criteria andExteriorupurlNotBetween(String value1, String value2) {
            addCriterion("exteriorUpUrl not between", value1, value2, "exteriorupurl");
            return (Criteria) this;
        }

        public Criteria andExteriorlefturlIsNull() {
            addCriterion("exteriorLeftUrl is null");
            return (Criteria) this;
        }

        public Criteria andExteriorlefturlIsNotNull() {
            addCriterion("exteriorLeftUrl is not null");
            return (Criteria) this;
        }

        public Criteria andExteriorlefturlEqualTo(String value) {
            addCriterion("exteriorLeftUrl =", value, "exteriorlefturl");
            return (Criteria) this;
        }

        public Criteria andExteriorlefturlNotEqualTo(String value) {
            addCriterion("exteriorLeftUrl <>", value, "exteriorlefturl");
            return (Criteria) this;
        }

        public Criteria andExteriorlefturlGreaterThan(String value) {
            addCriterion("exteriorLeftUrl >", value, "exteriorlefturl");
            return (Criteria) this;
        }

        public Criteria andExteriorlefturlGreaterThanOrEqualTo(String value) {
            addCriterion("exteriorLeftUrl >=", value, "exteriorlefturl");
            return (Criteria) this;
        }

        public Criteria andExteriorlefturlLessThan(String value) {
            addCriterion("exteriorLeftUrl <", value, "exteriorlefturl");
            return (Criteria) this;
        }

        public Criteria andExteriorlefturlLessThanOrEqualTo(String value) {
            addCriterion("exteriorLeftUrl <=", value, "exteriorlefturl");
            return (Criteria) this;
        }

        public Criteria andExteriorlefturlLike(String value) {
            addCriterion("exteriorLeftUrl like", value, "exteriorlefturl");
            return (Criteria) this;
        }

        public Criteria andExteriorlefturlNotLike(String value) {
            addCriterion("exteriorLeftUrl not like", value, "exteriorlefturl");
            return (Criteria) this;
        }

        public Criteria andExteriorlefturlIn(List<String> values) {
            addCriterion("exteriorLeftUrl in", values, "exteriorlefturl");
            return (Criteria) this;
        }

        public Criteria andExteriorlefturlNotIn(List<String> values) {
            addCriterion("exteriorLeftUrl not in", values, "exteriorlefturl");
            return (Criteria) this;
        }

        public Criteria andExteriorlefturlBetween(String value1, String value2) {
            addCriterion("exteriorLeftUrl between", value1, value2, "exteriorlefturl");
            return (Criteria) this;
        }

        public Criteria andExteriorlefturlNotBetween(String value1, String value2) {
            addCriterion("exteriorLeftUrl not between", value1, value2, "exteriorlefturl");
            return (Criteria) this;
        }

        public Criteria andExteriorcenterurlIsNull() {
            addCriterion("exteriorCenterUrl is null");
            return (Criteria) this;
        }

        public Criteria andExteriorcenterurlIsNotNull() {
            addCriterion("exteriorCenterUrl is not null");
            return (Criteria) this;
        }

        public Criteria andExteriorcenterurlEqualTo(String value) {
            addCriterion("exteriorCenterUrl =", value, "exteriorcenterurl");
            return (Criteria) this;
        }

        public Criteria andExteriorcenterurlNotEqualTo(String value) {
            addCriterion("exteriorCenterUrl <>", value, "exteriorcenterurl");
            return (Criteria) this;
        }

        public Criteria andExteriorcenterurlGreaterThan(String value) {
            addCriterion("exteriorCenterUrl >", value, "exteriorcenterurl");
            return (Criteria) this;
        }

        public Criteria andExteriorcenterurlGreaterThanOrEqualTo(String value) {
            addCriterion("exteriorCenterUrl >=", value, "exteriorcenterurl");
            return (Criteria) this;
        }

        public Criteria andExteriorcenterurlLessThan(String value) {
            addCriterion("exteriorCenterUrl <", value, "exteriorcenterurl");
            return (Criteria) this;
        }

        public Criteria andExteriorcenterurlLessThanOrEqualTo(String value) {
            addCriterion("exteriorCenterUrl <=", value, "exteriorcenterurl");
            return (Criteria) this;
        }

        public Criteria andExteriorcenterurlLike(String value) {
            addCriterion("exteriorCenterUrl like", value, "exteriorcenterurl");
            return (Criteria) this;
        }

        public Criteria andExteriorcenterurlNotLike(String value) {
            addCriterion("exteriorCenterUrl not like", value, "exteriorcenterurl");
            return (Criteria) this;
        }

        public Criteria andExteriorcenterurlIn(List<String> values) {
            addCriterion("exteriorCenterUrl in", values, "exteriorcenterurl");
            return (Criteria) this;
        }

        public Criteria andExteriorcenterurlNotIn(List<String> values) {
            addCriterion("exteriorCenterUrl not in", values, "exteriorcenterurl");
            return (Criteria) this;
        }

        public Criteria andExteriorcenterurlBetween(String value1, String value2) {
            addCriterion("exteriorCenterUrl between", value1, value2, "exteriorcenterurl");
            return (Criteria) this;
        }

        public Criteria andExteriorcenterurlNotBetween(String value1, String value2) {
            addCriterion("exteriorCenterUrl not between", value1, value2, "exteriorcenterurl");
            return (Criteria) this;
        }

        public Criteria andExteriorrighturlIsNull() {
            addCriterion("exteriorRightUrl is null");
            return (Criteria) this;
        }

        public Criteria andExteriorrighturlIsNotNull() {
            addCriterion("exteriorRightUrl is not null");
            return (Criteria) this;
        }

        public Criteria andExteriorrighturlEqualTo(String value) {
            addCriterion("exteriorRightUrl =", value, "exteriorrighturl");
            return (Criteria) this;
        }

        public Criteria andExteriorrighturlNotEqualTo(String value) {
            addCriterion("exteriorRightUrl <>", value, "exteriorrighturl");
            return (Criteria) this;
        }

        public Criteria andExteriorrighturlGreaterThan(String value) {
            addCriterion("exteriorRightUrl >", value, "exteriorrighturl");
            return (Criteria) this;
        }

        public Criteria andExteriorrighturlGreaterThanOrEqualTo(String value) {
            addCriterion("exteriorRightUrl >=", value, "exteriorrighturl");
            return (Criteria) this;
        }

        public Criteria andExteriorrighturlLessThan(String value) {
            addCriterion("exteriorRightUrl <", value, "exteriorrighturl");
            return (Criteria) this;
        }

        public Criteria andExteriorrighturlLessThanOrEqualTo(String value) {
            addCriterion("exteriorRightUrl <=", value, "exteriorrighturl");
            return (Criteria) this;
        }

        public Criteria andExteriorrighturlLike(String value) {
            addCriterion("exteriorRightUrl like", value, "exteriorrighturl");
            return (Criteria) this;
        }

        public Criteria andExteriorrighturlNotLike(String value) {
            addCriterion("exteriorRightUrl not like", value, "exteriorrighturl");
            return (Criteria) this;
        }

        public Criteria andExteriorrighturlIn(List<String> values) {
            addCriterion("exteriorRightUrl in", values, "exteriorrighturl");
            return (Criteria) this;
        }

        public Criteria andExteriorrighturlNotIn(List<String> values) {
            addCriterion("exteriorRightUrl not in", values, "exteriorrighturl");
            return (Criteria) this;
        }

        public Criteria andExteriorrighturlBetween(String value1, String value2) {
            addCriterion("exteriorRightUrl between", value1, value2, "exteriorrighturl");
            return (Criteria) this;
        }

        public Criteria andExteriorrighturlNotBetween(String value1, String value2) {
            addCriterion("exteriorRightUrl not between", value1, value2, "exteriorrighturl");
            return (Criteria) this;
        }

        public Criteria andExteriordownurlIsNull() {
            addCriterion("exteriorDownUrl is null");
            return (Criteria) this;
        }

        public Criteria andExteriordownurlIsNotNull() {
            addCriterion("exteriorDownUrl is not null");
            return (Criteria) this;
        }

        public Criteria andExteriordownurlEqualTo(String value) {
            addCriterion("exteriorDownUrl =", value, "exteriordownurl");
            return (Criteria) this;
        }

        public Criteria andExteriordownurlNotEqualTo(String value) {
            addCriterion("exteriorDownUrl <>", value, "exteriordownurl");
            return (Criteria) this;
        }

        public Criteria andExteriordownurlGreaterThan(String value) {
            addCriterion("exteriorDownUrl >", value, "exteriordownurl");
            return (Criteria) this;
        }

        public Criteria andExteriordownurlGreaterThanOrEqualTo(String value) {
            addCriterion("exteriorDownUrl >=", value, "exteriordownurl");
            return (Criteria) this;
        }

        public Criteria andExteriordownurlLessThan(String value) {
            addCriterion("exteriorDownUrl <", value, "exteriordownurl");
            return (Criteria) this;
        }

        public Criteria andExteriordownurlLessThanOrEqualTo(String value) {
            addCriterion("exteriorDownUrl <=", value, "exteriordownurl");
            return (Criteria) this;
        }

        public Criteria andExteriordownurlLike(String value) {
            addCriterion("exteriorDownUrl like", value, "exteriordownurl");
            return (Criteria) this;
        }

        public Criteria andExteriordownurlNotLike(String value) {
            addCriterion("exteriorDownUrl not like", value, "exteriordownurl");
            return (Criteria) this;
        }

        public Criteria andExteriordownurlIn(List<String> values) {
            addCriterion("exteriorDownUrl in", values, "exteriordownurl");
            return (Criteria) this;
        }

        public Criteria andExteriordownurlNotIn(List<String> values) {
            addCriterion("exteriorDownUrl not in", values, "exteriordownurl");
            return (Criteria) this;
        }

        public Criteria andExteriordownurlBetween(String value1, String value2) {
            addCriterion("exteriorDownUrl between", value1, value2, "exteriordownurl");
            return (Criteria) this;
        }

        public Criteria andExteriordownurlNotBetween(String value1, String value2) {
            addCriterion("exteriorDownUrl not between", value1, value2, "exteriordownurl");
            return (Criteria) this;
        }

        public Criteria andInteriorurlIsNull() {
            addCriterion("interiorUrl is null");
            return (Criteria) this;
        }

        public Criteria andInteriorurlIsNotNull() {
            addCriterion("interiorUrl is not null");
            return (Criteria) this;
        }

        public Criteria andInteriorurlEqualTo(String value) {
            addCriterion("interiorUrl =", value, "interiorurl");
            return (Criteria) this;
        }

        public Criteria andInteriorurlNotEqualTo(String value) {
            addCriterion("interiorUrl <>", value, "interiorurl");
            return (Criteria) this;
        }

        public Criteria andInteriorurlGreaterThan(String value) {
            addCriterion("interiorUrl >", value, "interiorurl");
            return (Criteria) this;
        }

        public Criteria andInteriorurlGreaterThanOrEqualTo(String value) {
            addCriterion("interiorUrl >=", value, "interiorurl");
            return (Criteria) this;
        }

        public Criteria andInteriorurlLessThan(String value) {
            addCriterion("interiorUrl <", value, "interiorurl");
            return (Criteria) this;
        }

        public Criteria andInteriorurlLessThanOrEqualTo(String value) {
            addCriterion("interiorUrl <=", value, "interiorurl");
            return (Criteria) this;
        }

        public Criteria andInteriorurlLike(String value) {
            addCriterion("interiorUrl like", value, "interiorurl");
            return (Criteria) this;
        }

        public Criteria andInteriorurlNotLike(String value) {
            addCriterion("interiorUrl not like", value, "interiorurl");
            return (Criteria) this;
        }

        public Criteria andInteriorurlIn(List<String> values) {
            addCriterion("interiorUrl in", values, "interiorurl");
            return (Criteria) this;
        }

        public Criteria andInteriorurlNotIn(List<String> values) {
            addCriterion("interiorUrl not in", values, "interiorurl");
            return (Criteria) this;
        }

        public Criteria andInteriorurlBetween(String value1, String value2) {
            addCriterion("interiorUrl between", value1, value2, "interiorurl");
            return (Criteria) this;
        }

        public Criteria andInteriorurlNotBetween(String value1, String value2) {
            addCriterion("interiorUrl not between", value1, value2, "interiorurl");
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