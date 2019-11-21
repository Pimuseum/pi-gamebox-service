package com.pi.admin.model.wow;

import java.util.ArrayList;
import java.util.List;

public class WowerInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WowerInfoExample() {
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

        public Criteria andWowerNameIsNull() {
            addCriterion("wower_name is null");
            return (Criteria) this;
        }

        public Criteria andWowerNameIsNotNull() {
            addCriterion("wower_name is not null");
            return (Criteria) this;
        }

        public Criteria andWowerNameEqualTo(String value) {
            addCriterion("wower_name =", value, "wowerName");
            return (Criteria) this;
        }

        public Criteria andWowerNameNotEqualTo(String value) {
            addCriterion("wower_name <>", value, "wowerName");
            return (Criteria) this;
        }

        public Criteria andWowerNameGreaterThan(String value) {
            addCriterion("wower_name >", value, "wowerName");
            return (Criteria) this;
        }

        public Criteria andWowerNameGreaterThanOrEqualTo(String value) {
            addCriterion("wower_name >=", value, "wowerName");
            return (Criteria) this;
        }

        public Criteria andWowerNameLessThan(String value) {
            addCriterion("wower_name <", value, "wowerName");
            return (Criteria) this;
        }

        public Criteria andWowerNameLessThanOrEqualTo(String value) {
            addCriterion("wower_name <=", value, "wowerName");
            return (Criteria) this;
        }

        public Criteria andWowerNameLike(String value) {
            addCriterion("wower_name like", value, "wowerName");
            return (Criteria) this;
        }

        public Criteria andWowerNameNotLike(String value) {
            addCriterion("wower_name not like", value, "wowerName");
            return (Criteria) this;
        }

        public Criteria andWowerNameIn(List<String> values) {
            addCriterion("wower_name in", values, "wowerName");
            return (Criteria) this;
        }

        public Criteria andWowerNameNotIn(List<String> values) {
            addCriterion("wower_name not in", values, "wowerName");
            return (Criteria) this;
        }

        public Criteria andWowerNameBetween(String value1, String value2) {
            addCriterion("wower_name between", value1, value2, "wowerName");
            return (Criteria) this;
        }

        public Criteria andWowerNameNotBetween(String value1, String value2) {
            addCriterion("wower_name not between", value1, value2, "wowerName");
            return (Criteria) this;
        }

        public Criteria andWxUserIdIsNull() {
            addCriterion("wx_user_id is null");
            return (Criteria) this;
        }

        public Criteria andWxUserIdIsNotNull() {
            addCriterion("wx_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andWxUserIdEqualTo(String value) {
            addCriterion("wx_user_id =", value, "wxUserId");
            return (Criteria) this;
        }

        public Criteria andWxUserIdNotEqualTo(String value) {
            addCriterion("wx_user_id <>", value, "wxUserId");
            return (Criteria) this;
        }

        public Criteria andWxUserIdGreaterThan(String value) {
            addCriterion("wx_user_id >", value, "wxUserId");
            return (Criteria) this;
        }

        public Criteria andWxUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("wx_user_id >=", value, "wxUserId");
            return (Criteria) this;
        }

        public Criteria andWxUserIdLessThan(String value) {
            addCriterion("wx_user_id <", value, "wxUserId");
            return (Criteria) this;
        }

        public Criteria andWxUserIdLessThanOrEqualTo(String value) {
            addCriterion("wx_user_id <=", value, "wxUserId");
            return (Criteria) this;
        }

        public Criteria andWxUserIdLike(String value) {
            addCriterion("wx_user_id like", value, "wxUserId");
            return (Criteria) this;
        }

        public Criteria andWxUserIdNotLike(String value) {
            addCriterion("wx_user_id not like", value, "wxUserId");
            return (Criteria) this;
        }

        public Criteria andWxUserIdIn(List<String> values) {
            addCriterion("wx_user_id in", values, "wxUserId");
            return (Criteria) this;
        }

        public Criteria andWxUserIdNotIn(List<String> values) {
            addCriterion("wx_user_id not in", values, "wxUserId");
            return (Criteria) this;
        }

        public Criteria andWxUserIdBetween(String value1, String value2) {
            addCriterion("wx_user_id between", value1, value2, "wxUserId");
            return (Criteria) this;
        }

        public Criteria andWxUserIdNotBetween(String value1, String value2) {
            addCriterion("wx_user_id not between", value1, value2, "wxUserId");
            return (Criteria) this;
        }

        public Criteria andWowerProfessionTypeIsNull() {
            addCriterion("wower_profession_type is null");
            return (Criteria) this;
        }

        public Criteria andWowerProfessionTypeIsNotNull() {
            addCriterion("wower_profession_type is not null");
            return (Criteria) this;
        }

        public Criteria andWowerProfessionTypeEqualTo(String value) {
            addCriterion("wower_profession_type =", value, "wowerProfessionType");
            return (Criteria) this;
        }

        public Criteria andWowerProfessionTypeNotEqualTo(String value) {
            addCriterion("wower_profession_type <>", value, "wowerProfessionType");
            return (Criteria) this;
        }

        public Criteria andWowerProfessionTypeGreaterThan(String value) {
            addCriterion("wower_profession_type >", value, "wowerProfessionType");
            return (Criteria) this;
        }

