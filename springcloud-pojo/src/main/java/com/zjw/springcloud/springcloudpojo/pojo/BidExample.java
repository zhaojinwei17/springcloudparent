package com.zjw.springcloud.springcloudpojo.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BidExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BidExample() {
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

        public Criteria andBididIsNull() {
            addCriterion("bidID is null");
            return (Criteria) this;
        }

        public Criteria andBididIsNotNull() {
            addCriterion("bidID is not null");
            return (Criteria) this;
        }

        public Criteria andBididEqualTo(Integer value) {
            addCriterion("bidID =", value, "bidid");
            return (Criteria) this;
        }

        public Criteria andBididNotEqualTo(Integer value) {
            addCriterion("bidID <>", value, "bidid");
            return (Criteria) this;
        }

        public Criteria andBididGreaterThan(Integer value) {
            addCriterion("bidID >", value, "bidid");
            return (Criteria) this;
        }

        public Criteria andBididGreaterThanOrEqualTo(Integer value) {
            addCriterion("bidID >=", value, "bidid");
            return (Criteria) this;
        }

        public Criteria andBididLessThan(Integer value) {
            addCriterion("bidID <", value, "bidid");
            return (Criteria) this;
        }

        public Criteria andBididLessThanOrEqualTo(Integer value) {
            addCriterion("bidID <=", value, "bidid");
            return (Criteria) this;
        }

        public Criteria andBididIn(List<Integer> values) {
            addCriterion("bidID in", values, "bidid");
            return (Criteria) this;
        }

        public Criteria andBididNotIn(List<Integer> values) {
            addCriterion("bidID not in", values, "bidid");
            return (Criteria) this;
        }

        public Criteria andBididBetween(Integer value1, Integer value2) {
            addCriterion("bidID between", value1, value2, "bidid");
            return (Criteria) this;
        }

        public Criteria andBididNotBetween(Integer value1, Integer value2) {
            addCriterion("bidID not between", value1, value2, "bidid");
            return (Criteria) this;
        }

        public Criteria andBidpriceIsNull() {
            addCriterion("bidPrice is null");
            return (Criteria) this;
        }

        public Criteria andBidpriceIsNotNull() {
            addCriterion("bidPrice is not null");
            return (Criteria) this;
        }

        public Criteria andBidpriceEqualTo(BigDecimal value) {
            addCriterion("bidPrice =", value, "bidprice");
            return (Criteria) this;
        }

        public Criteria andBidpriceNotEqualTo(BigDecimal value) {
            addCriterion("bidPrice <>", value, "bidprice");
            return (Criteria) this;
        }

        public Criteria andBidpriceGreaterThan(BigDecimal value) {
            addCriterion("bidPrice >", value, "bidprice");
            return (Criteria) this;
        }

        public Criteria andBidpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bidPrice >=", value, "bidprice");
            return (Criteria) this;
        }

        public Criteria andBidpriceLessThan(BigDecimal value) {
            addCriterion("bidPrice <", value, "bidprice");
            return (Criteria) this;
        }

        public Criteria andBidpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bidPrice <=", value, "bidprice");
            return (Criteria) this;
        }

        public Criteria andBidpriceIn(List<BigDecimal> values) {
            addCriterion("bidPrice in", values, "bidprice");
            return (Criteria) this;
        }

        public Criteria andBidpriceNotIn(List<BigDecimal> values) {
            addCriterion("bidPrice not in", values, "bidprice");
            return (Criteria) this;
        }

        public Criteria andBidpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bidPrice between", value1, value2, "bidprice");
            return (Criteria) this;
        }

        public Criteria andBidpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bidPrice not between", value1, value2, "bidprice");
            return (Criteria) this;
        }

        public Criteria andBidtimeIsNull() {
            addCriterion("bidTime is null");
            return (Criteria) this;
        }

        public Criteria andBidtimeIsNotNull() {
            addCriterion("bidTime is not null");
            return (Criteria) this;
        }

        public Criteria andBidtimeEqualTo(Date value) {
            addCriterionForJDBCDate("bidTime =", value, "bidtime");
            return (Criteria) this;
        }

        public Criteria andBidtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("bidTime <>", value, "bidtime");
            return (Criteria) this;
        }

        public Criteria andBidtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("bidTime >", value, "bidtime");
            return (Criteria) this;
        }

        public Criteria andBidtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("bidTime >=", value, "bidtime");
            return (Criteria) this;
        }

        public Criteria andBidtimeLessThan(Date value) {
            addCriterionForJDBCDate("bidTime <", value, "bidtime");
            return (Criteria) this;
        }

        public Criteria andBidtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("bidTime <=", value, "bidtime");
            return (Criteria) this;
        }

        public Criteria andBidtimeIn(List<Date> values) {
            addCriterionForJDBCDate("bidTime in", values, "bidtime");
            return (Criteria) this;
        }

        public Criteria andBidtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("bidTime not in", values, "bidtime");
            return (Criteria) this;
        }

        public Criteria andBidtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("bidTime between", value1, value2, "bidtime");
            return (Criteria) this;
        }

        public Criteria andBidtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("bidTime not between", value1, value2, "bidtime");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andItemidIsNull() {
            addCriterion("itemID is null");
            return (Criteria) this;
        }

        public Criteria andItemidIsNotNull() {
            addCriterion("itemID is not null");
            return (Criteria) this;
        }

        public Criteria andItemidEqualTo(Integer value) {
            addCriterion("itemID =", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotEqualTo(Integer value) {
            addCriterion("itemID <>", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidGreaterThan(Integer value) {
            addCriterion("itemID >", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidGreaterThanOrEqualTo(Integer value) {
            addCriterion("itemID >=", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidLessThan(Integer value) {
            addCriterion("itemID <", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidLessThanOrEqualTo(Integer value) {
            addCriterion("itemID <=", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidIn(List<Integer> values) {
            addCriterion("itemID in", values, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotIn(List<Integer> values) {
            addCriterion("itemID not in", values, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidBetween(Integer value1, Integer value2) {
            addCriterion("itemID between", value1, value2, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotBetween(Integer value1, Integer value2) {
            addCriterion("itemID not between", value1, value2, "itemid");
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