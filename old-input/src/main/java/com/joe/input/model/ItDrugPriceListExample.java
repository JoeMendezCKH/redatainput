package com.joe.input.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ItDrugPriceListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItDrugPriceListExample() {
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

        public Criteria andDrugCodeIsNull() {
            addCriterion("DRUG_CODE is null");
            return (Criteria) this;
        }

        public Criteria andDrugCodeIsNotNull() {
            addCriterion("DRUG_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andDrugCodeEqualTo(String value) {
            addCriterion("DRUG_CODE =", value, "drugCode");
            return (Criteria) this;
        }

        public Criteria andDrugCodeNotEqualTo(String value) {
            addCriterion("DRUG_CODE <>", value, "drugCode");
            return (Criteria) this;
        }

        public Criteria andDrugCodeGreaterThan(String value) {
            addCriterion("DRUG_CODE >", value, "drugCode");
            return (Criteria) this;
        }

        public Criteria andDrugCodeGreaterThanOrEqualTo(String value) {
            addCriterion("DRUG_CODE >=", value, "drugCode");
            return (Criteria) this;
        }

        public Criteria andDrugCodeLessThan(String value) {
            addCriterion("DRUG_CODE <", value, "drugCode");
            return (Criteria) this;
        }

        public Criteria andDrugCodeLessThanOrEqualTo(String value) {
            addCriterion("DRUG_CODE <=", value, "drugCode");
            return (Criteria) this;
        }

        public Criteria andDrugCodeLike(String value) {
            addCriterion("DRUG_CODE like", value, "drugCode");
            return (Criteria) this;
        }

        public Criteria andDrugCodeNotLike(String value) {
            addCriterion("DRUG_CODE not like", value, "drugCode");
            return (Criteria) this;
        }

        public Criteria andDrugCodeIn(List<String> values) {
            addCriterion("DRUG_CODE in", values, "drugCode");
            return (Criteria) this;
        }

        public Criteria andDrugCodeNotIn(List<String> values) {
            addCriterion("DRUG_CODE not in", values, "drugCode");
            return (Criteria) this;
        }

        public Criteria andDrugCodeBetween(String value1, String value2) {
            addCriterion("DRUG_CODE between", value1, value2, "drugCode");
            return (Criteria) this;
        }

        public Criteria andDrugCodeNotBetween(String value1, String value2) {
            addCriterion("DRUG_CODE not between", value1, value2, "drugCode");
            return (Criteria) this;
        }

        public Criteria andDrugSpecIsNull() {
            addCriterion("DRUG_SPEC is null");
            return (Criteria) this;
        }

        public Criteria andDrugSpecIsNotNull() {
            addCriterion("DRUG_SPEC is not null");
            return (Criteria) this;
        }

        public Criteria andDrugSpecEqualTo(String value) {
            addCriterion("DRUG_SPEC =", value, "drugSpec");
            return (Criteria) this;
        }

        public Criteria andDrugSpecNotEqualTo(String value) {
            addCriterion("DRUG_SPEC <>", value, "drugSpec");
            return (Criteria) this;
        }

        public Criteria andDrugSpecGreaterThan(String value) {
            addCriterion("DRUG_SPEC >", value, "drugSpec");
            return (Criteria) this;
        }

        public Criteria andDrugSpecGreaterThanOrEqualTo(String value) {
            addCriterion("DRUG_SPEC >=", value, "drugSpec");
            return (Criteria) this;
        }

        public Criteria andDrugSpecLessThan(String value) {
            addCriterion("DRUG_SPEC <", value, "drugSpec");
            return (Criteria) this;
        }

        public Criteria andDrugSpecLessThanOrEqualTo(String value) {
            addCriterion("DRUG_SPEC <=", value, "drugSpec");
            return (Criteria) this;
        }

        public Criteria andDrugSpecLike(String value) {
            addCriterion("DRUG_SPEC like", value, "drugSpec");
            return (Criteria) this;
        }

        public Criteria andDrugSpecNotLike(String value) {
            addCriterion("DRUG_SPEC not like", value, "drugSpec");
            return (Criteria) this;
        }

        public Criteria andDrugSpecIn(List<String> values) {
            addCriterion("DRUG_SPEC in", values, "drugSpec");
            return (Criteria) this;
        }

        public Criteria andDrugSpecNotIn(List<String> values) {
            addCriterion("DRUG_SPEC not in", values, "drugSpec");
            return (Criteria) this;
        }

        public Criteria andDrugSpecBetween(String value1, String value2) {
            addCriterion("DRUG_SPEC between", value1, value2, "drugSpec");
            return (Criteria) this;
        }

        public Criteria andDrugSpecNotBetween(String value1, String value2) {
            addCriterion("DRUG_SPEC not between", value1, value2, "drugSpec");
            return (Criteria) this;
        }

        public Criteria andFirmIdIsNull() {
            addCriterion("FIRM_ID is null");
            return (Criteria) this;
        }

        public Criteria andFirmIdIsNotNull() {
            addCriterion("FIRM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFirmIdEqualTo(String value) {
            addCriterion("FIRM_ID =", value, "firmId");
            return (Criteria) this;
        }

        public Criteria andFirmIdNotEqualTo(String value) {
            addCriterion("FIRM_ID <>", value, "firmId");
            return (Criteria) this;
        }

        public Criteria andFirmIdGreaterThan(String value) {
            addCriterion("FIRM_ID >", value, "firmId");
            return (Criteria) this;
        }

        public Criteria andFirmIdGreaterThanOrEqualTo(String value) {
            addCriterion("FIRM_ID >=", value, "firmId");
            return (Criteria) this;
        }

        public Criteria andFirmIdLessThan(String value) {
            addCriterion("FIRM_ID <", value, "firmId");
            return (Criteria) this;
        }

        public Criteria andFirmIdLessThanOrEqualTo(String value) {
            addCriterion("FIRM_ID <=", value, "firmId");
            return (Criteria) this;
        }

        public Criteria andFirmIdLike(String value) {
            addCriterion("FIRM_ID like", value, "firmId");
            return (Criteria) this;
        }

        public Criteria andFirmIdNotLike(String value) {
            addCriterion("FIRM_ID not like", value, "firmId");
            return (Criteria) this;
        }

        public Criteria andFirmIdIn(List<String> values) {
            addCriterion("FIRM_ID in", values, "firmId");
            return (Criteria) this;
        }

        public Criteria andFirmIdNotIn(List<String> values) {
            addCriterion("FIRM_ID not in", values, "firmId");
            return (Criteria) this;
        }

        public Criteria andFirmIdBetween(String value1, String value2) {
            addCriterion("FIRM_ID between", value1, value2, "firmId");
            return (Criteria) this;
        }

        public Criteria andFirmIdNotBetween(String value1, String value2) {
            addCriterion("FIRM_ID not between", value1, value2, "firmId");
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
            addCriterion("START_DATE =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterion("START_DATE <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterion("START_DATE >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("START_DATE >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterion("START_DATE <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterion("START_DATE <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterion("START_DATE in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterion("START_DATE not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterion("START_DATE between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterion("START_DATE not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andUnitsIsNull() {
            addCriterion("UNITS is null");
            return (Criteria) this;
        }

        public Criteria andUnitsIsNotNull() {
            addCriterion("UNITS is not null");
            return (Criteria) this;
        }

        public Criteria andUnitsEqualTo(String value) {
            addCriterion("UNITS =", value, "units");
            return (Criteria) this;
        }

        public Criteria andUnitsNotEqualTo(String value) {
            addCriterion("UNITS <>", value, "units");
            return (Criteria) this;
        }

        public Criteria andUnitsGreaterThan(String value) {
            addCriterion("UNITS >", value, "units");
            return (Criteria) this;
        }

        public Criteria andUnitsGreaterThanOrEqualTo(String value) {
            addCriterion("UNITS >=", value, "units");
            return (Criteria) this;
        }

        public Criteria andUnitsLessThan(String value) {
            addCriterion("UNITS <", value, "units");
            return (Criteria) this;
        }

        public Criteria andUnitsLessThanOrEqualTo(String value) {
            addCriterion("UNITS <=", value, "units");
            return (Criteria) this;
        }

        public Criteria andUnitsLike(String value) {
            addCriterion("UNITS like", value, "units");
            return (Criteria) this;
        }

        public Criteria andUnitsNotLike(String value) {
            addCriterion("UNITS not like", value, "units");
            return (Criteria) this;
        }

        public Criteria andUnitsIn(List<String> values) {
            addCriterion("UNITS in", values, "units");
            return (Criteria) this;
        }

        public Criteria andUnitsNotIn(List<String> values) {
            addCriterion("UNITS not in", values, "units");
            return (Criteria) this;
        }

        public Criteria andUnitsBetween(String value1, String value2) {
            addCriterion("UNITS between", value1, value2, "units");
            return (Criteria) this;
        }

        public Criteria andUnitsNotBetween(String value1, String value2) {
            addCriterion("UNITS not between", value1, value2, "units");
            return (Criteria) this;
        }

        public Criteria andTradePriceIsNull() {
            addCriterion("TRADE_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andTradePriceIsNotNull() {
            addCriterion("TRADE_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andTradePriceEqualTo(Float value) {
            addCriterion("TRADE_PRICE =", value, "tradePrice");
            return (Criteria) this;
        }

        public Criteria andTradePriceNotEqualTo(Float value) {
            addCriterion("TRADE_PRICE <>", value, "tradePrice");
            return (Criteria) this;
        }

        public Criteria andTradePriceGreaterThan(Float value) {
            addCriterion("TRADE_PRICE >", value, "tradePrice");
            return (Criteria) this;
        }

        public Criteria andTradePriceGreaterThanOrEqualTo(Float value) {
            addCriterion("TRADE_PRICE >=", value, "tradePrice");
            return (Criteria) this;
        }

        public Criteria andTradePriceLessThan(Float value) {
            addCriterion("TRADE_PRICE <", value, "tradePrice");
            return (Criteria) this;
        }

        public Criteria andTradePriceLessThanOrEqualTo(Float value) {
            addCriterion("TRADE_PRICE <=", value, "tradePrice");
            return (Criteria) this;
        }

        public Criteria andTradePriceIn(List<Float> values) {
            addCriterion("TRADE_PRICE in", values, "tradePrice");
            return (Criteria) this;
        }

        public Criteria andTradePriceNotIn(List<Float> values) {
            addCriterion("TRADE_PRICE not in", values, "tradePrice");
            return (Criteria) this;
        }

        public Criteria andTradePriceBetween(Float value1, Float value2) {
            addCriterion("TRADE_PRICE between", value1, value2, "tradePrice");
            return (Criteria) this;
        }

        public Criteria andTradePriceNotBetween(Float value1, Float value2) {
            addCriterion("TRADE_PRICE not between", value1, value2, "tradePrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceIsNull() {
            addCriterion("RETAIL_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andRetailPriceIsNotNull() {
            addCriterion("RETAIL_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andRetailPriceEqualTo(Float value) {
            addCriterion("RETAIL_PRICE =", value, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceNotEqualTo(Float value) {
            addCriterion("RETAIL_PRICE <>", value, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceGreaterThan(Float value) {
            addCriterion("RETAIL_PRICE >", value, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("RETAIL_PRICE >=", value, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceLessThan(Float value) {
            addCriterion("RETAIL_PRICE <", value, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceLessThanOrEqualTo(Float value) {
            addCriterion("RETAIL_PRICE <=", value, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceIn(List<Float> values) {
            addCriterion("RETAIL_PRICE in", values, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceNotIn(List<Float> values) {
            addCriterion("RETAIL_PRICE not in", values, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceBetween(Float value1, Float value2) {
            addCriterion("RETAIL_PRICE between", value1, value2, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceNotBetween(Float value1, Float value2) {
            addCriterion("RETAIL_PRICE not between", value1, value2, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andAmountPerPackageIsNull() {
            addCriterion("AMOUNT_PER_PACKAGE is null");
            return (Criteria) this;
        }

        public Criteria andAmountPerPackageIsNotNull() {
            addCriterion("AMOUNT_PER_PACKAGE is not null");
            return (Criteria) this;
        }

        public Criteria andAmountPerPackageEqualTo(Integer value) {
            addCriterion("AMOUNT_PER_PACKAGE =", value, "amountPerPackage");
            return (Criteria) this;
        }

        public Criteria andAmountPerPackageNotEqualTo(Integer value) {
            addCriterion("AMOUNT_PER_PACKAGE <>", value, "amountPerPackage");
            return (Criteria) this;
        }

        public Criteria andAmountPerPackageGreaterThan(Integer value) {
            addCriterion("AMOUNT_PER_PACKAGE >", value, "amountPerPackage");
            return (Criteria) this;
        }

        public Criteria andAmountPerPackageGreaterThanOrEqualTo(Integer value) {
            addCriterion("AMOUNT_PER_PACKAGE >=", value, "amountPerPackage");
            return (Criteria) this;
        }

        public Criteria andAmountPerPackageLessThan(Integer value) {
            addCriterion("AMOUNT_PER_PACKAGE <", value, "amountPerPackage");
            return (Criteria) this;
        }

        public Criteria andAmountPerPackageLessThanOrEqualTo(Integer value) {
            addCriterion("AMOUNT_PER_PACKAGE <=", value, "amountPerPackage");
            return (Criteria) this;
        }

        public Criteria andAmountPerPackageIn(List<Integer> values) {
            addCriterion("AMOUNT_PER_PACKAGE in", values, "amountPerPackage");
            return (Criteria) this;
        }

        public Criteria andAmountPerPackageNotIn(List<Integer> values) {
            addCriterion("AMOUNT_PER_PACKAGE not in", values, "amountPerPackage");
            return (Criteria) this;
        }

        public Criteria andAmountPerPackageBetween(Integer value1, Integer value2) {
            addCriterion("AMOUNT_PER_PACKAGE between", value1, value2, "amountPerPackage");
            return (Criteria) this;
        }

        public Criteria andAmountPerPackageNotBetween(Integer value1, Integer value2) {
            addCriterion("AMOUNT_PER_PACKAGE not between", value1, value2, "amountPerPackage");
            return (Criteria) this;
        }

        public Criteria andMinSpecIsNull() {
            addCriterion("MIN_SPEC is null");
            return (Criteria) this;
        }

        public Criteria andMinSpecIsNotNull() {
            addCriterion("MIN_SPEC is not null");
            return (Criteria) this;
        }

        public Criteria andMinSpecEqualTo(String value) {
            addCriterion("MIN_SPEC =", value, "minSpec");
            return (Criteria) this;
        }

        public Criteria andMinSpecNotEqualTo(String value) {
            addCriterion("MIN_SPEC <>", value, "minSpec");
            return (Criteria) this;
        }

        public Criteria andMinSpecGreaterThan(String value) {
            addCriterion("MIN_SPEC >", value, "minSpec");
            return (Criteria) this;
        }

        public Criteria andMinSpecGreaterThanOrEqualTo(String value) {
            addCriterion("MIN_SPEC >=", value, "minSpec");
            return (Criteria) this;
        }

        public Criteria andMinSpecLessThan(String value) {
            addCriterion("MIN_SPEC <", value, "minSpec");
            return (Criteria) this;
        }

        public Criteria andMinSpecLessThanOrEqualTo(String value) {
            addCriterion("MIN_SPEC <=", value, "minSpec");
            return (Criteria) this;
        }

        public Criteria andMinSpecLike(String value) {
            addCriterion("MIN_SPEC like", value, "minSpec");
            return (Criteria) this;
        }

        public Criteria andMinSpecNotLike(String value) {
            addCriterion("MIN_SPEC not like", value, "minSpec");
            return (Criteria) this;
        }

        public Criteria andMinSpecIn(List<String> values) {
            addCriterion("MIN_SPEC in", values, "minSpec");
            return (Criteria) this;
        }

        public Criteria andMinSpecNotIn(List<String> values) {
            addCriterion("MIN_SPEC not in", values, "minSpec");
            return (Criteria) this;
        }

        public Criteria andMinSpecBetween(String value1, String value2) {
            addCriterion("MIN_SPEC between", value1, value2, "minSpec");
            return (Criteria) this;
        }

        public Criteria andMinSpecNotBetween(String value1, String value2) {
            addCriterion("MIN_SPEC not between", value1, value2, "minSpec");
            return (Criteria) this;
        }

        public Criteria andMinUnitsIsNull() {
            addCriterion("MIN_UNITS is null");
            return (Criteria) this;
        }

        public Criteria andMinUnitsIsNotNull() {
            addCriterion("MIN_UNITS is not null");
            return (Criteria) this;
        }

        public Criteria andMinUnitsEqualTo(String value) {
            addCriterion("MIN_UNITS =", value, "minUnits");
            return (Criteria) this;
        }

        public Criteria andMinUnitsNotEqualTo(String value) {
            addCriterion("MIN_UNITS <>", value, "minUnits");
            return (Criteria) this;
        }

        public Criteria andMinUnitsGreaterThan(String value) {
            addCriterion("MIN_UNITS >", value, "minUnits");
            return (Criteria) this;
        }

        public Criteria andMinUnitsGreaterThanOrEqualTo(String value) {
            addCriterion("MIN_UNITS >=", value, "minUnits");
            return (Criteria) this;
        }

        public Criteria andMinUnitsLessThan(String value) {
            addCriterion("MIN_UNITS <", value, "minUnits");
            return (Criteria) this;
        }

        public Criteria andMinUnitsLessThanOrEqualTo(String value) {
            addCriterion("MIN_UNITS <=", value, "minUnits");
            return (Criteria) this;
        }

        public Criteria andMinUnitsLike(String value) {
            addCriterion("MIN_UNITS like", value, "minUnits");
            return (Criteria) this;
        }

        public Criteria andMinUnitsNotLike(String value) {
            addCriterion("MIN_UNITS not like", value, "minUnits");
            return (Criteria) this;
        }

        public Criteria andMinUnitsIn(List<String> values) {
            addCriterion("MIN_UNITS in", values, "minUnits");
            return (Criteria) this;
        }

        public Criteria andMinUnitsNotIn(List<String> values) {
            addCriterion("MIN_UNITS not in", values, "minUnits");
            return (Criteria) this;
        }

        public Criteria andMinUnitsBetween(String value1, String value2) {
            addCriterion("MIN_UNITS between", value1, value2, "minUnits");
            return (Criteria) this;
        }

        public Criteria andMinUnitsNotBetween(String value1, String value2) {
            addCriterion("MIN_UNITS not between", value1, value2, "minUnits");
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

        public Criteria andMemosIsNull() {
            addCriterion("MEMOS is null");
            return (Criteria) this;
        }

        public Criteria andMemosIsNotNull() {
            addCriterion("MEMOS is not null");
            return (Criteria) this;
        }

        public Criteria andMemosEqualTo(String value) {
            addCriterion("MEMOS =", value, "memos");
            return (Criteria) this;
        }

        public Criteria andMemosNotEqualTo(String value) {
            addCriterion("MEMOS <>", value, "memos");
            return (Criteria) this;
        }

        public Criteria andMemosGreaterThan(String value) {
            addCriterion("MEMOS >", value, "memos");
            return (Criteria) this;
        }

        public Criteria andMemosGreaterThanOrEqualTo(String value) {
            addCriterion("MEMOS >=", value, "memos");
            return (Criteria) this;
        }

        public Criteria andMemosLessThan(String value) {
            addCriterion("MEMOS <", value, "memos");
            return (Criteria) this;
        }

        public Criteria andMemosLessThanOrEqualTo(String value) {
            addCriterion("MEMOS <=", value, "memos");
            return (Criteria) this;
        }

        public Criteria andMemosLike(String value) {
            addCriterion("MEMOS like", value, "memos");
            return (Criteria) this;
        }

        public Criteria andMemosNotLike(String value) {
            addCriterion("MEMOS not like", value, "memos");
            return (Criteria) this;
        }

        public Criteria andMemosIn(List<String> values) {
            addCriterion("MEMOS in", values, "memos");
            return (Criteria) this;
        }

        public Criteria andMemosNotIn(List<String> values) {
            addCriterion("MEMOS not in", values, "memos");
            return (Criteria) this;
        }

        public Criteria andMemosBetween(String value1, String value2) {
            addCriterion("MEMOS between", value1, value2, "memos");
            return (Criteria) this;
        }

        public Criteria andMemosNotBetween(String value1, String value2) {
            addCriterion("MEMOS not between", value1, value2, "memos");
            return (Criteria) this;
        }

        public Criteria andClassOnInpRcptIsNull() {
            addCriterion("CLASS_ON_INP_RCPT is null");
            return (Criteria) this;
        }

        public Criteria andClassOnInpRcptIsNotNull() {
            addCriterion("CLASS_ON_INP_RCPT is not null");
            return (Criteria) this;
        }

        public Criteria andClassOnInpRcptEqualTo(String value) {
            addCriterion("CLASS_ON_INP_RCPT =", value, "classOnInpRcpt");
            return (Criteria) this;
        }

        public Criteria andClassOnInpRcptNotEqualTo(String value) {
            addCriterion("CLASS_ON_INP_RCPT <>", value, "classOnInpRcpt");
            return (Criteria) this;
        }

        public Criteria andClassOnInpRcptGreaterThan(String value) {
            addCriterion("CLASS_ON_INP_RCPT >", value, "classOnInpRcpt");
            return (Criteria) this;
        }

        public Criteria andClassOnInpRcptGreaterThanOrEqualTo(String value) {
            addCriterion("CLASS_ON_INP_RCPT >=", value, "classOnInpRcpt");
            return (Criteria) this;
        }

        public Criteria andClassOnInpRcptLessThan(String value) {
            addCriterion("CLASS_ON_INP_RCPT <", value, "classOnInpRcpt");
            return (Criteria) this;
        }

        public Criteria andClassOnInpRcptLessThanOrEqualTo(String value) {
            addCriterion("CLASS_ON_INP_RCPT <=", value, "classOnInpRcpt");
            return (Criteria) this;
        }

        public Criteria andClassOnInpRcptLike(String value) {
            addCriterion("CLASS_ON_INP_RCPT like", value, "classOnInpRcpt");
            return (Criteria) this;
        }

        public Criteria andClassOnInpRcptNotLike(String value) {
            addCriterion("CLASS_ON_INP_RCPT not like", value, "classOnInpRcpt");
            return (Criteria) this;
        }

        public Criteria andClassOnInpRcptIn(List<String> values) {
            addCriterion("CLASS_ON_INP_RCPT in", values, "classOnInpRcpt");
            return (Criteria) this;
        }

        public Criteria andClassOnInpRcptNotIn(List<String> values) {
            addCriterion("CLASS_ON_INP_RCPT not in", values, "classOnInpRcpt");
            return (Criteria) this;
        }

        public Criteria andClassOnInpRcptBetween(String value1, String value2) {
            addCriterion("CLASS_ON_INP_RCPT between", value1, value2, "classOnInpRcpt");
            return (Criteria) this;
        }

        public Criteria andClassOnInpRcptNotBetween(String value1, String value2) {
            addCriterion("CLASS_ON_INP_RCPT not between", value1, value2, "classOnInpRcpt");
            return (Criteria) this;
        }

        public Criteria andClassOnOutpRcptIsNull() {
            addCriterion("CLASS_ON_OUTP_RCPT is null");
            return (Criteria) this;
        }

        public Criteria andClassOnOutpRcptIsNotNull() {
            addCriterion("CLASS_ON_OUTP_RCPT is not null");
            return (Criteria) this;
        }

        public Criteria andClassOnOutpRcptEqualTo(String value) {
            addCriterion("CLASS_ON_OUTP_RCPT =", value, "classOnOutpRcpt");
            return (Criteria) this;
        }

        public Criteria andClassOnOutpRcptNotEqualTo(String value) {
            addCriterion("CLASS_ON_OUTP_RCPT <>", value, "classOnOutpRcpt");
            return (Criteria) this;
        }

        public Criteria andClassOnOutpRcptGreaterThan(String value) {
            addCriterion("CLASS_ON_OUTP_RCPT >", value, "classOnOutpRcpt");
            return (Criteria) this;
        }

        public Criteria andClassOnOutpRcptGreaterThanOrEqualTo(String value) {
            addCriterion("CLASS_ON_OUTP_RCPT >=", value, "classOnOutpRcpt");
            return (Criteria) this;
        }

        public Criteria andClassOnOutpRcptLessThan(String value) {
            addCriterion("CLASS_ON_OUTP_RCPT <", value, "classOnOutpRcpt");
            return (Criteria) this;
        }

        public Criteria andClassOnOutpRcptLessThanOrEqualTo(String value) {
            addCriterion("CLASS_ON_OUTP_RCPT <=", value, "classOnOutpRcpt");
            return (Criteria) this;
        }

        public Criteria andClassOnOutpRcptLike(String value) {
            addCriterion("CLASS_ON_OUTP_RCPT like", value, "classOnOutpRcpt");
            return (Criteria) this;
        }

        public Criteria andClassOnOutpRcptNotLike(String value) {
            addCriterion("CLASS_ON_OUTP_RCPT not like", value, "classOnOutpRcpt");
            return (Criteria) this;
        }

        public Criteria andClassOnOutpRcptIn(List<String> values) {
            addCriterion("CLASS_ON_OUTP_RCPT in", values, "classOnOutpRcpt");
            return (Criteria) this;
        }

        public Criteria andClassOnOutpRcptNotIn(List<String> values) {
            addCriterion("CLASS_ON_OUTP_RCPT not in", values, "classOnOutpRcpt");
            return (Criteria) this;
        }

        public Criteria andClassOnOutpRcptBetween(String value1, String value2) {
            addCriterion("CLASS_ON_OUTP_RCPT between", value1, value2, "classOnOutpRcpt");
            return (Criteria) this;
        }

        public Criteria andClassOnOutpRcptNotBetween(String value1, String value2) {
            addCriterion("CLASS_ON_OUTP_RCPT not between", value1, value2, "classOnOutpRcpt");
            return (Criteria) this;
        }

        public Criteria andClassOnReckoningIsNull() {
            addCriterion("CLASS_ON_RECKONING is null");
            return (Criteria) this;
        }

        public Criteria andClassOnReckoningIsNotNull() {
            addCriterion("CLASS_ON_RECKONING is not null");
            return (Criteria) this;
        }

        public Criteria andClassOnReckoningEqualTo(String value) {
            addCriterion("CLASS_ON_RECKONING =", value, "classOnReckoning");
            return (Criteria) this;
        }

        public Criteria andClassOnReckoningNotEqualTo(String value) {
            addCriterion("CLASS_ON_RECKONING <>", value, "classOnReckoning");
            return (Criteria) this;
        }

        public Criteria andClassOnReckoningGreaterThan(String value) {
            addCriterion("CLASS_ON_RECKONING >", value, "classOnReckoning");
            return (Criteria) this;
        }

        public Criteria andClassOnReckoningGreaterThanOrEqualTo(String value) {
            addCriterion("CLASS_ON_RECKONING >=", value, "classOnReckoning");
            return (Criteria) this;
        }

        public Criteria andClassOnReckoningLessThan(String value) {
            addCriterion("CLASS_ON_RECKONING <", value, "classOnReckoning");
            return (Criteria) this;
        }

        public Criteria andClassOnReckoningLessThanOrEqualTo(String value) {
            addCriterion("CLASS_ON_RECKONING <=", value, "classOnReckoning");
            return (Criteria) this;
        }

        public Criteria andClassOnReckoningLike(String value) {
            addCriterion("CLASS_ON_RECKONING like", value, "classOnReckoning");
            return (Criteria) this;
        }

        public Criteria andClassOnReckoningNotLike(String value) {
            addCriterion("CLASS_ON_RECKONING not like", value, "classOnReckoning");
            return (Criteria) this;
        }

        public Criteria andClassOnReckoningIn(List<String> values) {
            addCriterion("CLASS_ON_RECKONING in", values, "classOnReckoning");
            return (Criteria) this;
        }

        public Criteria andClassOnReckoningNotIn(List<String> values) {
            addCriterion("CLASS_ON_RECKONING not in", values, "classOnReckoning");
            return (Criteria) this;
        }

        public Criteria andClassOnReckoningBetween(String value1, String value2) {
            addCriterion("CLASS_ON_RECKONING between", value1, value2, "classOnReckoning");
            return (Criteria) this;
        }

        public Criteria andClassOnReckoningNotBetween(String value1, String value2) {
            addCriterion("CLASS_ON_RECKONING not between", value1, value2, "classOnReckoning");
            return (Criteria) this;
        }

        public Criteria andSubjCodeIsNull() {
            addCriterion("SUBJ_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSubjCodeIsNotNull() {
            addCriterion("SUBJ_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSubjCodeEqualTo(String value) {
            addCriterion("SUBJ_CODE =", value, "subjCode");
            return (Criteria) this;
        }

        public Criteria andSubjCodeNotEqualTo(String value) {
            addCriterion("SUBJ_CODE <>", value, "subjCode");
            return (Criteria) this;
        }

        public Criteria andSubjCodeGreaterThan(String value) {
            addCriterion("SUBJ_CODE >", value, "subjCode");
            return (Criteria) this;
        }

        public Criteria andSubjCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SUBJ_CODE >=", value, "subjCode");
            return (Criteria) this;
        }

        public Criteria andSubjCodeLessThan(String value) {
            addCriterion("SUBJ_CODE <", value, "subjCode");
            return (Criteria) this;
        }

        public Criteria andSubjCodeLessThanOrEqualTo(String value) {
            addCriterion("SUBJ_CODE <=", value, "subjCode");
            return (Criteria) this;
        }

        public Criteria andSubjCodeLike(String value) {
            addCriterion("SUBJ_CODE like", value, "subjCode");
            return (Criteria) this;
        }

        public Criteria andSubjCodeNotLike(String value) {
            addCriterion("SUBJ_CODE not like", value, "subjCode");
            return (Criteria) this;
        }

        public Criteria andSubjCodeIn(List<String> values) {
            addCriterion("SUBJ_CODE in", values, "subjCode");
            return (Criteria) this;
        }

        public Criteria andSubjCodeNotIn(List<String> values) {
            addCriterion("SUBJ_CODE not in", values, "subjCode");
            return (Criteria) this;
        }

        public Criteria andSubjCodeBetween(String value1, String value2) {
            addCriterion("SUBJ_CODE between", value1, value2, "subjCode");
            return (Criteria) this;
        }

        public Criteria andSubjCodeNotBetween(String value1, String value2) {
            addCriterion("SUBJ_CODE not between", value1, value2, "subjCode");
            return (Criteria) this;
        }

        public Criteria andClassOnMrIsNull() {
            addCriterion("CLASS_ON_MR is null");
            return (Criteria) this;
        }

        public Criteria andClassOnMrIsNotNull() {
            addCriterion("CLASS_ON_MR is not null");
            return (Criteria) this;
        }

        public Criteria andClassOnMrEqualTo(String value) {
            addCriterion("CLASS_ON_MR =", value, "classOnMr");
            return (Criteria) this;
        }

        public Criteria andClassOnMrNotEqualTo(String value) {
            addCriterion("CLASS_ON_MR <>", value, "classOnMr");
            return (Criteria) this;
        }

        public Criteria andClassOnMrGreaterThan(String value) {
            addCriterion("CLASS_ON_MR >", value, "classOnMr");
            return (Criteria) this;
        }

        public Criteria andClassOnMrGreaterThanOrEqualTo(String value) {
            addCriterion("CLASS_ON_MR >=", value, "classOnMr");
            return (Criteria) this;
        }

        public Criteria andClassOnMrLessThan(String value) {
            addCriterion("CLASS_ON_MR <", value, "classOnMr");
            return (Criteria) this;
        }

        public Criteria andClassOnMrLessThanOrEqualTo(String value) {
            addCriterion("CLASS_ON_MR <=", value, "classOnMr");
            return (Criteria) this;
        }

        public Criteria andClassOnMrLike(String value) {
            addCriterion("CLASS_ON_MR like", value, "classOnMr");
            return (Criteria) this;
        }

        public Criteria andClassOnMrNotLike(String value) {
            addCriterion("CLASS_ON_MR not like", value, "classOnMr");
            return (Criteria) this;
        }

        public Criteria andClassOnMrIn(List<String> values) {
            addCriterion("CLASS_ON_MR in", values, "classOnMr");
            return (Criteria) this;
        }

        public Criteria andClassOnMrNotIn(List<String> values) {
            addCriterion("CLASS_ON_MR not in", values, "classOnMr");
            return (Criteria) this;
        }

        public Criteria andClassOnMrBetween(String value1, String value2) {
            addCriterion("CLASS_ON_MR between", value1, value2, "classOnMr");
            return (Criteria) this;
        }

        public Criteria andClassOnMrNotBetween(String value1, String value2) {
            addCriterion("CLASS_ON_MR not between", value1, value2, "classOnMr");
            return (Criteria) this;
        }

        public Criteria andHlimitPriceIsNull() {
            addCriterion("HLIMIT_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andHlimitPriceIsNotNull() {
            addCriterion("HLIMIT_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andHlimitPriceEqualTo(Float value) {
            addCriterion("HLIMIT_PRICE =", value, "hlimitPrice");
            return (Criteria) this;
        }

        public Criteria andHlimitPriceNotEqualTo(Float value) {
            addCriterion("HLIMIT_PRICE <>", value, "hlimitPrice");
            return (Criteria) this;
        }

        public Criteria andHlimitPriceGreaterThan(Float value) {
            addCriterion("HLIMIT_PRICE >", value, "hlimitPrice");
            return (Criteria) this;
        }

        public Criteria andHlimitPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("HLIMIT_PRICE >=", value, "hlimitPrice");
            return (Criteria) this;
        }

        public Criteria andHlimitPriceLessThan(Float value) {
            addCriterion("HLIMIT_PRICE <", value, "hlimitPrice");
            return (Criteria) this;
        }

        public Criteria andHlimitPriceLessThanOrEqualTo(Float value) {
            addCriterion("HLIMIT_PRICE <=", value, "hlimitPrice");
            return (Criteria) this;
        }

        public Criteria andHlimitPriceIn(List<Float> values) {
            addCriterion("HLIMIT_PRICE in", values, "hlimitPrice");
            return (Criteria) this;
        }

        public Criteria andHlimitPriceNotIn(List<Float> values) {
            addCriterion("HLIMIT_PRICE not in", values, "hlimitPrice");
            return (Criteria) this;
        }

        public Criteria andHlimitPriceBetween(Float value1, Float value2) {
            addCriterion("HLIMIT_PRICE between", value1, value2, "hlimitPrice");
            return (Criteria) this;
        }

        public Criteria andHlimitPriceNotBetween(Float value1, Float value2) {
            addCriterion("HLIMIT_PRICE not between", value1, value2, "hlimitPrice");
            return (Criteria) this;
        }

        public Criteria andPriceClassIsNull() {
            addCriterion("PRICE_CLASS is null");
            return (Criteria) this;
        }

        public Criteria andPriceClassIsNotNull() {
            addCriterion("PRICE_CLASS is not null");
            return (Criteria) this;
        }

        public Criteria andPriceClassEqualTo(String value) {
            addCriterion("PRICE_CLASS =", value, "priceClass");
            return (Criteria) this;
        }

        public Criteria andPriceClassNotEqualTo(String value) {
            addCriterion("PRICE_CLASS <>", value, "priceClass");
            return (Criteria) this;
        }

        public Criteria andPriceClassGreaterThan(String value) {
            addCriterion("PRICE_CLASS >", value, "priceClass");
            return (Criteria) this;
        }

        public Criteria andPriceClassGreaterThanOrEqualTo(String value) {
            addCriterion("PRICE_CLASS >=", value, "priceClass");
            return (Criteria) this;
        }

        public Criteria andPriceClassLessThan(String value) {
            addCriterion("PRICE_CLASS <", value, "priceClass");
            return (Criteria) this;
        }

        public Criteria andPriceClassLessThanOrEqualTo(String value) {
            addCriterion("PRICE_CLASS <=", value, "priceClass");
            return (Criteria) this;
        }

        public Criteria andPriceClassLike(String value) {
            addCriterion("PRICE_CLASS like", value, "priceClass");
            return (Criteria) this;
        }

        public Criteria andPriceClassNotLike(String value) {
            addCriterion("PRICE_CLASS not like", value, "priceClass");
            return (Criteria) this;
        }

        public Criteria andPriceClassIn(List<String> values) {
            addCriterion("PRICE_CLASS in", values, "priceClass");
            return (Criteria) this;
        }

        public Criteria andPriceClassNotIn(List<String> values) {
            addCriterion("PRICE_CLASS not in", values, "priceClass");
            return (Criteria) this;
        }

        public Criteria andPriceClassBetween(String value1, String value2) {
            addCriterion("PRICE_CLASS between", value1, value2, "priceClass");
            return (Criteria) this;
        }

        public Criteria andPriceClassNotBetween(String value1, String value2) {
            addCriterion("PRICE_CLASS not between", value1, value2, "priceClass");
            return (Criteria) this;
        }

        public Criteria andPassNoIsNull() {
            addCriterion("PASS_NO is null");
            return (Criteria) this;
        }

        public Criteria andPassNoIsNotNull() {
            addCriterion("PASS_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPassNoEqualTo(String value) {
            addCriterion("PASS_NO =", value, "passNo");
            return (Criteria) this;
        }

        public Criteria andPassNoNotEqualTo(String value) {
            addCriterion("PASS_NO <>", value, "passNo");
            return (Criteria) this;
        }

        public Criteria andPassNoGreaterThan(String value) {
            addCriterion("PASS_NO >", value, "passNo");
            return (Criteria) this;
        }

        public Criteria andPassNoGreaterThanOrEqualTo(String value) {
            addCriterion("PASS_NO >=", value, "passNo");
            return (Criteria) this;
        }

        public Criteria andPassNoLessThan(String value) {
            addCriterion("PASS_NO <", value, "passNo");
            return (Criteria) this;
        }

        public Criteria andPassNoLessThanOrEqualTo(String value) {
            addCriterion("PASS_NO <=", value, "passNo");
            return (Criteria) this;
        }

        public Criteria andPassNoLike(String value) {
            addCriterion("PASS_NO like", value, "passNo");
            return (Criteria) this;
        }

        public Criteria andPassNoNotLike(String value) {
            addCriterion("PASS_NO not like", value, "passNo");
            return (Criteria) this;
        }

        public Criteria andPassNoIn(List<String> values) {
            addCriterion("PASS_NO in", values, "passNo");
            return (Criteria) this;
        }

        public Criteria andPassNoNotIn(List<String> values) {
            addCriterion("PASS_NO not in", values, "passNo");
            return (Criteria) this;
        }

        public Criteria andPassNoBetween(String value1, String value2) {
            addCriterion("PASS_NO between", value1, value2, "passNo");
            return (Criteria) this;
        }

        public Criteria andPassNoNotBetween(String value1, String value2) {
            addCriterion("PASS_NO not between", value1, value2, "passNo");
            return (Criteria) this;
        }

        public Criteria andGmpIsNull() {
            addCriterion("GMP is null");
            return (Criteria) this;
        }

        public Criteria andGmpIsNotNull() {
            addCriterion("GMP is not null");
            return (Criteria) this;
        }

        public Criteria andGmpEqualTo(Integer value) {
            addCriterion("GMP =", value, "gmp");
            return (Criteria) this;
        }

        public Criteria andGmpNotEqualTo(Integer value) {
            addCriterion("GMP <>", value, "gmp");
            return (Criteria) this;
        }

        public Criteria andGmpGreaterThan(Integer value) {
            addCriterion("GMP >", value, "gmp");
            return (Criteria) this;
        }

        public Criteria andGmpGreaterThanOrEqualTo(Integer value) {
            addCriterion("GMP >=", value, "gmp");
            return (Criteria) this;
        }

        public Criteria andGmpLessThan(Integer value) {
            addCriterion("GMP <", value, "gmp");
            return (Criteria) this;
        }

        public Criteria andGmpLessThanOrEqualTo(Integer value) {
            addCriterion("GMP <=", value, "gmp");
            return (Criteria) this;
        }

        public Criteria andGmpIn(List<Integer> values) {
            addCriterion("GMP in", values, "gmp");
            return (Criteria) this;
        }

        public Criteria andGmpNotIn(List<Integer> values) {
            addCriterion("GMP not in", values, "gmp");
            return (Criteria) this;
        }

        public Criteria andGmpBetween(Integer value1, Integer value2) {
            addCriterion("GMP between", value1, value2, "gmp");
            return (Criteria) this;
        }

        public Criteria andGmpNotBetween(Integer value1, Integer value2) {
            addCriterion("GMP not between", value1, value2, "gmp");
            return (Criteria) this;
        }

        public Criteria andChangedMemoIsNull() {
            addCriterion("CHANGED_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andChangedMemoIsNotNull() {
            addCriterion("CHANGED_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andChangedMemoEqualTo(String value) {
            addCriterion("CHANGED_MEMO =", value, "changedMemo");
            return (Criteria) this;
        }

        public Criteria andChangedMemoNotEqualTo(String value) {
            addCriterion("CHANGED_MEMO <>", value, "changedMemo");
            return (Criteria) this;
        }

        public Criteria andChangedMemoGreaterThan(String value) {
            addCriterion("CHANGED_MEMO >", value, "changedMemo");
            return (Criteria) this;
        }

        public Criteria andChangedMemoGreaterThanOrEqualTo(String value) {
            addCriterion("CHANGED_MEMO >=", value, "changedMemo");
            return (Criteria) this;
        }

        public Criteria andChangedMemoLessThan(String value) {
            addCriterion("CHANGED_MEMO <", value, "changedMemo");
            return (Criteria) this;
        }

        public Criteria andChangedMemoLessThanOrEqualTo(String value) {
            addCriterion("CHANGED_MEMO <=", value, "changedMemo");
            return (Criteria) this;
        }

        public Criteria andChangedMemoLike(String value) {
            addCriterion("CHANGED_MEMO like", value, "changedMemo");
            return (Criteria) this;
        }

        public Criteria andChangedMemoNotLike(String value) {
            addCriterion("CHANGED_MEMO not like", value, "changedMemo");
            return (Criteria) this;
        }

        public Criteria andChangedMemoIn(List<String> values) {
            addCriterion("CHANGED_MEMO in", values, "changedMemo");
            return (Criteria) this;
        }

        public Criteria andChangedMemoNotIn(List<String> values) {
            addCriterion("CHANGED_MEMO not in", values, "changedMemo");
            return (Criteria) this;
        }

        public Criteria andChangedMemoBetween(String value1, String value2) {
            addCriterion("CHANGED_MEMO between", value1, value2, "changedMemo");
            return (Criteria) this;
        }

        public Criteria andChangedMemoNotBetween(String value1, String value2) {
            addCriterion("CHANGED_MEMO not between", value1, value2, "changedMemo");
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