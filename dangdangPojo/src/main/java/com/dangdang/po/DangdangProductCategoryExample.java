package com.dangdang.po;

import java.util.ArrayList;
import java.util.List;

public class DangdangProductCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public DangdangProductCategoryExample() {
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

        public Criteria andDpcIdIsNull() {
            addCriterion("DPC_ID is null");
            return (Criteria) this;
        }

        public Criteria andDpcIdIsNotNull() {
            addCriterion("DPC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDpcIdEqualTo(Integer value) {
            addCriterion("DPC_ID =", value, "dpcId");
            return (Criteria) this;
        }

        public Criteria andDpcIdNotEqualTo(Integer value) {
            addCriterion("DPC_ID <>", value, "dpcId");
            return (Criteria) this;
        }

        public Criteria andDpcIdGreaterThan(Integer value) {
            addCriterion("DPC_ID >", value, "dpcId");
            return (Criteria) this;
        }

        public Criteria andDpcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DPC_ID >=", value, "dpcId");
            return (Criteria) this;
        }

        public Criteria andDpcIdLessThan(Integer value) {
            addCriterion("DPC_ID <", value, "dpcId");
            return (Criteria) this;
        }

        public Criteria andDpcIdLessThanOrEqualTo(Integer value) {
            addCriterion("DPC_ID <=", value, "dpcId");
            return (Criteria) this;
        }

        public Criteria andDpcIdIn(List<Integer> values) {
            addCriterion("DPC_ID in", values, "dpcId");
            return (Criteria) this;
        }

        public Criteria andDpcIdNotIn(List<Integer> values) {
            addCriterion("DPC_ID not in", values, "dpcId");
            return (Criteria) this;
        }

        public Criteria andDpcIdBetween(Integer value1, Integer value2) {
            addCriterion("DPC_ID between", value1, value2, "dpcId");
            return (Criteria) this;
        }

        public Criteria andDpcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DPC_ID not between", value1, value2, "dpcId");
            return (Criteria) this;
        }

        public Criteria andDpcNameIsNull() {
            addCriterion("DPC_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDpcNameIsNotNull() {
            addCriterion("DPC_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDpcNameEqualTo(String value) {
            addCriterion("DPC_NAME =", value, "dpcName");
            return (Criteria) this;
        }

        public Criteria andDpcNameNotEqualTo(String value) {
            addCriterion("DPC_NAME <>", value, "dpcName");
            return (Criteria) this;
        }

        public Criteria andDpcNameGreaterThan(String value) {
            addCriterion("DPC_NAME >", value, "dpcName");
            return (Criteria) this;
        }

        public Criteria andDpcNameGreaterThanOrEqualTo(String value) {
            addCriterion("DPC_NAME >=", value, "dpcName");
            return (Criteria) this;
        }

        public Criteria andDpcNameLessThan(String value) {
            addCriterion("DPC_NAME <", value, "dpcName");
            return (Criteria) this;
        }

        public Criteria andDpcNameLessThanOrEqualTo(String value) {
            addCriterion("DPC_NAME <=", value, "dpcName");
            return (Criteria) this;
        }

        public Criteria andDpcNameLike(String value) {
            addCriterion("DPC_NAME like", value, "dpcName");
            return (Criteria) this;
        }

        public Criteria andDpcNameNotLike(String value) {
            addCriterion("DPC_NAME not like", value, "dpcName");
            return (Criteria) this;
        }

        public Criteria andDpcNameIn(List<String> values) {
            addCriterion("DPC_NAME in", values, "dpcName");
            return (Criteria) this;
        }

        public Criteria andDpcNameNotIn(List<String> values) {
            addCriterion("DPC_NAME not in", values, "dpcName");
            return (Criteria) this;
        }

        public Criteria andDpcNameBetween(String value1, String value2) {
            addCriterion("DPC_NAME between", value1, value2, "dpcName");
            return (Criteria) this;
        }

        public Criteria andDpcNameNotBetween(String value1, String value2) {
            addCriterion("DPC_NAME not between", value1, value2, "dpcName");
            return (Criteria) this;
        }

        public Criteria andDpcParentIdIsNull() {
            addCriterion("DPC_PARENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDpcParentIdIsNotNull() {
            addCriterion("DPC_PARENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDpcParentIdEqualTo(Integer value) {
            addCriterion("DPC_PARENT_ID =", value, "dpcParentId");
            return (Criteria) this;
        }

        public Criteria andDpcParentIdNotEqualTo(Integer value) {
            addCriterion("DPC_PARENT_ID <>", value, "dpcParentId");
            return (Criteria) this;
        }

        public Criteria andDpcParentIdGreaterThan(Integer value) {
            addCriterion("DPC_PARENT_ID >", value, "dpcParentId");
            return (Criteria) this;
        }

        public Criteria andDpcParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DPC_PARENT_ID >=", value, "dpcParentId");
            return (Criteria) this;
        }

        public Criteria andDpcParentIdLessThan(Integer value) {
            addCriterion("DPC_PARENT_ID <", value, "dpcParentId");
            return (Criteria) this;
        }

        public Criteria andDpcParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("DPC_PARENT_ID <=", value, "dpcParentId");
            return (Criteria) this;
        }

        public Criteria andDpcParentIdIn(List<Integer> values) {
            addCriterion("DPC_PARENT_ID in", values, "dpcParentId");
            return (Criteria) this;
        }

        public Criteria andDpcParentIdNotIn(List<Integer> values) {
            addCriterion("DPC_PARENT_ID not in", values, "dpcParentId");
            return (Criteria) this;
        }

        public Criteria andDpcParentIdBetween(Integer value1, Integer value2) {
            addCriterion("DPC_PARENT_ID between", value1, value2, "dpcParentId");
            return (Criteria) this;
        }

        public Criteria andDpcParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DPC_PARENT_ID not between", value1, value2, "dpcParentId");
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