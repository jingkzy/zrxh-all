package com.zrxh.pingche.data.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
public class InspCarInfoExample implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    public void setOredCriteria(List<Criteria> oredCriteria) {
		this.oredCriteria = oredCriteria;
	}

	public InspCarInfoExample() {
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
    protected abstract static class GeneratedCriteria implements java.io.Serializable {
        protected List<Criterion> criteria;
        public void setCriteria(List<Criterion> criteria) {
			this.criteria = criteria;
		}

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

        public Criteria andBusinesstypeIsNull() {
            addCriterion("businessType is null");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIsNotNull() {
            addCriterion("businessType is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeEqualTo(String value) {
            addCriterion("businessType =", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotEqualTo(String value) {
            addCriterion("businessType <>", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeGreaterThan(String value) {
            addCriterion("businessType >", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeGreaterThanOrEqualTo(String value) {
            addCriterion("businessType >=", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeLessThan(String value) {
            addCriterion("businessType <", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeLessThanOrEqualTo(String value) {
            addCriterion("businessType <=", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeLike(String value) {
            addCriterion("businessType like", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotLike(String value) {
            addCriterion("businessType not like", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIn(List<String> values) {
            addCriterion("businessType in", values, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotIn(List<String> values) {
            addCriterion("businessType not in", values, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeBetween(String value1, String value2) {
            addCriterion("businessType between", value1, value2, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotBetween(String value1, String value2) {
            addCriterion("businessType not between", value1, value2, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypesubIsNull() {
            addCriterion("businessTypeSub is null");
            return (Criteria) this;
        }

        public Criteria andBusinesstypesubIsNotNull() {
            addCriterion("businessTypeSub is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesstypesubEqualTo(String value) {
            addCriterion("businessTypeSub =", value, "businesstypesub");
            return (Criteria) this;
        }

        public Criteria andBusinesstypesubNotEqualTo(String value) {
            addCriterion("businessTypeSub <>", value, "businesstypesub");
            return (Criteria) this;
        }

        public Criteria andBusinesstypesubGreaterThan(String value) {
            addCriterion("businessTypeSub >", value, "businesstypesub");
            return (Criteria) this;
        }

        public Criteria andBusinesstypesubGreaterThanOrEqualTo(String value) {
            addCriterion("businessTypeSub >=", value, "businesstypesub");
            return (Criteria) this;
        }

        public Criteria andBusinesstypesubLessThan(String value) {
            addCriterion("businessTypeSub <", value, "businesstypesub");
            return (Criteria) this;
        }

        public Criteria andBusinesstypesubLessThanOrEqualTo(String value) {
            addCriterion("businessTypeSub <=", value, "businesstypesub");
            return (Criteria) this;
        }

        public Criteria andBusinesstypesubLike(String value) {
            addCriterion("businessTypeSub like", value, "businesstypesub");
            return (Criteria) this;
        }

        public Criteria andBusinesstypesubNotLike(String value) {
            addCriterion("businessTypeSub not like", value, "businesstypesub");
            return (Criteria) this;
        }

        public Criteria andBusinesstypesubIn(List<String> values) {
            addCriterion("businessTypeSub in", values, "businesstypesub");
            return (Criteria) this;
        }

        public Criteria andBusinesstypesubNotIn(List<String> values) {
            addCriterion("businessTypeSub not in", values, "businesstypesub");
            return (Criteria) this;
        }

        public Criteria andBusinesstypesubBetween(String value1, String value2) {
            addCriterion("businessTypeSub between", value1, value2, "businesstypesub");
            return (Criteria) this;
        }

        public Criteria andBusinesstypesubNotBetween(String value1, String value2) {
            addCriterion("businessTypeSub not between", value1, value2, "businesstypesub");
            return (Criteria) this;
        }

        public Criteria andPlatenumberIsNull() {
            addCriterion("plateNumber is null");
            return (Criteria) this;
        }

        public Criteria andPlatenumberIsNotNull() {
            addCriterion("plateNumber is not null");
            return (Criteria) this;
        }

        public Criteria andPlatenumberEqualTo(String value) {
            addCriterion("plateNumber =", value, "platenumber");
            return (Criteria) this;
        }

        public Criteria andPlatenumberNotEqualTo(String value) {
            addCriterion("plateNumber <>", value, "platenumber");
            return (Criteria) this;
        }

        public Criteria andPlatenumberGreaterThan(String value) {
            addCriterion("plateNumber >", value, "platenumber");
            return (Criteria) this;
        }

        public Criteria andPlatenumberGreaterThanOrEqualTo(String value) {
            addCriterion("plateNumber >=", value, "platenumber");
            return (Criteria) this;
        }

        public Criteria andPlatenumberLessThan(String value) {
            addCriterion("plateNumber <", value, "platenumber");
            return (Criteria) this;
        }

        public Criteria andPlatenumberLessThanOrEqualTo(String value) {
            addCriterion("plateNumber <=", value, "platenumber");
            return (Criteria) this;
        }

        public Criteria andPlatenumberLike(String value) {
            addCriterion("plateNumber like", value, "platenumber");
            return (Criteria) this;
        }

        public Criteria andPlatenumberNotLike(String value) {
            addCriterion("plateNumber not like", value, "platenumber");
            return (Criteria) this;
        }

        public Criteria andPlatenumberIn(List<String> values) {
            addCriterion("plateNumber in", values, "platenumber");
            return (Criteria) this;
        }

        public Criteria andPlatenumberNotIn(List<String> values) {
            addCriterion("plateNumber not in", values, "platenumber");
            return (Criteria) this;
        }

        public Criteria andPlatenumberBetween(String value1, String value2) {
            addCriterion("plateNumber between", value1, value2, "platenumber");
            return (Criteria) this;
        }

        public Criteria andPlatenumberNotBetween(String value1, String value2) {
            addCriterion("plateNumber not between", value1, value2, "platenumber");
            return (Criteria) this;
        }

        public Criteria andCarownerIsNull() {
            addCriterion("carOwner is null");
            return (Criteria) this;
        }

        public Criteria andCarownerIsNotNull() {
            addCriterion("carOwner is not null");
            return (Criteria) this;
        }

        public Criteria andCarownerEqualTo(String value) {
            addCriterion("carOwner =", value, "carowner");
            return (Criteria) this;
        }

        public Criteria andCarownerNotEqualTo(String value) {
            addCriterion("carOwner <>", value, "carowner");
            return (Criteria) this;
        }

        public Criteria andCarownerGreaterThan(String value) {
            addCriterion("carOwner >", value, "carowner");
            return (Criteria) this;
        }

        public Criteria andCarownerGreaterThanOrEqualTo(String value) {
            addCriterion("carOwner >=", value, "carowner");
            return (Criteria) this;
        }

        public Criteria andCarownerLessThan(String value) {
            addCriterion("carOwner <", value, "carowner");
            return (Criteria) this;
        }

        public Criteria andCarownerLessThanOrEqualTo(String value) {
            addCriterion("carOwner <=", value, "carowner");
            return (Criteria) this;
        }

        public Criteria andCarownerLike(String value) {
            addCriterion("carOwner like", value, "carowner");
            return (Criteria) this;
        }

        public Criteria andCarownerNotLike(String value) {
            addCriterion("carOwner not like", value, "carowner");
            return (Criteria) this;
        }

        public Criteria andCarownerIn(List<String> values) {
            addCriterion("carOwner in", values, "carowner");
            return (Criteria) this;
        }

        public Criteria andCarownerNotIn(List<String> values) {
            addCriterion("carOwner not in", values, "carowner");
            return (Criteria) this;
        }

        public Criteria andCarownerBetween(String value1, String value2) {
            addCriterion("carOwner between", value1, value2, "carowner");
            return (Criteria) this;
        }

        public Criteria andCarownerNotBetween(String value1, String value2) {
            addCriterion("carOwner not between", value1, value2, "carowner");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andCartypeIsNull() {
            addCriterion("carType is null");
            return (Criteria) this;
        }

        public Criteria andCartypeIsNotNull() {
            addCriterion("carType is not null");
            return (Criteria) this;
        }

        public Criteria andCartypeEqualTo(String value) {
            addCriterion("carType =", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotEqualTo(String value) {
            addCriterion("carType <>", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeGreaterThan(String value) {
            addCriterion("carType >", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeGreaterThanOrEqualTo(String value) {
            addCriterion("carType >=", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeLessThan(String value) {
            addCriterion("carType <", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeLessThanOrEqualTo(String value) {
            addCriterion("carType <=", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeLike(String value) {
            addCriterion("carType like", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotLike(String value) {
            addCriterion("carType not like", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeIn(List<String> values) {
            addCriterion("carType in", values, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotIn(List<String> values) {
            addCriterion("carType not in", values, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeBetween(String value1, String value2) {
            addCriterion("carType between", value1, value2, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotBetween(String value1, String value2) {
            addCriterion("carType not between", value1, value2, "cartype");
            return (Criteria) this;
        }

        public Criteria andCaroutputIsNull() {
            addCriterion("carOutput is null");
            return (Criteria) this;
        }

        public Criteria andCaroutputIsNotNull() {
            addCriterion("carOutput is not null");
            return (Criteria) this;
        }

        public Criteria andCaroutputEqualTo(String value) {
            addCriterion("carOutput =", value, "caroutput");
            return (Criteria) this;
        }

        public Criteria andCaroutputNotEqualTo(String value) {
            addCriterion("carOutput <>", value, "caroutput");
            return (Criteria) this;
        }

        public Criteria andCaroutputGreaterThan(String value) {
            addCriterion("carOutput >", value, "caroutput");
            return (Criteria) this;
        }

        public Criteria andCaroutputGreaterThanOrEqualTo(String value) {
            addCriterion("carOutput >=", value, "caroutput");
            return (Criteria) this;
        }

        public Criteria andCaroutputLessThan(String value) {
            addCriterion("carOutput <", value, "caroutput");
            return (Criteria) this;
        }

        public Criteria andCaroutputLessThanOrEqualTo(String value) {
            addCriterion("carOutput <=", value, "caroutput");
            return (Criteria) this;
        }

        public Criteria andCaroutputLike(String value) {
            addCriterion("carOutput like", value, "caroutput");
            return (Criteria) this;
        }

        public Criteria andCaroutputNotLike(String value) {
            addCriterion("carOutput not like", value, "caroutput");
            return (Criteria) this;
        }

        public Criteria andCaroutputIn(List<String> values) {
            addCriterion("carOutput in", values, "caroutput");
            return (Criteria) this;
        }

        public Criteria andCaroutputNotIn(List<String> values) {
            addCriterion("carOutput not in", values, "caroutput");
            return (Criteria) this;
        }

        public Criteria andCaroutputBetween(String value1, String value2) {
            addCriterion("carOutput between", value1, value2, "caroutput");
            return (Criteria) this;
        }

        public Criteria andCaroutputNotBetween(String value1, String value2) {
            addCriterion("carOutput not between", value1, value2, "caroutput");
            return (Criteria) this;
        }

        public Criteria andVincodeIsNull() {
            addCriterion("vinCode is null");
            return (Criteria) this;
        }

        public Criteria andVincodeIsNotNull() {
            addCriterion("vinCode is not null");
            return (Criteria) this;
        }

        public Criteria andVincodeEqualTo(String value) {
            addCriterion("vinCode =", value, "vincode");
            return (Criteria) this;
        }

        public Criteria andVincodeNotEqualTo(String value) {
            addCriterion("vinCode <>", value, "vincode");
            return (Criteria) this;
        }

        public Criteria andVincodeGreaterThan(String value) {
            addCriterion("vinCode >", value, "vincode");
            return (Criteria) this;
        }

        public Criteria andVincodeGreaterThanOrEqualTo(String value) {
            addCriterion("vinCode >=", value, "vincode");
            return (Criteria) this;
        }

        public Criteria andVincodeLessThan(String value) {
            addCriterion("vinCode <", value, "vincode");
            return (Criteria) this;
        }

        public Criteria andVincodeLessThanOrEqualTo(String value) {
            addCriterion("vinCode <=", value, "vincode");
            return (Criteria) this;
        }

        public Criteria andVincodeLike(String value) {
            addCriterion("vinCode like", value, "vincode");
            return (Criteria) this;
        }

        public Criteria andVincodeNotLike(String value) {
            addCriterion("vinCode not like", value, "vincode");
            return (Criteria) this;
        }

        public Criteria andVincodeIn(List<String> values) {
            addCriterion("vinCode in", values, "vincode");
            return (Criteria) this;
        }

        public Criteria andVincodeNotIn(List<String> values) {
            addCriterion("vinCode not in", values, "vincode");
            return (Criteria) this;
        }

        public Criteria andVincodeBetween(String value1, String value2) {
            addCriterion("vinCode between", value1, value2, "vincode");
            return (Criteria) this;
        }

        public Criteria andVincodeNotBetween(String value1, String value2) {
            addCriterion("vinCode not between", value1, value2, "vincode");
            return (Criteria) this;
        }

        public Criteria andEnginenumberIsNull() {
            addCriterion("engineNumber is null");
            return (Criteria) this;
        }

        public Criteria andEnginenumberIsNotNull() {
            addCriterion("engineNumber is not null");
            return (Criteria) this;
        }

        public Criteria andEnginenumberEqualTo(String value) {
            addCriterion("engineNumber =", value, "enginenumber");
            return (Criteria) this;
        }

        public Criteria andEnginenumberNotEqualTo(String value) {
            addCriterion("engineNumber <>", value, "enginenumber");
            return (Criteria) this;
        }

        public Criteria andEnginenumberGreaterThan(String value) {
            addCriterion("engineNumber >", value, "enginenumber");
            return (Criteria) this;
        }

        public Criteria andEnginenumberGreaterThanOrEqualTo(String value) {
            addCriterion("engineNumber >=", value, "enginenumber");
            return (Criteria) this;
        }

        public Criteria andEnginenumberLessThan(String value) {
            addCriterion("engineNumber <", value, "enginenumber");
            return (Criteria) this;
        }

        public Criteria andEnginenumberLessThanOrEqualTo(String value) {
            addCriterion("engineNumber <=", value, "enginenumber");
            return (Criteria) this;
        }

        public Criteria andEnginenumberLike(String value) {
            addCriterion("engineNumber like", value, "enginenumber");
            return (Criteria) this;
        }

        public Criteria andEnginenumberNotLike(String value) {
            addCriterion("engineNumber not like", value, "enginenumber");
            return (Criteria) this;
        }

        public Criteria andEnginenumberIn(List<String> values) {
            addCriterion("engineNumber in", values, "enginenumber");
            return (Criteria) this;
        }

        public Criteria andEnginenumberNotIn(List<String> values) {
            addCriterion("engineNumber not in", values, "enginenumber");
            return (Criteria) this;
        }

        public Criteria andEnginenumberBetween(String value1, String value2) {
            addCriterion("engineNumber between", value1, value2, "enginenumber");
            return (Criteria) this;
        }

        public Criteria andEnginenumberNotBetween(String value1, String value2) {
            addCriterion("engineNumber not between", value1, value2, "enginenumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateIsNull() {
            addCriterion("registrationDate is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateIsNotNull() {
            addCriterion("registrationDate is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateEqualTo(String value) {
            addCriterion("registrationDate =", value, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateNotEqualTo(String value) {
            addCriterion("registrationDate <>", value, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateGreaterThan(String value) {
            addCriterion("registrationDate >", value, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateGreaterThanOrEqualTo(String value) {
            addCriterion("registrationDate >=", value, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateLessThan(String value) {
            addCriterion("registrationDate <", value, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateLessThanOrEqualTo(String value) {
            addCriterion("registrationDate <=", value, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateLike(String value) {
            addCriterion("registrationDate like", value, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateNotLike(String value) {
            addCriterion("registrationDate not like", value, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateIn(List<String> values) {
            addCriterion("registrationDate in", values, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateNotIn(List<String> values) {
            addCriterion("registrationDate not in", values, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateBetween(String value1, String value2) {
            addCriterion("registrationDate between", value1, value2, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateNotBetween(String value1, String value2) {
            addCriterion("registrationDate not between", value1, value2, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andFactorydateIsNull() {
            addCriterion("factoryDate is null");
            return (Criteria) this;
        }

        public Criteria andFactorydateIsNotNull() {
            addCriterion("factoryDate is not null");
            return (Criteria) this;
        }

        public Criteria andFactorydateEqualTo(String value) {
            addCriterion("factoryDate =", value, "factorydate");
            return (Criteria) this;
        }

        public Criteria andFactorydateNotEqualTo(String value) {
            addCriterion("factoryDate <>", value, "factorydate");
            return (Criteria) this;
        }

        public Criteria andFactorydateGreaterThan(String value) {
            addCriterion("factoryDate >", value, "factorydate");
            return (Criteria) this;
        }

        public Criteria andFactorydateGreaterThanOrEqualTo(String value) {
            addCriterion("factoryDate >=", value, "factorydate");
            return (Criteria) this;
        }

        public Criteria andFactorydateLessThan(String value) {
            addCriterion("factoryDate <", value, "factorydate");
            return (Criteria) this;
        }

        public Criteria andFactorydateLessThanOrEqualTo(String value) {
            addCriterion("factoryDate <=", value, "factorydate");
            return (Criteria) this;
        }

        public Criteria andFactorydateLike(String value) {
            addCriterion("factoryDate like", value, "factorydate");
            return (Criteria) this;
        }

        public Criteria andFactorydateNotLike(String value) {
            addCriterion("factoryDate not like", value, "factorydate");
            return (Criteria) this;
        }

        public Criteria andFactorydateIn(List<String> values) {
            addCriterion("factoryDate in", values, "factorydate");
            return (Criteria) this;
        }

        public Criteria andFactorydateNotIn(List<String> values) {
            addCriterion("factoryDate not in", values, "factorydate");
            return (Criteria) this;
        }

        public Criteria andFactorydateBetween(String value1, String value2) {
            addCriterion("factoryDate between", value1, value2, "factorydate");
            return (Criteria) this;
        }

        public Criteria andFactorydateNotBetween(String value1, String value2) {
            addCriterion("factoryDate not between", value1, value2, "factorydate");
            return (Criteria) this;
        }

        public Criteria andEnvironstandardsIsNull() {
            addCriterion("environStandards is null");
            return (Criteria) this;
        }

        public Criteria andEnvironstandardsIsNotNull() {
            addCriterion("environStandards is not null");
            return (Criteria) this;
        }

        public Criteria andEnvironstandardsEqualTo(String value) {
            addCriterion("environStandards =", value, "environstandards");
            return (Criteria) this;
        }

        public Criteria andEnvironstandardsNotEqualTo(String value) {
            addCriterion("environStandards <>", value, "environstandards");
            return (Criteria) this;
        }

        public Criteria andEnvironstandardsGreaterThan(String value) {
            addCriterion("environStandards >", value, "environstandards");
            return (Criteria) this;
        }

        public Criteria andEnvironstandardsGreaterThanOrEqualTo(String value) {
            addCriterion("environStandards >=", value, "environstandards");
            return (Criteria) this;
        }

        public Criteria andEnvironstandardsLessThan(String value) {
            addCriterion("environStandards <", value, "environstandards");
            return (Criteria) this;
        }

        public Criteria andEnvironstandardsLessThanOrEqualTo(String value) {
            addCriterion("environStandards <=", value, "environstandards");
            return (Criteria) this;
        }

        public Criteria andEnvironstandardsLike(String value) {
            addCriterion("environStandards like", value, "environstandards");
            return (Criteria) this;
        }

        public Criteria andEnvironstandardsNotLike(String value) {
            addCriterion("environStandards not like", value, "environstandards");
            return (Criteria) this;
        }

        public Criteria andEnvironstandardsIn(List<String> values) {
            addCriterion("environStandards in", values, "environstandards");
            return (Criteria) this;
        }

        public Criteria andEnvironstandardsNotIn(List<String> values) {
            addCriterion("environStandards not in", values, "environstandards");
            return (Criteria) this;
        }

        public Criteria andEnvironstandardsBetween(String value1, String value2) {
            addCriterion("environStandards between", value1, value2, "environstandards");
            return (Criteria) this;
        }

        public Criteria andEnvironstandardsNotBetween(String value1, String value2) {
            addCriterion("environStandards not between", value1, value2, "environstandards");
            return (Criteria) this;
        }

        public Criteria andMileageIsNull() {
            addCriterion("mileage is null");
            return (Criteria) this;
        }

        public Criteria andMileageIsNotNull() {
            addCriterion("mileage is not null");
            return (Criteria) this;
        }

        public Criteria andMileageEqualTo(String value) {
            addCriterion("mileage =", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotEqualTo(String value) {
            addCriterion("mileage <>", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageGreaterThan(String value) {
            addCriterion("mileage >", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageGreaterThanOrEqualTo(String value) {
            addCriterion("mileage >=", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageLessThan(String value) {
            addCriterion("mileage <", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageLessThanOrEqualTo(String value) {
            addCriterion("mileage <=", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageLike(String value) {
            addCriterion("mileage like", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotLike(String value) {
            addCriterion("mileage not like", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageIn(List<String> values) {
            addCriterion("mileage in", values, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotIn(List<String> values) {
            addCriterion("mileage not in", values, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageBetween(String value1, String value2) {
            addCriterion("mileage between", value1, value2, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotBetween(String value1, String value2) {
            addCriterion("mileage not between", value1, value2, "mileage");
            return (Criteria) this;
        }

        public Criteria andFueltypeIsNull() {
            addCriterion("fuelType is null");
            return (Criteria) this;
        }

        public Criteria andFueltypeIsNotNull() {
            addCriterion("fuelType is not null");
            return (Criteria) this;
        }

        public Criteria andFueltypeEqualTo(String value) {
            addCriterion("fuelType =", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeNotEqualTo(String value) {
            addCriterion("fuelType <>", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeGreaterThan(String value) {
            addCriterion("fuelType >", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeGreaterThanOrEqualTo(String value) {
            addCriterion("fuelType >=", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeLessThan(String value) {
            addCriterion("fuelType <", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeLessThanOrEqualTo(String value) {
            addCriterion("fuelType <=", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeLike(String value) {
            addCriterion("fuelType like", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeNotLike(String value) {
            addCriterion("fuelType not like", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeIn(List<String> values) {
            addCriterion("fuelType in", values, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeNotIn(List<String> values) {
            addCriterion("fuelType not in", values, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeBetween(String value1, String value2) {
            addCriterion("fuelType between", value1, value2, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeNotBetween(String value1, String value2) {
            addCriterion("fuelType not between", value1, value2, "fueltype");
            return (Criteria) this;
        }

        public Criteria andSpeedtypeIsNull() {
            addCriterion("speedType is null");
            return (Criteria) this;
        }

        public Criteria andSpeedtypeIsNotNull() {
            addCriterion("speedType is not null");
            return (Criteria) this;
        }

        public Criteria andSpeedtypeEqualTo(String value) {
            addCriterion("speedType =", value, "speedtype");
            return (Criteria) this;
        }

        public Criteria andSpeedtypeNotEqualTo(String value) {
            addCriterion("speedType <>", value, "speedtype");
            return (Criteria) this;
        }

        public Criteria andSpeedtypeGreaterThan(String value) {
            addCriterion("speedType >", value, "speedtype");
            return (Criteria) this;
        }

        public Criteria andSpeedtypeGreaterThanOrEqualTo(String value) {
            addCriterion("speedType >=", value, "speedtype");
            return (Criteria) this;
        }

        public Criteria andSpeedtypeLessThan(String value) {
            addCriterion("speedType <", value, "speedtype");
            return (Criteria) this;
        }

        public Criteria andSpeedtypeLessThanOrEqualTo(String value) {
            addCriterion("speedType <=", value, "speedtype");
            return (Criteria) this;
        }

        public Criteria andSpeedtypeLike(String value) {
            addCriterion("speedType like", value, "speedtype");
            return (Criteria) this;
        }

        public Criteria andSpeedtypeNotLike(String value) {
            addCriterion("speedType not like", value, "speedtype");
            return (Criteria) this;
        }

        public Criteria andSpeedtypeIn(List<String> values) {
            addCriterion("speedType in", values, "speedtype");
            return (Criteria) this;
        }

        public Criteria andSpeedtypeNotIn(List<String> values) {
            addCriterion("speedType not in", values, "speedtype");
            return (Criteria) this;
        }

        public Criteria andSpeedtypeBetween(String value1, String value2) {
            addCriterion("speedType between", value1, value2, "speedtype");
            return (Criteria) this;
        }

        public Criteria andSpeedtypeNotBetween(String value1, String value2) {
            addCriterion("speedType not between", value1, value2, "speedtype");
            return (Criteria) this;
        }

        public Criteria andDrivingmodeIsNull() {
            addCriterion("drivingMode is null");
            return (Criteria) this;
        }

        public Criteria andDrivingmodeIsNotNull() {
            addCriterion("drivingMode is not null");
            return (Criteria) this;
        }

        public Criteria andDrivingmodeEqualTo(String value) {
            addCriterion("drivingMode =", value, "drivingmode");
            return (Criteria) this;
        }

        public Criteria andDrivingmodeNotEqualTo(String value) {
            addCriterion("drivingMode <>", value, "drivingmode");
            return (Criteria) this;
        }

        public Criteria andDrivingmodeGreaterThan(String value) {
            addCriterion("drivingMode >", value, "drivingmode");
            return (Criteria) this;
        }

        public Criteria andDrivingmodeGreaterThanOrEqualTo(String value) {
            addCriterion("drivingMode >=", value, "drivingmode");
            return (Criteria) this;
        }

        public Criteria andDrivingmodeLessThan(String value) {
            addCriterion("drivingMode <", value, "drivingmode");
            return (Criteria) this;
        }

        public Criteria andDrivingmodeLessThanOrEqualTo(String value) {
            addCriterion("drivingMode <=", value, "drivingmode");
            return (Criteria) this;
        }

        public Criteria andDrivingmodeLike(String value) {
            addCriterion("drivingMode like", value, "drivingmode");
            return (Criteria) this;
        }

        public Criteria andDrivingmodeNotLike(String value) {
            addCriterion("drivingMode not like", value, "drivingmode");
            return (Criteria) this;
        }

        public Criteria andDrivingmodeIn(List<String> values) {
            addCriterion("drivingMode in", values, "drivingmode");
            return (Criteria) this;
        }

        public Criteria andDrivingmodeNotIn(List<String> values) {
            addCriterion("drivingMode not in", values, "drivingmode");
            return (Criteria) this;
        }

        public Criteria andDrivingmodeBetween(String value1, String value2) {
            addCriterion("drivingMode between", value1, value2, "drivingmode");
            return (Criteria) this;
        }

        public Criteria andDrivingmodeNotBetween(String value1, String value2) {
            addCriterion("drivingMode not between", value1, value2, "drivingmode");
            return (Criteria) this;
        }

        public Criteria andBodycolorIsNull() {
            addCriterion("bodyColor is null");
            return (Criteria) this;
        }

        public Criteria andBodycolorIsNotNull() {
            addCriterion("bodyColor is not null");
            return (Criteria) this;
        }

        public Criteria andBodycolorEqualTo(String value) {
            addCriterion("bodyColor =", value, "bodycolor");
            return (Criteria) this;
        }

        public Criteria andBodycolorNotEqualTo(String value) {
            addCriterion("bodyColor <>", value, "bodycolor");
            return (Criteria) this;
        }

        public Criteria andBodycolorGreaterThan(String value) {
            addCriterion("bodyColor >", value, "bodycolor");
            return (Criteria) this;
        }

        public Criteria andBodycolorGreaterThanOrEqualTo(String value) {
            addCriterion("bodyColor >=", value, "bodycolor");
            return (Criteria) this;
        }

        public Criteria andBodycolorLessThan(String value) {
            addCriterion("bodyColor <", value, "bodycolor");
            return (Criteria) this;
        }

        public Criteria andBodycolorLessThanOrEqualTo(String value) {
            addCriterion("bodyColor <=", value, "bodycolor");
            return (Criteria) this;
        }

        public Criteria andBodycolorLike(String value) {
            addCriterion("bodyColor like", value, "bodycolor");
            return (Criteria) this;
        }

        public Criteria andBodycolorNotLike(String value) {
            addCriterion("bodyColor not like", value, "bodycolor");
            return (Criteria) this;
        }

        public Criteria andBodycolorIn(List<String> values) {
            addCriterion("bodyColor in", values, "bodycolor");
            return (Criteria) this;
        }

        public Criteria andBodycolorNotIn(List<String> values) {
            addCriterion("bodyColor not in", values, "bodycolor");
            return (Criteria) this;
        }

        public Criteria andBodycolorBetween(String value1, String value2) {
            addCriterion("bodyColor between", value1, value2, "bodycolor");
            return (Criteria) this;
        }

        public Criteria andBodycolorNotBetween(String value1, String value2) {
            addCriterion("bodyColor not between", value1, value2, "bodycolor");
            return (Criteria) this;
        }

        public Criteria andCarkeysIsNull() {
            addCriterion("carKeys is null");
            return (Criteria) this;
        }

        public Criteria andCarkeysIsNotNull() {
            addCriterion("carKeys is not null");
            return (Criteria) this;
        }

        public Criteria andCarkeysEqualTo(String value) {
            addCriterion("carKeys =", value, "carkeys");
            return (Criteria) this;
        }

        public Criteria andCarkeysNotEqualTo(String value) {
            addCriterion("carKeys <>", value, "carkeys");
            return (Criteria) this;
        }

        public Criteria andCarkeysGreaterThan(String value) {
            addCriterion("carKeys >", value, "carkeys");
            return (Criteria) this;
        }

        public Criteria andCarkeysGreaterThanOrEqualTo(String value) {
            addCriterion("carKeys >=", value, "carkeys");
            return (Criteria) this;
        }

        public Criteria andCarkeysLessThan(String value) {
            addCriterion("carKeys <", value, "carkeys");
            return (Criteria) this;
        }

        public Criteria andCarkeysLessThanOrEqualTo(String value) {
            addCriterion("carKeys <=", value, "carkeys");
            return (Criteria) this;
        }

        public Criteria andCarkeysLike(String value) {
            addCriterion("carKeys like", value, "carkeys");
            return (Criteria) this;
        }

        public Criteria andCarkeysNotLike(String value) {
            addCriterion("carKeys not like", value, "carkeys");
            return (Criteria) this;
        }

        public Criteria andCarkeysIn(List<String> values) {
            addCriterion("carKeys in", values, "carkeys");
            return (Criteria) this;
        }

        public Criteria andCarkeysNotIn(List<String> values) {
            addCriterion("carKeys not in", values, "carkeys");
            return (Criteria) this;
        }

        public Criteria andCarkeysBetween(String value1, String value2) {
            addCriterion("carKeys between", value1, value2, "carkeys");
            return (Criteria) this;
        }

        public Criteria andCarkeysNotBetween(String value1, String value2) {
            addCriterion("carKeys not between", value1, value2, "carkeys");
            return (Criteria) this;
        }

        public Criteria andAuditpersonIsNull() {
            addCriterion("auditPerson is null");
            return (Criteria) this;
        }

        public Criteria andAuditpersonIsNotNull() {
            addCriterion("auditPerson is not null");
            return (Criteria) this;
        }

        public Criteria andAuditpersonEqualTo(String value) {
            addCriterion("auditPerson =", value, "auditperson");
            return (Criteria) this;
        }

        public Criteria andAuditpersonNotEqualTo(String value) {
            addCriterion("auditPerson <>", value, "auditperson");
            return (Criteria) this;
        }

        public Criteria andAuditpersonGreaterThan(String value) {
            addCriterion("auditPerson >", value, "auditperson");
            return (Criteria) this;
        }

        public Criteria andAuditpersonGreaterThanOrEqualTo(String value) {
            addCriterion("auditPerson >=", value, "auditperson");
            return (Criteria) this;
        }

        public Criteria andAuditpersonLessThan(String value) {
            addCriterion("auditPerson <", value, "auditperson");
            return (Criteria) this;
        }

        public Criteria andAuditpersonLessThanOrEqualTo(String value) {
            addCriterion("auditPerson <=", value, "auditperson");
            return (Criteria) this;
        }

        public Criteria andAuditpersonLike(String value) {
            addCriterion("auditPerson like", value, "auditperson");
            return (Criteria) this;
        }

        public Criteria andAuditpersonNotLike(String value) {
            addCriterion("auditPerson not like", value, "auditperson");
            return (Criteria) this;
        }

        public Criteria andAuditpersonIn(List<String> values) {
            addCriterion("auditPerson in", values, "auditperson");
            return (Criteria) this;
        }

        public Criteria andAuditpersonNotIn(List<String> values) {
            addCriterion("auditPerson not in", values, "auditperson");
            return (Criteria) this;
        }

        public Criteria andAuditpersonBetween(String value1, String value2) {
            addCriterion("auditPerson between", value1, value2, "auditperson");
            return (Criteria) this;
        }

        public Criteria andAuditpersonNotBetween(String value1, String value2) {
            addCriterion("auditPerson not between", value1, value2, "auditperson");
            return (Criteria) this;
        }

        public Criteria andAuditstatusIsNull() {
            addCriterion("auditStatus is null");
            return (Criteria) this;
        }

        public Criteria andAuditstatusIsNotNull() {
            addCriterion("auditStatus is not null");
            return (Criteria) this;
        }

        public Criteria andAuditstatusEqualTo(String value) {
            addCriterion("auditStatus =", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusNotEqualTo(String value) {
            addCriterion("auditStatus <>", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusGreaterThan(String value) {
            addCriterion("auditStatus >", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusGreaterThanOrEqualTo(String value) {
            addCriterion("auditStatus >=", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusLessThan(String value) {
            addCriterion("auditStatus <", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusLessThanOrEqualTo(String value) {
            addCriterion("auditStatus <=", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusLike(String value) {
            addCriterion("auditStatus like", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusNotLike(String value) {
            addCriterion("auditStatus not like", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusIn(List<String> values) {
            addCriterion("auditStatus in", values, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusNotIn(List<String> values) {
            addCriterion("auditStatus not in", values, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusBetween(String value1, String value2) {
            addCriterion("auditStatus between", value1, value2, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusNotBetween(String value1, String value2) {
            addCriterion("auditStatus not between", value1, value2, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAudittimeIsNull() {
            addCriterion("auditTime is null");
            return (Criteria) this;
        }

        public Criteria andAudittimeIsNotNull() {
            addCriterion("auditTime is not null");
            return (Criteria) this;
        }

        public Criteria andAudittimeEqualTo(Date value) {
            addCriterion("auditTime =", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeNotEqualTo(Date value) {
            addCriterion("auditTime <>", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeGreaterThan(Date value) {
            addCriterion("auditTime >", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeGreaterThanOrEqualTo(Date value) {
            addCriterion("auditTime >=", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeLessThan(Date value) {
            addCriterion("auditTime <", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeLessThanOrEqualTo(Date value) {
            addCriterion("auditTime <=", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeIn(List<Date> values) {
            addCriterion("auditTime in", values, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeNotIn(List<Date> values) {
            addCriterion("auditTime not in", values, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeBetween(Date value1, Date value2) {
            addCriterion("auditTime between", value1, value2, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeNotBetween(Date value1, Date value2) {
            addCriterion("auditTime not between", value1, value2, "audittime");
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

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userId like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userId not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCarnumtypeIsNull() {
            addCriterion("carnumtype is null");
            return (Criteria) this;
        }

        public Criteria andCarnumtypeIsNotNull() {
            addCriterion("carnumtype is not null");
            return (Criteria) this;
        }

        public Criteria andCarnumtypeEqualTo(String value) {
            addCriterion("carnumtype =", value, "carnumtype");
            return (Criteria) this;
        }

        public Criteria andCarnumtypeNotEqualTo(String value) {
            addCriterion("carnumtype <>", value, "carnumtype");
            return (Criteria) this;
        }

        public Criteria andCarnumtypeGreaterThan(String value) {
            addCriterion("carnumtype >", value, "carnumtype");
            return (Criteria) this;
        }

        public Criteria andCarnumtypeGreaterThanOrEqualTo(String value) {
            addCriterion("carnumtype >=", value, "carnumtype");
            return (Criteria) this;
        }

        public Criteria andCarnumtypeLessThan(String value) {
            addCriterion("carnumtype <", value, "carnumtype");
            return (Criteria) this;
        }

        public Criteria andCarnumtypeLessThanOrEqualTo(String value) {
            addCriterion("carnumtype <=", value, "carnumtype");
            return (Criteria) this;
        }

        public Criteria andCarnumtypeLike(String value) {
            addCriterion("carnumtype like", value, "carnumtype");
            return (Criteria) this;
        }

        public Criteria andCarnumtypeNotLike(String value) {
            addCriterion("carnumtype not like", value, "carnumtype");
            return (Criteria) this;
        }

        public Criteria andCarnumtypeIn(List<String> values) {
            addCriterion("carnumtype in", values, "carnumtype");
            return (Criteria) this;
        }

        public Criteria andCarnumtypeNotIn(List<String> values) {
            addCriterion("carnumtype not in", values, "carnumtype");
            return (Criteria) this;
        }

        public Criteria andCarnumtypeBetween(String value1, String value2) {
            addCriterion("carnumtype between", value1, value2, "carnumtype");
            return (Criteria) this;
        }

        public Criteria andCarnumtypeNotBetween(String value1, String value2) {
            addCriterion("carnumtype not between", value1, value2, "carnumtype");
            return (Criteria) this;
        }

        public Criteria andPlateprovinceIsNull() {
            addCriterion("plateProvince is null");
            return (Criteria) this;
        }

        public Criteria andPlateprovinceIsNotNull() {
            addCriterion("plateProvince is not null");
            return (Criteria) this;
        }

        public Criteria andPlateprovinceEqualTo(String value) {
            addCriterion("plateProvince =", value, "plateprovince");
            return (Criteria) this;
        }

        public Criteria andPlateprovinceNotEqualTo(String value) {
            addCriterion("plateProvince <>", value, "plateprovince");
            return (Criteria) this;
        }

        public Criteria andPlateprovinceGreaterThan(String value) {
            addCriterion("plateProvince >", value, "plateprovince");
            return (Criteria) this;
        }

        public Criteria andPlateprovinceGreaterThanOrEqualTo(String value) {
            addCriterion("plateProvince >=", value, "plateprovince");
            return (Criteria) this;
        }

        public Criteria andPlateprovinceLessThan(String value) {
            addCriterion("plateProvince <", value, "plateprovince");
            return (Criteria) this;
        }

        public Criteria andPlateprovinceLessThanOrEqualTo(String value) {
            addCriterion("plateProvince <=", value, "plateprovince");
            return (Criteria) this;
        }

        public Criteria andPlateprovinceLike(String value) {
            addCriterion("plateProvince like", value, "plateprovince");
            return (Criteria) this;
        }

        public Criteria andPlateprovinceNotLike(String value) {
            addCriterion("plateProvince not like", value, "plateprovince");
            return (Criteria) this;
        }

        public Criteria andPlateprovinceIn(List<String> values) {
            addCriterion("plateProvince in", values, "plateprovince");
            return (Criteria) this;
        }

        public Criteria andPlateprovinceNotIn(List<String> values) {
            addCriterion("plateProvince not in", values, "plateprovince");
            return (Criteria) this;
        }

        public Criteria andPlateprovinceBetween(String value1, String value2) {
            addCriterion("plateProvince between", value1, value2, "plateprovince");
            return (Criteria) this;
        }

        public Criteria andPlateprovinceNotBetween(String value1, String value2) {
            addCriterion("plateProvince not between", value1, value2, "plateprovince");
            return (Criteria) this;
        }

        public Criteria andPlateszIsNull() {
            addCriterion("plateSz is null");
            return (Criteria) this;
        }

        public Criteria andPlateszIsNotNull() {
            addCriterion("plateSz is not null");
            return (Criteria) this;
        }

        public Criteria andPlateszEqualTo(String value) {
            addCriterion("plateSz =", value, "platesz");
            return (Criteria) this;
        }

        public Criteria andPlateszNotEqualTo(String value) {
            addCriterion("plateSz <>", value, "platesz");
            return (Criteria) this;
        }

        public Criteria andPlateszGreaterThan(String value) {
            addCriterion("plateSz >", value, "platesz");
            return (Criteria) this;
        }

        public Criteria andPlateszGreaterThanOrEqualTo(String value) {
            addCriterion("plateSz >=", value, "platesz");
            return (Criteria) this;
        }

        public Criteria andPlateszLessThan(String value) {
            addCriterion("plateSz <", value, "platesz");
            return (Criteria) this;
        }

        public Criteria andPlateszLessThanOrEqualTo(String value) {
            addCriterion("plateSz <=", value, "platesz");
            return (Criteria) this;
        }

        public Criteria andPlateszLike(String value) {
            addCriterion("plateSz like", value, "platesz");
            return (Criteria) this;
        }

        public Criteria andPlateszNotLike(String value) {
            addCriterion("plateSz not like", value, "platesz");
            return (Criteria) this;
        }

        public Criteria andPlateszIn(List<String> values) {
            addCriterion("plateSz in", values, "platesz");
            return (Criteria) this;
        }

        public Criteria andPlateszNotIn(List<String> values) {
            addCriterion("plateSz not in", values, "platesz");
            return (Criteria) this;
        }

        public Criteria andPlateszBetween(String value1, String value2) {
            addCriterion("plateSz between", value1, value2, "platesz");
            return (Criteria) this;
        }

        public Criteria andPlateszNotBetween(String value1, String value2) {
            addCriterion("plateSz not between", value1, value2, "platesz");
            return (Criteria) this;
        }

        public Criteria andTrimidIsNull() {
            addCriterion("trimId is null");
            return (Criteria) this;
        }

        public Criteria andTrimidIsNotNull() {
            addCriterion("trimId is not null");
            return (Criteria) this;
        }

        public Criteria andTrimidEqualTo(String value) {
            addCriterion("trimId =", value, "trimid");
            return (Criteria) this;
        }

        public Criteria andTrimidNotEqualTo(String value) {
            addCriterion("trimId <>", value, "trimid");
            return (Criteria) this;
        }

        public Criteria andTrimidGreaterThan(String value) {
            addCriterion("trimId >", value, "trimid");
            return (Criteria) this;
        }

        public Criteria andTrimidGreaterThanOrEqualTo(String value) {
            addCriterion("trimId >=", value, "trimid");
            return (Criteria) this;
        }

        public Criteria andTrimidLessThan(String value) {
            addCriterion("trimId <", value, "trimid");
            return (Criteria) this;
        }

        public Criteria andTrimidLessThanOrEqualTo(String value) {
            addCriterion("trimId <=", value, "trimid");
            return (Criteria) this;
        }

        public Criteria andTrimidLike(String value) {
            addCriterion("trimId like", value, "trimid");
            return (Criteria) this;
        }

        public Criteria andTrimidNotLike(String value) {
            addCriterion("trimId not like", value, "trimid");
            return (Criteria) this;
        }

        public Criteria andTrimidIn(List<String> values) {
            addCriterion("trimId in", values, "trimid");
            return (Criteria) this;
        }

        public Criteria andTrimidNotIn(List<String> values) {
            addCriterion("trimId not in", values, "trimid");
            return (Criteria) this;
        }

        public Criteria andTrimidBetween(String value1, String value2) {
            addCriterion("trimId between", value1, value2, "trimid");
            return (Criteria) this;
        }

        public Criteria andTrimidNotBetween(String value1, String value2) {
            addCriterion("trimId not between", value1, value2, "trimid");
            return (Criteria) this;
        }

        public Criteria andCurrentlableIsNull() {
            addCriterion("currentLable is null");
            return (Criteria) this;
        }

        public Criteria andCurrentlableIsNotNull() {
            addCriterion("currentLable is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentlableEqualTo(String value) {
            addCriterion("currentLable =", value, "currentlable");
            return (Criteria) this;
        }

        public Criteria andCurrentlableNotEqualTo(String value) {
            addCriterion("currentLable <>", value, "currentlable");
            return (Criteria) this;
        }

        public Criteria andCurrentlableGreaterThan(String value) {
            addCriterion("currentLable >", value, "currentlable");
            return (Criteria) this;
        }

        public Criteria andCurrentlableGreaterThanOrEqualTo(String value) {
            addCriterion("currentLable >=", value, "currentlable");
            return (Criteria) this;
        }

        public Criteria andCurrentlableLessThan(String value) {
            addCriterion("currentLable <", value, "currentlable");
            return (Criteria) this;
        }

        public Criteria andCurrentlableLessThanOrEqualTo(String value) {
            addCriterion("currentLable <=", value, "currentlable");
            return (Criteria) this;
        }

        public Criteria andCurrentlableLike(String value) {
            addCriterion("currentLable like", value, "currentlable");
            return (Criteria) this;
        }

        public Criteria andCurrentlableNotLike(String value) {
            addCriterion("currentLable not like", value, "currentlable");
            return (Criteria) this;
        }

        public Criteria andCurrentlableIn(List<String> values) {
            addCriterion("currentLable in", values, "currentlable");
            return (Criteria) this;
        }

        public Criteria andCurrentlableNotIn(List<String> values) {
            addCriterion("currentLable not in", values, "currentlable");
            return (Criteria) this;
        }

        public Criteria andCurrentlableBetween(String value1, String value2) {
            addCriterion("currentLable between", value1, value2, "currentlable");
            return (Criteria) this;
        }

        public Criteria andCurrentlableNotBetween(String value1, String value2) {
            addCriterion("currentLable not between", value1, value2, "currentlable");
            return (Criteria) this;
        }

        public Criteria andIspassexamineIsNull() {
            addCriterion("isPassExamine is null");
            return (Criteria) this;
        }

        public Criteria andIspassexamineIsNotNull() {
            addCriterion("isPassExamine is not null");
            return (Criteria) this;
        }

        public Criteria andIspassexamineEqualTo(String value) {
            addCriterion("isPassExamine =", value, "ispassexamine");
            return (Criteria) this;
        }

        public Criteria andIspassexamineNotEqualTo(String value) {
            addCriterion("isPassExamine <>", value, "ispassexamine");
            return (Criteria) this;
        }

        public Criteria andIspassexamineGreaterThan(String value) {
            addCriterion("isPassExamine >", value, "ispassexamine");
            return (Criteria) this;
        }

        public Criteria andIspassexamineGreaterThanOrEqualTo(String value) {
            addCriterion("isPassExamine >=", value, "ispassexamine");
            return (Criteria) this;
        }

        public Criteria andIspassexamineLessThan(String value) {
            addCriterion("isPassExamine <", value, "ispassexamine");
            return (Criteria) this;
        }

        public Criteria andIspassexamineLessThanOrEqualTo(String value) {
            addCriterion("isPassExamine <=", value, "ispassexamine");
            return (Criteria) this;
        }

        public Criteria andIspassexamineLike(String value) {
            addCriterion("isPassExamine like", value, "ispassexamine");
            return (Criteria) this;
        }

        public Criteria andIspassexamineNotLike(String value) {
            addCriterion("isPassExamine not like", value, "ispassexamine");
            return (Criteria) this;
        }

        public Criteria andIspassexamineIn(List<String> values) {
            addCriterion("isPassExamine in", values, "ispassexamine");
            return (Criteria) this;
        }

        public Criteria andIspassexamineNotIn(List<String> values) {
            addCriterion("isPassExamine not in", values, "ispassexamine");
            return (Criteria) this;
        }

        public Criteria andIspassexamineBetween(String value1, String value2) {
            addCriterion("isPassExamine between", value1, value2, "ispassexamine");
            return (Criteria) this;
        }

        public Criteria andIspassexamineNotBetween(String value1, String value2) {
            addCriterion("isPassExamine not between", value1, value2, "ispassexamine");
            return (Criteria) this;
        }

        public Criteria andContinueormodifyIsNull() {
            addCriterion("continueOrModify is null");
            return (Criteria) this;
        }

        public Criteria andContinueormodifyIsNotNull() {
            addCriterion("continueOrModify is not null");
            return (Criteria) this;
        }

        public Criteria andContinueormodifyEqualTo(String value) {
            addCriterion("continueOrModify =", value, "continueormodify");
            return (Criteria) this;
        }

        public Criteria andContinueormodifyNotEqualTo(String value) {
            addCriterion("continueOrModify <>", value, "continueormodify");
            return (Criteria) this;
        }

        public Criteria andContinueormodifyGreaterThan(String value) {
            addCriterion("continueOrModify >", value, "continueormodify");
            return (Criteria) this;
        }

        public Criteria andContinueormodifyGreaterThanOrEqualTo(String value) {
            addCriterion("continueOrModify >=", value, "continueormodify");
            return (Criteria) this;
        }

        public Criteria andContinueormodifyLessThan(String value) {
            addCriterion("continueOrModify <", value, "continueormodify");
            return (Criteria) this;
        }

        public Criteria andContinueormodifyLessThanOrEqualTo(String value) {
            addCriterion("continueOrModify <=", value, "continueormodify");
            return (Criteria) this;
        }

        public Criteria andContinueormodifyLike(String value) {
            addCriterion("continueOrModify like", value, "continueormodify");
            return (Criteria) this;
        }

        public Criteria andContinueormodifyNotLike(String value) {
            addCriterion("continueOrModify not like", value, "continueormodify");
            return (Criteria) this;
        }

        public Criteria andContinueormodifyIn(List<String> values) {
            addCriterion("continueOrModify in", values, "continueormodify");
            return (Criteria) this;
        }

        public Criteria andContinueormodifyNotIn(List<String> values) {
            addCriterion("continueOrModify not in", values, "continueormodify");
            return (Criteria) this;
        }

        public Criteria andContinueormodifyBetween(String value1, String value2) {
            addCriterion("continueOrModify between", value1, value2, "continueormodify");
            return (Criteria) this;
        }

        public Criteria andContinueormodifyNotBetween(String value1, String value2) {
            addCriterion("continueOrModify not between", value1, value2, "continueormodify");
            return (Criteria) this;
        }

        public Criteria andStyleidIsNull() {
            addCriterion("styleId is null");
            return (Criteria) this;
        }

        public Criteria andStyleidIsNotNull() {
            addCriterion("styleId is not null");
            return (Criteria) this;
        }

        public Criteria andStyleidEqualTo(String value) {
            addCriterion("styleId =", value, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidNotEqualTo(String value) {
            addCriterion("styleId <>", value, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidGreaterThan(String value) {
            addCriterion("styleId >", value, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidGreaterThanOrEqualTo(String value) {
            addCriterion("styleId >=", value, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidLessThan(String value) {
            addCriterion("styleId <", value, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidLessThanOrEqualTo(String value) {
            addCriterion("styleId <=", value, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidLike(String value) {
            addCriterion("styleId like", value, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidNotLike(String value) {
            addCriterion("styleId not like", value, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidIn(List<String> values) {
            addCriterion("styleId in", values, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidNotIn(List<String> values) {
            addCriterion("styleId not in", values, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidBetween(String value1, String value2) {
            addCriterion("styleId between", value1, value2, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidNotBetween(String value1, String value2) {
            addCriterion("styleId not between", value1, value2, "styleid");
            return (Criteria) this;
        }

        public Criteria andMilesecondIsNull() {
            addCriterion("MileSecond is null");
            return (Criteria) this;
        }

        public Criteria andMilesecondIsNotNull() {
            addCriterion("MileSecond is not null");
            return (Criteria) this;
        }

        public Criteria andMilesecondEqualTo(String value) {
            addCriterion("MileSecond =", value, "milesecond");
            return (Criteria) this;
        }

        public Criteria andMilesecondNotEqualTo(String value) {
            addCriterion("MileSecond <>", value, "milesecond");
            return (Criteria) this;
        }

        public Criteria andMilesecondGreaterThan(String value) {
            addCriterion("MileSecond >", value, "milesecond");
            return (Criteria) this;
        }

        public Criteria andMilesecondGreaterThanOrEqualTo(String value) {
            addCriterion("MileSecond >=", value, "milesecond");
            return (Criteria) this;
        }

        public Criteria andMilesecondLessThan(String value) {
            addCriterion("MileSecond <", value, "milesecond");
            return (Criteria) this;
        }

        public Criteria andMilesecondLessThanOrEqualTo(String value) {
            addCriterion("MileSecond <=", value, "milesecond");
            return (Criteria) this;
        }

        public Criteria andMilesecondLike(String value) {
            addCriterion("MileSecond like", value, "milesecond");
            return (Criteria) this;
        }

        public Criteria andMilesecondNotLike(String value) {
            addCriterion("MileSecond not like", value, "milesecond");
            return (Criteria) this;
        }

        public Criteria andMilesecondIn(List<String> values) {
            addCriterion("MileSecond in", values, "milesecond");
            return (Criteria) this;
        }

        public Criteria andMilesecondNotIn(List<String> values) {
            addCriterion("MileSecond not in", values, "milesecond");
            return (Criteria) this;
        }

        public Criteria andMilesecondBetween(String value1, String value2) {
            addCriterion("MileSecond between", value1, value2, "milesecond");
            return (Criteria) this;
        }

        public Criteria andMilesecondNotBetween(String value1, String value2) {
            addCriterion("MileSecond not between", value1, value2, "milesecond");
            return (Criteria) this;
        }

        public Criteria andIdphotoIsNull() {
            addCriterion("IDPhoto is null");
            return (Criteria) this;
        }

        public Criteria andIdphotoIsNotNull() {
            addCriterion("IDPhoto is not null");
            return (Criteria) this;
        }

        public Criteria andIdphotoEqualTo(String value) {
            addCriterion("IDPhoto =", value, "idphoto");
            return (Criteria) this;
        }

        public Criteria andIdphotoNotEqualTo(String value) {
            addCriterion("IDPhoto <>", value, "idphoto");
            return (Criteria) this;
        }

        public Criteria andIdphotoGreaterThan(String value) {
            addCriterion("IDPhoto >", value, "idphoto");
            return (Criteria) this;
        }

        public Criteria andIdphotoGreaterThanOrEqualTo(String value) {
            addCriterion("IDPhoto >=", value, "idphoto");
            return (Criteria) this;
        }

        public Criteria andIdphotoLessThan(String value) {
            addCriterion("IDPhoto <", value, "idphoto");
            return (Criteria) this;
        }

        public Criteria andIdphotoLessThanOrEqualTo(String value) {
            addCriterion("IDPhoto <=", value, "idphoto");
            return (Criteria) this;
        }

        public Criteria andIdphotoLike(String value) {
            addCriterion("IDPhoto like", value, "idphoto");
            return (Criteria) this;
        }

        public Criteria andIdphotoNotLike(String value) {
            addCriterion("IDPhoto not like", value, "idphoto");
            return (Criteria) this;
        }

        public Criteria andIdphotoIn(List<String> values) {
            addCriterion("IDPhoto in", values, "idphoto");
            return (Criteria) this;
        }

        public Criteria andIdphotoNotIn(List<String> values) {
            addCriterion("IDPhoto not in", values, "idphoto");
            return (Criteria) this;
        }

        public Criteria andIdphotoBetween(String value1, String value2) {
            addCriterion("IDPhoto between", value1, value2, "idphoto");
            return (Criteria) this;
        }

        public Criteria andIdphotoNotBetween(String value1, String value2) {
            addCriterion("IDPhoto not between", value1, value2, "idphoto");
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
    public static class Criterion implements java.io.Serializable {
    	private Criterion(){
        	
        }
        public void setCondition(String condition) {
			this.condition = condition;
		}

		public void setValue(Object value) {
			this.value = value;
		}

		public void setSecondValue(Object secondValue) {
			this.secondValue = secondValue;
		}

		public void setNoValue(boolean noValue) {
			this.noValue = noValue;
		}

		public void setSingleValue(boolean singleValue) {
			this.singleValue = singleValue;
		}

		public void setBetweenValue(boolean betweenValue) {
			this.betweenValue = betweenValue;
		}

		public void setListValue(boolean listValue) {
			this.listValue = listValue;
		}

		public void setTypeHandler(String typeHandler) {
			this.typeHandler = typeHandler;
		}

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