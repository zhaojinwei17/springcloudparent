package com.zjw.springcloud.springcloudpojo.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class VPriceUseridExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VPriceUseridExample() {
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

        public Criteria and竞拍物品编号IsNull() {
            addCriterion("竞拍物品编号 is null");
            return (Criteria) this;
        }

        public Criteria and竞拍物品编号IsNotNull() {
            addCriterion("竞拍物品编号 is not null");
            return (Criteria) this;
        }

        public Criteria and竞拍物品编号EqualTo(Integer value) {
            addCriterion("竞拍物品编号 =", value, "竞拍物品编号");
            return (Criteria) this;
        }

        public Criteria and竞拍物品编号NotEqualTo(Integer value) {
            addCriterion("竞拍物品编号 <>", value, "竞拍物品编号");
            return (Criteria) this;
        }

        public Criteria and竞拍物品编号GreaterThan(Integer value) {
            addCriterion("竞拍物品编号 >", value, "竞拍物品编号");
            return (Criteria) this;
        }

        public Criteria and竞拍物品编号GreaterThanOrEqualTo(Integer value) {
            addCriterion("竞拍物品编号 >=", value, "竞拍物品编号");
            return (Criteria) this;
        }

        public Criteria and竞拍物品编号LessThan(Integer value) {
            addCriterion("竞拍物品编号 <", value, "竞拍物品编号");
            return (Criteria) this;
        }

        public Criteria and竞拍物品编号LessThanOrEqualTo(Integer value) {
            addCriterion("竞拍物品编号 <=", value, "竞拍物品编号");
            return (Criteria) this;
        }

        public Criteria and竞拍物品编号In(List<Integer> values) {
            addCriterion("竞拍物品编号 in", values, "竞拍物品编号");
            return (Criteria) this;
        }

        public Criteria and竞拍物品编号NotIn(List<Integer> values) {
            addCriterion("竞拍物品编号 not in", values, "竞拍物品编号");
            return (Criteria) this;
        }

        public Criteria and竞拍物品编号Between(Integer value1, Integer value2) {
            addCriterion("竞拍物品编号 between", value1, value2, "竞拍物品编号");
            return (Criteria) this;
        }

        public Criteria and竞拍物品编号NotBetween(Integer value1, Integer value2) {
            addCriterion("竞拍物品编号 not between", value1, value2, "竞拍物品编号");
            return (Criteria) this;
        }

        public Criteria and竞拍者编号IsNull() {
            addCriterion("竞拍者编号 is null");
            return (Criteria) this;
        }

        public Criteria and竞拍者编号IsNotNull() {
            addCriterion("竞拍者编号 is not null");
            return (Criteria) this;
        }

        public Criteria and竞拍者编号EqualTo(Integer value) {
            addCriterion("竞拍者编号 =", value, "竞拍者编号");
            return (Criteria) this;
        }

        public Criteria and竞拍者编号NotEqualTo(Integer value) {
            addCriterion("竞拍者编号 <>", value, "竞拍者编号");
            return (Criteria) this;
        }

        public Criteria and竞拍者编号GreaterThan(Integer value) {
            addCriterion("竞拍者编号 >", value, "竞拍者编号");
            return (Criteria) this;
        }

        public Criteria and竞拍者编号GreaterThanOrEqualTo(Integer value) {
            addCriterion("竞拍者编号 >=", value, "竞拍者编号");
            return (Criteria) this;
        }

        public Criteria and竞拍者编号LessThan(Integer value) {
            addCriterion("竞拍者编号 <", value, "竞拍者编号");
            return (Criteria) this;
        }

        public Criteria and竞拍者编号LessThanOrEqualTo(Integer value) {
            addCriterion("竞拍者编号 <=", value, "竞拍者编号");
            return (Criteria) this;
        }

        public Criteria and竞拍者编号In(List<Integer> values) {
            addCriterion("竞拍者编号 in", values, "竞拍者编号");
            return (Criteria) this;
        }

        public Criteria and竞拍者编号NotIn(List<Integer> values) {
            addCriterion("竞拍者编号 not in", values, "竞拍者编号");
            return (Criteria) this;
        }

        public Criteria and竞拍者编号Between(Integer value1, Integer value2) {
            addCriterion("竞拍者编号 between", value1, value2, "竞拍者编号");
            return (Criteria) this;
        }

        public Criteria and竞拍者编号NotBetween(Integer value1, Integer value2) {
            addCriterion("竞拍者编号 not between", value1, value2, "竞拍者编号");
            return (Criteria) this;
        }

        public Criteria and最高竞拍价IsNull() {
            addCriterion("最高竞拍价 is null");
            return (Criteria) this;
        }

        public Criteria and最高竞拍价IsNotNull() {
            addCriterion("最高竞拍价 is not null");
            return (Criteria) this;
        }

        public Criteria and最高竞拍价EqualTo(BigDecimal value) {
            addCriterion("最高竞拍价 =", value, "最高竞拍价");
            return (Criteria) this;
        }

        public Criteria and最高竞拍价NotEqualTo(BigDecimal value) {
            addCriterion("最高竞拍价 <>", value, "最高竞拍价");
            return (Criteria) this;
        }

        public Criteria and最高竞拍价GreaterThan(BigDecimal value) {
            addCriterion("最高竞拍价 >", value, "最高竞拍价");
            return (Criteria) this;
        }

        public Criteria and最高竞拍价GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("最高竞拍价 >=", value, "最高竞拍价");
            return (Criteria) this;
        }

        public Criteria and最高竞拍价LessThan(BigDecimal value) {
            addCriterion("最高竞拍价 <", value, "最高竞拍价");
            return (Criteria) this;
        }

        public Criteria and最高竞拍价LessThanOrEqualTo(BigDecimal value) {
            addCriterion("最高竞拍价 <=", value, "最高竞拍价");
            return (Criteria) this;
        }

        public Criteria and最高竞拍价In(List<BigDecimal> values) {
            addCriterion("最高竞拍价 in", values, "最高竞拍价");
            return (Criteria) this;
        }

        public Criteria and最高竞拍价NotIn(List<BigDecimal> values) {
            addCriterion("最高竞拍价 not in", values, "最高竞拍价");
            return (Criteria) this;
        }

        public Criteria and最高竞拍价Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("最高竞拍价 between", value1, value2, "最高竞拍价");
            return (Criteria) this;
        }

        public Criteria and最高竞拍价NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("最高竞拍价 not between", value1, value2, "最高竞拍价");
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