package com.zjw.springcloud.springcloudpojo.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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

        public Criteria andCustomeridIsNull() {
            addCriterion("customerID is null");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNotNull() {
            addCriterion("customerID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeridEqualTo(Integer value) {
            addCriterion("customerID =", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotEqualTo(Integer value) {
            addCriterion("customerID <>", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThan(Integer value) {
            addCriterion("customerID >", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThanOrEqualTo(Integer value) {
            addCriterion("customerID >=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThan(Integer value) {
            addCriterion("customerID <", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThanOrEqualTo(Integer value) {
            addCriterion("customerID <=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIn(List<Integer> values) {
            addCriterion("customerID in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotIn(List<Integer> values) {
            addCriterion("customerID not in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridBetween(Integer value1, Integer value2) {
            addCriterion("customerID between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotBetween(Integer value1, Integer value2) {
            addCriterion("customerID not between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andOrdersdateIsNull() {
            addCriterion("ordersDate is null");
            return (Criteria) this;
        }

        public Criteria andOrdersdateIsNotNull() {
            addCriterion("ordersDate is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersdateEqualTo(Date value) {
            addCriterionForJDBCDate("ordersDate =", value, "ordersdate");
            return (Criteria) this;
        }

        public Criteria andOrdersdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ordersDate <>", value, "ordersdate");
            return (Criteria) this;
        }

        public Criteria andOrdersdateGreaterThan(Date value) {
            addCriterionForJDBCDate("ordersDate >", value, "ordersdate");
            return (Criteria) this;
        }

        public Criteria andOrdersdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ordersDate >=", value, "ordersdate");
            return (Criteria) this;
        }

        public Criteria andOrdersdateLessThan(Date value) {
            addCriterionForJDBCDate("ordersDate <", value, "ordersdate");
            return (Criteria) this;
        }

        public Criteria andOrdersdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ordersDate <=", value, "ordersdate");
            return (Criteria) this;
        }

        public Criteria andOrdersdateIn(List<Date> values) {
            addCriterionForJDBCDate("ordersDate in", values, "ordersdate");
            return (Criteria) this;
        }

        public Criteria andOrdersdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ordersDate not in", values, "ordersdate");
            return (Criteria) this;
        }

        public Criteria andOrdersdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ordersDate between", value1, value2, "ordersdate");
            return (Criteria) this;
        }

        public Criteria andOrdersdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ordersDate not between", value1, value2, "ordersdate");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andManTimesIsNull() {
            addCriterion("man_times is null");
            return (Criteria) this;
        }

        public Criteria andManTimesIsNotNull() {
            addCriterion("man_times is not null");
            return (Criteria) this;
        }

        public Criteria andManTimesEqualTo(Integer value) {
            addCriterion("man_times =", value, "manTimes");
            return (Criteria) this;
        }

        public Criteria andManTimesNotEqualTo(Integer value) {
            addCriterion("man_times <>", value, "manTimes");
            return (Criteria) this;
        }

        public Criteria andManTimesGreaterThan(Integer value) {
            addCriterion("man_times >", value, "manTimes");
            return (Criteria) this;
        }

        public Criteria andManTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("man_times >=", value, "manTimes");
            return (Criteria) this;
        }

        public Criteria andManTimesLessThan(Integer value) {
            addCriterion("man_times <", value, "manTimes");
            return (Criteria) this;
        }

        public Criteria andManTimesLessThanOrEqualTo(Integer value) {
            addCriterion("man_times <=", value, "manTimes");
            return (Criteria) this;
        }

        public Criteria andManTimesIn(List<Integer> values) {
            addCriterion("man_times in", values, "manTimes");
            return (Criteria) this;
        }

        public Criteria andManTimesNotIn(List<Integer> values) {
            addCriterion("man_times not in", values, "manTimes");
            return (Criteria) this;
        }

        public Criteria andManTimesBetween(Integer value1, Integer value2) {
            addCriterion("man_times between", value1, value2, "manTimes");
            return (Criteria) this;
        }

        public Criteria andManTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("man_times not between", value1, value2, "manTimes");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(BigDecimal value) {
            addCriterion("discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(BigDecimal value) {
            addCriterion("discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(BigDecimal value) {
            addCriterion("discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(BigDecimal value) {
            addCriterion("discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<BigDecimal> values) {
            addCriterion("discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<BigDecimal> values) {
            addCriterion("discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andEffectiveamountIsNull() {
            addCriterion("effectiveAmount is null");
            return (Criteria) this;
        }

        public Criteria andEffectiveamountIsNotNull() {
            addCriterion("effectiveAmount is not null");
            return (Criteria) this;
        }

        public Criteria andEffectiveamountEqualTo(BigDecimal value) {
            addCriterion("effectiveAmount =", value, "effectiveamount");
            return (Criteria) this;
        }

        public Criteria andEffectiveamountNotEqualTo(BigDecimal value) {
            addCriterion("effectiveAmount <>", value, "effectiveamount");
            return (Criteria) this;
        }

        public Criteria andEffectiveamountGreaterThan(BigDecimal value) {
            addCriterion("effectiveAmount >", value, "effectiveamount");
            return (Criteria) this;
        }

        public Criteria andEffectiveamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("effectiveAmount >=", value, "effectiveamount");
            return (Criteria) this;
        }

        public Criteria andEffectiveamountLessThan(BigDecimal value) {
            addCriterion("effectiveAmount <", value, "effectiveamount");
            return (Criteria) this;
        }

        public Criteria andEffectiveamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("effectiveAmount <=", value, "effectiveamount");
            return (Criteria) this;
        }

        public Criteria andEffectiveamountIn(List<BigDecimal> values) {
            addCriterion("effectiveAmount in", values, "effectiveamount");
            return (Criteria) this;
        }

        public Criteria andEffectiveamountNotIn(List<BigDecimal> values) {
            addCriterion("effectiveAmount not in", values, "effectiveamount");
            return (Criteria) this;
        }

        public Criteria andEffectiveamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("effectiveAmount between", value1, value2, "effectiveamount");
            return (Criteria) this;
        }

        public Criteria andEffectiveamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("effectiveAmount not between", value1, value2, "effectiveamount");
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