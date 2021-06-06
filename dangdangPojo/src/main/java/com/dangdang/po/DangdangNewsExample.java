package com.dangdang.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DangdangNewsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public DangdangNewsExample() {
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

        public Criteria andDnIdIsNull() {
            addCriterion("DN_ID is null");
            return (Criteria) this;
        }

        public Criteria andDnIdIsNotNull() {
            addCriterion("DN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDnIdEqualTo(Integer value) {
            addCriterion("DN_ID =", value, "dnId");
            return (Criteria) this;
        }

        public Criteria andDnIdNotEqualTo(Integer value) {
            addCriterion("DN_ID <>", value, "dnId");
            return (Criteria) this;
        }

        public Criteria andDnIdGreaterThan(Integer value) {
            addCriterion("DN_ID >", value, "dnId");
            return (Criteria) this;
        }

        public Criteria andDnIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DN_ID >=", value, "dnId");
            return (Criteria) this;
        }

        public Criteria andDnIdLessThan(Integer value) {
            addCriterion("DN_ID <", value, "dnId");
            return (Criteria) this;
        }

        public Criteria andDnIdLessThanOrEqualTo(Integer value) {
            addCriterion("DN_ID <=", value, "dnId");
            return (Criteria) this;
        }

        public Criteria andDnIdIn(List<Integer> values) {
            addCriterion("DN_ID in", values, "dnId");
            return (Criteria) this;
        }

        public Criteria andDnIdNotIn(List<Integer> values) {
            addCriterion("DN_ID not in", values, "dnId");
            return (Criteria) this;
        }

        public Criteria andDnIdBetween(Integer value1, Integer value2) {
            addCriterion("DN_ID between", value1, value2, "dnId");
            return (Criteria) this;
        }

        public Criteria andDnIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DN_ID not between", value1, value2, "dnId");
            return (Criteria) this;
        }

        public Criteria andDnTitleIsNull() {
            addCriterion("DN_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andDnTitleIsNotNull() {
            addCriterion("DN_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andDnTitleEqualTo(String value) {
            addCriterion("DN_TITLE =", value, "dnTitle");
            return (Criteria) this;
        }

        public Criteria andDnTitleNotEqualTo(String value) {
            addCriterion("DN_TITLE <>", value, "dnTitle");
            return (Criteria) this;
        }

        public Criteria andDnTitleGreaterThan(String value) {
            addCriterion("DN_TITLE >", value, "dnTitle");
            return (Criteria) this;
        }

        public Criteria andDnTitleGreaterThanOrEqualTo(String value) {
            addCriterion("DN_TITLE >=", value, "dnTitle");
            return (Criteria) this;
        }

        public Criteria andDnTitleLessThan(String value) {
            addCriterion("DN_TITLE <", value, "dnTitle");
            return (Criteria) this;
        }

        public Criteria andDnTitleLessThanOrEqualTo(String value) {
            addCriterion("DN_TITLE <=", value, "dnTitle");
            return (Criteria) this;
        }

        public Criteria andDnTitleLike(String value) {
            addCriterion("DN_TITLE like", value, "dnTitle");
            return (Criteria) this;
        }

        public Criteria andDnTitleNotLike(String value) {
            addCriterion("DN_TITLE not like", value, "dnTitle");
            return (Criteria) this;
        }

        public Criteria andDnTitleIn(List<String> values) {
            addCriterion("DN_TITLE in", values, "dnTitle");
            return (Criteria) this;
        }

        public Criteria andDnTitleNotIn(List<String> values) {
            addCriterion("DN_TITLE not in", values, "dnTitle");
            return (Criteria) this;
        }

        public Criteria andDnTitleBetween(String value1, String value2) {
            addCriterion("DN_TITLE between", value1, value2, "dnTitle");
            return (Criteria) this;
        }

        public Criteria andDnTitleNotBetween(String value1, String value2) {
            addCriterion("DN_TITLE not between", value1, value2, "dnTitle");
            return (Criteria) this;
        }

        public Criteria andDnContentIsNull() {
            addCriterion("DN_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andDnContentIsNotNull() {
            addCriterion("DN_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andDnContentEqualTo(String value) {
            addCriterion("DN_CONTENT =", value, "dnContent");
            return (Criteria) this;
        }

        public Criteria andDnContentNotEqualTo(String value) {
            addCriterion("DN_CONTENT <>", value, "dnContent");
            return (Criteria) this;
        }

        public Criteria andDnContentGreaterThan(String value) {
            addCriterion("DN_CONTENT >", value, "dnContent");
            return (Criteria) this;
        }

        public Criteria andDnContentGreaterThanOrEqualTo(String value) {
            addCriterion("DN_CONTENT >=", value, "dnContent");
            return (Criteria) this;
        }

        public Criteria andDnContentLessThan(String value) {
            addCriterion("DN_CONTENT <", value, "dnContent");
            return (Criteria) this;
        }

        public Criteria andDnContentLessThanOrEqualTo(String value) {
            addCriterion("DN_CONTENT <=", value, "dnContent");
            return (Criteria) this;
        }

        public Criteria andDnContentLike(String value) {
            addCriterion("DN_CONTENT like", value, "dnContent");
            return (Criteria) this;
        }

        public Criteria andDnContentNotLike(String value) {
            addCriterion("DN_CONTENT not like", value, "dnContent");
            return (Criteria) this;
        }

        public Criteria andDnContentIn(List<String> values) {
            addCriterion("DN_CONTENT in", values, "dnContent");
            return (Criteria) this;
        }

        public Criteria andDnContentNotIn(List<String> values) {
            addCriterion("DN_CONTENT not in", values, "dnContent");
            return (Criteria) this;
        }

        public Criteria andDnContentBetween(String value1, String value2) {
            addCriterion("DN_CONTENT between", value1, value2, "dnContent");
            return (Criteria) this;
        }

        public Criteria andDnContentNotBetween(String value1, String value2) {
            addCriterion("DN_CONTENT not between", value1, value2, "dnContent");
            return (Criteria) this;
        }

        public Criteria andDnCreateTimeIsNull() {
            addCriterion("DN_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDnCreateTimeIsNotNull() {
            addCriterion("DN_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDnCreateTimeEqualTo(Date value) {
            addCriterion("DN_CREATE_TIME =", value, "dnCreateTime");
            return (Criteria) this;
        }

        public Criteria andDnCreateTimeNotEqualTo(Date value) {
            addCriterion("DN_CREATE_TIME <>", value, "dnCreateTime");
            return (Criteria) this;
        }

        public Criteria andDnCreateTimeGreaterThan(Date value) {
            addCriterion("DN_CREATE_TIME >", value, "dnCreateTime");
            return (Criteria) this;
        }

        public Criteria andDnCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DN_CREATE_TIME >=", value, "dnCreateTime");
            return (Criteria) this;
        }

        public Criteria andDnCreateTimeLessThan(Date value) {
            addCriterion("DN_CREATE_TIME <", value, "dnCreateTime");
            return (Criteria) this;
        }

        public Criteria andDnCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("DN_CREATE_TIME <=", value, "dnCreateTime");
            return (Criteria) this;
        }

        public Criteria andDnCreateTimeIn(List<Date> values) {
            addCriterion("DN_CREATE_TIME in", values, "dnCreateTime");
            return (Criteria) this;
        }

        public Criteria andDnCreateTimeNotIn(List<Date> values) {
            addCriterion("DN_CREATE_TIME not in", values, "dnCreateTime");
            return (Criteria) this;
        }

        public Criteria andDnCreateTimeBetween(Date value1, Date value2) {
            addCriterion("DN_CREATE_TIME between", value1, value2, "dnCreateTime");
            return (Criteria) this;
        }

        public Criteria andDnCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("DN_CREATE_TIME not between", value1, value2, "dnCreateTime");
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