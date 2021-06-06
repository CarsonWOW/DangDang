package com.dangdang.po;

import java.util.ArrayList;
import java.util.List;

public class DangdangShoppingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public DangdangShoppingExample() {
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

        public Criteria andDodIdIsNull() {
            addCriterion("DOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andDodIdIsNotNull() {
            addCriterion("DOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDodIdEqualTo(Integer value) {
            addCriterion("DOD_ID =", value, "dodId");
            return (Criteria) this;
        }

        public Criteria andDodIdNotEqualTo(Integer value) {
            addCriterion("DOD_ID <>", value, "dodId");
            return (Criteria) this;
        }

        public Criteria andDodIdGreaterThan(Integer value) {
            addCriterion("DOD_ID >", value, "dodId");
            return (Criteria) this;
        }

        public Criteria andDodIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DOD_ID >=", value, "dodId");
            return (Criteria) this;
        }

        public Criteria andDodIdLessThan(Integer value) {
            addCriterion("DOD_ID <", value, "dodId");
            return (Criteria) this;
        }

        public Criteria andDodIdLessThanOrEqualTo(Integer value) {
            addCriterion("DOD_ID <=", value, "dodId");
            return (Criteria) this;
        }

        public Criteria andDodIdIn(List<Integer> values) {
            addCriterion("DOD_ID in", values, "dodId");
            return (Criteria) this;
        }

        public Criteria andDodIdNotIn(List<Integer> values) {
            addCriterion("DOD_ID not in", values, "dodId");
            return (Criteria) this;
        }

        public Criteria andDodIdBetween(Integer value1, Integer value2) {
            addCriterion("DOD_ID between", value1, value2, "dodId");
            return (Criteria) this;
        }

        public Criteria andDodIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DOD_ID not between", value1, value2, "dodId");
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

        public Criteria andDoUserIdEqualTo(Integer value) {
            addCriterion("DO_USER_ID =", value, "doUserId");
            return (Criteria) this;
        }

        public Criteria andDoUserIdNotEqualTo(Integer value) {
            addCriterion("DO_USER_ID <>", value, "doUserId");
            return (Criteria) this;
        }

        public Criteria andDoUserIdGreaterThan(Integer value) {
            addCriterion("DO_USER_ID >", value, "doUserId");
            return (Criteria) this;
        }

        public Criteria andDoUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DO_USER_ID >=", value, "doUserId");
            return (Criteria) this;
        }

        public Criteria andDoUserIdLessThan(Integer value) {
            addCriterion("DO_USER_ID <", value, "doUserId");
            return (Criteria) this;
        }

