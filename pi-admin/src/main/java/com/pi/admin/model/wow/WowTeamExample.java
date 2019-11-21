package com.pi.admin.model.wow;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WowTeamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WowTeamExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTeamNameIsNull() {
            addCriterion("team_name is null");
            return (Criteria) this;
        }

        public Criteria andTeamNameIsNotNull() {
            addCriterion("team_name is not null");
            return (Criteria) this;
        }

        public Criteria andTeamNameEqualTo(String value) {
            addCriterion("team_name =", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotEqualTo(String value) {
            addCriterion("team_name <>", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameGreaterThan(String value) {
            addCriterion("team_name >", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameGreaterThanOrEqualTo(String value) {
            addCriterion("team_name >=", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameLessThan(String value) {
            addCriterion("team_name <", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameLessThanOrEqualTo(String value) {
            addCriterion("team_name <=", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameLike(String value) {
            addCriterion("team_name like", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotLike(String value) {
            addCriterion("team_name not like", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameIn(List<String> values) {
            addCriterion("team_name in", values, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotIn(List<String> values) {
            addCriterion("team_name not in", values, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameBetween(String value1, String value2) {
            addCriterion("team_name between", value1, value2, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotBetween(String value1, String value2) {
            addCriterion("team_name not between", value1, value2, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamDescIsNull() {
            addCriterion("team_desc is null");
            return (Criteria) this;
        }

        public Criteria andTeamDescIsNotNull() {
            addCriterion("team_desc is not null");
            return (Criteria) this;
        }

        public Criteria andTeamDescEqualTo(String value) {
            addCriterion("team_desc =", value, "teamDesc");
            return (Criteria) this;
        }

        public Criteria andTeamDescNotEqualTo(String value) {
            addCriterion("team_desc <>", value, "teamDesc");
            return (Criteria) this;
        }

        public Criteria andTeamDescGreaterThan(String value) {
            addCriterion("team_desc >", value, "teamDesc");
            return (Criteria) this;
        }

        public Criteria andTeamDescGreaterThanOrEqualTo(String value) {
            addCriterion("team_desc >=", value, "teamDesc");
            return (Criteria) this;
        }

        public Criteria andTeamDescLessThan(String value) {
            addCriterion("team_desc <", value, "teamDesc");
            return (Criteria) this;
        }

        public Criteria andTeamDescLessThanOrEqualTo(String value) {
            addCriterion("team_desc <=", value, "teamDesc");
            return (Criteria) this;
        }

        public Criteria andTeamDescLike(String value) {
            addCriterion("team_desc like", value, "teamDesc");
            return (Criteria) this;
        }

        public Criteria andTeamDescNotLike(String value) {
            addCriterion("team_desc not like", value, "teamDesc");
            return (Criteria) this;
        }

        public Criteria andTeamDescIn(List<String> values) {
            addCriterion("team_desc in", values, "teamDesc");
            return (Criteria) this;
        }

        public Criteria andTeamDescNotIn(List<String> values) {
            addCriterion("team_desc not in", values, "teamDesc");
            return (Criteria) this;
        }

        public Criteria andTeamDescBetween(String value1, String value2) {
            addCriterion("team_desc between", value1, value2, "teamDesc");
            return (Criteria) this;
        }

        public Criteria andTeamDescNotBetween(String value1, String value2) {
            addCriterion("team_desc not between", value1, value2, "teamDesc");
            return (Criteria) this;
        }

        public Criteria andTeamNoticeIsNull() {
            addCriterion("team_notice is null");
            return (Criteria) this;
        }

        public Criteria andTeamNoticeIsNotNull() {
            addCriterion("team_notice is not null");
            return (Criteria) this;
        }

        public Criteria andTeamNoticeEqualTo(String value) {
            addCriterion("team_notice =", value, "teamNotice");
            return (Criteria) this;
        }

        public Criteria andTeamNoticeNotEqualTo(String value) {
            addCriterion("team_notice <>", value, "teamNotice");
            return (Criteria) this;
        }

        public Criteria andTeamNoticeGreaterThan(String value) {
            addCriterion("team_notice >", value, "teamNotice");
            return (Criteria) this;
        }

        public Criteria andTeamNoticeGreaterThanOrEqualTo(String value) {
            addCriterion("team_notice >=", value, "teamNotice");
            return (Criteria) this;
        }

        public Criteria andTeamNoticeLessThan(String value) {
            addCriterion("team_notice <", value, "teamNotice");
            return (Criteria) this;
        }

        public Criteria andTeamNoticeLessThanOrEqualTo(String value) {
            addCriterion("team_notice <=", value, "teamNotice");
            return (Criteria) this;
        }

        public Criteria andTeamNoticeLike(String value) {
            addCriterion("team_notice like", value, "teamNotice");
            return (Criteria) this;
        }

        public Criteria andTeamNoticeNotLike(String value) {
            addCriterion("team_notice not like", value, "teamNotice");
            return (Criteria) this;
        }

        public Criteria andTeamNoticeIn(List<String> values) {
            addCriterion("team_notice in", values, "teamNotice");
            return (Criteria) this;
        }

        public Criteria andTeamNoticeNotIn(List<String> values) {
            addCriterion("team_notice not in", values, "teamNotice");
            return (Criteria) this;
        }

        public Criteria andTeamNoticeBetween(String value1, String value2) {
            addCriterion("team_notice between", value1, value2, "teamNotice");
            return (Criteria) this;
        }

        public Criteria andTeamNoticeNotBetween(String value1, String value2) {
            addCriterion("team_notice not between", value1, value2, "teamNotice");
            return (Criteria) this;
        }

        public Criteria andTeamPicIsNull() {
            addCriterion("team_pic is null");
            return (Criteria) this;
        }

        public Criteria andTeamPicIsNotNull() {
            addCriterion("team_pic is not null");
            return (Criteria) this;
        }

        public Criteria andTeamPicEqualTo(String value) {
            addCriterion("team_pic =", value, "teamPic");
            return (Criteria) this;
        }

        public Criteria andTeamPicNotEqualTo(String value) {
            addCriterion("team_pic <>", value, "teamPic");
            return (Criteria) this;
        }

        public Criteria andTeamPicGreaterThan(String value) {
            addCriterion("team_pic >", value, "teamPic");
            return (Criteria) this;
        }

        public Criteria andTeamPicGreaterThanOrEqualTo(String value) {
            addCriterion("team_pic >=", value, "teamPic");
            return (Criteria) this;
        }

        public Criteria andTeamPicLessThan(String value) {
            addCriterion("team_pic <", value, "teamPic");
            return (Criteria) this;
        }

        public Criteria andTeamPicLessThanOrEqualTo(String value) {
            addCriterion("team_pic <=", value, "teamPic");
            return (Criteria) this;
        }

        public Criteria andTeamPicLike(String value) {
            addCriterion("team_pic like", value, "teamPic");
            return (Criteria) this;
        }

        public Criteria andTeamPicNotLike(String value) {
            addCriterion("team_pic not like", value, "teamPic");
            return (Criteria) this;
        }

        public Criteria andTeamPicIn(List<String> values) {
            addCriterion("team_pic in", values, "teamPic");
            return (Criteria) this;
        }

        public Criteria andTeamPicNotIn(List<String> values) {
            addCriterion("team_pic not in", values, "teamPic");
            return (Criteria) this;
        }

        public Criteria andTeamPicBetween(String value1, String value2) {
            addCriterion("team_pic between", value1, value2, "teamPic");
            return (Criteria) this;
        }

        public Criteria andTeamPicNotBetween(String value1, String value2) {
            addCriterion("team_pic not between", value1, value2, "teamPic");
            return (Criteria) this;
        }

        public Criteria andTeamCreatorIsNull() {
            addCriterion("team_creator is null");
            return (Criteria) this;
        }

        public Criteria andTeamCreatorIsNotNull() {
            addCriterion("team_creator is not null");
            return (Criteria) this;
        }

        public Criteria andTeamCreatorEqualTo(String value) {
            addCriterion("team_creator =", value, "teamCreator");
            return (Criteria) this;
        }

        public Criteria andTeamCreatorNotEqualTo(String value) {
            addCriterion("team_creator <>", value, "teamCreator");
            return (Criteria) this;
        }

        public Criteria andTeamCreatorGreaterThan(String value) {
            addCriterion("team_creator >", value, "teamCreator");
            return (Criteria) this;
        }

        public Criteria andTeamCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("team_creator >=", value, "teamCreator");
            return (Criteria) this;
        }

        public Criteria andTeamCreatorLessThan(String value) {
            addCriterion("team_creator <", value, "teamCreator");
            return (Criteria) this;
        }

        public Criteria andTeamCreatorLessThanOrEqualTo(String value) {
            addCriterion("team_creator <=", value, "teamCreator");
            return (Criteria) this;
        }

        public Criteria andTeamCreatorLike(String value) {
            addCriterion("team_creator like", value, "teamCreator");
            return (Criteria) this;
        }

        public Criteria andTeamCreatorNotLike(String value) {
            addCriterion("team_creator not like", value, "teamCreator");
            return (Criteria) this;
        }

        public Criteria andTeamCreatorIn(List<String> values) {
            addCriterion("team_creator in", values, "teamCreator");
            return (Criteria) this;
        }

        public Criteria andTeamCreatorNotIn(List<String> values) {
            addCriterion("team_creator not in", values, "teamCreator");
            return (Criteria) this;
        }

        public Criteria andTeamCreatorBetween(String value1, String value2) {
            addCriterion("team_creator between", value1, value2, "teamCreator");
            return (Criteria) this;
        }

        public Criteria andTeamCreatorNotBetween(String value1, String value2) {
            addCriterion("team_creator not between", value1, value2, "teamCreator");
            return (Criteria) this;
        }

        public Criteria andTeamCreateTimeIsNull() {
            addCriterion("team_create_time is null");
            return (Criteria) this;
        }

        public Criteria andTeamCreateTimeIsNotNull() {
            addCriterion("team_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andTeamCreateTimeEqualTo(Date value) {
            addCriterion("team_create_time =", value, "teamCreateTime");
            return (Criteria) this;
        }

        public Criteria andTeamCreateTimeNotEqualTo(Date value) {
            addCriterion("team_create_time <>", value, "teamCreateTime");
            return (Criteria) this;
        }

        public Criteria andTeamCreateTimeGreaterThan(Date value) {
            addCriterion("team_create_time >", value, "teamCreateTime");
            return (Criteria) this;
        }

        public Criteria andTeamCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("team_create_time >=", value, "teamCreateTime");
            return (Criteria) this;
        }

        public Criteria andTeamCreateTimeLessThan(Date value) {
            addCriterion("team_create_time <", value, "teamCreateTime");
            return (Criteria) this;
        }

        public Criteria andTeamCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("team_create_time <=", value, "teamCreateTime");
            return (Criteria) this;
        }

        public Criteria andTeamCreateTimeIn(List<Date> values) {
            addCriterion("team_create_time in", values, "teamCreateTime");
            return (Criteria) this;
        }

        public Criteria andTeamCreateTimeNotIn(List<Date> values) {
            addCriterion("team_create_time not in", values, "teamCreateTime");
            return (Criteria) this;
        }

        public Criteria andTeamCreateTimeBetween(Date value1, Date value2) {
            addCriterion("team_create_time between", value1, value2, "teamCreateTime");
            return (Criteria) this;
        }

        public Criteria andTeamCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("team_create_time not between", value1, value2, "teamCreateTime");
            return (Criteria) this;
        }

        public Criteria andDelIsNull() {
            addCriterion("del is null");
            return (Criteria) this;
        }

        public Criteria andDelIsNotNull() {
            addCriterion("del is not null");
            return (Criteria) this;
        }

        public Criteria andDelEqualTo(Boolean value) {
            addCriterion("del =", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelNotEqualTo(Boolean value) {
            addCriterion("del <>", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelGreaterThan(Boolean value) {
            addCriterion("del >", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("del >=", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelLessThan(Boolean value) {
            addCriterion("del <", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelLessThanOrEqualTo(Boolean value) {
            addCriterion("del <=", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelIn(List<Boolean> values) {
            addCriterion("del in", values, "del");
            return (Criteria) this;
        }

        public Criteria andDelNotIn(List<Boolean> values) {
            addCriterion("del not in", values, "del");
            return (Criteria) this;
        }

        public Criteria andDelBetween(Boolean value1, Boolean value2) {
            addCriterion("del between", value1, value2, "del");
            return (Criteria) this;
        }

        public Criteria andDelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("del not between", value1, value2, "del");
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