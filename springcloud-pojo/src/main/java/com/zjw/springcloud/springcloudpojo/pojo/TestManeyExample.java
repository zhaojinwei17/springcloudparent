package com.zjw.springcloud.springcloudpojo.pojo;

import java.util.ArrayList;
import java.util.List;

public class TestManeyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TestManeyExample() {
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

        public Criteria andManeyIdIsNull() {
            addCriterion("maney_id is null");
            return (Criteria) this;
        }

        public Criteria andManeyIdIsNotNull() {
            addCriterion("maney_id is not null");
            return (Criteria) this;
        }

        public Criteria andManeyIdEqualTo(Long value) {
            addCriterion("maney_id =", value, "maneyId");
            return (Criteria) this;
        }

        public Criteria andManeyIdNotEqualTo(Long value) {
            addCriterion("maney_id <>", value, "maneyId");
            return (Criteria) this;
        }

        public Criteria andManeyIdGreaterThan(Long value) {
            addCriterion("maney_id >", value, "maneyId");
            return (Criteria) this;
        }

        public Criteria andManeyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("maney_id >=", value, "maneyId");
            return (Criteria) this;
        }

        public Criteria andManeyIdLessThan(Long value) {
            addCriterion("maney_id <", value, "maneyId");
            return (Criteria) this;
        }

        public Criteria andManeyIdLessThanOrEqualTo(Long value) {
            addCriterion("maney_id <=", value, "maneyId");
            return (Criteria) this;
        }

        public Criteria andManeyIdIn(List<Long> values) {
            addCriterion("maney_id in", values, "maneyId");
            return (Criteria) this;
        }

        public Criteria andManeyIdNotIn(List<Long> values) {
            addCriterion("maney_id not in", values, "maneyId");
            return (Criteria) this;
        }

        public Criteria andManeyIdBetween(Long value1, Long value2) {
            addCriterion("maney_id between", value1, value2, "maneyId");
            return (Criteria) this;
        }

        public Criteria andManeyIdNotBetween(Long value1, Long value2) {
            addCriterion("maney_id not between", value1, value2, "maneyId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andOneIdIsNull() {
            addCriterion("one_id is null");
            return (Criteria) this;
        }

        public Criteria andOneIdIsNotNull() {
            addCriterion("one_id is not null");
            return (Criteria) this;
        }

        public Criteria andOneIdEqualTo(Long value) {
            addCriterion("one_id =", value, "oneId");
            return (Criteria) this;
        }

        public Criteria andOneIdNotEqualTo(Long value) {
            addCriterion("one_id <>", value, "oneId");
            return (Criteria) this;
        }

        public Criteria andOneIdGreaterThan(Long value) {
            addCriterion("one_id >", value, "oneId");
            return (Criteria) this;
        }

        public Criteria andOneIdGreaterThanOrEqualTo(Long value) {
            addCriterion("one_id >=", value, "oneId");
            return (Criteria) this;
        }

        public Criteria andOneIdLessThan(Long value) {
            addCriterion("one_id <", value, "oneId");
            return (Criteria) this;
        }

        public Criteria andOneIdLessThanOrEqualTo(Long value) {
            addCriterion("one_id <=", value, "oneId");
            return (Criteria) this;
        }

        public Criteria andOneIdIn(List<Long> values) {
            addCriterion("one_id in", values, "oneId");
            return (Criteria) this;
        }

        public Criteria andOneIdNotIn(List<Long> values) {
            addCriterion("one_id not in", values, "oneId");
            return (Criteria) this;
        }

        public Criteria andOneIdBetween(Long value1, Long value2) {
            addCriterion("one_id between", value1, value2, "oneId");
            return (Criteria) this;
        }

        public Criteria andOneIdNotBetween(Long value1, Long value2) {
            addCriterion("one_id not between", value1, value2, "oneId");
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