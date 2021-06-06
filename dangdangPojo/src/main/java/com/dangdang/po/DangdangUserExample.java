package com.dangdang.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DangdangUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public DangdangUserExample() {
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

        public Criteria andDuUserIdIsNull() {
            addCriterion("Du_user_id is null");
            return (Criteria) this;
        }

        public Criteria andDuUserIdIsNotNull() {
            addCriterion("Du_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andDuUserIdEqualTo(Integer value) {
            addCriterion("Du_user_id =", value, "duUserId");
            return (Criteria) this;
        }

        public Criteria andDuUserIdNotEqualTo(Integer value) {
            addCriterion("Du_user_id <>", value, "duUserId");
            return (Criteria) this;
        }

        public Criteria andDuUserIdGreaterThan(Integer value) {
            addCriterion("Du_user_id >", value, "duUserId");
            return (Criteria) this;
        }

        public Criteria andDuUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Du_user_id >=", value, "duUserId");
            return (Criteria) this;
        }

        public Criteria andDuUserIdLessThan(Integer value) {
            addCriterion("Du_user_id <", value, "duUserId");
            return (Criteria) this;
        }

        public Criteria andDuUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("Du_user_id <=", value, "duUserId");
            return (Criteria) this;
        }

        public Criteria andDuUserIdIn(List<Integer> values) {
            addCriterion("Du_user_id in", values, "duUserId");
            return (Criteria) this;
        }

        public Criteria andDuUserIdNotIn(List<Integer> values) {
            addCriterion("Du_user_id not in", values, "duUserId");
            return (Criteria) this;
        }

        public Criteria andDuUserIdBetween(Integer value1, Integer value2) {
            addCriterion("Du_user_id between", value1, value2, "duUserId");
            return (Criteria) this;
        }

        public Criteria andDuUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Du_user_id not between", value1, value2, "duUserId");
            return (Criteria) this;
        }

        public Criteria andDuEmailIsNull() {
            addCriterion("DU_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andDuEmailIsNotNull() {
            addCriterion("DU_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andDuEmailEqualTo(String value) {
            addCriterion("DU_EMAIL =", value, "duEmail");
            return (Criteria) this;
        }

        public Criteria andDuEmailNotEqualTo(String value) {
            addCriterion("DU_EMAIL <>", value, "duEmail");
            return (Criteria) this;
        }

        public Criteria andDuEmailGreaterThan(String value) {
            addCriterion("DU_EMAIL >", value, "duEmail");
            return (Criteria) this;
        }

        public Criteria andDuEmailGreaterThanOrEqualTo(String value) {
            addCriterion("DU_EMAIL >=", value, "duEmail");
            return (Criteria) this;
        }

        public Criteria andDuEmailLessThan(String value) {
            addCriterion("DU_EMAIL <", value, "duEmail");
            return (Criteria) this;
        }

        public Criteria andDuEmailLessThanOrEqualTo(String value) {
            addCriterion("DU_EMAIL <=", value, "duEmail");
            return (Criteria) this;
        }

        public Criteria andDuEmailLike(String value) {
            addCriterion("DU_EMAIL like", value, "duEmail");
            return (Criteria) this;
        }

        public Criteria andDuEmailNotLike(String value) {
            addCriterion("DU_EMAIL not like", value, "duEmail");
            return (Criteria) this;
        }

        public Criteria andDuEmailIn(List<String> values) {
            addCriterion("DU_EMAIL in", values, "duEmail");
            return (Criteria) this;
        }

        public Criteria andDuEmailNotIn(List<String> values) {
            addCriterion("DU_EMAIL not in", values, "duEmail");
            return (Criteria) this;
        }

        public Criteria andDuEmailBetween(String value1, String value2) {
            addCriterion("DU_EMAIL between", value1, value2, "duEmail");
            return (Criteria) this;
        }

        public Criteria andDuEmailNotBetween(String value1, String value2) {
            addCriterion("DU_EMAIL not between", value1, value2, "duEmail");
            return (Criteria) this;
        }

        public Criteria andDuUserNameIsNull() {
            addCriterion("DU_USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDuUserNameIsNotNull() {
            addCriterion("DU_USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDuUserNameEqualTo(String value) {
            addCriterion("DU_USER_NAME =", value, "duUserName");
            return (Criteria) this;
        }

        public Criteria andDuUserNameNotEqualTo(String value) {
            addCriterion("DU_USER_NAME <>", value, "duUserName");
            return (Criteria) this;
        }

        public Criteria andDuUserNameGreaterThan(String value) {
            addCriterion("DU_USER_NAME >", value, "duUserName");
            return (Criteria) this;
        }

        public Criteria andDuUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("DU_USER_NAME >=", value, "duUserName");
            return (Criteria) this;
        }

        public Criteria andDuUserNameLessThan(String value) {
            addCriterion("DU_USER_NAME <", value, "duUserName");
            return (Criteria) this;
        }

        public Criteria andDuUserNameLessThanOrEqualTo(String value) {
            addCriterion("DU_USER_NAME <=", value, "duUserName");
            return (Criteria) this;
        }

        public Criteria andDuUserNameLike(String value) {
            addCriterion("DU_USER_NAME like", value, "duUserName");
            return (Criteria) this;
        }

        public Criteria andDuUserNameNotLike(String value) {
            addCriterion("DU_USER_NAME not like", value, "duUserName");
            return (Criteria) this;
        }

        public Criteria andDuUserNameIn(List<String> values) {
            addCriterion("DU_USER_NAME in", values, "duUserName");
            return (Criteria) this;
        }

        public Criteria andDuUserNameNotIn(List<String> values) {
            addCriterion("DU_USER_NAME not in", values, "duUserName");
            return (Criteria) this;
        }

        public Criteria andDuUserNameBetween(String value1, String value2) {
            addCriterion("DU_USER_NAME between", value1, value2, "duUserName");
            return (Criteria) this;
        }

        public Criteria andDuUserNameNotBetween(String value1, String value2) {
            addCriterion("DU_USER_NAME not between", value1, value2, "duUserName");
            return (Criteria) this;
        }

        public Criteria andDuPasswordIsNull() {
            addCriterion("DU_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andDuPasswordIsNotNull() {
            addCriterion("DU_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andDuPasswordEqualTo(String value) {
            addCriterion("DU_PASSWORD =", value, "duPassword");
            return (Criteria) this;
        }

        public Criteria andDuPasswordNotEqualTo(String value) {
            addCriterion("DU_PASSWORD <>", value, "duPassword");
            return (Criteria) this;
        }

        public Criteria andDuPasswordGreaterThan(String value) {
            addCriterion("DU_PASSWORD >", value, "duPassword");
            return (Criteria) this;
        }

        public Criteria andDuPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("DU_PASSWORD >=", value, "duPassword");
            return (Criteria) this;
        }

        public Criteria andDuPasswordLessThan(String value) {
            addCriterion("DU_PASSWORD <", value, "duPassword");
            return (Criteria) this;
        }

        public Criteria andDuPasswordLessThanOrEqualTo(String value) {
            addCriterion("DU_PASSWORD <=", value, "duPassword");
            return (Criteria) this;
        }

        public Criteria andDuPasswordLike(String value) {
            addCriterion("DU_PASSWORD like", value, "duPassword");
            return (Criteria) this;
        }

        public Criteria andDuPasswordNotLike(String value) {
            addCriterion("DU_PASSWORD not like", value, "duPassword");
            return (Criteria) this;
        }

        public Criteria andDuPasswordIn(List<String> values) {
            addCriterion("DU_PASSWORD in", values, "duPassword");
            return (Criteria) this;
        }

        public Criteria andDuPasswordNotIn(List<String> values) {
            addCriterion("DU_PASSWORD not in", values, "duPassword");
            return (Criteria) this;
        }

        public Criteria andDuPasswordBetween(String value1, String value2) {
            addCriterion("DU_PASSWORD between", value1, value2, "duPassword");
            return (Criteria) this;
        }

        public Criteria andDuPasswordNotBetween(String value1, String value2) {
            addCriterion("DU_PASSWORD not between", value1, value2, "duPassword");
            return (Criteria) this;
        }

        public Criteria andDuSexIsNull() {
            addCriterion("DU_SEX is null");
            return (Criteria) this;
        }

        public Criteria andDuSexIsNotNull() {
            addCriterion("DU_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andDuSexEqualTo(String value) {
            addCriterion("DU_SEX =", value, "duSex");
            return (Criteria) this;
        }

        public Criteria andDuSexNotEqualTo(String value) {
            addCriterion("DU_SEX <>", value, "duSex");
            return (Criteria) this;
        }

        public Criteria andDuSexGreaterThan(String value) {
            addCriterion("DU_SEX >", value, "duSex");
            return (Criteria) this;
        }

        public Criteria andDuSexGreaterThanOrEqualTo(String value) {
            addCriterion("DU_SEX >=", value, "duSex");
            return (Criteria) this;
        }

        public Criteria andDuSexLessThan(String value) {
            addCriterion("DU_SEX <", value, "duSex");
            return (Criteria) this;
        }

        public Criteria andDuSexLessThanOrEqualTo(String value) {
            addCriterion("DU_SEX <=", value, "duSex");
            return (Criteria) this;
        }

        public Criteria andDuSexLike(String value) {
            addCriterion("DU_SEX like", value, "duSex");
            return (Criteria) this;
        }

        public Criteria andDuSexNotLike(String value) {
            addCriterion("DU_SEX not like", value, "duSex");
            return (Criteria) this;
        }

        public Criteria andDuSexIn(List<String> values) {
            addCriterion("DU_SEX in", values, "duSex");
            return (Criteria) this;
        }

        public Criteria andDuSexNotIn(List<String> values) {
            addCriterion("DU_SEX not in", values, "duSex");
            return (Criteria) this;
        }

        public Criteria andDuSexBetween(String value1, String value2) {
            addCriterion("DU_SEX between", value1, value2, "duSex");
            return (Criteria) this;
        }

        public Criteria andDuSexNotBetween(String value1, String value2) {
            addCriterion("DU_SEX not between", value1, value2, "duSex");
            return (Criteria) this;
        }

        public Criteria andDuBirthdayIsNull() {
            addCriterion("DU_BIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andDuBirthdayIsNotNull() {
            addCriterion("DU_BIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andDuBirthdayEqualTo(Date value) {
            addCriterion("DU_BIRTHDAY =", value, "duBirthday");
            return (Criteria) this;
        }

        public Criteria andDuBirthdayNotEqualTo(Date value) {
            addCriterion("DU_BIRTHDAY <>", value, "duBirthday");
            return (Criteria) this;
        }

        public Criteria andDuBirthdayGreaterThan(Date value) {
            addCriterion("DU_BIRTHDAY >", value, "duBirthday");
            return (Criteria) this;
        }

        public Criteria andDuBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("DU_BIRTHDAY >=", value, "duBirthday");
            return (Criteria) this;
        }

        public Criteria andDuBirthdayLessThan(Date value) {
            addCriterion("DU_BIRTHDAY <", value, "duBirthday");
            return (Criteria) this;
        }

        public Criteria andDuBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("DU_BIRTHDAY <=", value, "duBirthday");
            return (Criteria) this;
        }

        public Criteria andDuBirthdayIn(List<Date> values) {
            addCriterion("DU_BIRTHDAY in", values, "duBirthday");
            return (Criteria) this;
        }

        public Criteria andDuBirthdayNotIn(List<Date> values) {
            addCriterion("DU_BIRTHDAY not in", values, "duBirthday");
            return (Criteria) this;
        }

        public Criteria andDuBirthdayBetween(Date value1, Date value2) {
            addCriterion("DU_BIRTHDAY between", value1, value2, "duBirthday");
            return (Criteria) this;
        }

        public Criteria andDuBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("DU_BIRTHDAY not between", value1, value2, "duBirthday");
            return (Criteria) this;
        }

        public Criteria andDuIdentityCodeIsNull() {
            addCriterion("DU_IDENTITY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andDuIdentityCodeIsNotNull() {
            addCriterion("DU_IDENTITY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andDuIdentityCodeEqualTo(String value) {
            addCriterion("DU_IDENTITY_CODE =", value, "duIdentityCode");
            return (Criteria) this;
        }

        public Criteria andDuIdentityCodeNotEqualTo(String value) {
            addCriterion("DU_IDENTITY_CODE <>", value, "duIdentityCode");
            return (Criteria) this;
        }

        public Criteria andDuIdentityCodeGreaterThan(String value) {
            addCriterion("DU_IDENTITY_CODE >", value, "duIdentityCode");
            return (Criteria) this;
        }

        public Criteria andDuIdentityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("DU_IDENTITY_CODE >=", value, "duIdentityCode");
            return (Criteria) this;
        }

        public Criteria andDuIdentityCodeLessThan(String value) {
            addCriterion("DU_IDENTITY_CODE <", value, "duIdentityCode");
            return (Criteria) this;
        }

        public Criteria andDuIdentityCodeLessThanOrEqualTo(String value) {
            addCriterion("DU_IDENTITY_CODE <=", value, "duIdentityCode");
            return (Criteria) this;
        }

        public Criteria andDuIdentityCodeLike(String value) {
            addCriterion("DU_IDENTITY_CODE like", value, "duIdentityCode");
            return (Criteria) this;
        }

        public Criteria andDuIdentityCodeNotLike(String value) {
            addCriterion("DU_IDENTITY_CODE not like", value, "duIdentityCode");
            return (Criteria) this;
        }

        public Criteria andDuIdentityCodeIn(List<String> values) {
            addCriterion("DU_IDENTITY_CODE in", values, "duIdentityCode");
            return (Criteria) this;
        }

        public Criteria andDuIdentityCodeNotIn(List<String> values) {
            addCriterion("DU_IDENTITY_CODE not in", values, "duIdentityCode");
            return (Criteria) this;
        }

        public Criteria andDuIdentityCodeBetween(String value1, String value2) {
            addCriterion("DU_IDENTITY_CODE between", value1, value2, "duIdentityCode");
            return (Criteria) this;
        }

        public Criteria andDuIdentityCodeNotBetween(String value1, String value2) {
            addCriterion("DU_IDENTITY_CODE not between", value1, value2, "duIdentityCode");
            return (Criteria) this;
        }

        public Criteria andDuMobileIsNull() {
            addCriterion("DU_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andDuMobileIsNotNull() {
            addCriterion("DU_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andDuMobileEqualTo(String value) {
            addCriterion("DU_MOBILE =", value, "duMobile");
            return (Criteria) this;
        }

        public Criteria andDuMobileNotEqualTo(String value) {
            addCriterion("DU_MOBILE <>", value, "duMobile");
            return (Criteria) this;
        }

        public Criteria andDuMobileGreaterThan(String value) {
            addCriterion("DU_MOBILE >", value, "duMobile");
            return (Criteria) this;
        }

        public Criteria andDuMobileGreaterThanOrEqualTo(String value) {
            addCriterion("DU_MOBILE >=", value, "duMobile");
            return (Criteria) this;
        }

        public Criteria andDuMobileLessThan(String value) {
            addCriterion("DU_MOBILE <", value, "duMobile");
            return (Criteria) this;
        }

        public Criteria andDuMobileLessThanOrEqualTo(String value) {
            addCriterion("DU_MOBILE <=", value, "duMobile");
            return (Criteria) this;
        }

        public Criteria andDuMobileLike(String value) {
            addCriterion("DU_MOBILE like", value, "duMobile");
            return (Criteria) this;
        }

        public Criteria andDuMobileNotLike(String value) {
            addCriterion("DU_MOBILE not like", value, "duMobile");
            return (Criteria) this;
        }

        public Criteria andDuMobileIn(List<String> values) {
            addCriterion("DU_MOBILE in", values, "duMobile");
            return (Criteria) this;
        }

        public Criteria andDuMobileNotIn(List<String> values) {
            addCriterion("DU_MOBILE not in", values, "duMobile");
            return (Criteria) this;
        }

        public Criteria andDuMobileBetween(String value1, String value2) {
            addCriterion("DU_MOBILE between", value1, value2, "duMobile");
            return (Criteria) this;
        }

        public Criteria andDuMobileNotBetween(String value1, String value2) {
            addCriterion("DU_MOBILE not between", value1, value2, "duMobile");
            return (Criteria) this;
        }

        public Criteria andDuCreatetimeIsNull() {
            addCriterion("DU_createtime is null");
            return (Criteria) this;
        }

        public Criteria andDuCreatetimeIsNotNull() {
            addCriterion("DU_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andDuCreatetimeEqualTo(Date value) {
            addCriterion("DU_createtime =", value, "duCreatetime");
            return (Criteria) this;
        }

        public Criteria andDuCreatetimeNotEqualTo(Date value) {
            addCriterion("DU_createtime <>", value, "duCreatetime");
            return (Criteria) this;
        }

        public Criteria andDuCreatetimeGreaterThan(Date value) {
            addCriterion("DU_createtime >", value, "duCreatetime");
            return (Criteria) this;
        }

        public Criteria andDuCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DU_createtime >=", value, "duCreatetime");
            return (Criteria) this;
        }

        public Criteria andDuCreatetimeLessThan(Date value) {
            addCriterion("DU_createtime <", value, "duCreatetime");
            return (Criteria) this;
        }

        public Criteria andDuCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("DU_createtime <=", value, "duCreatetime");
            return (Criteria) this;
        }

        public Criteria andDuCreatetimeIn(List<Date> values) {
            addCriterion("DU_createtime in", values, "duCreatetime");
            return (Criteria) this;
        }

        public Criteria andDuCreatetimeNotIn(List<Date> values) {
            addCriterion("DU_createtime not in", values, "duCreatetime");
            return (Criteria) this;
        }

        public Criteria andDuCreatetimeBetween(Date value1, Date value2) {
            addCriterion("DU_createtime between", value1, value2, "duCreatetime");
            return (Criteria) this;
        }

        public Criteria andDuCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("DU_createtime not between", value1, value2, "duCreatetime");
            return (Criteria) this;
        }

        public Criteria andDuCreateuserIsNull() {
            addCriterion("DU_createuser is null");
            return (Criteria) this;
        }

        public Criteria andDuCreateuserIsNotNull() {
            addCriterion("DU_createuser is not null");
            return (Criteria) this;
        }

        public Criteria andDuCreateuserEqualTo(Date value) {
            addCriterion("DU_createuser =", value, "duCreateuser");
            return (Criteria) this;
        }

        public Criteria andDuCreateuserNotEqualTo(Date value) {
            addCriterion("DU_createuser <>", value, "duCreateuser");
            return (Criteria) this;
        }

        public Criteria andDuCreateuserGreaterThan(Date value) {
            addCriterion("DU_createuser >", value, "duCreateuser");
            return (Criteria) this;
        }

        public Criteria andDuCreateuserGreaterThanOrEqualTo(Date value) {
            addCriterion("DU_createuser >=", value, "duCreateuser");
            return (Criteria) this;
        }

        public Criteria andDuCreateuserLessThan(Date value) {
            addCriterion("DU_createuser <", value, "duCreateuser");
            return (Criteria) this;
        }

        public Criteria andDuCreateuserLessThanOrEqualTo(Date value) {
            addCriterion("DU_createuser <=", value, "duCreateuser");
            return (Criteria) this;
        }

        public Criteria andDuCreateuserIn(List<Date> values) {
            addCriterion("DU_createuser in", values, "duCreateuser");
            return (Criteria) this;
        }

        public Criteria andDuCreateuserNotIn(List<Date> values) {
            addCriterion("DU_createuser not in", values, "duCreateuser");
            return (Criteria) this;
        }

        public Criteria andDuCreateuserBetween(Date value1, Date value2) {
            addCriterion("DU_createuser between", value1, value2, "duCreateuser");
            return (Criteria) this;
        }

        public Criteria andDuCreateuserNotBetween(Date value1, Date value2) {
            addCriterion("DU_createuser not between", value1, value2, "duCreateuser");
            return (Criteria) this;
        }

        public Criteria andDuUpdatetimetimeIsNull() {
            addCriterion("DU_upDATETIMEtime is null");
            return (Criteria) this;
        }

        public Criteria andDuUpdatetimetimeIsNotNull() {
            addCriterion("DU_upDATETIMEtime is not null");
            return (Criteria) this;
        }

        public Criteria andDuUpdatetimetimeEqualTo(Date value) {
            addCriterion("DU_upDATETIMEtime =", value, "duUpdatetimetime");
            return (Criteria) this;
        }

        public Criteria andDuUpdatetimetimeNotEqualTo(Date value) {
            addCriterion("DU_upDATETIMEtime <>", value, "duUpdatetimetime");
            return (Criteria) this;
        }

        public Criteria andDuUpdatetimetimeGreaterThan(Date value) {
            addCriterion("DU_upDATETIMEtime >", value, "duUpdatetimetime");
            return (Criteria) this;
        }

        public Criteria andDuUpdatetimetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DU_upDATETIMEtime >=", value, "duUpdatetimetime");
            return (Criteria) this;
        }

        public Criteria andDuUpdatetimetimeLessThan(Date value) {
            addCriterion("DU_upDATETIMEtime <", value, "duUpdatetimetime");
            return (Criteria) this;
        }

        public Criteria andDuUpdatetimetimeLessThanOrEqualTo(Date value) {
            addCriterion("DU_upDATETIMEtime <=", value, "duUpdatetimetime");
            return (Criteria) this;
        }

        public Criteria andDuUpdatetimetimeIn(List<Date> values) {
            addCriterion("DU_upDATETIMEtime in", values, "duUpdatetimetime");
            return (Criteria) this;
        }

        public Criteria andDuUpdatetimetimeNotIn(List<Date> values) {
            addCriterion("DU_upDATETIMEtime not in", values, "duUpdatetimetime");
            return (Criteria) this;
        }

        public Criteria andDuUpdatetimetimeBetween(Date value1, Date value2) {
            addCriterion("DU_upDATETIMEtime between", value1, value2, "duUpdatetimetime");
            return (Criteria) this;
        }

        public Criteria andDuUpdatetimetimeNotBetween(Date value1, Date value2) {
            addCriterion("DU_upDATETIMEtime not between", value1, value2, "duUpdatetimetime");
            return (Criteria) this;
        }

        public Criteria andDuUpdatetimeuserIsNull() {
            addCriterion("DU_upDATETIMEuser is null");
            return (Criteria) this;
        }

        public Criteria andDuUpdatetimeuserIsNotNull() {
            addCriterion("DU_upDATETIMEuser is not null");
            return (Criteria) this;
        }

        public Criteria andDuUpdatetimeuserEqualTo(Date value) {
            addCriterion("DU_upDATETIMEuser =", value, "duUpdatetimeuser");
            return (Criteria) this;
        }

        public Criteria andDuUpdatetimeuserNotEqualTo(Date value) {
            addCriterion("DU_upDATETIMEuser <>", value, "duUpdatetimeuser");
            return (Criteria) this;
        }

        public Criteria andDuUpdatetimeuserGreaterThan(Date value) {
            addCriterion("DU_upDATETIMEuser >", value, "duUpdatetimeuser");
            return (Criteria) this;
        }

        public Criteria andDuUpdatetimeuserGreaterThanOrEqualTo(Date value) {
            addCriterion("DU_upDATETIMEuser >=", value, "duUpdatetimeuser");
            return (Criteria) this;
        }

        public Criteria andDuUpdatetimeuserLessThan(Date value) {
            addCriterion("DU_upDATETIMEuser <", value, "duUpdatetimeuser");
            return (Criteria) this;
        }

        public Criteria andDuUpdatetimeuserLessThanOrEqualTo(Date value) {
            addCriterion("DU_upDATETIMEuser <=", value, "duUpdatetimeuser");
            return (Criteria) this;
        }

        public Criteria andDuUpdatetimeuserIn(List<Date> values) {
            addCriterion("DU_upDATETIMEuser in", values, "duUpdatetimeuser");
            return (Criteria) this;
        }

        public Criteria andDuUpdatetimeuserNotIn(List<Date> values) {
            addCriterion("DU_upDATETIMEuser not in", values, "duUpdatetimeuser");
            return (Criteria) this;
        }

        public Criteria andDuUpdatetimeuserBetween(Date value1, Date value2) {
            addCriterion("DU_upDATETIMEuser between", value1, value2, "duUpdatetimeuser");
            return (Criteria) this;
        }

        public Criteria andDuUpdatetimeuserNotBetween(Date value1, Date value2) {
            addCriterion("DU_upDATETIMEuser not between", value1, value2, "duUpdatetimeuser");
            return (Criteria) this;
        }

        public Criteria andDuStatusIsNull() {
            addCriterion("DU_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andDuStatusIsNotNull() {
            addCriterion("DU_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andDuStatusEqualTo(Integer value) {
            addCriterion("DU_STATUS =", value, "duStatus");
            return (Criteria) this;
        }

        public Criteria andDuStatusNotEqualTo(Integer value) {
            addCriterion("DU_STATUS <>", value, "duStatus");
            return (Criteria) this;
        }

        public Criteria andDuStatusGreaterThan(Integer value) {
            addCriterion("DU_STATUS >", value, "duStatus");
            return (Criteria) this;
        }

        public Criteria andDuStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("DU_STATUS >=", value, "duStatus");
            return (Criteria) this;
        }

        public Criteria andDuStatusLessThan(Integer value) {
            addCriterion("DU_STATUS <", value, "duStatus");
            return (Criteria) this;
        }

        public Criteria andDuStatusLessThanOrEqualTo(Integer value) {
            addCriterion("DU_STATUS <=", value, "duStatus");
            return (Criteria) this;
        }

        public Criteria andDuStatusIn(List<Integer> values) {
            addCriterion("DU_STATUS in", values, "duStatus");
            return (Criteria) this;
        }

        public Criteria andDuStatusNotIn(List<Integer> values) {
            addCriterion("DU_STATUS not in", values, "duStatus");
            return (Criteria) this;
        }

        public Criteria andDuStatusBetween(Integer value1, Integer value2) {
            addCriterion("DU_STATUS between", value1, value2, "duStatus");
            return (Criteria) this;
        }

        public Criteria andDuStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("DU_STATUS not between", value1, value2, "duStatus");
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