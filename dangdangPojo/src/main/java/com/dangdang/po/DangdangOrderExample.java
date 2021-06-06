package com.dangdang.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DangdangOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public DangdangOrderExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andDoIdIsNull() {
            addCriterion("DO_ID is null");
            return (Criteria) this;
        }

        public Criteria andDoIdIsNotNull() {
            addCriterion("DO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDoIdEqualTo(Integer value) {
            addCriterion("DO_ID =", value, "doId");
            return (Criteria) this;
        }

        public Criteria andDoIdNotEqualTo(Integer value) {
            addCriterion("DO_ID <>", value, "doId");
            return (Criteria) this;
        }

        public Criteria andDoIdGreaterThan(Integer value) {
            addCriterion("DO_ID >", value, "doId");
            return (Criteria) this;
        }

        public Criteria andDoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DO_ID >=", value, "doId");
            return (Criteria) this;
        }

        public Criteria andDoIdLessThan(Integer value) {
            addCriterion("DO_ID <", value, "doId");
            return (Criteria) this;
        }

        public Criteria andDoIdLessThanOrEqualTo(Integer value) {
            addCriterion("DO_ID <=", value, "doId");
            return (Criteria) this;
        }

        public Criteria andDoIdIn(List<Integer> values) {
            addCriterion("DO_ID in", values, "doId");
            return (Criteria) this;
        }

        public Criteria andDoIdNotIn(List<Integer> values) {
            addCriterion("DO_ID not in", values, "doId");
            return (Criteria) this;
        }

        public Criteria andDoIdBetween(Integer value1, Integer value2) {
            addCriterion("DO_ID between", value1, value2, "doId");
            return (Criteria) this;
        }

        public Criteria andDoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DO_ID not between", value1, value2, "doId");
            return (Criteria) this;
        }

        public Criteria andDoUserIdIsNull() {
            addCriterion("DO_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andDoUserIdIsNotNull() {
            addCriterion("DO_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDoUserIdEqualTo(String value) {
            addCriterion("DO_USER_ID =", value, "doUserId");
            return (Criteria) this;
        }

        public Criteria andDoUserIdNotEqualTo(String value) {
            addCriterion("DO_USER_ID <>", value, "doUserId");
            return (Criteria) this;
        }

        public Criteria andDoUserIdGreaterThan(String value) {
            addCriterion("DO_USER_ID >", value, "doUserId");
            return (Criteria) this;
        }

        public Criteria andDoUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("DO_USER_ID >=", value, "doUserId");
            return (Criteria) this;
        }

        public Criteria andDoUserIdLessThan(String value) {
            addCriterion("DO_USER_ID <", value, "doUserId");
            return (Criteria) this;
        }

        public Criteria andDoUserIdLessThanOrEqualTo(String value) {
            addCriterion("DO_USER_ID <=", value, "doUserId");
            return (Criteria) this;
        }

        public Criteria andDoUserIdLike(String value) {
            addCriterion("DO_USER_ID like", value, "doUserId");
            return (Criteria) this;
        }

        public Criteria andDoUserIdNotLike(String value) {
            addCriterion("DO_USER_ID not like", value, "doUserId");
            return (Criteria) this;
        }

        public Criteria andDoUserIdIn(List<String> values) {
            addCriterion("DO_USER_ID in", values, "doUserId");
            return (Criteria) this;
        }

        public Criteria andDoUserIdNotIn(List<String> values) {
            addCriterion("DO_USER_ID not in", values, "doUserId");
            return (Criteria) this;
        }

        public Criteria andDoUserIdBetween(String value1, String value2) {
            addCriterion("DO_USER_ID between", value1, value2, "doUserId");
            return (Criteria) this;
        }

        public Criteria andDoUserIdNotBetween(String value1, String value2) {
            addCriterion("DO_USER_ID not between", value1, value2, "doUserId");
            return (Criteria) this;
        }

        public Criteria andDoUserNameIsNull() {
            addCriterion("DO_USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDoUserNameIsNotNull() {
            addCriterion("DO_USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDoUserNameEqualTo(String value) {
            addCriterion("DO_USER_NAME =", value, "doUserName");
            return (Criteria) this;
        }

        public Criteria andDoUserNameNotEqualTo(String value) {
            addCriterion("DO_USER_NAME <>", value, "doUserName");
            return (Criteria) this;
        }

        public Criteria andDoUserNameGreaterThan(String value) {
            addCriterion("DO_USER_NAME >", value, "doUserName");
            return (Criteria) this;
        }

        public Criteria andDoUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("DO_USER_NAME >=", value, "doUserName");
            return (Criteria) this;
        }

        public Criteria andDoUserNameLessThan(String value) {
            addCriterion("DO_USER_NAME <", value, "doUserName");
            return (Criteria) this;
        }

        public Criteria andDoUserNameLessThanOrEqualTo(String value) {
            addCriterion("DO_USER_NAME <=", value, "doUserName");
            return (Criteria) this;
        }

        public Criteria andDoUserNameLike(String value) {
            addCriterion("DO_USER_NAME like", value, "doUserName");
            return (Criteria) this;
        }

        public Criteria andDoUserNameNotLike(String value) {
            addCriterion("DO_USER_NAME not like", value, "doUserName");
            return (Criteria) this;
        }

        public Criteria andDoUserNameIn(List<String> values) {
            addCriterion("DO_USER_NAME in", values, "doUserName");
            return (Criteria) this;
        }

        public Criteria andDoUserNameNotIn(List<String> values) {
            addCriterion("DO_USER_NAME not in", values, "doUserName");
            return (Criteria) this;
        }

        public Criteria andDoUserNameBetween(String value1, String value2) {
            addCriterion("DO_USER_NAME between", value1, value2, "doUserName");
            return (Criteria) this;
        }

        public Criteria andDoUserNameNotBetween(String value1, String value2) {
            addCriterion("DO_USER_NAME not between", value1, value2, "doUserName");
            return (Criteria) this;
        }

        public Criteria andDoUserTelIsNull() {
            addCriterion("DO_USER_TEL is null");
            return (Criteria) this;
        }

        public Criteria andDoUserTelIsNotNull() {
            addCriterion("DO_USER_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andDoUserTelEqualTo(String value) {
            addCriterion("DO_USER_TEL =", value, "doUserTel");
            return (Criteria) this;
        }

        public Criteria andDoUserTelNotEqualTo(String value) {
            addCriterion("DO_USER_TEL <>", value, "doUserTel");
            return (Criteria) this;
        }

        public Criteria andDoUserTelGreaterThan(String value) {
            addCriterion("DO_USER_TEL >", value, "doUserTel");
            return (Criteria) this;
        }

        public Criteria andDoUserTelGreaterThanOrEqualTo(String value) {
            addCriterion("DO_USER_TEL >=", value, "doUserTel");
            return (Criteria) this;
        }

        public Criteria andDoUserTelLessThan(String value) {
            addCriterion("DO_USER_TEL <", value, "doUserTel");
            return (Criteria) this;
        }

        public Criteria andDoUserTelLessThanOrEqualTo(String value) {
            addCriterion("DO_USER_TEL <=", value, "doUserTel");
            return (Criteria) this;
        }

        public Criteria andDoUserTelLike(String value) {
            addCriterion("DO_USER_TEL like", value, "doUserTel");
            return (Criteria) this;
        }

        public Criteria andDoUserTelNotLike(String value) {
            addCriterion("DO_USER_TEL not like", value, "doUserTel");
            return (Criteria) this;
        }

        public Criteria andDoUserTelIn(List<String> values) {
            addCriterion("DO_USER_TEL in", values, "doUserTel");
            return (Criteria) this;
        }

        public Criteria andDoUserTelNotIn(List<String> values) {
            addCriterion("DO_USER_TEL not in", values, "doUserTel");
            return (Criteria) this;
        }

        public Criteria andDoUserTelBetween(String value1, String value2) {
            addCriterion("DO_USER_TEL between", value1, value2, "doUserTel");
            return (Criteria) this;
        }

        public Criteria andDoUserTelNotBetween(String value1, String value2) {
            addCriterion("DO_USER_TEL not between", value1, value2, "doUserTel");
            return (Criteria) this;
        }

        public Criteria andDoUserAddressIsNull() {
            addCriterion("DO_USER_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andDoUserAddressIsNotNull() {
            addCriterion("DO_USER_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andDoUserAddressEqualTo(String value) {
            addCriterion("DO_USER_ADDRESS =", value, "doUserAddress");
            return (Criteria) this;
        }

        public Criteria andDoUserAddressNotEqualTo(String value) {
            addCriterion("DO_USER_ADDRESS <>", value, "doUserAddress");
            return (Criteria) this;
        }

        public Criteria andDoUserAddressGreaterThan(String value) {
            addCriterion("DO_USER_ADDRESS >", value, "doUserAddress");
            return (Criteria) this;
        }

        public Criteria andDoUserAddressGreaterThanOrEqualTo(String value) {
            addCriterion("DO_USER_ADDRESS >=", value, "doUserAddress");
            return (Criteria) this;
        }

        public Criteria andDoUserAddressLessThan(String value) {
            addCriterion("DO_USER_ADDRESS <", value, "doUserAddress");
            return (Criteria) this;
        }

        public Criteria andDoUserAddressLessThanOrEqualTo(String value) {
            addCriterion("DO_USER_ADDRESS <=", value, "doUserAddress");
            return (Criteria) this;
        }

        public Criteria andDoUserAddressLike(String value) {
            addCriterion("DO_USER_ADDRESS like", value, "doUserAddress");
            return (Criteria) this;
        }

        public Criteria andDoUserAddressNotLike(String value) {
            addCriterion("DO_USER_ADDRESS not like", value, "doUserAddress");
            return (Criteria) this;
        }

        public Criteria andDoUserAddressIn(List<String> values) {
            addCriterion("DO_USER_ADDRESS in", values, "doUserAddress");
            return (Criteria) this;
        }

        public Criteria andDoUserAddressNotIn(List<String> values) {
            addCriterion("DO_USER_ADDRESS not in", values, "doUserAddress");
            return (Criteria) this;
        }

        public Criteria andDoUserAddressBetween(String value1, String value2) {
            addCriterion("DO_USER_ADDRESS between", value1, value2, "doUserAddress");
            return (Criteria) this;
        }

        public Criteria andDoUserAddressNotBetween(String value1, String value2) {
            addCriterion("DO_USER_ADDRESS not between", value1, value2, "doUserAddress");
            return (Criteria) this;
        }

        public Criteria andDoCostIsNull() {
            addCriterion("DO_COST is null");
            return (Criteria) this;
        }

        public Criteria andDoCostIsNotNull() {
            addCriterion("DO_COST is not null");
            return (Criteria) this;
        }

        public Criteria andDoCostEqualTo(Integer value) {
            addCriterion("DO_COST =", value, "doCost");
            return (Criteria) this;
        }

        public Criteria andDoCostNotEqualTo(Integer value) {
            addCriterion("DO_COST <>", value, "doCost");
            return (Criteria) this;
        }

        public Criteria andDoCostGreaterThan(Integer value) {
            addCriterion("DO_COST >", value, "doCost");
            return (Criteria) this;
        }

        public Criteria andDoCostGreaterThanOrEqualTo(Integer value) {
            addCriterion("DO_COST >=", value, "doCost");
            return (Criteria) this;
        }

        public Criteria andDoCostLessThan(Integer value) {
            addCriterion("DO_COST <", value, "doCost");
            return (Criteria) this;
        }

        public Criteria andDoCostLessThanOrEqualTo(Integer value) {
            addCriterion("DO_COST <=", value, "doCost");
            return (Criteria) this;
        }

        public Criteria andDoCostIn(List<Integer> values) {
            addCriterion("DO_COST in", values, "doCost");
            return (Criteria) this;
        }

        public Criteria andDoCostNotIn(List<Integer> values) {
            addCriterion("DO_COST not in", values, "doCost");
            return (Criteria) this;
        }

        public Criteria andDoCostBetween(Integer value1, Integer value2) {
            addCriterion("DO_COST between", value1, value2, "doCost");
            return (Criteria) this;
        }

        public Criteria andDoCostNotBetween(Integer value1, Integer value2) {
            addCriterion("DO_COST not between", value1, value2, "doCost");
            return (Criteria) this;
        }

        public Criteria andDoCreateTimeIsNull() {
            addCriterion("DO_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDoCreateTimeIsNotNull() {
            addCriterion("DO_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDoCreateTimeEqualTo(Date value) {
            addCriterion("DO_CREATE_TIME =", value, "doCreateTime");
            return (Criteria) this;
        }

        public Criteria andDoCreateTimeNotEqualTo(Date value) {
            addCriterion("DO_CREATE_TIME <>", value, "doCreateTime");
            return (Criteria) this;
        }

        public Criteria andDoCreateTimeGreaterThan(Date value) {
            addCriterion("DO_CREATE_TIME >", value, "doCreateTime");
            return (Criteria) this;
        }

        public Criteria andDoCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DO_CREATE_TIME >=", value, "doCreateTime");
            return (Criteria) this;
        }

        public Criteria andDoCreateTimeLessThan(Date value) {
            addCriterion("DO_CREATE_TIME <", value, "doCreateTime");
            return (Criteria) this;
        }

        public Criteria andDoCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("DO_CREATE_TIME <=", value, "doCreateTime");
            return (Criteria) this;
        }

        public Criteria andDoCreateTimeIn(List<Date> values) {
            addCriterion("DO_CREATE_TIME in", values, "doCreateTime");
            return (Criteria) this;
        }

        public Criteria andDoCreateTimeNotIn(List<Date> values) {
            addCriterion("DO_CREATE_TIME not in", values, "doCreateTime");
            return (Criteria) this;
        }

        public Criteria andDoCreateTimeBetween(Date value1, Date value2) {
            addCriterion("DO_CREATE_TIME between", value1, value2, "doCreateTime");
            return (Criteria) this;
        }

        public Criteria andDoCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("DO_CREATE_TIME not between", value1, value2, "doCreateTime");
            return (Criteria) this;
        }

        public Criteria andDoStatusIsNull() {
            addCriterion("DO_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andDoStatusIsNotNull() {
            addCriterion("DO_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andDoStatusEqualTo(Integer value) {
            addCriterion("DO_STATUS =", value, "doStatus");
            return (Criteria) this;
        }

        public Criteria andDoStatusNotEqualTo(Integer value) {
            addCriterion("DO_STATUS <>", value, "doStatus");
            return (Criteria) this;
        }

        public Criteria andDoStatusGreaterThan(Integer value) {
            addCriterion("DO_STATUS >", value, "doStatus");
            return (Criteria) this;
        }

        public Criteria andDoStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("DO_STATUS >=", value, "doStatus");
            return (Criteria) this;
        }

        public Criteria andDoStatusLessThan(Integer value) {
            addCriterion("DO_STATUS <", value, "doStatus");
            return (Criteria) this;
        }

        public Criteria andDoStatusLessThanOrEqualTo(Integer value) {
            addCriterion("DO_STATUS <=", value, "doStatus");
            return (Criteria) this;
        }

        public Criteria andDoStatusIn(List<Integer> values) {
            addCriterion("DO_STATUS in", values, "doStatus");
            return (Criteria) this;
        }

        public Criteria andDoStatusNotIn(List<Integer> values) {
            addCriterion("DO_STATUS not in", values, "doStatus");
            return (Criteria) this;
        }

        public Criteria andDoStatusBetween(Integer value1, Integer value2) {
            addCriterion("DO_STATUS between", value1, value2, "doStatus");
            return (Criteria) this;
        }

        public Criteria andDoStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("DO_STATUS not between", value1, value2, "doStatus");
            return (Criteria) this;
        }

        public Criteria andDoTypeIsNull() {
            addCriterion("DO_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDoTypeIsNotNull() {
            addCriterion("DO_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDoTypeEqualTo(Integer value) {
            addCriterion("DO_TYPE =", value, "doType");
            return (Criteria) this;
        }

        public Criteria andDoTypeNotEqualTo(Integer value) {
            addCriterion("DO_TYPE <>", value, "doType");
            return (Criteria) this;
        }

        public Criteria andDoTypeGreaterThan(Integer value) {
            addCriterion("DO_TYPE >", value, "doType");
            return (Criteria) this;
        }

        public Criteria andDoTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("DO_TYPE >=", value, "doType");
            return (Criteria) this;
        }

        public Criteria andDoTypeLessThan(Integer value) {
            addCriterion("DO_TYPE <", value, "doType");
            return (Criteria) this;
        }

        public Criteria andDoTypeLessThanOrEqualTo(Integer value) {
            addCriterion("DO_TYPE <=", value, "doType");
            return (Criteria) this;
        }

        public Criteria andDoTypeIn(List<Integer> values) {
            addCriterion("DO_TYPE in", values, "doType");
            return (Criteria) this;
        }

        public Criteria andDoTypeNotIn(List<Integer> values) {
            addCriterion("DO_TYPE not in", values, "doType");
            return (Criteria) this;
        }

        public Criteria andDoTypeBetween(Integer value1, Integer value2) {
            addCriterion("DO_TYPE between", value1, value2, "doType");
            return (Criteria) this;
        }

        public Criteria andDoTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("DO_TYPE not between", value1, value2, "doType");
            return (Criteria) this;
        }
    }

    /**
     */
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