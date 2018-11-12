package com.zjw.springcloud.springcloudpojo.pojo;

import java.util.ArrayList;
import java.util.List;

public class TestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TestExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAaIsNull() {
            addCriterion("aa is null");
            return (Criteria) this;
        }

        public Criteria andAaIsNotNull() {
            addCriterion("aa is not null");
            return (Criteria) this;
        }

        public Criteria andAaEqualTo(String value) {
            addCriterion("aa =", value, "aa");
            return (Criteria) this;
        }

        public Criteria andAaNotEqualTo(String value) {
            addCriterion("aa <>", value, "aa");
            return (Criteria) this;
        }

        public Criteria andAaGreaterThan(String value) {
            addCriterion("aa >", value, "aa");
            return (Criteria) this;
        }

        public Criteria andAaGreaterThanOrEqualTo(String value) {
            addCriterion("aa >=", value, "aa");
            return (Criteria) this;
        }

        public Criteria andAaLessThan(String value) {
            addCriterion("aa <", value, "aa");
            return (Criteria) this;
        }

        public Criteria andAaLessThanOrEqualTo(String value) {
            addCriterion("aa <=", value, "aa");
            return (Criteria) this;
        }

        public Criteria andAaLike(String value) {
            addCriterion("aa like", value, "aa");
            return (Criteria) this;
        }

        public Criteria andAaNotLike(String value) {
            addCriterion("aa not like", value, "aa");
            return (Criteria) this;
        }

        public Criteria andAaIn(List<String> values) {
            addCriterion("aa in", values, "aa");
            return (Criteria) this;
        }

        public Criteria andAaNotIn(List<String> values) {
            addCriterion("aa not in", values, "aa");
            return (Criteria) this;
        }

        public Criteria andAaBetween(String value1, String value2) {
            addCriterion("aa between", value1, value2, "aa");
            return (Criteria) this;
        }

        public Criteria andAaNotBetween(String value1, String value2) {
            addCriterion("aa not between", value1, value2, "aa");
            return (Criteria) this;
        }

        public Criteria andBbIsNull() {
            addCriterion("bb is null");
            return (Criteria) this;
        }

        public Criteria andBbIsNotNull() {
            addCriterion("bb is not null");
            return (Criteria) this;
        }

        public Criteria andBbEqualTo(String value) {
            addCriterion("bb =", value, "bb");
            return (Criteria) this;
        }

        public Criteria andBbNotEqualTo(String value) {
            addCriterion("bb <>", value, "bb");
            return (Criteria) this;
        }

        public Criteria andBbGreaterThan(String value) {
            addCriterion("bb >", value, "bb");
            return (Criteria) this;
        }

        public Criteria andBbGreaterThanOrEqualTo(String value) {
            addCriterion("bb >=", value, "bb");
            return (Criteria) this;
        }

        public Criteria andBbLessThan(String value) {
            addCriterion("bb <", value, "bb");
            return (Criteria) this;
        }

        public Criteria andBbLessThanOrEqualTo(String value) {
            addCriterion("bb <=", value, "bb");
            return (Criteria) this;
        }

        public Criteria andBbLike(String value) {
            addCriterion("bb like", value, "bb");
            return (Criteria) this;
        }

        public Criteria andBbNotLike(String value) {
            addCriterion("bb not like", value, "bb");
            return (Criteria) this;
        }

        public Criteria andBbIn(List<String> values) {
            addCriterion("bb in", values, "bb");
            return (Criteria) this;
        }

        public Criteria andBbNotIn(List<String> values) {
            addCriterion("bb not in", values, "bb");
            return (Criteria) this;
        }

        public Criteria andBbBetween(String value1, String value2) {
            addCriterion("bb between", value1, value2, "bb");
            return (Criteria) this;
        }

        public Criteria andBbNotBetween(String value1, String value2) {
            addCriterion("bb not between", value1, value2, "bb");
            return (Criteria) this;
        }

        public Criteria andCcIsNull() {
            addCriterion("cc is null");
            return (Criteria) this;
        }

        public Criteria andCcIsNotNull() {
            addCriterion("cc is not null");
            return (Criteria) this;
        }

        public Criteria andCcEqualTo(String value) {
            addCriterion("cc =", value, "cc");
            return (Criteria) this;
        }

        public Criteria andCcNotEqualTo(String value) {
            addCriterion("cc <>", value, "cc");
            return (Criteria) this;
        }

        public Criteria andCcGreaterThan(String value) {
            addCriterion("cc >", value, "cc");
            return (Criteria) this;
        }

        public Criteria andCcGreaterThanOrEqualTo(String value) {
            addCriterion("cc >=", value, "cc");
            return (Criteria) this;
        }

        public Criteria andCcLessThan(String value) {
            addCriterion("cc <", value, "cc");
            return (Criteria) this;
        }

        public Criteria andCcLessThanOrEqualTo(String value) {
            addCriterion("cc <=", value, "cc");
            return (Criteria) this;
        }

        public Criteria andCcLike(String value) {
            addCriterion("cc like", value, "cc");
            return (Criteria) this;
        }

        public Criteria andCcNotLike(String value) {
            addCriterion("cc not like", value, "cc");
            return (Criteria) this;
        }

        public Criteria andCcIn(List<String> values) {
            addCriterion("cc in", values, "cc");
            return (Criteria) this;
        }

        public Criteria andCcNotIn(List<String> values) {
            addCriterion("cc not in", values, "cc");
            return (Criteria) this;
        }

        public Criteria andCcBetween(String value1, String value2) {
            addCriterion("cc between", value1, value2, "cc");
            return (Criteria) this;
        }

        public Criteria andCcNotBetween(String value1, String value2) {
            addCriterion("cc not between", value1, value2, "cc");
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