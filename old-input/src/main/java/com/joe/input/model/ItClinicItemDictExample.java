package com.joe.input.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ItClinicItemDictExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItClinicItemDictExample() {
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

        public Criteria andItemClassIsNull() {
            addCriterion("ITEM_CLASS is null");
            return (Criteria) this;
        }

        public Criteria andItemClassIsNotNull() {
            addCriterion("ITEM_CLASS is not null");
            return (Criteria) this;
        }

        public Criteria andItemClassEqualTo(String value) {
            addCriterion("ITEM_CLASS =", value, "itemClass");
            return (Criteria) this;
        }

        public Criteria andItemClassNotEqualTo(String value) {
            addCriterion("ITEM_CLASS <>", value, "itemClass");
            return (Criteria) this;
        }

        public Criteria andItemClassGreaterThan(String value) {
            addCriterion("ITEM_CLASS >", value, "itemClass");
            return (Criteria) this;
        }

        public Criteria andItemClassGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_CLASS >=", value, "itemClass");
            return (Criteria) this;
        }

        public Criteria andItemClassLessThan(String value) {
            addCriterion("ITEM_CLASS <", value, "itemClass");
            return (Criteria) this;
        }

        public Criteria andItemClassLessThanOrEqualTo(String value) {
            addCriterion("ITEM_CLASS <=", value, "itemClass");
            return (Criteria) this;
        }

        public Criteria andItemClassLike(String value) {
            addCriterion("ITEM_CLASS like", value, "itemClass");
            return (Criteria) this;
        }

        public Criteria andItemClassNotLike(String value) {
            addCriterion("ITEM_CLASS not like", value, "itemClass");
            return (Criteria) this;
        }

        public Criteria andItemClassIn(List<String> values) {
            addCriterion("ITEM_CLASS in", values, "itemClass");
            return (Criteria) this;
        }

        public Criteria andItemClassNotIn(List<String> values) {
            addCriterion("ITEM_CLASS not in", values, "itemClass");
            return (Criteria) this;
        }

        public Criteria andItemClassBetween(String value1, String value2) {
            addCriterion("ITEM_CLASS between", value1, value2, "itemClass");
            return (Criteria) this;
        }

        public Criteria andItemClassNotBetween(String value1, String value2) {
            addCriterion("ITEM_CLASS not between", value1, value2, "itemClass");
            return (Criteria) this;
        }

        public Criteria andItemCodeIsNull() {
            addCriterion("ITEM_CODE is null");
            return (Criteria) this;
        }

        public Criteria andItemCodeIsNotNull() {
            addCriterion("ITEM_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andItemCodeEqualTo(String value) {
            addCriterion("ITEM_CODE =", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeNotEqualTo(String value) {
            addCriterion("ITEM_CODE <>", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeGreaterThan(String value) {
            addCriterion("ITEM_CODE >", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_CODE >=", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeLessThan(String value) {
            addCriterion("ITEM_CODE <", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeLessThanOrEqualTo(String value) {
            addCriterion("ITEM_CODE <=", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeLike(String value) {
            addCriterion("ITEM_CODE like", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeNotLike(String value) {
            addCriterion("ITEM_CODE not like", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeIn(List<String> values) {
            addCriterion("ITEM_CODE in", values, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeNotIn(List<String> values) {
            addCriterion("ITEM_CODE not in", values, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeBetween(String value1, String value2) {
            addCriterion("ITEM_CODE between", value1, value2, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeNotBetween(String value1, String value2) {
            addCriterion("ITEM_CODE not between", value1, value2, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNull() {
            addCriterion("ITEM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNotNull() {
            addCriterion("ITEM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andItemNameEqualTo(String value) {
            addCriterion("ITEM_NAME =", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotEqualTo(String value) {
            addCriterion("ITEM_NAME <>", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThan(String value) {
            addCriterion("ITEM_NAME >", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_NAME >=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThan(String value) {
            addCriterion("ITEM_NAME <", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThanOrEqualTo(String value) {
            addCriterion("ITEM_NAME <=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLike(String value) {
            addCriterion("ITEM_NAME like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotLike(String value) {
            addCriterion("ITEM_NAME not like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameIn(List<String> values) {
            addCriterion("ITEM_NAME in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotIn(List<String> values) {
            addCriterion("ITEM_NAME not in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameBetween(String value1, String value2) {
            addCriterion("ITEM_NAME between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotBetween(String value1, String value2) {
            addCriterion("ITEM_NAME not between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andInputCodeIsNull() {
            addCriterion("INPUT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andInputCodeIsNotNull() {
            addCriterion("INPUT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andInputCodeEqualTo(String value) {
            addCriterion("INPUT_CODE =", value, "inputCode");
            return (Criteria) this;
        }

        public Criteria andInputCodeNotEqualTo(String value) {
            addCriterion("INPUT_CODE <>", value, "inputCode");
            return (Criteria) this;
        }

        public Criteria andInputCodeGreaterThan(String value) {
            addCriterion("INPUT_CODE >", value, "inputCode");
            return (Criteria) this;
        }

        public Criteria andInputCodeGreaterThanOrEqualTo(String value) {
            addCriterion("INPUT_CODE >=", value, "inputCode");
            return (Criteria) this;
        }

        public Criteria andInputCodeLessThan(String value) {
            addCriterion("INPUT_CODE <", value, "inputCode");
            return (Criteria) this;
        }

        public Criteria andInputCodeLessThanOrEqualTo(String value) {
            addCriterion("INPUT_CODE <=", value, "inputCode");
            return (Criteria) this;
        }

        public Criteria andInputCodeLike(String value) {
            addCriterion("INPUT_CODE like", value, "inputCode");
            return (Criteria) this;
        }

        public Criteria andInputCodeNotLike(String value) {
            addCriterion("INPUT_CODE not like", value, "inputCode");
            return (Criteria) this;
        }

        public Criteria andInputCodeIn(List<String> values) {
            addCriterion("INPUT_CODE in", values, "inputCode");
            return (Criteria) this;
        }

        public Criteria andInputCodeNotIn(List<String> values) {
            addCriterion("INPUT_CODE not in", values, "inputCode");
            return (Criteria) this;
        }

        public Criteria andInputCodeBetween(String value1, String value2) {
            addCriterion("INPUT_CODE between", value1, value2, "inputCode");
            return (Criteria) this;
        }

        public Criteria andInputCodeNotBetween(String value1, String value2) {
            addCriterion("INPUT_CODE not between", value1, value2, "inputCode");
            return (Criteria) this;
        }

        public Criteria andExpand1IsNull() {
            addCriterion("EXPAND1 is null");
            return (Criteria) this;
        }

        public Criteria andExpand1IsNotNull() {
            addCriterion("EXPAND1 is not null");
            return (Criteria) this;
        }

        public Criteria andExpand1EqualTo(String value) {
            addCriterion("EXPAND1 =", value, "expand1");
            return (Criteria) this;
        }

        public Criteria andExpand1NotEqualTo(String value) {
            addCriterion("EXPAND1 <>", value, "expand1");
            return (Criteria) this;
        }

        public Criteria andExpand1GreaterThan(String value) {
            addCriterion("EXPAND1 >", value, "expand1");
            return (Criteria) this;
        }

        public Criteria andExpand1GreaterThanOrEqualTo(String value) {
            addCriterion("EXPAND1 >=", value, "expand1");
            return (Criteria) this;
        }

        public Criteria andExpand1LessThan(String value) {
            addCriterion("EXPAND1 <", value, "expand1");
            return (Criteria) this;
        }

        public Criteria andExpand1LessThanOrEqualTo(String value) {
            addCriterion("EXPAND1 <=", value, "expand1");
            return (Criteria) this;
        }

        public Criteria andExpand1Like(String value) {
            addCriterion("EXPAND1 like", value, "expand1");
            return (Criteria) this;
        }

        public Criteria andExpand1NotLike(String value) {
            addCriterion("EXPAND1 not like", value, "expand1");
            return (Criteria) this;
        }

        public Criteria andExpand1In(List<String> values) {
            addCriterion("EXPAND1 in", values, "expand1");
            return (Criteria) this;
        }

        public Criteria andExpand1NotIn(List<String> values) {
            addCriterion("EXPAND1 not in", values, "expand1");
            return (Criteria) this;
        }

        public Criteria andExpand1Between(String value1, String value2) {
            addCriterion("EXPAND1 between", value1, value2, "expand1");
            return (Criteria) this;
        }

        public Criteria andExpand1NotBetween(String value1, String value2) {
            addCriterion("EXPAND1 not between", value1, value2, "expand1");
            return (Criteria) this;
        }

        public Criteria andExpand2IsNull() {
            addCriterion("EXPAND2 is null");
            return (Criteria) this;
        }

        public Criteria andExpand2IsNotNull() {
            addCriterion("EXPAND2 is not null");
            return (Criteria) this;
        }

        public Criteria andExpand2EqualTo(String value) {
            addCriterion("EXPAND2 =", value, "expand2");
            return (Criteria) this;
        }

        public Criteria andExpand2NotEqualTo(String value) {
            addCriterion("EXPAND2 <>", value, "expand2");
            return (Criteria) this;
        }

        public Criteria andExpand2GreaterThan(String value) {
            addCriterion("EXPAND2 >", value, "expand2");
            return (Criteria) this;
        }

        public Criteria andExpand2GreaterThanOrEqualTo(String value) {
            addCriterion("EXPAND2 >=", value, "expand2");
            return (Criteria) this;
        }

        public Criteria andExpand2LessThan(String value) {
            addCriterion("EXPAND2 <", value, "expand2");
            return (Criteria) this;
        }

        public Criteria andExpand2LessThanOrEqualTo(String value) {
            addCriterion("EXPAND2 <=", value, "expand2");
            return (Criteria) this;
        }

        public Criteria andExpand2Like(String value) {
            addCriterion("EXPAND2 like", value, "expand2");
            return (Criteria) this;
        }

        public Criteria andExpand2NotLike(String value) {
            addCriterion("EXPAND2 not like", value, "expand2");
            return (Criteria) this;
        }

        public Criteria andExpand2In(List<String> values) {
            addCriterion("EXPAND2 in", values, "expand2");
            return (Criteria) this;
        }

        public Criteria andExpand2NotIn(List<String> values) {
            addCriterion("EXPAND2 not in", values, "expand2");
            return (Criteria) this;
        }

        public Criteria andExpand2Between(String value1, String value2) {
            addCriterion("EXPAND2 between", value1, value2, "expand2");
            return (Criteria) this;
        }

        public Criteria andExpand2NotBetween(String value1, String value2) {
            addCriterion("EXPAND2 not between", value1, value2, "expand2");
            return (Criteria) this;
        }

        public Criteria andExpand3IsNull() {
            addCriterion("EXPAND3 is null");
            return (Criteria) this;
        }

        public Criteria andExpand3IsNotNull() {
            addCriterion("EXPAND3 is not null");
            return (Criteria) this;
        }

        public Criteria andExpand3EqualTo(String value) {
            addCriterion("EXPAND3 =", value, "expand3");
            return (Criteria) this;
        }

        public Criteria andExpand3NotEqualTo(String value) {
            addCriterion("EXPAND3 <>", value, "expand3");
            return (Criteria) this;
        }

        public Criteria andExpand3GreaterThan(String value) {
            addCriterion("EXPAND3 >", value, "expand3");
            return (Criteria) this;
        }

        public Criteria andExpand3GreaterThanOrEqualTo(String value) {
            addCriterion("EXPAND3 >=", value, "expand3");
            return (Criteria) this;
        }

        public Criteria andExpand3LessThan(String value) {
            addCriterion("EXPAND3 <", value, "expand3");
            return (Criteria) this;
        }

        public Criteria andExpand3LessThanOrEqualTo(String value) {
            addCriterion("EXPAND3 <=", value, "expand3");
            return (Criteria) this;
        }

        public Criteria andExpand3Like(String value) {
            addCriterion("EXPAND3 like", value, "expand3");
            return (Criteria) this;
        }

        public Criteria andExpand3NotLike(String value) {
            addCriterion("EXPAND3 not like", value, "expand3");
            return (Criteria) this;
        }

        public Criteria andExpand3In(List<String> values) {
            addCriterion("EXPAND3 in", values, "expand3");
            return (Criteria) this;
        }

        public Criteria andExpand3NotIn(List<String> values) {
            addCriterion("EXPAND3 not in", values, "expand3");
            return (Criteria) this;
        }

        public Criteria andExpand3Between(String value1, String value2) {
            addCriterion("EXPAND3 between", value1, value2, "expand3");
            return (Criteria) this;
        }

        public Criteria andExpand3NotBetween(String value1, String value2) {
            addCriterion("EXPAND3 not between", value1, value2, "expand3");
            return (Criteria) this;
        }

        public Criteria andExpand4IsNull() {
            addCriterion("EXPAND4 is null");
            return (Criteria) this;
        }

        public Criteria andExpand4IsNotNull() {
            addCriterion("EXPAND4 is not null");
            return (Criteria) this;
        }

        public Criteria andExpand4EqualTo(String value) {
            addCriterion("EXPAND4 =", value, "expand4");
            return (Criteria) this;
        }

        public Criteria andExpand4NotEqualTo(String value) {
            addCriterion("EXPAND4 <>", value, "expand4");
            return (Criteria) this;
        }

        public Criteria andExpand4GreaterThan(String value) {
            addCriterion("EXPAND4 >", value, "expand4");
            return (Criteria) this;
        }

        public Criteria andExpand4GreaterThanOrEqualTo(String value) {
            addCriterion("EXPAND4 >=", value, "expand4");
            return (Criteria) this;
        }

        public Criteria andExpand4LessThan(String value) {
            addCriterion("EXPAND4 <", value, "expand4");
            return (Criteria) this;
        }

        public Criteria andExpand4LessThanOrEqualTo(String value) {
            addCriterion("EXPAND4 <=", value, "expand4");
            return (Criteria) this;
        }

        public Criteria andExpand4Like(String value) {
            addCriterion("EXPAND4 like", value, "expand4");
            return (Criteria) this;
        }

        public Criteria andExpand4NotLike(String value) {
            addCriterion("EXPAND4 not like", value, "expand4");
            return (Criteria) this;
        }

        public Criteria andExpand4In(List<String> values) {
            addCriterion("EXPAND4 in", values, "expand4");
            return (Criteria) this;
        }

        public Criteria andExpand4NotIn(List<String> values) {
            addCriterion("EXPAND4 not in", values, "expand4");
            return (Criteria) this;
        }

        public Criteria andExpand4Between(String value1, String value2) {
            addCriterion("EXPAND4 between", value1, value2, "expand4");
            return (Criteria) this;
        }

        public Criteria andExpand4NotBetween(String value1, String value2) {
            addCriterion("EXPAND4 not between", value1, value2, "expand4");
            return (Criteria) this;
        }

        public Criteria andExpand5IsNull() {
            addCriterion("EXPAND5 is null");
            return (Criteria) this;
        }

        public Criteria andExpand5IsNotNull() {
            addCriterion("EXPAND5 is not null");
            return (Criteria) this;
        }

        public Criteria andExpand5EqualTo(String value) {
            addCriterion("EXPAND5 =", value, "expand5");
            return (Criteria) this;
        }

        public Criteria andExpand5NotEqualTo(String value) {
            addCriterion("EXPAND5 <>", value, "expand5");
            return (Criteria) this;
        }

        public Criteria andExpand5GreaterThan(String value) {
            addCriterion("EXPAND5 >", value, "expand5");
            return (Criteria) this;
        }

        public Criteria andExpand5GreaterThanOrEqualTo(String value) {
            addCriterion("EXPAND5 >=", value, "expand5");
            return (Criteria) this;
        }

        public Criteria andExpand5LessThan(String value) {
            addCriterion("EXPAND5 <", value, "expand5");
            return (Criteria) this;
        }

        public Criteria andExpand5LessThanOrEqualTo(String value) {
            addCriterion("EXPAND5 <=", value, "expand5");
            return (Criteria) this;
        }

        public Criteria andExpand5Like(String value) {
            addCriterion("EXPAND5 like", value, "expand5");
            return (Criteria) this;
        }

        public Criteria andExpand5NotLike(String value) {
            addCriterion("EXPAND5 not like", value, "expand5");
            return (Criteria) this;
        }

        public Criteria andExpand5In(List<String> values) {
            addCriterion("EXPAND5 in", values, "expand5");
            return (Criteria) this;
        }

        public Criteria andExpand5NotIn(List<String> values) {
            addCriterion("EXPAND5 not in", values, "expand5");
            return (Criteria) this;
        }

        public Criteria andExpand5Between(String value1, String value2) {
            addCriterion("EXPAND5 between", value1, value2, "expand5");
            return (Criteria) this;
        }

        public Criteria andExpand5NotBetween(String value1, String value2) {
            addCriterion("EXPAND5 not between", value1, value2, "expand5");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("START_DATE =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("START_DATE <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("START_DATE >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("START_DATE >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterionForJDBCDate("START_DATE <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("START_DATE <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("START_DATE in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("START_DATE not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("START_DATE between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("START_DATE not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStopDateIsNull() {
            addCriterion("STOP_DATE is null");
            return (Criteria) this;
        }

        public Criteria andStopDateIsNotNull() {
            addCriterion("STOP_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andStopDateEqualTo(Date value) {
            addCriterionForJDBCDate("STOP_DATE =", value, "stopDate");
            return (Criteria) this;
        }

        public Criteria andStopDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("STOP_DATE <>", value, "stopDate");
            return (Criteria) this;
        }

        public Criteria andStopDateGreaterThan(Date value) {
            addCriterionForJDBCDate("STOP_DATE >", value, "stopDate");
            return (Criteria) this;
        }

        public Criteria andStopDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STOP_DATE >=", value, "stopDate");
            return (Criteria) this;
        }

        public Criteria andStopDateLessThan(Date value) {
            addCriterionForJDBCDate("STOP_DATE <", value, "stopDate");
            return (Criteria) this;
        }

        public Criteria andStopDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STOP_DATE <=", value, "stopDate");
            return (Criteria) this;
        }

        public Criteria andStopDateIn(List<Date> values) {
            addCriterionForJDBCDate("STOP_DATE in", values, "stopDate");
            return (Criteria) this;
        }

        public Criteria andStopDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("STOP_DATE not in", values, "stopDate");
            return (Criteria) this;
        }

        public Criteria andStopDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STOP_DATE between", value1, value2, "stopDate");
            return (Criteria) this;
        }

        public Criteria andStopDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STOP_DATE not between", value1, value2, "stopDate");
            return (Criteria) this;
        }

        public Criteria andItemStatusIsNull() {
            addCriterion("ITEM_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andItemStatusIsNotNull() {
            addCriterion("ITEM_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andItemStatusEqualTo(String value) {
            addCriterion("ITEM_STATUS =", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusNotEqualTo(String value) {
            addCriterion("ITEM_STATUS <>", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusGreaterThan(String value) {
            addCriterion("ITEM_STATUS >", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_STATUS >=", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusLessThan(String value) {
            addCriterion("ITEM_STATUS <", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusLessThanOrEqualTo(String value) {
            addCriterion("ITEM_STATUS <=", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusLike(String value) {
            addCriterion("ITEM_STATUS like", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusNotLike(String value) {
            addCriterion("ITEM_STATUS not like", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusIn(List<String> values) {
            addCriterion("ITEM_STATUS in", values, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusNotIn(List<String> values) {
            addCriterion("ITEM_STATUS not in", values, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusBetween(String value1, String value2) {
            addCriterion("ITEM_STATUS between", value1, value2, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusNotBetween(String value1, String value2) {
            addCriterion("ITEM_STATUS not between", value1, value2, "itemStatus");
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