package com.dangdang.po;

import java.util.ArrayList;
import java.util.List;

public class DangdangProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public DangdangProductExample() {
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

        public Criteria andDpNameIsNull() {
            addCriterion("DP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDpNameIsNotNull() {
            addCriterion("DP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDpNameEqualTo(String value) {
            addCriterion("DP_NAME =", value, "dpName");
            return (Criteria) this;
        }

        public Criteria andDpNameNotEqualTo(String value) {
            addCriterion("DP_NAME <>", value, "dpName");
            return (Criteria) this;
        }

        public Criteria andDpNameGreaterThan(String value) {
            addCriterion("DP_NAME >", value, "dpName");
            return (Criteria) this;
        }

        public Criteria andDpNameGreaterThanOrEqualTo(String value) {
            addCriterion("DP_NAME >=", value, "dpName");
            return (Criteria) this;
        }

        public Criteria andDpNameLessThan(String value) {
            addCriterion("DP_NAME <", value, "dpName");
            return (Criteria) this;
        }

        public Criteria andDpNameLessThanOrEqualTo(String value) {
            addCriterion("DP_NAME <=", value, "dpName");
            return (Criteria) this;
        }

        public Criteria andDpNameLike(String value) {
            addCriterion("DP_NAME like", value, "dpName");
            return (Criteria) this;
        }

        public Criteria andDpNameNotLike(String value) {
            addCriterion("DP_NAME not like", value, "dpName");
            return (Criteria) this;
        }

        public Criteria andDpNameIn(List<String> values) {
            addCriterion("DP_NAME in", values, "dpName");
            return (Criteria) this;
        }

        public Criteria andDpNameNotIn(List<String> values) {
            addCriterion("DP_NAME not in", values, "dpName");
            return (Criteria) this;
        }

        public Criteria andDpNameBetween(String value1, String value2) {
            addCriterion("DP_NAME between", value1, value2, "dpName");
            return (Criteria) this;
        }

        public Criteria andDpNameNotBetween(String value1, String value2) {
            addCriterion("DP_NAME not between", value1, value2, "dpName");
            return (Criteria) this;
        }

        public Criteria andDpDescriptionIsNull() {
            addCriterion("DP_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDpDescriptionIsNotNull() {
            addCriterion("DP_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDpDescriptionEqualTo(String value) {
            addCriterion("DP_DESCRIPTION =", value, "dpDescription");
            return (Criteria) this;
        }

        public Criteria andDpDescriptionNotEqualTo(String value) {
            addCriterion("DP_DESCRIPTION <>", value, "dpDescription");
            return (Criteria) this;
        }

        public Criteria andDpDescriptionGreaterThan(String value) {
            addCriterion("DP_DESCRIPTION >", value, "dpDescription");
            return (Criteria) this;
        }

        public Criteria andDpDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DP_DESCRIPTION >=", value, "dpDescription");
            return (Criteria) this;
        }

        public Criteria andDpDescriptionLessThan(String value) {
            addCriterion("DP_DESCRIPTION <", value, "dpDescription");
            return (Criteria) this;
        }

        public Criteria andDpDescriptionLessThanOrEqualTo(String value) {
            addCriterion("DP_DESCRIPTION <=", value, "dpDescription");
            return (Criteria) this;
        }

        public Criteria andDpDescriptionLike(String value) {
            addCriterion("DP_DESCRIPTION like", value, "dpDescription");
            return (Criteria) this;
        }

        public Criteria andDpDescriptionNotLike(String value) {
            addCriterion("DP_DESCRIPTION not like", value, "dpDescription");
            return (Criteria) this;
        }

        public Criteria andDpDescriptionIn(List<String> values) {
            addCriterion("DP_DESCRIPTION in", values, "dpDescription");
            return (Criteria) this;
        }

        public Criteria andDpDescriptionNotIn(List<String> values) {
            addCriterion("DP_DESCRIPTION not in", values, "dpDescription");
            return (Criteria) this;
        }

        public Criteria andDpDescriptionBetween(String value1, String value2) {
            addCriterion("DP_DESCRIPTION between", value1, value2, "dpDescription");
            return (Criteria) this;
        }

        public Criteria andDpDescriptionNotBetween(String value1, String value2) {
            addCriterion("DP_DESCRIPTION not between", value1, value2, "dpDescription");
            return (Criteria) this;
        }

        public Criteria andDpPriceIsNull() {
            addCriterion("DP_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andDpPriceIsNotNull() {
            addCriterion("DP_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andDpPriceEqualTo(Double value) {
            addCriterion("DP_PRICE =", value, "dpPrice");
            return (Criteria) this;
        }

        public Criteria andDpPriceNotEqualTo(Double value) {
            addCriterion("DP_PRICE <>", value, "dpPrice");
            return (Criteria) this;
        }

        public Criteria andDpPriceGreaterThan(Double value) {
            addCriterion("DP_PRICE >", value, "dpPrice");
            return (Criteria) this;
        }

        public Criteria andDpPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("DP_PRICE >=", value, "dpPrice");
            return (Criteria) this;
        }

        public Criteria andDpPriceLessThan(Double value) {
            addCriterion("DP_PRICE <", value, "dpPrice");
            return (Criteria) this;
        }

        public Criteria andDpPriceLessThanOrEqualTo(Double value) {
            addCriterion("DP_PRICE <=", value, "dpPrice");
            return (Criteria) this;
        }

        public Criteria andDpPriceIn(List<Double> values) {
            addCriterion("DP_PRICE in", values, "dpPrice");
            return (Criteria) this;
        }

        public Criteria andDpPriceNotIn(List<Double> values) {
            addCriterion("DP_PRICE not in", values, "dpPrice");
            return (Criteria) this;
        }

        public Criteria andDpPriceBetween(Double value1, Double value2) {
            addCriterion("DP_PRICE between", value1, value2, "dpPrice");
            return (Criteria) this;
        }

        public Criteria andDpPriceNotBetween(Double value1, Double value2) {
            addCriterion("DP_PRICE not between", value1, value2, "dpPrice");
            return (Criteria) this;
        }

        public Criteria andDpStockIsNull() {
            addCriterion("DP_STOCK is null");
            return (Criteria) this;
        }

        public Criteria andDpStockIsNotNull() {
            addCriterion("DP_STOCK is not null");
            return (Criteria) this;
        }

        public Criteria andDpStockEqualTo(Integer value) {
            addCriterion("DP_STOCK =", value, "dpStock");
            return (Criteria) this;
        }

        public Criteria andDpStockNotEqualTo(Integer value) {
            addCriterion("DP_STOCK <>", value, "dpStock");
            return (Criteria) this;
        }

        public Criteria andDpStockGreaterThan(Integer value) {
            addCriterion("DP_STOCK >", value, "dpStock");
            return (Criteria) this;
        }

        public Criteria andDpStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("DP_STOCK >=", value, "dpStock");
            return (Criteria) this;
        }

        public Criteria andDpStockLessThan(Integer value) {
            addCriterion("DP_STOCK <", value, "dpStock");
            return (Criteria) this;
        }

        public Criteria andDpStockLessThanOrEqualTo(Integer value) {
            addCriterion("DP_STOCK <=", value, "dpStock");
            return (Criteria) this;
        }

        public Criteria andDpStockIn(List<Integer> values) {
            addCriterion("DP_STOCK in", values, "dpStock");
            return (Criteria) this;
        }

        public Criteria andDpStockNotIn(List<Integer> values) {
            addCriterion("DP_STOCK not in", values, "dpStock");
            return (Criteria) this;
        }

        public Criteria andDpStockBetween(Integer value1, Integer value2) {
            addCriterion("DP_STOCK between", value1, value2, "dpStock");
            return (Criteria) this;
        }

        public Criteria andDpStockNotBetween(Integer value1, Integer value2) {
            addCriterion("DP_STOCK not between", value1, value2, "dpStock");
            return (Criteria) this;
        }

        public Criteria andDpcChildIdIsNull() {
            addCriterion("DPC_CHILD_ID is null");
            return (Criteria) this;
        }

        public Criteria andDpcChildIdIsNotNull() {
            addCriterion("DPC_CHILD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDpcChildIdEqualTo(Integer value) {
            addCriterion("DPC_CHILD_ID =", value, "dpcChildId");
            return (Criteria) this;
        }

        public Criteria andDpcChildIdNotEqualTo(Integer value) {
            addCriterion("DPC_CHILD_ID <>", value, "dpcChildId");
            return (Criteria) this;
        }

        public Criteria andDpcChildIdGreaterThan(Integer value) {
            addCriterion("DPC_CHILD_ID >", value, "dpcChildId");
            return (Criteria) this;
        }

        public Criteria andDpcChildIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DPC_CHILD_ID >=", value, "dpcChildId");
            return (Criteria) this;
        }

        public Criteria andDpcChildIdLessThan(Integer value) {
            addCriterion("DPC_CHILD_ID <", value, "dpcChildId");
            return (Criteria) this;
        }

        public Criteria andDpcChildIdLessThanOrEqualTo(Integer value) {
            addCriterion("DPC_CHILD_ID <=", value, "dpcChildId");
            return (Criteria) this;
        }

        public Criteria andDpcChildIdIn(List<Integer> values) {
            addCriterion("DPC_CHILD_ID in", values, "dpcChildId");
            return (Criteria) this;
        }

        public Criteria andDpcChildIdNotIn(List<Integer> values) {
            addCriterion("DPC_CHILD_ID not in", values, "dpcChildId");
            return (Criteria) this;
        }

        public Criteria andDpcChildIdBetween(Integer value1, Integer value2) {
            addCriterion("DPC_CHILD_ID between", value1, value2, "dpcChildId");
            return (Criteria) this;
        }

        public Criteria andDpcChildIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DPC_CHILD_ID not between", value1, value2, "dpcChildId");
            return (Criteria) this;
        }

        public Criteria andDpFileNameIsNull() {
            addCriterion("DP_FILE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDpFileNameIsNotNull() {
            addCriterion("DP_FILE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDpFileNameEqualTo(String value) {
            addCriterion("DP_FILE_NAME =", value, "dpFileName");
            return (Criteria) this;
        }

        public Criteria andDpFileNameNotEqualTo(String value) {
            addCriterion("DP_FILE_NAME <>", value, "dpFileName");
            return (Criteria) this;
        }

        public Criteria andDpFileNameGreaterThan(String value) {
            addCriterion("DP_FILE_NAME >", value, "dpFileName");
            return (Criteria) this;
        }

        public Criteria andDpFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("DP_FILE_NAME >=", value, "dpFileName");
            return (Criteria) this;
        }

        public Criteria andDpFileNameLessThan(String value) {
            addCriterion("DP_FILE_NAME <", value, "dpFileName");
            return (Criteria) this;
        }

        public Criteria andDpFileNameLessThanOrEqualTo(String value) {
            addCriterion("DP_FILE_NAME <=", value, "dpFileName");
            return (Criteria) this;
        }

        public Criteria andDpFileNameLike(String value) {
            addCriterion("DP_FILE_NAME like", value, "dpFileName");
            return (Criteria) this;
        }

        public Criteria andDpFileNameNotLike(String value) {
            addCriterion("DP_FILE_NAME not like", value, "dpFileName");
            return (Criteria) this;
        }

        public Criteria andDpFileNameIn(List<String> values) {
            addCriterion("DP_FILE_NAME in", values, "dpFileName");
            return (Criteria) this;
        }

        public Criteria andDpFileNameNotIn(List<String> values) {
            addCriterion("DP_FILE_NAME not in", values, "dpFileName");
            return (Criteria) this;
        }

        public Criteria andDpFileNameBetween(String value1, String value2) {
            addCriterion("DP_FILE_NAME between", value1, value2, "dpFileName");
            return (Criteria) this;
        }

        public Criteria andDpFileNameNotBetween(String value1, String value2) {
            addCriterion("DP_FILE_NAME not between", value1, value2, "dpFileName");
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