package com.tenbamboo.bean;

import java.util.ArrayList;
import java.util.List;

public class PoetryTagsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer offset = -1;

    protected Integer limit = -1;

    public PoetryTagsExample() {
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

        public Criteria andTagsIdIsNull() {
            addCriterion("tags_id is null");
            return (Criteria) this;
        }

        public Criteria andTagsIdIsNotNull() {
            addCriterion("tags_id is not null");
            return (Criteria) this;
        }

        public Criteria andTagsIdEqualTo(String value) {
            addCriterion("tags_id =", value, "tagsId");
            return (Criteria) this;
        }

        public Criteria andTagsIdNotEqualTo(String value) {
            addCriterion("tags_id <>", value, "tagsId");
            return (Criteria) this;
        }

        public Criteria andTagsIdGreaterThan(String value) {
            addCriterion("tags_id >", value, "tagsId");
            return (Criteria) this;
        }

        public Criteria andTagsIdGreaterThanOrEqualTo(String value) {
            addCriterion("tags_id >=", value, "tagsId");
            return (Criteria) this;
        }

        public Criteria andTagsIdLessThan(String value) {
            addCriterion("tags_id <", value, "tagsId");
            return (Criteria) this;
        }

        public Criteria andTagsIdLessThanOrEqualTo(String value) {
            addCriterion("tags_id <=", value, "tagsId");
            return (Criteria) this;
        }

        public Criteria andTagsIdLike(String value) {
            addCriterion("tags_id like", value, "tagsId");
            return (Criteria) this;
        }

        public Criteria andTagsIdNotLike(String value) {
            addCriterion("tags_id not like", value, "tagsId");
            return (Criteria) this;
        }

        public Criteria andTagsIdIn(List<String> values) {
            addCriterion("tags_id in", values, "tagsId");
            return (Criteria) this;
        }

        public Criteria andTagsIdNotIn(List<String> values) {
            addCriterion("tags_id not in", values, "tagsId");
            return (Criteria) this;
        }

        public Criteria andTagsIdBetween(String value1, String value2) {
            addCriterion("tags_id between", value1, value2, "tagsId");
            return (Criteria) this;
        }

        public Criteria andTagsIdNotBetween(String value1, String value2) {
            addCriterion("tags_id not between", value1, value2, "tagsId");
            return (Criteria) this;
        }

        public Criteria andTagsNameIsNull() {
            addCriterion("tags_name is null");
            return (Criteria) this;
        }

        public Criteria andTagsNameIsNotNull() {
            addCriterion("tags_name is not null");
            return (Criteria) this;
        }

        public Criteria andTagsNameEqualTo(String value) {
            addCriterion("tags_name =", value, "tagsName");
            return (Criteria) this;
        }

        public Criteria andTagsNameNotEqualTo(String value) {
            addCriterion("tags_name <>", value, "tagsName");
            return (Criteria) this;
        }

        public Criteria andTagsNameGreaterThan(String value) {
            addCriterion("tags_name >", value, "tagsName");
            return (Criteria) this;
        }

        public Criteria andTagsNameGreaterThanOrEqualTo(String value) {
            addCriterion("tags_name >=", value, "tagsName");
            return (Criteria) this;
        }

        public Criteria andTagsNameLessThan(String value) {
            addCriterion("tags_name <", value, "tagsName");
            return (Criteria) this;
        }

        public Criteria andTagsNameLessThanOrEqualTo(String value) {
            addCriterion("tags_name <=", value, "tagsName");
            return (Criteria) this;
        }

        public Criteria andTagsNameLike(String value) {
            addCriterion("tags_name like", value, "tagsName");
            return (Criteria) this;
        }

        public Criteria andTagsNameNotLike(String value) {
            addCriterion("tags_name not like", value, "tagsName");
            return (Criteria) this;
        }

        public Criteria andTagsNameIn(List<String> values) {
            addCriterion("tags_name in", values, "tagsName");
            return (Criteria) this;
        }

        public Criteria andTagsNameNotIn(List<String> values) {
            addCriterion("tags_name not in", values, "tagsName");
            return (Criteria) this;
        }

        public Criteria andTagsNameBetween(String value1, String value2) {
            addCriterion("tags_name between", value1, value2, "tagsName");
            return (Criteria) this;
        }

        public Criteria andTagsNameNotBetween(String value1, String value2) {
            addCriterion("tags_name not between", value1, value2, "tagsName");
            return (Criteria) this;
        }

        public Criteria andTagsTypeIsNull() {
            addCriterion("tags_type is null");
            return (Criteria) this;
        }

        public Criteria andTagsTypeIsNotNull() {
            addCriterion("tags_type is not null");
            return (Criteria) this;
        }

        public Criteria andTagsTypeEqualTo(String value) {
            addCriterion("tags_type =", value, "tagsType");
            return (Criteria) this;
        }

        public Criteria andTagsTypeNotEqualTo(String value) {
            addCriterion("tags_type <>", value, "tagsType");
            return (Criteria) this;
        }

        public Criteria andTagsTypeGreaterThan(String value) {
            addCriterion("tags_type >", value, "tagsType");
            return (Criteria) this;
        }

        public Criteria andTagsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("tags_type >=", value, "tagsType");
            return (Criteria) this;
        }

        public Criteria andTagsTypeLessThan(String value) {
            addCriterion("tags_type <", value, "tagsType");
            return (Criteria) this;
        }

        public Criteria andTagsTypeLessThanOrEqualTo(String value) {
            addCriterion("tags_type <=", value, "tagsType");
            return (Criteria) this;
        }

        public Criteria andTagsTypeLike(String value) {
            addCriterion("tags_type like", value, "tagsType");
            return (Criteria) this;
        }

        public Criteria andTagsTypeNotLike(String value) {
            addCriterion("tags_type not like", value, "tagsType");
            return (Criteria) this;
        }

        public Criteria andTagsTypeIn(List<String> values) {
            addCriterion("tags_type in", values, "tagsType");
            return (Criteria) this;
        }

        public Criteria andTagsTypeNotIn(List<String> values) {
            addCriterion("tags_type not in", values, "tagsType");
            return (Criteria) this;
        }

        public Criteria andTagsTypeBetween(String value1, String value2) {
            addCriterion("tags_type between", value1, value2, "tagsType");
            return (Criteria) this;
        }

        public Criteria andTagsTypeNotBetween(String value1, String value2) {
            addCriterion("tags_type not between", value1, value2, "tagsType");
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

        public Criteria andBaseIdIsNull() {
            addCriterion("base_id is null");
            return (Criteria) this;
        }

        public Criteria andBaseIdIsNotNull() {
            addCriterion("base_id is not null");
            return (Criteria) this;
        }

        public Criteria andBaseIdEqualTo(String value) {
            addCriterion("base_id =", value, "baseId");
            return (Criteria) this;
        }

        public Criteria andBaseIdNotEqualTo(String value) {
            addCriterion("base_id <>", value, "baseId");
            return (Criteria) this;
        }

        public Criteria andBaseIdGreaterThan(String value) {
            addCriterion("base_id >", value, "baseId");
            return (Criteria) this;
        }

        public Criteria andBaseIdGreaterThanOrEqualTo(String value) {
            addCriterion("base_id >=", value, "baseId");
            return (Criteria) this;
        }

        public Criteria andBaseIdLessThan(String value) {
            addCriterion("base_id <", value, "baseId");
            return (Criteria) this;
        }

        public Criteria andBaseIdLessThanOrEqualTo(String value) {
            addCriterion("base_id <=", value, "baseId");
            return (Criteria) this;
        }

        public Criteria andBaseIdLike(String value) {
            addCriterion("base_id like", value, "baseId");
            return (Criteria) this;
        }

        public Criteria andBaseIdNotLike(String value) {
            addCriterion("base_id not like", value, "baseId");
            return (Criteria) this;
        }

        public Criteria andBaseIdIn(List<String> values) {
            addCriterion("base_id in", values, "baseId");
            return (Criteria) this;
        }

        public Criteria andBaseIdNotIn(List<String> values) {
            addCriterion("base_id not in", values, "baseId");
            return (Criteria) this;
        }

        public Criteria andBaseIdBetween(String value1, String value2) {
            addCriterion("base_id between", value1, value2, "baseId");
            return (Criteria) this;
        }

        public Criteria andBaseIdNotBetween(String value1, String value2) {
            addCriterion("base_id not between", value1, value2, "baseId");
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