        public Criteria andWowerProfessionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("wower_profession_type >=", value, "wowerProfessionType");
            return (Criteria) this;
        }

        public Criteria andWowerProfessionTypeLessThan(String value) {
            addCriterion("wower_profession_type <", value, "wowerProfessionType");
            return (Criteria) this;
        }

        public Criteria andWowerProfessionTypeLessThanOrEqualTo(String value) {
            addCriterion("wower_profession_type <=", value, "wowerProfessionType");
            return (Criteria) this;
        }

        public Criteria andWowerProfessionTypeLike(String value) {
            addCriterion("wower_profession_type like", value, "wowerProfessionType");
            return (Criteria) this;
        }

        public Criteria andWowerProfessionTypeNotLike(String value) {
            addCriterion("wower_profession_type not like", value, "wowerProfessionType");
            return (Criteria) this;
        }

        public Criteria andWowerProfessionTypeIn(List<String> values) {
            addCriterion("wower_profession_type in", values, "wowerProfessionType");
            return (Criteria) this;
        }

        public Criteria andWowerProfessionTypeNotIn(List<String> values) {
            addCriterion("wower_profession_type not in", values, "wowerProfessionType");
            return (Criteria) this;
        }

        public Criteria andWowerProfessionTypeBetween(String value1, String value2) {
            addCriterion("wower_profession_type between", value1, value2, "wowerProfessionType");
            return (Criteria) this;
        }

        public Criteria andWowerProfessionTypeNotBetween(String value1, String value2) {
            addCriterion("wower_profession_type not between", value1, value2, "wowerProfessionType");
            return (Criteria) this;
        }

        public Criteria andWowerEquipmentLevelIsNull() {
            addCriterion("wower_equipment_level is null");
            return (Criteria) this;
        }

        public Criteria andWowerEquipmentLevelIsNotNull() {
            addCriterion("wower_equipment_level is not null");
            return (Criteria) this;
        }

        public Criteria andWowerEquipmentLevelEqualTo(Integer value) {
            addCriterion("wower_equipment_level =", value, "wowerEquipmentLevel");
            return (Criteria) this;
        }

        public Criteria andWowerEquipmentLevelNotEqualTo(Integer value) {
            addCriterion("wower_equipment_level <>", value, "wowerEquipmentLevel");
            return (Criteria) this;
        }

        public Criteria andWowerEquipmentLevelGreaterThan(Integer value) {
            addCriterion("wower_equipment_level >", value, "wowerEquipmentLevel");
            return (Criteria) this;
        }

        public Criteria andWowerEquipmentLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("wower_equipment_level >=", value, "wowerEquipmentLevel");
            return (Criteria) this;
        }

        public Criteria andWowerEquipmentLevelLessThan(Integer value) {
            addCriterion("wower_equipment_level <", value, "wowerEquipmentLevel");
            return (Criteria) this;
        }

        public Criteria andWowerEquipmentLevelLessThanOrEqualTo(Integer value) {
            addCriterion("wower_equipment_level <=", value, "wowerEquipmentLevel");
            return (Criteria) this;
        }

        public Criteria andWowerEquipmentLevelIn(List<Integer> values) {
            addCriterion("wower_equipment_level in", values, "wowerEquipmentLevel");
            return (Criteria) this;
        }

        public Criteria andWowerEquipmentLevelNotIn(List<Integer> values) {
            addCriterion("wower_equipment_level not in", values, "wowerEquipmentLevel");
            return (Criteria) this;
        }

        public Criteria andWowerEquipmentLevelBetween(Integer value1, Integer value2) {
            addCriterion("wower_equipment_level between", value1, value2, "wowerEquipmentLevel");
            return (Criteria) this;
        }

        public Criteria andWowerEquipmentLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("wower_equipment_level not between", value1, value2, "wowerEquipmentLevel");
            return (Criteria) this;
        }

        public Criteria andWowerHeadPicIsNull() {
            addCriterion("wower_head_pic is null");
            return (Criteria) this;
        }

        public Criteria andWowerHeadPicIsNotNull() {
            addCriterion("wower_head_pic is not null");
            return (Criteria) this;
        }

        public Criteria andWowerHeadPicEqualTo(String value) {
            addCriterion("wower_head_pic =", value, "wowerHeadPic");
            return (Criteria) this;
        }

        public Criteria andWowerHeadPicNotEqualTo(String value) {
            addCriterion("wower_head_pic <>", value, "wowerHeadPic");
            return (Criteria) this;
        }

        public Criteria andWowerHeadPicGreaterThan(String value) {
            addCriterion("wower_head_pic >", value, "wowerHeadPic");
            return (Criteria) this;
        }

        public Criteria andWowerHeadPicGreaterThanOrEqualTo(String value) {
            addCriterion("wower_head_pic >=", value, "wowerHeadPic");
            return (Criteria) this;
        }

        public Criteria andWowerHeadPicLessThan(String value) {
            addCriterion("wower_head_pic <", value, "wowerHeadPic");
            return (Criteria) this;
        }

        public Criteria andWowerHeadPicLessThanOrEqualTo(String value) {
            addCriterion("wower_head_pic <=", value, "wowerHeadPic");
            return (Criteria) this;
        }

        public Criteria andWowerHeadPicLike(String value) {
            addCriterion("wower_head_pic like", value, "wowerHeadPic");
            return (Criteria) this;
        }

        public Criteria andWowerHeadPicNotLike(String value) {
            addCriterion("wower_head_pic not like", value, "wowerHeadPic");
            return (Criteria) this;
        }

        public Criteria andWowerHeadPicIn(List<String> values) {
            addCriterion("wower_head_pic in", values, "wowerHeadPic");
            return (Criteria) this;
        }

        public Criteria andWowerHeadPicNotIn(List<String> values) {
            addCriterion("wower_head_pic not in", values, "wowerHeadPic");
            return (Criteria) this;
        }

        public Criteria andWowerHeadPicBetween(String value1, String value2) {
            addCriterion("wower_head_pic between", value1, value2, "wowerHeadPic");
            return (Criteria) this;
        }

        public Criteria andWowerHeadPicNotBetween(String value1, String value2) {
            addCriterion("wower_head_pic not between", value1, value2, "wowerHeadPic");
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