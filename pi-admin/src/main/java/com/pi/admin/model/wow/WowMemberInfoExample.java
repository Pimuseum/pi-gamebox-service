package com.pi.admin.model.wow;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WowMemberInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WowMemberInfoExample() {
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

        public Criteria andTeamIdIsNull() {
            addCriterion("team_id is null");
            return (Criteria) this;
        }

        public Criteria andTeamIdIsNotNull() {
            addCriterion("team_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeamIdEqualTo(Integer value) {
            addCriterion("team_id =", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotEqualTo(Integer value) {
            addCriterion("team_id <>", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdGreaterThan(Integer value) {
            addCriterion("team_id >", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("team_id >=", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdLessThan(Integer value) {
            addCriterion("team_id <", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdLessThanOrEqualTo(Integer value) {
            addCriterion("team_id <=", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdIn(List<Integer> values) {
            addCriterion("team_id in", values, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotIn(List<Integer> values) {
            addCriterion("team_id not in", values, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdBetween(Integer value1, Integer value2) {
            addCriterion("team_id between", value1, value2, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotBetween(Integer value1, Integer value2) {
            addCriterion("team_id not between", value1, value2, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamDutyIsNull() {
            addCriterion("team_duty is null");
            return (Criteria) this;
        }

        public Criteria andTeamDutyIsNotNull() {
            addCriterion("team_duty is not null");
            return (Criteria) this;
        }

        public Criteria andTeamDutyEqualTo(String value) {
            addCriterion("team_duty =", value, "teamDuty");
            return (Criteria) this;
        }

        public Criteria andTeamDutyNotEqualTo(String value) {
            addCriterion("team_duty <>", value, "teamDuty");
            return (Criteria) this;
        }

        public Criteria andTeamDutyGreaterThan(String value) {
            addCriterion("team_duty >", value, "teamDuty");
            return (Criteria) this;
        }

        public Criteria andTeamDutyGreaterThanOrEqualTo(String value) {
            addCriterion("team_duty >=", value, "teamDuty");
            return (Criteria) this;
        }

        public Criteria andTeamDutyLessThan(String value) {
            addCriterion("team_duty <", value, "teamDuty");
            return (Criteria) this;
        }

        public Criteria andTeamDutyLessThanOrEqualTo(String value) {
            addCriterion("team_duty <=", value, "teamDuty");
            return (Criteria) this;
        }

        public Criteria andTeamDutyLike(String value) {
            addCriterion("team_duty like", value, "teamDuty");
            return (Criteria) this;
        }

        public Criteria andTeamDutyNotLike(String value) {
            addCriterion("team_duty not like", value, "teamDuty");
            return (Criteria) this;
        }

        public Criteria andTeamDutyIn(List<String> values) {
            addCriterion("team_duty in", values, "teamDuty");
            return (Criteria) this;
        }

        public Criteria andTeamDutyNotIn(List<String> values) {
            addCriterion("team_duty not in", values, "teamDuty");
            return (Criteria) this;
        }

        public Criteria andTeamDutyBetween(String value1, String value2) {
            addCriterion("team_duty between", value1, value2, "teamDuty");
            return (Criteria) this;
        }

        public Criteria andTeamDutyNotBetween(String value1, String value2) {
            addCriterion("team_duty not between", value1, value2, "teamDuty");
            return (Criteria) this;
        }

        public Criteria andDkpIsNull() {
            addCriterion("dkp is null");
            return (Criteria) this;
        }

        public Criteria andDkpIsNotNull() {
            addCriterion("dkp is not null");
            return (Criteria) this;
        }

        public Criteria andDkpEqualTo(Integer value) {
            addCriterion("dkp =", value, "dkp");
            return (Criteria) this;
        }

        public Criteria andDkpNotEqualTo(Integer value) {
            addCriterion("dkp <>", value, "dkp");
            return (Criteria) this;
        }

        public Criteria andDkpGreaterThan(Integer value) {
            addCriterion("dkp >", value, "dkp");
            return (Criteria) this;
        }

        public Criteria andDkpGreaterThanOrEqualTo(Integer value) {
            addCriterion("dkp >=", value, "dkp");
            return (Criteria) this;
        }

        public Criteria andDkpLessThan(Integer value) {
            addCriterion("dkp <", value, "dkp");
            return (Criteria) this;
        }

        public Criteria andDkpLessThanOrEqualTo(Integer value) {
            addCriterion("dkp <=", value, "dkp");
            return (Criteria) this;
        }

        public Criteria andDkpIn(List<Integer> values) {
            addCriterion("dkp in", values, "dkp");
            return (Criteria) this;
        }

        public Criteria andDkpNotIn(List<Integer> values) {
            addCriterion("dkp not in", values, "dkp");
            return (Criteria) this;
        }

        public Criteria andDkpBetween(Integer value1, Integer value2) {
            addCriterion("dkp between", value1, value2, "dkp");
            return (Criteria) this;
        }

        public Criteria andDkpNotBetween(Integer value1, Integer value2) {
            addCriterion("dkp not between", value1, value2, "dkp");
            return (Criteria) this;
        }

        public Criteria andRecentlyGroupIdIsNull() {
            addCriterion("recently_group_id is null");
            return (Criteria) this;
        }

        public Criteria andRecentlyGroupIdIsNotNull() {
            addCriterion("recently_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecentlyGroupIdEqualTo(Long value) {
            addCriterion("recently_group_id =", value, "recentlyGroupId");
            return (Criteria) this;
        }

        public Criteria andRecentlyGroupIdNotEqualTo(Long value) {
            addCriterion("recently_group_id <>", value, "recentlyGroupId");
            return (Criteria) this;
        }

        public Criteria andRecentlyGroupIdGreaterThan(Long value) {
            addCriterion("recently_group_id >", value, "recentlyGroupId");
            return (Criteria) this;
        }

        public Criteria andRecentlyGroupIdGreaterThanOrEqualTo(Long value) {
            addCriterion("recently_group_id >=", value, "recentlyGroupId");
            return (Criteria) this;
        }

        public Criteria andRecentlyGroupIdLessThan(Long value) {
            addCriterion("recently_group_id <", value, "recentlyGroupId");
            return (Criteria) this;
        }

        public Criteria andRecentlyGroupIdLessThanOrEqualTo(Long value) {
            addCriterion("recently_group_id <=", value, "recentlyGroupId");
            return (Criteria) this;
        }

        public Criteria andRecentlyGroupIdIn(List<Long> values) {
            addCriterion("recently_group_id in", values, "recentlyGroupId");
            return (Criteria) this;
        }

        public Criteria andRecentlyGroupIdNotIn(List<Long> values) {
            addCriterion("recently_group_id not in", values, "recentlyGroupId");
            return (Criteria) this;
        }

        public Criteria andRecentlyGroupIdBetween(Long value1, Long value2) {
            addCriterion("recently_group_id between", value1, value2, "recentlyGroupId");
            return (Criteria) this;
        }

        public Criteria andRecentlyGroupIdNotBetween(Long value1, Long value2) {
            addCriterion("recently_group_id not between", value1, value2, "recentlyGroupId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andInviterIdIsNull() {
            addCriterion("inviter_id is null");
            return (Criteria) this;
        }

        public Criteria andInviterIdIsNotNull() {
            addCriterion("inviter_id is not null");
            return (Criteria) this;
        }

        public Criteria andInviterIdEqualTo(Long value) {
            addCriterion("inviter_id =", value, "inviterId");
            return (Criteria) this;
        }

        public Criteria andInviterIdNotEqualTo(Long value) {
            addCriterion("inviter_id <>", value, "inviterId");
            return (Criteria) this;
        }

        public Criteria andInviterIdGreaterThan(Long value) {
            addCriterion("inviter_id >", value, "inviterId");
            return (Criteria) this;
        }

        public Criteria andInviterIdGreaterThanOrEqualTo(Long value) {
            addCriterion("inviter_id >=", value, "inviterId");
            return (Criteria) this;
        }

        public Criteria andInviterIdLessThan(Long value) {
            addCriterion("inviter_id <", value, "inviterId");
            return (Criteria) this;
        }

        public Criteria andInviterIdLessThanOrEqualTo(Long value) {
            addCriterion("inviter_id <=", value, "inviterId");
            return (Criteria) this;
        }

        public Criteria andInviterIdIn(List<Long> values) {
            addCriterion("inviter_id in", values, "inviterId");
            return (Criteria) this;
        }

        public Criteria andInviterIdNotIn(List<Long> values) {
            addCriterion("inviter_id not in", values, "inviterId");
            return (Criteria) this;
        }

        public Criteria andInviterIdBetween(Long value1, Long value2) {
            addCriterion("inviter_id between", value1, value2, "inviterId");
            return (Criteria) this;
        }

        public Criteria andInviterIdNotBetween(Long value1, Long value2) {
            addCriterion("inviter_id not between", value1, value2, "inviterId");
            return (Criteria) this;
        }

        public Criteria andGroupNumIsNull() {
            addCriterion("group_num is null");
            return (Criteria) this;
        }

        public Criteria andGroupNumIsNotNull() {
            addCriterion("group_num is not null");
            return (Criteria) this;
        }

        public Criteria andGroupNumEqualTo(Integer value) {
            addCriterion("group_num =", value, "groupNum");
            return (Criteria) this;
        }

        public Criteria andGroupNumNotEqualTo(Integer value) {
            addCriterion("group_num <>", value, "groupNum");
            return (Criteria) this;
        }

        public Criteria andGroupNumGreaterThan(Integer value) {
            addCriterion("group_num >", value, "groupNum");
            return (Criteria) this;
        }

        public Criteria andGroupNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("group_num >=", value, "groupNum");
            return (Criteria) this;
        }

        public Criteria andGroupNumLessThan(Integer value) {
            addCriterion("group_num <", value, "groupNum");
            return (Criteria) this;
        }

        public Criteria andGroupNumLessThanOrEqualTo(Integer value) {
            addCriterion("group_num <=", value, "groupNum");
            return (Criteria) this;
        }

        public Criteria andGroupNumIn(List<Integer> values) {
            addCriterion("group_num in", values, "groupNum");
            return (Criteria) this;
        }

        public Criteria andGroupNumNotIn(List<Integer> values) {
            addCriterion("group_num not in", values, "groupNum");
            return (Criteria) this;
        }

        public Criteria andGroupNumBetween(Integer value1, Integer value2) {
            addCriterion("group_num between", value1, value2, "groupNum");
            return (Criteria) this;
        }

        public Criteria andGroupNumNotBetween(Integer value1, Integer value2) {
            addCriterion("group_num not between", value1, value2, "groupNum");
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