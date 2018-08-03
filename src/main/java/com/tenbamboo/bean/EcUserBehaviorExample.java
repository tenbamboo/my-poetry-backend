package com.tenbamboo.bean;

import java.util.ArrayList;
import java.util.List;

public class EcUserBehaviorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer offset = -1;

    protected Integer limit = -1;

    public EcUserBehaviorExample() {
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

    public void setOffset(Integer offset) {
        this.offset=offset;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setLimit(Integer limit) {
        this.limit=limit;
    }

    public Integer getLimit() {
        return limit;
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

        public Criteria andBehaviorIdIsNull() {
            addCriterion("behavior_id is null");
            return (Criteria) this;
        }

        public Criteria andBehaviorIdIsNotNull() {
            addCriterion("behavior_id is not null");
            return (Criteria) this;
        }

        public Criteria andBehaviorIdEqualTo(Integer value) {
            addCriterion("behavior_id =", value, "behaviorId");
            return (Criteria) this;
        }

        public Criteria andBehaviorIdNotEqualTo(Integer value) {
            addCriterion("behavior_id <>", value, "behaviorId");
            return (Criteria) this;
        }

        public Criteria andBehaviorIdGreaterThan(Integer value) {
            addCriterion("behavior_id >", value, "behaviorId");
            return (Criteria) this;
        }

        public Criteria andBehaviorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("behavior_id >=", value, "behaviorId");
            return (Criteria) this;
        }

        public Criteria andBehaviorIdLessThan(Integer value) {
            addCriterion("behavior_id <", value, "behaviorId");
            return (Criteria) this;
        }

        public Criteria andBehaviorIdLessThanOrEqualTo(Integer value) {
            addCriterion("behavior_id <=", value, "behaviorId");
            return (Criteria) this;
        }

        public Criteria andBehaviorIdIn(List<Integer> values) {
            addCriterion("behavior_id in", values, "behaviorId");
            return (Criteria) this;
        }

        public Criteria andBehaviorIdNotIn(List<Integer> values) {
            addCriterion("behavior_id not in", values, "behaviorId");
            return (Criteria) this;
        }

        public Criteria andBehaviorIdBetween(Integer value1, Integer value2) {
            addCriterion("behavior_id between", value1, value2, "behaviorId");
            return (Criteria) this;
        }

        public Criteria andBehaviorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("behavior_id not between", value1, value2, "behaviorId");
            return (Criteria) this;
        }

        public Criteria andBehaviorTypeIsNull() {
            addCriterion("behavior_type is null");
            return (Criteria) this;
        }

        public Criteria andBehaviorTypeIsNotNull() {
            addCriterion("behavior_type is not null");
            return (Criteria) this;
        }

        public Criteria andBehaviorTypeEqualTo(String value) {
            addCriterion("behavior_type =", value, "behaviorType");
            return (Criteria) this;
        }

        public Criteria andBehaviorTypeNotEqualTo(String value) {
            addCriterion("behavior_type <>", value, "behaviorType");
            return (Criteria) this;
        }

        public Criteria andBehaviorTypeGreaterThan(String value) {
            addCriterion("behavior_type >", value, "behaviorType");
            return (Criteria) this;
        }

        public Criteria andBehaviorTypeGreaterThanOrEqualTo(String value) {
            addCriterion("behavior_type >=", value, "behaviorType");
            return (Criteria) this;
        }

        public Criteria andBehaviorTypeLessThan(String value) {
            addCriterion("behavior_type <", value, "behaviorType");
            return (Criteria) this;
        }

        public Criteria andBehaviorTypeLessThanOrEqualTo(String value) {
            addCriterion("behavior_type <=", value, "behaviorType");
            return (Criteria) this;
        }

        public Criteria andBehaviorTypeLike(String value) {
            addCriterion("behavior_type like", value, "behaviorType");
            return (Criteria) this;
        }

        public Criteria andBehaviorTypeNotLike(String value) {
            addCriterion("behavior_type not like", value, "behaviorType");
            return (Criteria) this;
        }

        public Criteria andBehaviorTypeIn(List<String> values) {
            addCriterion("behavior_type in", values, "behaviorType");
            return (Criteria) this;
        }

        public Criteria andBehaviorTypeNotIn(List<String> values) {
            addCriterion("behavior_type not in", values, "behaviorType");
            return (Criteria) this;
        }

        public Criteria andBehaviorTypeBetween(String value1, String value2) {
            addCriterion("behavior_type between", value1, value2, "behaviorType");
            return (Criteria) this;
        }

        public Criteria andBehaviorTypeNotBetween(String value1, String value2) {
            addCriterion("behavior_type not between", value1, value2, "behaviorType");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andOperIdIsNull() {
            addCriterion("oper_id is null");
            return (Criteria) this;
        }

        public Criteria andOperIdIsNotNull() {
            addCriterion("oper_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperIdEqualTo(String value) {
            addCriterion("oper_id =", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdNotEqualTo(String value) {
            addCriterion("oper_id <>", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdGreaterThan(String value) {
            addCriterion("oper_id >", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdGreaterThanOrEqualTo(String value) {
            addCriterion("oper_id >=", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdLessThan(String value) {
            addCriterion("oper_id <", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdLessThanOrEqualTo(String value) {
            addCriterion("oper_id <=", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdLike(String value) {
            addCriterion("oper_id like", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdNotLike(String value) {
            addCriterion("oper_id not like", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdIn(List<String> values) {
            addCriterion("oper_id in", values, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdNotIn(List<String> values) {
            addCriterion("oper_id not in", values, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdBetween(String value1, String value2) {
            addCriterion("oper_id between", value1, value2, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdNotBetween(String value1, String value2) {
            addCriterion("oper_id not between", value1, value2, "operId");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(String value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(String value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(String value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(String value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(String value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(String value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLike(String value) {
            addCriterion("create_date like", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotLike(String value) {
            addCriterion("create_date not like", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<String> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<String> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(String value1, String value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(String value1, String value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
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