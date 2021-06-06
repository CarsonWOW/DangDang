package com.dangdang.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DangdangCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public DangdangCommentExample() {
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

        public Criteria andDuIdIsNull() {
            addCriterion("DU_ID is null");
            return (Criteria) this;
        }

        public Criteria andDuIdIsNotNull() {
            addCriterion("DU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDuIdEqualTo(Integer value) {
            addCriterion("DU_ID =", value, "duId");
            return (Criteria) this;
        }

        public Criteria andDuIdNotEqualTo(Integer value) {
            addCriterion("DU_ID <>", value, "duId");
            return (Criteria) this;
        }

        public Criteria andDuIdGreaterThan(Integer value) {
            addCriterion("DU_ID >", value, "duId");
            return (Criteria) this;
        }

        public Criteria andDuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DU_ID >=", value, "duId");
            return (Criteria) this;
        }

        public Criteria andDuIdLessThan(Integer value) {
            addCriterion("DU_ID <", value, "duId");
            return (Criteria) this;
        }

        public Criteria andDuIdLessThanOrEqualTo(Integer value) {
            addCriterion("DU_ID <=", value, "duId");
            return (Criteria) this;
        }

        public Criteria andDuIdIn(List<Integer> values) {
            addCriterion("DU_ID in", values, "duId");
            return (Criteria) this;
        }

        public Criteria andDuIdNotIn(List<Integer> values) {
            addCriterion("DU_ID not in", values, "duId");
            return (Criteria) this;
        }

        public Criteria andDuIdBetween(Integer value1, Integer value2) {
            addCriterion("DU_ID between", value1, value2, "duId");
            return (Criteria) this;
        }

        public Criteria andDuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DU_ID not between", value1, value2, "duId");
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

        public Criteria andDuCommentNameIsNull() {
            addCriterion("DU_comment_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDuCommentNameIsNotNull() {
            addCriterion("DU_comment_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDuCommentNameEqualTo(String value) {
            addCriterion("DU_comment_NAME =", value, "duCommentName");
            return (Criteria) this;
        }

        public Criteria andDuCommentNameNotEqualTo(String value) {
            addCriterion("DU_comment_NAME <>", value, "duCommentName");
            return (Criteria) this;
        }

        public Criteria andDuCommentNameGreaterThan(String value) {
            addCriterion("DU_comment_NAME >", value, "duCommentName");
            return (Criteria) this;
        }

        public Criteria andDuCommentNameGreaterThanOrEqualTo(String value) {
            addCriterion("DU_comment_NAME >=", value, "duCommentName");
            return (Criteria) this;
        }

        public Criteria andDuCommentNameLessThan(String value) {
            addCriterion("DU_comment_NAME <", value, "duCommentName");
            return (Criteria) this;
        }

        public Criteria andDuCommentNameLessThanOrEqualTo(String value) {
            addCriterion("DU_comment_NAME <=", value, "duCommentName");
            return (Criteria) this;
        }

        public Criteria andDuCommentNameLike(String value) {
            addCriterion("DU_comment_NAME like", value, "duCommentName");
            return (Criteria) this;
        }

        public Criteria andDuCommentNameNotLike(String value) {
            addCriterion("DU_comment_NAME not like", value, "duCommentName");
            return (Criteria) this;
        }

        public Criteria andDuCommentNameIn(List<String> values) {
            addCriterion("DU_comment_NAME in", values, "duCommentName");
            return (Criteria) this;
        }

        public Criteria andDuCommentNameNotIn(List<String> values) {
            addCriterion("DU_comment_NAME not in", values, "duCommentName");
            return (Criteria) this;
        }

        public Criteria andDuCommentNameBetween(String value1, String value2) {
            addCriterion("DU_comment_NAME between", value1, value2, "duCommentName");
            return (Criteria) this;
        }

        public Criteria andDuCommentNameNotBetween(String value1, String value2) {
            addCriterion("DU_comment_NAME not between", value1, value2, "duCommentName");
            return (Criteria) this;
        }

        public Criteria andDuContentIsNull() {
            addCriterion("DU_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andDuContentIsNotNull() {
            addCriterion("DU_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andDuContentEqualTo(String value) {
            addCriterion("DU_CONTENT =", value, "duContent");
            return (Criteria) this;
        }

        public Criteria andDuContentNotEqualTo(String value) {
            addCriterion("DU_CONTENT <>", value, "duContent");
            return (Criteria) this;
        }

        public Criteria andDuContentGreaterThan(String value) {
            addCriterion("DU_CONTENT >", value, "duContent");
            return (Criteria) this;
        }

        public Criteria andDuContentGreaterThanOrEqualTo(String value) {
            addCriterion("DU_CONTENT >=", value, "duContent");
            return (Criteria) this;
        }

        public Criteria andDuContentLessThan(String value) {
            addCriterion("DU_CONTENT <", value, "duContent");
            return (Criteria) this;
        }

        public Criteria andDuContentLessThanOrEqualTo(String value) {
            addCriterion("DU_CONTENT <=", value, "duContent");
            return (Criteria) this;
        }

        public Criteria andDuContentLike(String value) {
            addCriterion("DU_CONTENT like", value, "duContent");
            return (Criteria) this;
        }

        public Criteria andDuContentNotLike(String value) {
            addCriterion("DU_CONTENT not like", value, "duContent");
            return (Criteria) this;
        }

        public Criteria andDuContentIn(List<String> values) {
            addCriterion("DU_CONTENT in", values, "duContent");
            return (Criteria) this;
        }

        public Criteria andDuContentNotIn(List<String> values) {
            addCriterion("DU_CONTENT not in", values, "duContent");
            return (Criteria) this;
        }

        public Criteria andDuContentBetween(String value1, String value2) {
            addCriterion("DU_CONTENT between", value1, value2, "duContent");
            return (Criteria) this;
        }

        public Criteria andDuContentNotBetween(String value1, String value2) {
            addCriterion("DU_CONTENT not between", value1, value2, "duContent");
            return (Criteria) this;
        }

        public Criteria andDuAnswerContentIsNull() {
            addCriterion("DU_answer_content is null");
            return (Criteria) this;
        }

        public Criteria andDuAnswerContentIsNotNull() {
            addCriterion("DU_answer_content is not null");
            return (Criteria) this;
        }

        public Criteria andDuAnswerContentEqualTo(String value) {
            addCriterion("DU_answer_content =", value, "duAnswerContent");
            return (Criteria) this;
        }

        public Criteria andDuAnswerContentNotEqualTo(String value) {
            addCriterion("DU_answer_content <>", value, "duAnswerContent");
            return (Criteria) this;
        }

        public Criteria andDuAnswerContentGreaterThan(String value) {
            addCriterion("DU_answer_content >", value, "duAnswerContent");
            return (Criteria) this;
        }

        public Criteria andDuAnswerContentGreaterThanOrEqualTo(String value) {
            addCriterion("DU_answer_content >=", value, "duAnswerContent");
            return (Criteria) this;
        }

        public Criteria andDuAnswerContentLessThan(String value) {
            addCriterion("DU_answer_content <", value, "duAnswerContent");
            return (Criteria) this;
        }

        public Criteria andDuAnswerContentLessThanOrEqualTo(String value) {
            addCriterion("DU_answer_content <=", value, "duAnswerContent");
            return (Criteria) this;
        }

        public Criteria andDuAnswerContentLike(String value) {
            addCriterion("DU_answer_content like", value, "duAnswerContent");
            return (Criteria) this;
        }

        public Criteria andDuAnswerContentNotLike(String value) {
            addCriterion("DU_answer_content not like", value, "duAnswerContent");
            return (Criteria) this;
        }

        public Criteria andDuAnswerContentIn(List<String> values) {
            addCriterion("DU_answer_content in", values, "duAnswerContent");
            return (Criteria) this;
        }

        public Criteria andDuAnswerContentNotIn(List<String> values) {
            addCriterion("DU_answer_content not in", values, "duAnswerContent");
            return (Criteria) this;
        }

        public Criteria andDuAnswerContentBetween(String value1, String value2) {
            addCriterion("DU_answer_content between", value1, value2, "duAnswerContent");
            return (Criteria) this;
        }

        public Criteria andDuAnswerContentNotBetween(String value1, String value2) {
            addCriterion("DU_answer_content not between", value1, value2, "duAnswerContent");
            return (Criteria) this;
        }

        public Criteria andDuCreateTimeIsNull() {
            addCriterion("DU_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDuCreateTimeIsNotNull() {
            addCriterion("DU_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDuCreateTimeEqualTo(Date value) {
            addCriterion("DU_CREATE_TIME =", value, "duCreateTime");
            return (Criteria) this;
        }

        public Criteria andDuCreateTimeNotEqualTo(Date value) {
            addCriterion("DU_CREATE_TIME <>", value, "duCreateTime");
            return (Criteria) this;
        }

        public Criteria andDuCreateTimeGreaterThan(Date value) {
            addCriterion("DU_CREATE_TIME >", value, "duCreateTime");
            return (Criteria) this;
        }

        public Criteria andDuCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DU_CREATE_TIME >=", value, "duCreateTime");
            return (Criteria) this;
        }

        public Criteria andDuCreateTimeLessThan(Date value) {
            addCriterion("DU_CREATE_TIME <", value, "duCreateTime");
            return (Criteria) this;
        }

        public Criteria andDuCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("DU_CREATE_TIME <=", value, "duCreateTime");
            return (Criteria) this;
        }

        public Criteria andDuCreateTimeIn(List<Date> values) {
            addCriterion("DU_CREATE_TIME in", values, "duCreateTime");
            return (Criteria) this;
        }

        public Criteria andDuCreateTimeNotIn(List<Date> values) {
            addCriterion("DU_CREATE_TIME not in", values, "duCreateTime");
            return (Criteria) this;
        }

        public Criteria andDuCreateTimeBetween(Date value1, Date value2) {
            addCriterion("DU_CREATE_TIME between", value1, value2, "duCreateTime");
            return (Criteria) this;
        }

        public Criteria andDuCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("DU_CREATE_TIME not between", value1, value2, "duCreateTime");
            return (Criteria) this;
        }

        public Criteria andDuReplyTimeIsNull() {
            addCriterion("DU_reply_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDuReplyTimeIsNotNull() {
            addCriterion("DU_reply_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDuReplyTimeEqualTo(Date value) {
            addCriterion("DU_reply_TIME =", value, "duReplyTime");
            return (Criteria) this;
        }

        public Criteria andDuReplyTimeNotEqualTo(Date value) {
            addCriterion("DU_reply_TIME <>", value, "duReplyTime");
            return (Criteria) this;
        }

        public Criteria andDuReplyTimeGreaterThan(Date value) {
            addCriterion("DU_reply_TIME >", value, "duReplyTime");
            return (Criteria) this;
        }

        public Criteria andDuReplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DU_reply_TIME >=", value, "duReplyTime");
            return (Criteria) this;
        }

        public Criteria andDuReplyTimeLessThan(Date value) {
            addCriterion("DU_reply_TIME <", value, "duReplyTime");
            return (Criteria) this;
        }

        public Criteria andDuReplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("DU_reply_TIME <=", value, "duReplyTime");
            return (Criteria) this;
        }

        public Criteria andDuReplyTimeIn(List<Date> values) {
            addCriterion("DU_reply_TIME in", values, "duReplyTime");
            return (Criteria) this;
        }

        public Criteria andDuReplyTimeNotIn(List<Date> values) {
            addCriterion("DU_reply_TIME not in", values, "duReplyTime");
            return (Criteria) this;
        }

        public Criteria andDuReplyTimeBetween(Date value1, Date value2) {
            addCriterion("DU_reply_TIME between", value1, value2, "duReplyTime");
            return (Criteria) this;
        }

        public Criteria andDuReplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("DU_reply_TIME not between", value1, value2, "duReplyTime");
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