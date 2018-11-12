package com.zjw.springcloud.springcloudpojo.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OlDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OlDetailExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andOrdersidIsNull() {
            addCriterion("ordersID is null");
            return (Criteria) this;
        }

        public Criteria andOrdersidIsNotNull() {
            addCriterion("ordersID is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersidEqualTo(Integer value) {
            addCriterion("ordersID =", value, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidNotEqualTo(Integer value) {
            addCriterion("ordersID <>", value, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidGreaterThan(Integer value) {
            addCriterion("ordersID >", value, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ordersID >=", value, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidLessThan(Integer value) {
            addCriterion("ordersID <", value, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidLessThanOrEqualTo(Integer value) {
            addCriterion("ordersID <=", value, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidIn(List<Integer> values) {
            addCriterion("ordersID in", values, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidNotIn(List<Integer> values) {
            addCriterion("ordersID not in", values, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidBetween(Integer value1, Integer value2) {
            addCriterion("ordersID between", value1, value2, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidNotBetween(Integer value1, Integer value2) {
            addCriterion("ordersID not between", value1, value2, "ordersid");
            return (Criteria) this;
        }

        public Criteria andLineidIsNull() {
            addCriterion("lineID is null");
            return (Criteria) this;
        }

        public Criteria andLineidIsNotNull() {
            addCriterion("lineID is not null");
            return (Criteria) this;
        }

        public Criteria andLineidEqualTo(Integer value) {
            addCriterion("lineID =", value, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidNotEqualTo(Integer value) {
            addCriterion("lineID <>", value, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidGreaterThan(Integer value) {
            addCriterion("lineID >", value, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidGreaterThanOrEqualTo(Integer value) {
            addCriterion("lineID >=", value, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidLessThan(Integer value) {
            addCriterion("lineID <", value, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidLessThanOrEqualTo(Integer value) {
            addCriterion("lineID <=", value, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidIn(List<Integer> values) {
            addCriterion("lineID in", values, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidNotIn(List<Integer> values) {
            addCriterion("lineID not in", values, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidBetween(Integer value1, Integer value2) {
            addCriterion("lineID between", value1, value2, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidNotBetween(Integer value1, Integer value2) {
            addCriterion("lineID not between", value1, value2, "lineid");
            return (Criteria) this;
        }

        public Criteria andTraveldateIsNull() {
            addCriterion("travelDate is null");
            return (Criteria) this;
        }

        public Criteria andTraveldateIsNotNull() {
            addCriterion("travelDate is not null");
            return (Criteria) this;
        }

        public Criteria andTraveldateEqualTo(Date value) {
            addCriterionForJDBCDate("travelDate =", value, "traveldate");
            return (Criteria) this;
        }

        public Criteria andTraveldateNotEqualTo(Date value) {
            addCriterionForJDBCDate("travelDate <>", value, "traveldate");
            return (Criteria) this;
        }

        public Criteria andTraveldateGreaterThan(Date value) {
            addCriterionForJDBCDate("travelDate >", value, "traveldate");
            return (Criteria) this;
        }

        public Criteria andTraveldateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("travelDate >=", value, "traveldate");
            return (Criteria) this;
        }

        public Criteria andTraveldateLessThan(Date value) {
            addCriterionForJDBCDate("travelDate <", value, "traveldate");
            return (Criteria) this;
        }

        public Criteria andTraveldateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("travelDate <=", value, "traveldate");
            return (Criteria) this;
        }

        public Criteria andTraveldateIn(List<Date> values) {
            addCriterionForJDBCDate("travelDate in", values, "traveldate");
            return (Criteria) this;
        }

        public Criteria andTraveldateNotIn(List<Date> values) {
            addCriterionForJDBCDate("travelDate not in", values, "traveldate");
            return (Criteria) this;
        }

        public Criteria andTraveldateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("travelDate between", value1, value2, "traveldate");
            return (Criteria) this;
        }

        public Criteria andTraveldateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("travelDate not between", value1, value2, "traveldate");
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