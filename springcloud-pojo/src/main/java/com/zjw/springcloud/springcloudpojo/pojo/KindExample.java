package com.zjw.springcloud.springcloudpojo.pojo;

import java.util.ArrayList;
import java.util.List;

public class KindExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KindExample() {
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

        public Criteria andKindidIsNull() {
            addCriterion("kindID is null");
            return (Criteria) this;
        }

        public Criteria andKindidIsNotNull() {
            addCriterion("kindID is not null");
            return (Criteria) this;
        }

        public Criteria andKindidEqualTo(Integer value) {
            addCriterion("kindID =", value, "kindid");
            return (Criteria) this;
        }

        public Criteria andKindidNotEqualTo(Integer value) {
            addCriterion("kindID <>", value, "kindid");
            return (Criteria) this;
        }

        public Criteria andKindidGreaterThan(Integer value) {
            addCriterion("kindID >", value, "kindid");
            return (Criteria) this;
        }

        public Criteria andKindidGreaterThanOrEqualTo(Integer value) {
            addCriterion("kindID >=", value, "kindid");
            return (Criteria) this;
        }

        public Criteria andKindidLessThan(Integer value) {
            addCriterion("kindID <", value, "kindid");
            return (Criteria) this;
        }

        public Criteria andKindidLessThanOrEqualTo(Integer value) {
            addCriterion("kindID <=", value, "kindid");
            return (Criteria) this;
        }

        public Criteria andKindidIn(List<Integer> values) {
            addCriterion("kindID in", values, "kindid");
            return (Criteria) this;
        }

        public Criteria andKindidNotIn(List<Integer> values) {
            addCriterion("kindID not in", values, "kindid");
            return (Criteria) this;
        }

        public Criteria andKindidBetween(Integer value1, Integer value2) {
            addCriterion("kindID between", value1, value2, "kindid");
            return (Criteria) this;
        }

        public Criteria andKindidNotBetween(Integer value1, Integer value2) {
            addCriterion("kindID not between", value1, value2, "kindid");
            return (Criteria) this;
        }

        public Criteria andKindnameIsNull() {
            addCriterion("kindName is null");
            return (Criteria) this;
        }

        public Criteria andKindnameIsNotNull() {
            addCriterion("kindName is not null");
            return (Criteria) this;
        }

        public Criteria andKindnameEqualTo(String value) {
            addCriterion("kindName =", value, "kindname");
            return (Criteria) this;
        }

        public Criteria andKindnameNotEqualTo(String value) {
            addCriterion("kindName <>", value, "kindname");
            return (Criteria) this;
        }

        public Criteria andKindnameGreaterThan(String value) {
            addCriterion("kindName >", value, "kindname");
            return (Criteria) this;
        }

        public Criteria andKindnameGreaterThanOrEqualTo(String value) {
            addCriterion("kindName >=", value, "kindname");
            return (Criteria) this;
        }

        public Criteria andKindnameLessThan(String value) {
            addCriterion("kindName <", value, "kindname");
            return (Criteria) this;
        }

        public Criteria andKindnameLessThanOrEqualTo(String value) {
            addCriterion("kindName <=", value, "kindname");
            return (Criteria) this;
        }

        public Criteria andKindnameLike(String value) {
            addCriterion("kindName like", value, "kindname");
            return (Criteria) this;
        }

        public Criteria andKindnameNotLike(String value) {
            addCriterion("kindName not like", value, "kindname");
            return (Criteria) this;
        }

        public Criteria andKindnameIn(List<String> values) {
            addCriterion("kindName in", values, "kindname");
            return (Criteria) this;
        }

        public Criteria andKindnameNotIn(List<String> values) {
            addCriterion("kindName not in", values, "kindname");
            return (Criteria) this;
        }

        public Criteria andKindnameBetween(String value1, String value2) {
            addCriterion("kindName between", value1, value2, "kindname");
            return (Criteria) this;
        }

        public Criteria andKindnameNotBetween(String value1, String value2) {
            addCriterion("kindName not between", value1, value2, "kindname");
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