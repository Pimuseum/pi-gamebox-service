package com.pi.admin.model.wow;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WowGroupMemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WowGroupMemberExample() {
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

        public Criteria andWowerIdIsNull() {
            addCriterion("wower_id is null");
            return (Criteria) this;
        }

        public Criteria andWowerIdIsNotNull() {
            addCriterion("wower_id is not null");
            return (Criteria) this;
        }

        public Criteria andWowerIdEqualTo(Long value) {
            addCriterion("wower_id =", value, "wowerId");
            return (Criteria) this;
        }

        public Criteria andWowerIdNotEqualTo(Long value) {
            addCriterion("wower_id <>", value, "wowerId");
            return (Criteria) this;
        }

        public Criteria andWowerIdGreaterThan(Long value) {
            addCriterion("wower_id >", value, "wowerId");
            return (Criteria) this;
        }

        public Criteria andWowerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("wower_id >=", value, "wowerId");
            return (Criteria) this;
        }

        public Criteria andWowerIdLessThan(Long value) {
            addCriterion("wower_id <", value, "wowerId");
            return (Criteria) this;
        }

        public Criteria andWowerIdLessThanOrEqualTo(Long value) {
            addCriterion("wower_id <=", value, "wowerId");
            return (Criteria) this;
        }

        public Criteria andWowerIdIn(List<Long> values) {
            addCriterion("wower_id in", values, "wowerId");
            return (Criteria) this;
        }

        public Criteria andWowerIdNotIn(List<Long> values) {
            addCriterion("wower_id not in", values, "wowerId");
            return (Criteria) this;
        }

        public Criteria andWowerIdBetween(Long value1, Long value2) {
            addCriterion("wower_id between", value1, value2, "wowerId");
            return (Criteria) this;
        }

        public Criteria andWowerIdNotBetween(Long value1, Long value2) {
            addCriterion("wower_id not between", value1, value2, "wowerId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNull() {
            addCriterion("group_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(Long value) {
            addCriterion("group_id =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(Long value) {
            addCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(Long value) {
            addCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(Long value) {
            addCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(Long value) {
            addCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(Long value) {
            addCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<Long> values) {
            addCriterion("group_id in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<Long> values) {
            addCriterion("group_id not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(Long value1, Long value2) {
            addCriterion("group_id between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(Long value1, Long value2) {
            addCriterion("group_id not between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupDutyTypeIsNull() {
            addCriterion("group_duty_type is null");
            return (Criteria) this;
        }

        public Criteria andGroupDutyTypeIsNotNull() {
            addCriterion("group_duty_type is not null");
            return (Criteria) this;
        }

        public Criteria andGroupDutyTypeEqualTo(Integer value) {
            addCriterion("group_duty_type =", value, "groupDutyType");
            return (Criteria) this;
        }

        public Criteria andGroupDutyTypeNotEqualTo(Integer value) {
            addCriterion("group_duty_type <>", value, "groupDutyType");
            return (Criteria) this;
        }

        public Criteria andGroupDutyTypeGreaterThan(Integer value) {
            addCriterion("group_duty_type >", value, "groupDutyType");
            return (Criteria) this;
        }

        public Criteria andGroupDutyTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("group_duty_type >=", value, "groupDutyType");
            return (Criteria) this;
        }

        public Criteria andGroupDutyTypeLessThan(Integer value) {
            addCriterion("group_duty_type <", value, "groupDutyType");
            return (Criteria) this;
        }

        public Criteria andGroupDutyTypeLessThanOrEqualTo(Integer value) {
            addCriterion("group_duty_type <=", value, "groupDutyType");
            return (Criteria) this;
        }

        public Criteria andGroupDutyTypeIn(List<Integer> values) {
            addCriterion("group_duty_type in", values, "groupDutyType");
            return (Criteria) this;
        }

        public Criteria andGroupDutyTypeNotIn(List<Integer> values) {
            addCriterion("group_duty_type not in", values, "groupDutyType");
            return (Criteria) this;
        }

        public Criteria andGroupDutyTypeBetween(Integer value1, Integer value2) {
            addCriterion("group_duty_type between", value1, value2, "groupDutyType");
            return (Criteria) this;
        }

        public Criteria andGroupDutyTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("group_duty_type not between", value1, value2, "groupDutyType");
            return (Criteria) this;
        }

        public Criteria andPlanBeginPlaytimeIsNull() {
            addCriterion("plan_begin_playtime is null");
            return (Criteria) this;
        }

        public Criteria andPlanBeginPlaytimeIsNotNull() {
            addCriterion("plan_begin_playtime is not null");
            return (Criteria) this;
        }

        public Criteria andPlanBeginPlaytimeEqualTo(Date value) {
            addCriterion("plan_begin_playtime =", value, "planBeginPlaytime");
            return (Criteria) this;
        }

        public Criteria andPlanBeginPlaytimeNotEqualTo(Date value) {
            addCriterion("plan_begin_playtime <>", value, "planBeginPlaytime");
            return (Criteria) this;
        }

        public Criteria andPlanBeginPlaytimeGreaterThan(Date value) {
            addCriterion("plan_begin_playtime >", value, "planBeginPlaytime");
            return (Criteria) this;
        }

        public Criteria andPlanBeginPlaytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("plan_begin_playtime >=", value, "planBeginPlaytime");
            return (Criteria) this;
        }

        public Criteria andPlanBeginPlaytimeLessThan(Date value) {
            addCriterion("plan_begin_playtime <", value, "planBeginPlaytime");
            return (Criteria) this;
        }

        public Criteria andPlanBeginPlaytimeLessThanOrEqualTo(Date value) {
            addCriterion("plan_begin_playtime <=", value, "planBeginPlaytime");
            return (Criteria) this;
        }

        public Criteria andPlanBeginPlaytimeIn(List<Date> values) {
            addCriterion("plan_begin_playtime in", values, "planBeginPlaytime");
            return (Criteria) this;
        }

        public Criteria andPlanBeginPlaytimeNotIn(List<Date> values) {
            addCriterion("plan_begin_playtime not in", values, "planBeginPlaytime");
            return (Criteria) this;
        }

        public Criteria andPlanBeginPlaytimeBetween(Date value1, Date value2) {
            addCriterion("plan_begin_playtime between", value1, value2, "planBeginPlaytime");
            return (Criteria) this;
        }

        public Criteria andPlanBeginPlaytimeNotBetween(Date value1, Date value2) {
            addCriterion("plan_begin_playtime not between", value1, value2, "planBeginPlaytime");
            return (Criteria) this;
        }

        public Criteria andPlanEndPlaytimeIsNull() {
            addCriterion("plan_end_playtime is null");
            return (Criteria) this;
        }

        public Criteria andPlanEndPlaytimeIsNotNull() {
            addCriterion("plan_end_playtime is not null");
            return (Criteria) this;
        }

        public Criteria andPlanEndPlaytimeEqualTo(Date value) {
            addCriterion("plan_end_playtime =", value, "planEndPlaytime");
            return (Criteria) this;
        }

        public Criteria andPlanEndPlaytimeNotEqualTo(Date value) {
            addCriterion("plan_end_playtime <>", value, "planEndPlaytime");
            return (Criteria) this;
        }

        public Criteria andPlanEndPlaytimeGreaterThan(Date value) {
            addCriterion("plan_end_playtime >", value, "planEndPlaytime");
            return (Criteria) this;
        }

        public Criteria andPlanEndPlaytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("plan_end_playtime >=", value, "planEndPlaytime");
            return (Criteria) this;
        }

        public Criteria andPlanEndPlaytimeLessThan(Date value) {
            addCriterion("plan_end_playtime <", value, "planEndPlaytime");
            return (Criteria) this;
        }

        public Criteria andPlanEndPlaytimeLessThanOrEqualTo(Date value) {
            addCriterion("plan_end_playtime <=", value, "planEndPlaytime");
            return (Criteria) this;
        }

        public Criteria andPlanEndPlaytimeIn(List<Date> values) {
            addCriterion("plan_end_playtime in", values, "planEndPlaytime");
            return (Criteria) this;
        }

        public Criteria andPlanEndPlaytimeNotIn(List<Date> values) {
            addCriterion("plan_end_playtime not in", values, "planEndPlaytime");
            return (Criteria) this;
        }

        public Criteria andPlanEndPlaytimeBetween(Date value1, Date value2) {
            addCriterion("plan_end_playtime between", value1, value2, "planEndPlaytime");
            return (Criteria) this;
        }

        public Criteria andPlanEndPlaytimeNotBetween(Date value1, Date value2) {
            addCriterion("plan_end_playtime not between", value1, value2, "planEndPlaytime");
            return (Criteria) this;
        }

        public Criteria andDescIsNull() {
            addCriterion("desc is null");
            return (Criteria) this;
        }

        public Criteria andDescIsNotNull() {
            addCriterion("desc is not null");
            return (Criteria) this;
        }

        public Criteria andDescEqualTo(String value) {
            addCriterion("desc =", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotEqualTo(String value) {
            addCriterion("desc <>", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescGreaterThan(String value) {
            addCriterion("desc >", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescGreaterThanOrEqualTo(String value) {
            addCriterion("desc >=", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLessThan(String value) {
            addCriterion("desc <", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLessThanOrEqualTo(String value) {
            addCriterion("desc <=", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLike(String value) {
            addCriterion("desc like", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotLike(String value) {
            addCriterion("desc not like", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescIn(List<String> values) {
            addCriterion("desc in", values, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotIn(List<String> values) {
            addCriterion("desc not in", values, "desc");
            return (Criteria) this;
        }

        public Criteria andDescBetween(String value1, String value2) {
            addCriterion("desc between", value1, value2, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotBetween(String value1, String value2) {
            addCriterion("desc not between", value1, value2, "desc");
            return (Criteria) this;
        }

        public Criteria andGroupGeniusIsNull() {
            addCriterion("group_genius is null");
            return (Criteria) this;
        }

        public Criteria andGroupGeniusIsNotNull() {
            addCriterion("group_genius is not null");
            return (Criteria) this;
        }

        public Criteria andGroupGeniusEqualTo(String value) {
            addCriterion("group_genius =", value, "groupGenius");
            return (Criteria) this;
        }

        public Criteria andGroupGeniusNotEqualTo(String value) {
            addCriterion("group_genius <>", value, "groupGenius");
            return (Criteria) this;
        }

        public Criteria andGroupGeniusGreaterThan(String value) {
            addCriterion("group_genius >", value, "groupGenius");
            return (Criteria) this;
        }

        public Criteria andGroupGeniusGreaterThanOrEqualTo(String value) {
            addCriterion("group_genius >=", value, "groupGenius");
            return (Criteria) this;
        }

        public Criteria andGroupGeniusLessThan(String value) {
            addCriterion("group_genius <", value, "groupGenius");
            return (Criteria) this;
        }

        public Criteria andGroupGeniusLessThanOrEqualTo(String value) {
            addCriterion("group_genius <=", value, "groupGenius");
            return (Criteria) this;
        }

        public Criteria andGroupGeniusLike(String value) {
            addCriterion("group_genius like", value, "groupGenius");
            return (Criteria) this;
        }

        public Criteria andGroupGeniusNotLike(String value) {
            addCriterion("group_genius not like", value, "groupGenius");
            return (Criteria) this;
        }

        public Criteria andGroupGeniusIn(List<String> values) {
            addCriterion("group_genius in", values, "groupGenius");
            return (Criteria) this;
        }

        public Criteria andGroupGeniusNotIn(List<String> values) {
            addCriterion("group_genius not in", values, "groupGenius");
            return (Criteria) this;
        }

        public Criteria andGroupGeniusBetween(String value1, String value2) {
            addCriterion("group_genius between", value1, value2, "groupGenius");
            return (Criteria) this;
        }

        public Criteria andGroupGeniusNotBetween(String value1, String value2) {
            addCriterion("group_genius not between", value1, value2, "groupGenius");
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