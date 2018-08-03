package com.tenbamboo.bean;

import java.util.ArrayList;
import java.util.List;

public class PoetryErrorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer offset = -1;

    protected Integer limit = -1;

    public PoetryErrorExample() {
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

        public Criteria andErrorIdIsNull() {
            addCriterion("error_id is null");
            return (Criteria) this;
        }

        public Criteria andErrorIdIsNotNull() {
            addCriterion("error_id is not null");
            return (Criteria) this;
        }

        public Criteria andErrorIdEqualTo(String value) {
            addCriterion("error_id =", value, "errorId");
            return (Criteria) this;
        }

        public Criteria andErrorIdNotEqualTo(String value) {
            addCriterion("error_id <>", value, "errorId");
            return (Criteria) this;
        }

        public Criteria andErrorIdGreaterThan(String value) {
            addCriterion("error_id >", value, "errorId");
            return (Criteria) this;
        }

        public Criteria andErrorIdGreaterThanOrEqualTo(String value) {
            addCriterion("error_id >=", value, "errorId");
            return (Criteria) this;
        }

        public Criteria andErrorIdLessThan(String value) {
            addCriterion("error_id <", value, "errorId");
            return (Criteria) this;
        }

        public Criteria andErrorIdLessThanOrEqualTo(String value) {
            addCriterion("error_id <=", value, "errorId");
            return (Criteria) this;
        }

        public Criteria andErrorIdLike(String value) {
            addCriterion("error_id like", value, "errorId");
            return (Criteria) this;
        }

        public Criteria andErrorIdNotLike(String value) {
            addCriterion("error_id not like", value, "errorId");
            return (Criteria) this;
        }

        public Criteria andErrorIdIn(List<String> values) {
            addCriterion("error_id in", values, "errorId");
            return (Criteria) this;
        }

        public Criteria andErrorIdNotIn(List<String> values) {
            addCriterion("error_id not in", values, "errorId");
            return (Criteria) this;
        }

        public Criteria andErrorIdBetween(String value1, String value2) {
            addCriterion("error_id between", value1, value2, "errorId");
            return (Criteria) this;
        }

        public Criteria andErrorIdNotBetween(String value1, String value2) {
            addCriterion("error_id not between", value1, value2, "errorId");
            return (Criteria) this;
        }

        public Criteria andErrorFileNameIsNull() {
            addCriterion("error_file_name is null");
            return (Criteria) this;
        }

        public Criteria andErrorFileNameIsNotNull() {
            addCriterion("error_file_name is not null");
            return (Criteria) this;
        }

        public Criteria andErrorFileNameEqualTo(String value) {
            addCriterion("error_file_name =", value, "errorFileName");
            return (Criteria) this;
        }

        public Criteria andErrorFileNameNotEqualTo(String value) {
            addCriterion("error_file_name <>", value, "errorFileName");
            return (Criteria) this;
        }

        public Criteria andErrorFileNameGreaterThan(String value) {
            addCriterion("error_file_name >", value, "errorFileName");
            return (Criteria) this;
        }

        public Criteria andErrorFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("error_file_name >=", value, "errorFileName");
            return (Criteria) this;
        }

        public Criteria andErrorFileNameLessThan(String value) {
            addCriterion("error_file_name <", value, "errorFileName");
            return (Criteria) this;
        }

        public Criteria andErrorFileNameLessThanOrEqualTo(String value) {
            addCriterion("error_file_name <=", value, "errorFileName");
            return (Criteria) this;
        }

        public Criteria andErrorFileNameLike(String value) {
            addCriterion("error_file_name like", value, "errorFileName");
            return (Criteria) this;
        }

        public Criteria andErrorFileNameNotLike(String value) {
            addCriterion("error_file_name not like", value, "errorFileName");
            return (Criteria) this;
        }

        public Criteria andErrorFileNameIn(List<String> values) {
            addCriterion("error_file_name in", values, "errorFileName");
            return (Criteria) this;
        }

        public Criteria andErrorFileNameNotIn(List<String> values) {
            addCriterion("error_file_name not in", values, "errorFileName");
            return (Criteria) this;
        }

        public Criteria andErrorFileNameBetween(String value1, String value2) {
            addCriterion("error_file_name between", value1, value2, "errorFileName");
            return (Criteria) this;
        }

        public Criteria andErrorFileNameNotBetween(String value1, String value2) {
            addCriterion("error_file_name not between", value1, value2, "errorFileName");
            return (Criteria) this;
        }

        public Criteria andErrorTitleNameIsNull() {
            addCriterion("error_title_name is null");
            return (Criteria) this;
        }

        public Criteria andErrorTitleNameIsNotNull() {
            addCriterion("error_title_name is not null");
            return (Criteria) this;
        }

        public Criteria andErrorTitleNameEqualTo(String value) {
            addCriterion("error_title_name =", value, "errorTitleName");
            return (Criteria) this;
        }

        public Criteria andErrorTitleNameNotEqualTo(String value) {
            addCriterion("error_title_name <>", value, "errorTitleName");
            return (Criteria) this;
        }

        public Criteria andErrorTitleNameGreaterThan(String value) {
            addCriterion("error_title_name >", value, "errorTitleName");
            return (Criteria) this;
        }

        public Criteria andErrorTitleNameGreaterThanOrEqualTo(String value) {
            addCriterion("error_title_name >=", value, "errorTitleName");
            return (Criteria) this;
        }

        public Criteria andErrorTitleNameLessThan(String value) {
            addCriterion("error_title_name <", value, "errorTitleName");
            return (Criteria) this;
        }

        public Criteria andErrorTitleNameLessThanOrEqualTo(String value) {
            addCriterion("error_title_name <=", value, "errorTitleName");
            return (Criteria) this;
        }

        public Criteria andErrorTitleNameLike(String value) {
            addCriterion("error_title_name like", value, "errorTitleName");
            return (Criteria) this;
        }

        public Criteria andErrorTitleNameNotLike(String value) {
            addCriterion("error_title_name not like", value, "errorTitleName");
            return (Criteria) this;
        }

        public Criteria andErrorTitleNameIn(List<String> values) {
            addCriterion("error_title_name in", values, "errorTitleName");
            return (Criteria) this;
        }

        public Criteria andErrorTitleNameNotIn(List<String> values) {
            addCriterion("error_title_name not in", values, "errorTitleName");
            return (Criteria) this;
        }

        public Criteria andErrorTitleNameBetween(String value1, String value2) {
            addCriterion("error_title_name between", value1, value2, "errorTitleName");
            return (Criteria) this;
        }

        public Criteria andErrorTitleNameNotBetween(String value1, String value2) {
            addCriterion("error_title_name not between", value1, value2, "errorTitleName");
            return (Criteria) this;
        }

        public Criteria andErrorMsgIsNull() {
            addCriterion("error_msg is null");
            return (Criteria) this;
        }

        public Criteria andErrorMsgIsNotNull() {
            addCriterion("error_msg is not null");
            return (Criteria) this;
        }

        public Criteria andErrorMsgEqualTo(String value) {
            addCriterion("error_msg =", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgNotEqualTo(String value) {
            addCriterion("error_msg <>", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgGreaterThan(String value) {
            addCriterion("error_msg >", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgGreaterThanOrEqualTo(String value) {
            addCriterion("error_msg >=", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgLessThan(String value) {
            addCriterion("error_msg <", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgLessThanOrEqualTo(String value) {
            addCriterion("error_msg <=", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgLike(String value) {
            addCriterion("error_msg like", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgNotLike(String value) {
            addCriterion("error_msg not like", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgIn(List<String> values) {
            addCriterion("error_msg in", values, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgNotIn(List<String> values) {
            addCriterion("error_msg not in", values, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgBetween(String value1, String value2) {
            addCriterion("error_msg between", value1, value2, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgNotBetween(String value1, String value2) {
            addCriterion("error_msg not between", value1, value2, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andIsSolveIsNull() {
            addCriterion("is_solve is null");
            return (Criteria) this;
        }

        public Criteria andIsSolveIsNotNull() {
            addCriterion("is_solve is not null");
            return (Criteria) this;
        }

        public Criteria andIsSolveEqualTo(String value) {
            addCriterion("is_solve =", value, "isSolve");
            return (Criteria) this;
        }

        public Criteria andIsSolveNotEqualTo(String value) {
            addCriterion("is_solve <>", value, "isSolve");
            return (Criteria) this;
        }

        public Criteria andIsSolveGreaterThan(String value) {
            addCriterion("is_solve >", value, "isSolve");
            return (Criteria) this;
        }

        public Criteria andIsSolveGreaterThanOrEqualTo(String value) {
            addCriterion("is_solve >=", value, "isSolve");
            return (Criteria) this;
        }

        public Criteria andIsSolveLessThan(String value) {
            addCriterion("is_solve <", value, "isSolve");
            return (Criteria) this;
        }

        public Criteria andIsSolveLessThanOrEqualTo(String value) {
            addCriterion("is_solve <=", value, "isSolve");
            return (Criteria) this;
        }

        public Criteria andIsSolveLike(String value) {
            addCriterion("is_solve like", value, "isSolve");
            return (Criteria) this;
        }

        public Criteria andIsSolveNotLike(String value) {
            addCriterion("is_solve not like", value, "isSolve");
            return (Criteria) this;
        }

        public Criteria andIsSolveIn(List<String> values) {
            addCriterion("is_solve in", values, "isSolve");
            return (Criteria) this;
        }

        public Criteria andIsSolveNotIn(List<String> values) {
            addCriterion("is_solve not in", values, "isSolve");
            return (Criteria) this;
        }

        public Criteria andIsSolveBetween(String value1, String value2) {
            addCriterion("is_solve between", value1, value2, "isSolve");
            return (Criteria) this;
        }

        public Criteria andIsSolveNotBetween(String value1, String value2) {
            addCriterion("is_solve not between", value1, value2, "isSolve");
            return (Criteria) this;
        }

        public Criteria andSolveWayIsNull() {
            addCriterion("solve_way is null");
            return (Criteria) this;
        }

        public Criteria andSolveWayIsNotNull() {
            addCriterion("solve_way is not null");
            return (Criteria) this;
        }

        public Criteria andSolveWayEqualTo(String value) {
            addCriterion("solve_way =", value, "solveWay");
            return (Criteria) this;
        }

        public Criteria andSolveWayNotEqualTo(String value) {
            addCriterion("solve_way <>", value, "solveWay");
            return (Criteria) this;
        }

        public Criteria andSolveWayGreaterThan(String value) {
            addCriterion("solve_way >", value, "solveWay");
            return (Criteria) this;
        }

        public Criteria andSolveWayGreaterThanOrEqualTo(String value) {
            addCriterion("solve_way >=", value, "solveWay");
            return (Criteria) this;
        }

        public Criteria andSolveWayLessThan(String value) {
            addCriterion("solve_way <", value, "solveWay");
            return (Criteria) this;
        }

        public Criteria andSolveWayLessThanOrEqualTo(String value) {
            addCriterion("solve_way <=", value, "solveWay");
            return (Criteria) this;
        }

        public Criteria andSolveWayLike(String value) {
            addCriterion("solve_way like", value, "solveWay");
            return (Criteria) this;
        }

        public Criteria andSolveWayNotLike(String value) {
            addCriterion("solve_way not like", value, "solveWay");
            return (Criteria) this;
        }

        public Criteria andSolveWayIn(List<String> values) {
            addCriterion("solve_way in", values, "solveWay");
            return (Criteria) this;
        }

        public Criteria andSolveWayNotIn(List<String> values) {
            addCriterion("solve_way not in", values, "solveWay");
            return (Criteria) this;
        }

        public Criteria andSolveWayBetween(String value1, String value2) {
            addCriterion("solve_way between", value1, value2, "solveWay");
            return (Criteria) this;
        }

        public Criteria andSolveWayNotBetween(String value1, String value2) {
            addCriterion("solve_way not between", value1, value2, "solveWay");
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