package com.pi.admin.model.wow;

import java.util.ArrayList;
import java.util.List;

public class DkpLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DkpLogExample() {
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

        public Criteria andMemberidIsNull() {
            addCriterion("memberId is null");
            return (Criteria) this;
        }

        public Criteria andMemberidIsNotNull() {
            addCriterion("memberId is not null");
            return (Criteria) this;
        }

        public Criteria andMemberidEqualTo(Long value) {
            addCriterion("memberId =", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotEqualTo(Long value) {
            addCriterion("memberId <>", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidGreaterThan(Long value) {
            addCriterion("memberId >", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidGreaterThanOrEqualTo(Long value) {
            addCriterion("memberId >=", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidLessThan(Long value) {
            addCriterion("memberId <", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidLessThanOrEqualTo(Long value) {
            addCriterion("memberId <=", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidIn(List<Long> values) {
            addCriterion("memberId in", values, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotIn(List<Long> values) {
            addCriterion("memberId not in", values, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidBetween(Long value1, Long value2) {
            addCriterion("memberId between", value1, value2, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotBetween(Long value1, Long value2) {
            addCriterion("memberId not between", value1, value2, "memberid");
            return (Criteria) this;
        }

        public Criteria andWowNameIsNull() {
            addCriterion("wow_name is null");
            return (Criteria) this;
        }

        public Criteria andWowNameIsNotNull() {
            addCriterion("wow_name is not null");
            return (Criteria) this;
        }

        public Criteria andWowNameEqualTo(String value) {
            addCriterion("wow_name =", value, "wowName");
            return (Criteria) this;
        }

        public Criteria andWowNameNotEqualTo(String value) {
            addCriterion("wow_name <>", value, "wowName");
            return (Criteria) this;
        }

        public Criteria andWowNameGreaterThan(String value) {
            addCriterion("wow_name >", value, "wowName");
            return (Criteria) this;
        }

        public Criteria andWowNameGreaterThanOrEqualTo(String value) {
            addCriterion("wow_name >=", value, "wowName");
            return (Criteria) this;
        }

        public Criteria andWowNameLessThan(String value) {
            addCriterion("wow_name <", value, "wowName");
            return (Criteria) this;
        }

        public Criteria andWowNameLessThanOrEqualTo(String value) {
            addCriterion("wow_name <=", value, "wowName");
            return (Criteria) this;
        }

        public Criteria andWowNameLike(String value) {
            addCriterion("wow_name like", value, "wowName");
            return (Criteria) this;
        }

        public Criteria andWowNameNotLike(String value) {
            addCriterion("wow_name not like", value, "wowName");
            return (Criteria) this;
        }

        public Criteria andWowNameIn(List<String> values) {
            addCriterion("wow_name in", values, "wowName");
            return (Criteria) this;
        }

        public Criteria andWowNameNotIn(List<String> values) {
            addCriterion("wow_name not in", values, "wowName");
            return (Criteria) this;
        }

        public Criteria andWowNameBetween(String value1, String value2) {
            addCriterion("wow_name between", value1, value2, "wowName");
            return (Criteria) this;
        }

        public Criteria andWowNameNotBetween(String value1, String value2) {
            addCriterion("wow_name not between", value1, value2, "wowName");
            return (Criteria) this;
        }

        public Criteria andChangeDkpValueIsNull() {
            addCriterion("change_dkp_value is null");
            return (Criteria) this;
        }

        public Criteria andChangeDkpValueIsNotNull() {
            addCriterion("change_dkp_value is not null");
            return (Criteria) this;
        }

        public Criteria andChangeDkpValueEqualTo(Integer value) {
            addCriterion("change_dkp_value =", value, "changeDkpValue");
            return (Criteria) this;
        }

        public Criteria andChangeDkpValueNotEqualTo(Integer value) {
            addCriterion("change_dkp_value <>", value, "changeDkpValue");
            return (Criteria) this;
        }

        public Criteria andChangeDkpValueGreaterThan(Integer value) {
            addCriterion("change_dkp_value >", value, "changeDkpValue");
            return (Criteria) this;
        }

        public Criteria andChangeDkpValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("change_dkp_value >=", value, "changeDkpValue");
            return (Criteria) this;
        }

        public Criteria andChangeDkpValueLessThan(Integer value) {
            addCriterion("change_dkp_value <", value, "changeDkpValue");
            return (Criteria) this;
        }

        public Criteria andChangeDkpValueLessThanOrEqualTo(Integer value) {
            addCriterion("change_dkp_value <=", value, "changeDkpValue");
            return (Criteria) this;
        }

        public Criteria andChangeDkpValueIn(List<Integer> values) {
            addCriterion("change_dkp_value in", values, "changeDkpValue");
            return (Criteria) this;
        }

        public Criteria andChangeDkpValueNotIn(List<Integer> values) {
            addCriterion("change_dkp_value not in", values, "changeDkpValue");
            return (Criteria) this;
        }

        public Criteria andChangeDkpValueBetween(Integer value1, Integer value2) {
            addCriterion("change_dkp_value between", value1, value2, "changeDkpValue");
            return (Criteria) this;
        }

        public Criteria andChangeDkpValueNotBetween(Integer value1, Integer value2) {
            addCriterion("change_dkp_value not between", value1, value2, "changeDkpValue");
            return (Criteria) this;
        }

        public Criteria andOriginalDkpIsNull() {
            addCriterion("original_dkp is null");
            return (Criteria) this;
        }

        public Criteria andOriginalDkpIsNotNull() {
            addCriterion("original_dkp is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalDkpEqualTo(Integer value) {
            addCriterion("original_dkp =", value, "originalDkp");
            return (Criteria) this;
        }

        public Criteria andOriginalDkpNotEqualTo(Integer value) {
            addCriterion("original_dkp <>", value, "originalDkp");
            return (Criteria) this;
        }

        public Criteria andOriginalDkpGreaterThan(Integer value) {
            addCriterion("original_dkp >", value, "originalDkp");
            return (Criteria) this;
        }

        public Criteria andOriginalDkpGreaterThanOrEqualTo(Integer value) {
            addCriterion("original_dkp >=", value, "originalDkp");
            return (Criteria) this;
        }

        public Criteria andOriginalDkpLessThan(Integer value) {
            addCriterion("original_dkp <", value, "originalDkp");
            return (Criteria) this;
        }

        public Criteria andOriginalDkpLessThanOrEqualTo(Integer value) {
            addCriterion("original_dkp <=", value, "originalDkp");
            return (Criteria) this;
        }

        public Criteria andOriginalDkpIn(List<Integer> values) {
            addCriterion("original_dkp in", values, "originalDkp");
            return (Criteria) this;
        }

        public Criteria andOriginalDkpNotIn(List<Integer> values) {
            addCriterion("original_dkp not in", values, "originalDkp");
            return (Criteria) this;
        }

        public Criteria andOriginalDkpBetween(Integer value1, Integer value2) {
            addCriterion("original_dkp between", value1, value2, "originalDkp");
            return (Criteria) this;
        }

        public Criteria andOriginalDkpNotBetween(Integer value1, Integer value2) {
            addCriterion("original_dkp not between", value1, value2, "originalDkp");
            return (Criteria) this;
        }

        public Criteria andModifiedDkpIsNull() {
            addCriterion("modified_dkp is null");
            return (Criteria) this;
        }

        public Criteria andModifiedDkpIsNotNull() {
            addCriterion("modified_dkp is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedDkpEqualTo(Integer value) {
            addCriterion("modified_dkp =", value, "modifiedDkp");
            return (Criteria) this;
        }

        public Criteria andModifiedDkpNotEqualTo(Integer value) {
            addCriterion("modified_dkp <>", value, "modifiedDkp");
            return (Criteria) this;
        }

        public Criteria andModifiedDkpGreaterThan(Integer value) {
            addCriterion("modified_dkp >", value, "modifiedDkp");
            return (Criteria) this;
        }

        public Criteria andModifiedDkpGreaterThanOrEqualTo(Integer value) {
            addCriterion("modified_dkp >=", value, "modifiedDkp");
            return (Criteria) this;
        }

        public Criteria andModifiedDkpLessThan(Integer value) {
            addCriterion("modified_dkp <", value, "modifiedDkp");
            return (Criteria) this;
        }

        public Criteria andModifiedDkpLessThanOrEqualTo(Integer value) {
            addCriterion("modified_dkp <=", value, "modifiedDkp");
            return (Criteria) this;
        }

        public Criteria andModifiedDkpIn(List<Integer> values) {
            addCriterion("modified_dkp in", values, "modifiedDkp");
            return (Criteria) this;
        }

        public Criteria andModifiedDkpNotIn(List<Integer> values) {
            addCriterion("modified_dkp not in", values, "modifiedDkp");
            return (Criteria) this;
        }

        public Criteria andModifiedDkpBetween(Integer value1, Integer value2) {
            addCriterion("modified_dkp between", value1, value2, "modifiedDkp");
            return (Criteria) this;
        }

        public Criteria andModifiedDkpNotBetween(Integer value1, Integer value2) {
            addCriterion("modified_dkp not between", value1, value2, "modifiedDkp");
            return (Criteria) this;
        }

        public Criteria andChangeMsgIsNull() {
            addCriterion("change_msg is null");
            return (Criteria) this;
        }

        public Criteria andChangeMsgIsNotNull() {
            addCriterion("change_msg is not null");
            return (Criteria) this;
        }

        public Criteria andChangeMsgEqualTo(String value) {
            addCriterion("change_msg =", value, "changeMsg");
            return (Criteria) this;
        }

        public Criteria andChangeMsgNotEqualTo(String value) {
            addCriterion("change_msg <>", value, "changeMsg");
            return (Criteria) this;
        }

        public Criteria andChangeMsgGreaterThan(String value) {
            addCriterion("change_msg >", value, "changeMsg");
            return (Criteria) this;
        }

        public Criteria andChangeMsgGreaterThanOrEqualTo(String value) {
            addCriterion("change_msg >=", value, "changeMsg");
            return (Criteria) this;
        }

        public Criteria andChangeMsgLessThan(String value) {
            addCriterion("change_msg <", value, "changeMsg");
            return (Criteria) this;
        }

        public Criteria andChangeMsgLessThanOrEqualTo(String value) {
            addCriterion("change_msg <=", value, "changeMsg");
            return (Criteria) this;
        }

        public Criteria andChangeMsgLike(String value) {
            addCriterion("change_msg like", value, "changeMsg");
            return (Criteria) this;
        }

        public Criteria andChangeMsgNotLike(String value) {
            addCriterion("change_msg not like", value, "changeMsg");
            return (Criteria) this;
        }

        public Criteria andChangeMsgIn(List<String> values) {
            addCriterion("change_msg in", values, "changeMsg");
            return (Criteria) this;
        }

        public Criteria andChangeMsgNotIn(List<String> values) {
            addCriterion("change_msg not in", values, "changeMsg");
            return (Criteria) this;
        }

        public Criteria andChangeMsgBetween(String value1, String value2) {
            addCriterion("change_msg between", value1, value2, "changeMsg");
            return (Criteria) this;
        }

        public Criteria andChangeMsgNotBetween(String value1, String value2) {
            addCriterion("change_msg not between", value1, value2, "changeMsg");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("operator like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("operator not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("operator not between", value1, value2, "operator");
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