        public Criteria andDoUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("DO_USER_ID <=", value, "doUserId");
            return (Criteria) this;
        }

        public Criteria andDoUserIdIn(List<Integer> values) {
            addCriterion("DO_USER_ID in", values, "doUserId");
            return (Criteria) this;
        }

        public Criteria andDoUserIdNotIn(List<Integer> values) {
            addCriterion("DO_USER_ID not in", values, "doUserId");
            return (Criteria) this;
        }

        public Criteria andDoUserIdBetween(Integer value1, Integer value2) {
            addCriterion("DO_USER_ID between", value1, value2, "doUserId");
            return (Criteria) this;
        }

        public Criteria andDoUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DO_USER_ID not between", value1, value2, "doUserId");
            return (Criteria) this;
        }

        public Criteria andDpIdIsNull() {
            addCriterion("DP_ID is null");
            return (Criteria) this;
        }

        public Criteria andDpIdIsNotNull() {
            addCriterion("DP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDpIdEqualTo(Integer value) {
            addCriterion("DP_ID =", value, "dpId");
            return (Criteria) this;
        }

        public Criteria andDpIdNotEqualTo(Integer value) {
            addCriterion("DP_ID <>", value, "dpId");
            return (Criteria) this;
        }

        public Criteria andDpIdGreaterThan(Integer value) {
            addCriterion("DP_ID >", value, "dpId");
            return (Criteria) this;
        }

        public Criteria andDpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DP_ID >=", value, "dpId");
            return (Criteria) this;
        }

        public Criteria andDpIdLessThan(Integer value) {
            addCriterion("DP_ID <", value, "dpId");
            return (Criteria) this;
        }

        public Criteria andDpIdLessThanOrEqualTo(Integer value) {
            addCriterion("DP_ID <=", value, "dpId");
            return (Criteria) this;
        }

        public Criteria andDpIdIn(List<Integer> values) {
            addCriterion("DP_ID in", values, "dpId");
            return (Criteria) this;
        }

        public Criteria andDpIdNotIn(List<Integer> values) {
            addCriterion("DP_ID not in", values, "dpId");
            return (Criteria) this;
        }

        public Criteria andDpIdBetween(Integer value1, Integer value2) {
            addCriterion("DP_ID between", value1, value2, "dpId");
            return (Criteria) this;
        }

        public Criteria andDpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DP_ID not between", value1, value2, "dpId");
            return (Criteria) this;
        }

        public Criteria andDodQuantityIsNull() {
            addCriterion("DOD_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andDodQuantityIsNotNull() {
            addCriterion("DOD_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andDodQuantityEqualTo(Integer value) {
            addCriterion("DOD_QUANTITY =", value, "dodQuantity");
            return (Criteria) this;
        }

        public Criteria andDodQuantityNotEqualTo(Integer value) {
            addCriterion("DOD_QUANTITY <>", value, "dodQuantity");
            return (Criteria) this;
        }

        public Criteria andDodQuantityGreaterThan(Integer value) {
            addCriterion("DOD_QUANTITY >", value, "dodQuantity");
            return (Criteria) this;
        }

        public Criteria andDodQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("DOD_QUANTITY >=", value, "dodQuantity");
            return (Criteria) this;
        }

        public Criteria andDodQuantityLessThan(Integer value) {
            addCriterion("DOD_QUANTITY <", value, "dodQuantity");
            return (Criteria) this;
        }

        public Criteria andDodQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("DOD_QUANTITY <=", value, "dodQuantity");
            return (Criteria) this;
        }

        public Criteria andDodQuantityIn(List<Integer> values) {
            addCriterion("DOD_QUANTITY in", values, "dodQuantity");
            return (Criteria) this;
        }

        public Criteria andDodQuantityNotIn(List<Integer> values) {
            addCriterion("DOD_QUANTITY not in", values, "dodQuantity");
            return (Criteria) this;
        }

        public Criteria andDodQuantityBetween(Integer value1, Integer value2) {
            addCriterion("DOD_QUANTITY between", value1, value2, "dodQuantity");
            return (Criteria) this;
        }

        public Criteria andDodQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("DOD_QUANTITY not between", value1, value2, "dodQuantity");
            return (Criteria) this;
        }

        public Criteria andDodCostIsNull() {
            addCriterion("DOD_COST is null");
            return (Criteria) this;
        }

        public Criteria andDodCostIsNotNull() {
            addCriterion("DOD_COST is not null");
            return (Criteria) this;
        }

        public Criteria andDodCostEqualTo(Double value) {
            addCriterion("DOD_COST =", value, "dodCost");
            return (Criteria) this;
        }

        public Criteria andDodCostNotEqualTo(Double value) {
            addCriterion("DOD_COST <>", value, "dodCost");
            return (Criteria) this;
        }

        public Criteria andDodCostGreaterThan(Double value) {
            addCriterion("DOD_COST >", value, "dodCost");
            return (Criteria) this;
        }

        public Criteria andDodCostGreaterThanOrEqualTo(Double value) {
            addCriterion("DOD_COST >=", value, "dodCost");
            return (Criteria) this;
        }

        public Criteria andDodCostLessThan(Double value) {
            addCriterion("DOD_COST <", value, "dodCost");
            return (Criteria) this;
        }

        public Criteria andDodCostLessThanOrEqualTo(Double value) {
            addCriterion("DOD_COST <=", value, "dodCost");
            return (Criteria) this;
        }

        public Criteria andDodCostIn(List<Double> values) {
            addCriterion("DOD_COST in", values, "dodCost");
            return (Criteria) this;
        }

        public Criteria andDodCostNotIn(List<Double> values) {
            addCriterion("DOD_COST not in", values, "dodCost");
            return (Criteria) this;
        }

        public Criteria andDodCostBetween(Double value1, Double value2) {
            addCriterion("DOD_COST between", value1, value2, "dodCost");
            return (Criteria) this;
        }

        public Criteria andDodCostNotBetween(Double value1, Double value2) {
            addCriterion("DOD_COST not between", value1, value2, "dodCost");
            return (Criteria) this;
        }

        public Criteria andDoStateIsNull() {
            addCriterion("DO_STATE is null");
            return (Criteria) this;
        }

        public Criteria andDoStateIsNotNull() {
            addCriterion("DO_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andDoStateEqualTo(Integer value) {
            addCriterion("DO_STATE =", value, "doState");
            return (Criteria) this;
        }

        public Criteria andDoStateNotEqualTo(Integer value) {
            addCriterion("DO_STATE <>", value, "doState");
            return (Criteria) this;
        }

        public Criteria andDoStateGreaterThan(Integer value) {
            addCriterion("DO_STATE >", value, "doState");
            return (Criteria) this;
        }

        public Criteria andDoStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("DO_STATE >=", value, "doState");
            return (Criteria) this;
        }

        public Criteria andDoStateLessThan(Integer value) {
            addCriterion("DO_STATE <", value, "doState");
            return (Criteria) this;
        }

        public Criteria andDoStateLessThanOrEqualTo(Integer value) {
            addCriterion("DO_STATE <=", value, "doState");
            return (Criteria) this;
        }

        public Criteria andDoStateIn(List<Integer> values) {
            addCriterion("DO_STATE in", values, "doState");
            return (Criteria) this;
        }

        public Criteria andDoStateNotIn(List<Integer> values) {
            addCriterion("DO_STATE not in", values, "doState");
            return (Criteria) this;
        }

        public Criteria andDoStateBetween(Integer value1, Integer value2) {
            addCriterion("DO_STATE between", value1, value2, "doState");
            return (Criteria) this;
        }

        public Criteria andDoStateNotBetween(Integer value1, Integer value2) {
            addCriterion("DO_STATE not between", value1, value2, "doState");
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