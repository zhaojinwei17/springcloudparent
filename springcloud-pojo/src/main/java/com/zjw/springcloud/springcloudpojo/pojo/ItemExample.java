package com.zjw.springcloud.springcloudpojo.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItemExample() {
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

        public Criteria andItemnameIsNull() {
            addCriterion("itemName is null");
            return (Criteria) this;
        }

        public Criteria andItemnameIsNotNull() {
            addCriterion("itemName is not null");
            return (Criteria) this;
        }

        public Criteria andItemnameEqualTo(String value) {
            addCriterion("itemName =", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotEqualTo(String value) {
            addCriterion("itemName <>", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameGreaterThan(String value) {
            addCriterion("itemName >", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameGreaterThanOrEqualTo(String value) {
            addCriterion("itemName >=", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameLessThan(String value) {
            addCriterion("itemName <", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameLessThanOrEqualTo(String value) {
            addCriterion("itemName <=", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameLike(String value) {
            addCriterion("itemName like", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotLike(String value) {
            addCriterion("itemName not like", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameIn(List<String> values) {
            addCriterion("itemName in", values, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotIn(List<String> values) {
            addCriterion("itemName not in", values, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameBetween(String value1, String value2) {
            addCriterion("itemName between", value1, value2, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotBetween(String value1, String value2) {
            addCriterion("itemName not between", value1, value2, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemdescIsNull() {
            addCriterion("itemDesc is null");
            return (Criteria) this;
        }

        public Criteria andItemdescIsNotNull() {
            addCriterion("itemDesc is not null");
            return (Criteria) this;
        }

        public Criteria andItemdescEqualTo(String value) {
            addCriterion("itemDesc =", value, "itemdesc");
            return (Criteria) this;
        }

        public Criteria andItemdescNotEqualTo(String value) {
            addCriterion("itemDesc <>", value, "itemdesc");
            return (Criteria) this;
        }

        public Criteria andItemdescGreaterThan(String value) {
            addCriterion("itemDesc >", value, "itemdesc");
            return (Criteria) this;
        }

        public Criteria andItemdescGreaterThanOrEqualTo(String value) {
            addCriterion("itemDesc >=", value, "itemdesc");
            return (Criteria) this;
        }

        public Criteria andItemdescLessThan(String value) {
            addCriterion("itemDesc <", value, "itemdesc");
            return (Criteria) this;
        }

        public Criteria andItemdescLessThanOrEqualTo(String value) {
            addCriterion("itemDesc <=", value, "itemdesc");
            return (Criteria) this;
        }

        public Criteria andItemdescLike(String value) {
            addCriterion("itemDesc like", value, "itemdesc");
            return (Criteria) this;
        }

        public Criteria andItemdescNotLike(String value) {
            addCriterion("itemDesc not like", value, "itemdesc");
            return (Criteria) this;
        }

        public Criteria andItemdescIn(List<String> values) {
            addCriterion("itemDesc in", values, "itemdesc");
            return (Criteria) this;
        }

        public Criteria andItemdescNotIn(List<String> values) {
            addCriterion("itemDesc not in", values, "itemdesc");
            return (Criteria) this;
        }

        public Criteria andItemdescBetween(String value1, String value2) {
            addCriterion("itemDesc between", value1, value2, "itemdesc");
            return (Criteria) this;
        }

        public Criteria andItemdescNotBetween(String value1, String value2) {
            addCriterion("itemDesc not between", value1, value2, "itemdesc");
            return (Criteria) this;
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

        public Criteria andStarttimeIsNull() {
            addCriterion("startTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("startTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterionForJDBCDate("startTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("startTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("startTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("startTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterionForJDBCDate("startTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("startTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterionForJDBCDate("startTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("startTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("startTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("startTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterionForJDBCDate("endTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("endTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("endTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterionForJDBCDate("endTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterionForJDBCDate("endTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("endTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endTime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andInitpriceIsNull() {
            addCriterion("initPrice is null");
            return (Criteria) this;
        }

        public Criteria andInitpriceIsNotNull() {
            addCriterion("initPrice is not null");
            return (Criteria) this;
        }

        public Criteria andInitpriceEqualTo(BigDecimal value) {
            addCriterion("initPrice =", value, "initprice");
            return (Criteria) this;
        }

        public Criteria andInitpriceNotEqualTo(BigDecimal value) {
            addCriterion("initPrice <>", value, "initprice");
            return (Criteria) this;
        }

        public Criteria andInitpriceGreaterThan(BigDecimal value) {
            addCriterion("initPrice >", value, "initprice");
            return (Criteria) this;
        }

        public Criteria andInitpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("initPrice >=", value, "initprice");
            return (Criteria) this;
        }

        public Criteria andInitpriceLessThan(BigDecimal value) {
            addCriterion("initPrice <", value, "initprice");
            return (Criteria) this;
        }

        public Criteria andInitpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("initPrice <=", value, "initprice");
            return (Criteria) this;
        }

        public Criteria andInitpriceIn(List<BigDecimal> values) {
            addCriterion("initPrice in", values, "initprice");
            return (Criteria) this;
        }

        public Criteria andInitpriceNotIn(List<BigDecimal> values) {
            addCriterion("initPrice not in", values, "initprice");
            return (Criteria) this;
        }

        public Criteria andInitpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("initPrice between", value1, value2, "initprice");
            return (Criteria) this;
        }

        public Criteria andInitpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("initPrice not between", value1, value2, "initprice");
            return (Criteria) this;
        }

        public Criteria andMaxpriceIsNull() {
            addCriterion("maxPrice is null");
            return (Criteria) this;
        }

        public Criteria andMaxpriceIsNotNull() {
            addCriterion("maxPrice is not null");
            return (Criteria) this;
        }

        public Criteria andMaxpriceEqualTo(BigDecimal value) {
            addCriterion("maxPrice =", value, "maxprice");
            return (Criteria) this;
        }

        public Criteria andMaxpriceNotEqualTo(BigDecimal value) {
            addCriterion("maxPrice <>", value, "maxprice");
            return (Criteria) this;
        }

        public Criteria andMaxpriceGreaterThan(BigDecimal value) {
            addCriterion("maxPrice >", value, "maxprice");
            return (Criteria) this;
        }

        public Criteria andMaxpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("maxPrice >=", value, "maxprice");
            return (Criteria) this;
        }

        public Criteria andMaxpriceLessThan(BigDecimal value) {
            addCriterion("maxPrice <", value, "maxprice");
            return (Criteria) this;
        }

        public Criteria andMaxpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("maxPrice <=", value, "maxprice");
            return (Criteria) this;
        }

        public Criteria andMaxpriceIn(List<BigDecimal> values) {
            addCriterion("maxPrice in", values, "maxprice");
            return (Criteria) this;
        }

        public Criteria andMaxpriceNotIn(List<BigDecimal> values) {
            addCriterion("maxPrice not in", values, "maxprice");
            return (Criteria) this;
        }

        public Criteria andMaxpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("maxPrice between", value1, value2, "maxprice");
            return (Criteria) this;
        }

        public Criteria andMaxpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("maxPrice not between", value1, value2, "maxprice");
            return (Criteria) this;
        }

        public Criteria andReservepriceIsNull() {
            addCriterion("reservePrice is null");
            return (Criteria) this;
        }

        public Criteria andReservepriceIsNotNull() {
            addCriterion("reservePrice is not null");
            return (Criteria) this;
        }

        public Criteria andReservepriceEqualTo(BigDecimal value) {
            addCriterion("reservePrice =", value, "reserveprice");
            return (Criteria) this;
        }

        public Criteria andReservepriceNotEqualTo(BigDecimal value) {
            addCriterion("reservePrice <>", value, "reserveprice");
            return (Criteria) this;
        }

        public Criteria andReservepriceGreaterThan(BigDecimal value) {
            addCriterion("reservePrice >", value, "reserveprice");
            return (Criteria) this;
        }

        public Criteria andReservepriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("reservePrice >=", value, "reserveprice");
            return (Criteria) this;
        }

        public Criteria andReservepriceLessThan(BigDecimal value) {
            addCriterion("reservePrice <", value, "reserveprice");
            return (Criteria) this;
        }

        public Criteria andReservepriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("reservePrice <=", value, "reserveprice");
            return (Criteria) this;
        }

        public Criteria andReservepriceIn(List<BigDecimal> values) {
            addCriterion("reservePrice in", values, "reserveprice");
            return (Criteria) this;
        }

        public Criteria andReservepriceNotIn(List<BigDecimal> values) {
            addCriterion("reservePrice not in", values, "reserveprice");
            return (Criteria) this;
        }

        public Criteria andReservepriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reservePrice between", value1, value2, "reserveprice");
            return (Criteria) this;
        }

        public Criteria andReservepriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reservePrice not between", value1, value2, "reserveprice");
            return (Criteria) this;
        }

        public Criteria andOwneridIsNull() {
            addCriterion("ownerID is null");
            return (Criteria) this;
        }

        public Criteria andOwneridIsNotNull() {
            addCriterion("ownerID is not null");
            return (Criteria) this;
        }

        public Criteria andOwneridEqualTo(Integer value) {
            addCriterion("ownerID =", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridNotEqualTo(Integer value) {
            addCriterion("ownerID <>", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridGreaterThan(Integer value) {
            addCriterion("ownerID >", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridGreaterThanOrEqualTo(Integer value) {
            addCriterion("ownerID >=", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridLessThan(Integer value) {
            addCriterion("ownerID <", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridLessThanOrEqualTo(Integer value) {
            addCriterion("ownerID <=", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridIn(List<Integer> values) {
            addCriterion("ownerID in", values, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridNotIn(List<Integer> values) {
            addCriterion("ownerID not in", values, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridBetween(Integer value1, Integer value2) {
            addCriterion("ownerID between", value1, value2, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridNotBetween(Integer value1, Integer value2) {
            addCriterion("ownerID not between", value1, value2, "ownerid");
            return (Criteria) this;
        }

        public Criteria andWinneridIsNull() {
            addCriterion("winnerID is null");
            return (Criteria) this;
        }

        public Criteria andWinneridIsNotNull() {
            addCriterion("winnerID is not null");
            return (Criteria) this;
        }

        public Criteria andWinneridEqualTo(Integer value) {
            addCriterion("winnerID =", value, "winnerid");
            return (Criteria) this;
        }

        public Criteria andWinneridNotEqualTo(Integer value) {
            addCriterion("winnerID <>", value, "winnerid");
            return (Criteria) this;
        }

        public Criteria andWinneridGreaterThan(Integer value) {
            addCriterion("winnerID >", value, "winnerid");
            return (Criteria) this;
        }

        public Criteria andWinneridGreaterThanOrEqualTo(Integer value) {
            addCriterion("winnerID >=", value, "winnerid");
            return (Criteria) this;
        }

        public Criteria andWinneridLessThan(Integer value) {
            addCriterion("winnerID <", value, "winnerid");
            return (Criteria) this;
        }

        public Criteria andWinneridLessThanOrEqualTo(Integer value) {
            addCriterion("winnerID <=", value, "winnerid");
            return (Criteria) this;
        }

        public Criteria andWinneridIn(List<Integer> values) {
            addCriterion("winnerID in", values, "winnerid");
            return (Criteria) this;
        }

        public Criteria andWinneridNotIn(List<Integer> values) {
            addCriterion("winnerID not in", values, "winnerid");
            return (Criteria) this;
        }

        public Criteria andWinneridBetween(Integer value1, Integer value2) {
            addCriterion("winnerID between", value1, value2, "winnerid");
            return (Criteria) this;
        }

        public Criteria andWinneridNotBetween(Integer value1, Integer value2) {
            addCriterion("winnerID not between", value1, value2, "winnerid");
            return (Criteria) this;
        }

        public Criteria andStateidIsNull() {
            addCriterion("stateID is null");
            return (Criteria) this;
        }

        public Criteria andStateidIsNotNull() {
            addCriterion("stateID is not null");
            return (Criteria) this;
        }

        public Criteria andStateidEqualTo(Integer value) {
            addCriterion("stateID =", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidNotEqualTo(Integer value) {
            addCriterion("stateID <>", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidGreaterThan(Integer value) {
            addCriterion("stateID >", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("stateID >=", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidLessThan(Integer value) {
            addCriterion("stateID <", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidLessThanOrEqualTo(Integer value) {
            addCriterion("stateID <=", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidIn(List<Integer> values) {
            addCriterion("stateID in", values, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidNotIn(List<Integer> values) {
            addCriterion("stateID not in", values, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidBetween(Integer value1, Integer value2) {
            addCriterion("stateID between", value1, value2, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidNotBetween(Integer value1, Integer value2) {
            addCriterion("stateID not between", value1, value2, "stateid");
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