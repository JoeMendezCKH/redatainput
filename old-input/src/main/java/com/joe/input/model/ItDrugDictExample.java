package com.joe.input.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItDrugDictExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItDrugDictExample() {
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

        public Criteria andDrugIndicatorIsNull() {
            addCriterion("DRUG_INDICATOR is null");
            return (Criteria) this;
        }

        public Criteria andDrugIndicatorIsNotNull() {
            addCriterion("DRUG_INDICATOR is not null");
            return (Criteria) this;
        }

        public Criteria andDrugIndicatorEqualTo(Integer value) {
            addCriterion("DRUG_INDICATOR =", value, "drugIndicator");
            return (Criteria) this;
        }

        public Criteria andDrugIndicatorNotEqualTo(Integer value) {
            addCriterion("DRUG_INDICATOR <>", value, "drugIndicator");
            return (Criteria) this;
        }

        public Criteria andDrugIndicatorGreaterThan(Integer value) {
            addCriterion("DRUG_INDICATOR >", value, "drugIndicator");
            return (Criteria) this;
        }

        public Criteria andDrugIndicatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("DRUG_INDICATOR >=", value, "drugIndicator");
            return (Criteria) this;
        }

        public Criteria andDrugIndicatorLessThan(Integer value) {
            addCriterion("DRUG_INDICATOR <", value, "drugIndicator");
            return (Criteria) this;
        }

        public Criteria andDrugIndicatorLessThanOrEqualTo(Integer value) {
            addCriterion("DRUG_INDICATOR <=", value, "drugIndicator");
            return (Criteria) this;
        }

        public Criteria andDrugIndicatorIn(List<Integer> values) {
            addCriterion("DRUG_INDICATOR in", values, "drugIndicator");
            return (Criteria) this;
        }

        public Criteria andDrugIndicatorNotIn(List<Integer> values) {
            addCriterion("DRUG_INDICATOR not in", values, "drugIndicator");
            return (Criteria) this;
        }

        public Criteria andDrugIndicatorBetween(Integer value1, Integer value2) {
            addCriterion("DRUG_INDICATOR between", value1, value2, "drugIndicator");
            return (Criteria) this;
        }

        public Criteria andDrugIndicatorNotBetween(Integer value1, Integer value2) {
            addCriterion("DRUG_INDICATOR not between", value1, value2, "drugIndicator");
            return (Criteria) this;
        }

        public Criteria andDrugNameIsNull() {
            addCriterion("DRUG_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDrugNameIsNotNull() {
            addCriterion("DRUG_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDrugNameEqualTo(String value) {
            addCriterion("DRUG_NAME =", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameNotEqualTo(String value) {
            addCriterion("DRUG_NAME <>", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameGreaterThan(String value) {
            addCriterion("DRUG_NAME >", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameGreaterThanOrEqualTo(String value) {
            addCriterion("DRUG_NAME >=", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameLessThan(String value) {
            addCriterion("DRUG_NAME <", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameLessThanOrEqualTo(String value) {
            addCriterion("DRUG_NAME <=", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameLike(String value) {
            addCriterion("DRUG_NAME like", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameNotLike(String value) {
            addCriterion("DRUG_NAME not like", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameIn(List<String> values) {
            addCriterion("DRUG_NAME in", values, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameNotIn(List<String> values) {
            addCriterion("DRUG_NAME not in", values, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameBetween(String value1, String value2) {
            addCriterion("DRUG_NAME between", value1, value2, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameNotBetween(String value1, String value2) {
            addCriterion("DRUG_NAME not between", value1, value2, "drugName");
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

        public Criteria andDrugFormIsNull() {
            addCriterion("DRUG_FORM is null");
            return (Criteria) this;
        }

        public Criteria andDrugFormIsNotNull() {
            addCriterion("DRUG_FORM is not null");
            return (Criteria) this;
        }

        public Criteria andDrugFormEqualTo(String value) {
            addCriterion("DRUG_FORM =", value, "drugForm");
            return (Criteria) this;
        }

        public Criteria andDrugFormNotEqualTo(String value) {
            addCriterion("DRUG_FORM <>", value, "drugForm");
            return (Criteria) this;
        }

        public Criteria andDrugFormGreaterThan(String value) {
            addCriterion("DRUG_FORM >", value, "drugForm");
            return (Criteria) this;
        }

        public Criteria andDrugFormGreaterThanOrEqualTo(String value) {
            addCriterion("DRUG_FORM >=", value, "drugForm");
            return (Criteria) this;
        }

        public Criteria andDrugFormLessThan(String value) {
            addCriterion("DRUG_FORM <", value, "drugForm");
            return (Criteria) this;
        }

        public Criteria andDrugFormLessThanOrEqualTo(String value) {
            addCriterion("DRUG_FORM <=", value, "drugForm");
            return (Criteria) this;
        }

        public Criteria andDrugFormLike(String value) {
            addCriterion("DRUG_FORM like", value, "drugForm");
            return (Criteria) this;
        }

        public Criteria andDrugFormNotLike(String value) {
            addCriterion("DRUG_FORM not like", value, "drugForm");
            return (Criteria) this;
        }

        public Criteria andDrugFormIn(List<String> values) {
            addCriterion("DRUG_FORM in", values, "drugForm");
            return (Criteria) this;
        }

        public Criteria andDrugFormNotIn(List<String> values) {
            addCriterion("DRUG_FORM not in", values, "drugForm");
            return (Criteria) this;
        }

        public Criteria andDrugFormBetween(String value1, String value2) {
            addCriterion("DRUG_FORM between", value1, value2, "drugForm");
            return (Criteria) this;
        }

        public Criteria andDrugFormNotBetween(String value1, String value2) {
            addCriterion("DRUG_FORM not between", value1, value2, "drugForm");
            return (Criteria) this;
        }

        public Criteria andToxiPropertyIsNull() {
            addCriterion("TOXI_PROPERTY is null");
            return (Criteria) this;
        }

        public Criteria andToxiPropertyIsNotNull() {
            addCriterion("TOXI_PROPERTY is not null");
            return (Criteria) this;
        }

        public Criteria andToxiPropertyEqualTo(String value) {
            addCriterion("TOXI_PROPERTY =", value, "toxiProperty");
            return (Criteria) this;
        }

        public Criteria andToxiPropertyNotEqualTo(String value) {
            addCriterion("TOXI_PROPERTY <>", value, "toxiProperty");
            return (Criteria) this;
        }

        public Criteria andToxiPropertyGreaterThan(String value) {
            addCriterion("TOXI_PROPERTY >", value, "toxiProperty");
            return (Criteria) this;
        }

        public Criteria andToxiPropertyGreaterThanOrEqualTo(String value) {
            addCriterion("TOXI_PROPERTY >=", value, "toxiProperty");
            return (Criteria) this;
        }

        public Criteria andToxiPropertyLessThan(String value) {
            addCriterion("TOXI_PROPERTY <", value, "toxiProperty");
            return (Criteria) this;
        }

        public Criteria andToxiPropertyLessThanOrEqualTo(String value) {
            addCriterion("TOXI_PROPERTY <=", value, "toxiProperty");
            return (Criteria) this;
        }

        public Criteria andToxiPropertyLike(String value) {
            addCriterion("TOXI_PROPERTY like", value, "toxiProperty");
            return (Criteria) this;
        }

        public Criteria andToxiPropertyNotLike(String value) {
            addCriterion("TOXI_PROPERTY not like", value, "toxiProperty");
            return (Criteria) this;
        }

        public Criteria andToxiPropertyIn(List<String> values) {
            addCriterion("TOXI_PROPERTY in", values, "toxiProperty");
            return (Criteria) this;
        }

        public Criteria andToxiPropertyNotIn(List<String> values) {
            addCriterion("TOXI_PROPERTY not in", values, "toxiProperty");
            return (Criteria) this;
        }

        public Criteria andToxiPropertyBetween(String value1, String value2) {
            addCriterion("TOXI_PROPERTY between", value1, value2, "toxiProperty");
            return (Criteria) this;
        }

        public Criteria andToxiPropertyNotBetween(String value1, String value2) {
            addCriterion("TOXI_PROPERTY not between", value1, value2, "toxiProperty");
            return (Criteria) this;
        }

        public Criteria andDosePerUnitIsNull() {
            addCriterion("DOSE_PER_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andDosePerUnitIsNotNull() {
            addCriterion("DOSE_PER_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andDosePerUnitEqualTo(Float value) {
            addCriterion("DOSE_PER_UNIT =", value, "dosePerUnit");
            return (Criteria) this;
        }

        public Criteria andDosePerUnitNotEqualTo(Float value) {
            addCriterion("DOSE_PER_UNIT <>", value, "dosePerUnit");
            return (Criteria) this;
        }

        public Criteria andDosePerUnitGreaterThan(Float value) {
            addCriterion("DOSE_PER_UNIT >", value, "dosePerUnit");
            return (Criteria) this;
        }

        public Criteria andDosePerUnitGreaterThanOrEqualTo(Float value) {
            addCriterion("DOSE_PER_UNIT >=", value, "dosePerUnit");
            return (Criteria) this;
        }

        public Criteria andDosePerUnitLessThan(Float value) {
            addCriterion("DOSE_PER_UNIT <", value, "dosePerUnit");
            return (Criteria) this;
        }

        public Criteria andDosePerUnitLessThanOrEqualTo(Float value) {
            addCriterion("DOSE_PER_UNIT <=", value, "dosePerUnit");
            return (Criteria) this;
        }

        public Criteria andDosePerUnitIn(List<Float> values) {
            addCriterion("DOSE_PER_UNIT in", values, "dosePerUnit");
            return (Criteria) this;
        }

        public Criteria andDosePerUnitNotIn(List<Float> values) {
            addCriterion("DOSE_PER_UNIT not in", values, "dosePerUnit");
            return (Criteria) this;
        }

        public Criteria andDosePerUnitBetween(Float value1, Float value2) {
            addCriterion("DOSE_PER_UNIT between", value1, value2, "dosePerUnit");
            return (Criteria) this;
        }

        public Criteria andDosePerUnitNotBetween(Float value1, Float value2) {
            addCriterion("DOSE_PER_UNIT not between", value1, value2, "dosePerUnit");
            return (Criteria) this;
        }

        public Criteria andDoseUnitsIsNull() {
            addCriterion("DOSE_UNITS is null");
            return (Criteria) this;
        }

        public Criteria andDoseUnitsIsNotNull() {
            addCriterion("DOSE_UNITS is not null");
            return (Criteria) this;
        }

        public Criteria andDoseUnitsEqualTo(String value) {
            addCriterion("DOSE_UNITS =", value, "doseUnits");
            return (Criteria) this;
        }

        public Criteria andDoseUnitsNotEqualTo(String value) {
            addCriterion("DOSE_UNITS <>", value, "doseUnits");
            return (Criteria) this;
        }

        public Criteria andDoseUnitsGreaterThan(String value) {
            addCriterion("DOSE_UNITS >", value, "doseUnits");
            return (Criteria) this;
        }

        public Criteria andDoseUnitsGreaterThanOrEqualTo(String value) {
            addCriterion("DOSE_UNITS >=", value, "doseUnits");
            return (Criteria) this;
        }

        public Criteria andDoseUnitsLessThan(String value) {
            addCriterion("DOSE_UNITS <", value, "doseUnits");
            return (Criteria) this;
        }

        public Criteria andDoseUnitsLessThanOrEqualTo(String value) {
            addCriterion("DOSE_UNITS <=", value, "doseUnits");
            return (Criteria) this;
        }

        public Criteria andDoseUnitsLike(String value) {
            addCriterion("DOSE_UNITS like", value, "doseUnits");
            return (Criteria) this;
        }

        public Criteria andDoseUnitsNotLike(String value) {
            addCriterion("DOSE_UNITS not like", value, "doseUnits");
            return (Criteria) this;
        }

        public Criteria andDoseUnitsIn(List<String> values) {
            addCriterion("DOSE_UNITS in", values, "doseUnits");
            return (Criteria) this;
        }

        public Criteria andDoseUnitsNotIn(List<String> values) {
            addCriterion("DOSE_UNITS not in", values, "doseUnits");
            return (Criteria) this;
        }

        public Criteria andDoseUnitsBetween(String value1, String value2) {
            addCriterion("DOSE_UNITS between", value1, value2, "doseUnits");
            return (Criteria) this;
        }

        public Criteria andDoseUnitsNotBetween(String value1, String value2) {
            addCriterion("DOSE_UNITS not between", value1, value2, "doseUnits");
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

        public Criteria andOtcIsNull() {
            addCriterion("OTC is null");
            return (Criteria) this;
        }

        public Criteria andOtcIsNotNull() {
            addCriterion("OTC is not null");
            return (Criteria) this;
        }

        public Criteria andOtcEqualTo(String value) {
            addCriterion("OTC =", value, "otc");
            return (Criteria) this;
        }

        public Criteria andOtcNotEqualTo(String value) {
            addCriterion("OTC <>", value, "otc");
            return (Criteria) this;
        }

        public Criteria andOtcGreaterThan(String value) {
            addCriterion("OTC >", value, "otc");
            return (Criteria) this;
        }

        public Criteria andOtcGreaterThanOrEqualTo(String value) {
            addCriterion("OTC >=", value, "otc");
            return (Criteria) this;
        }

        public Criteria andOtcLessThan(String value) {
            addCriterion("OTC <", value, "otc");
            return (Criteria) this;
        }

        public Criteria andOtcLessThanOrEqualTo(String value) {
            addCriterion("OTC <=", value, "otc");
            return (Criteria) this;
        }

        public Criteria andOtcLike(String value) {
            addCriterion("OTC like", value, "otc");
            return (Criteria) this;
        }

        public Criteria andOtcNotLike(String value) {
            addCriterion("OTC not like", value, "otc");
            return (Criteria) this;
        }

        public Criteria andOtcIn(List<String> values) {
            addCriterion("OTC in", values, "otc");
            return (Criteria) this;
        }

        public Criteria andOtcNotIn(List<String> values) {
            addCriterion("OTC not in", values, "otc");
            return (Criteria) this;
        }

        public Criteria andOtcBetween(String value1, String value2) {
            addCriterion("OTC between", value1, value2, "otc");
            return (Criteria) this;
        }

        public Criteria andOtcNotBetween(String value1, String value2) {
            addCriterion("OTC not between", value1, value2, "otc");
            return (Criteria) this;
        }

        public Criteria andLimitClassIsNull() {
            addCriterion("LIMIT_CLASS is null");
            return (Criteria) this;
        }

        public Criteria andLimitClassIsNotNull() {
            addCriterion("LIMIT_CLASS is not null");
            return (Criteria) this;
        }

        public Criteria andLimitClassEqualTo(String value) {
            addCriterion("LIMIT_CLASS =", value, "limitClass");
            return (Criteria) this;
        }

        public Criteria andLimitClassNotEqualTo(String value) {
            addCriterion("LIMIT_CLASS <>", value, "limitClass");
            return (Criteria) this;
        }

        public Criteria andLimitClassGreaterThan(String value) {
            addCriterion("LIMIT_CLASS >", value, "limitClass");
            return (Criteria) this;
        }

        public Criteria andLimitClassGreaterThanOrEqualTo(String value) {
            addCriterion("LIMIT_CLASS >=", value, "limitClass");
            return (Criteria) this;
        }

        public Criteria andLimitClassLessThan(String value) {
            addCriterion("LIMIT_CLASS <", value, "limitClass");
            return (Criteria) this;
        }

        public Criteria andLimitClassLessThanOrEqualTo(String value) {
            addCriterion("LIMIT_CLASS <=", value, "limitClass");
            return (Criteria) this;
        }

        public Criteria andLimitClassLike(String value) {
            addCriterion("LIMIT_CLASS like", value, "limitClass");
            return (Criteria) this;
        }

        public Criteria andLimitClassNotLike(String value) {
            addCriterion("LIMIT_CLASS not like", value, "limitClass");
            return (Criteria) this;
        }

        public Criteria andLimitClassIn(List<String> values) {
            addCriterion("LIMIT_CLASS in", values, "limitClass");
            return (Criteria) this;
        }

        public Criteria andLimitClassNotIn(List<String> values) {
            addCriterion("LIMIT_CLASS not in", values, "limitClass");
            return (Criteria) this;
        }

        public Criteria andLimitClassBetween(String value1, String value2) {
            addCriterion("LIMIT_CLASS between", value1, value2, "limitClass");
            return (Criteria) this;
        }

        public Criteria andLimitClassNotBetween(String value1, String value2) {
            addCriterion("LIMIT_CLASS not between", value1, value2, "limitClass");
            return (Criteria) this;
        }

        public Criteria andStopFlagIsNull() {
            addCriterion("STOP_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andStopFlagIsNotNull() {
            addCriterion("STOP_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andStopFlagEqualTo(Integer value) {
            addCriterion("STOP_FLAG =", value, "stopFlag");
            return (Criteria) this;
        }

        public Criteria andStopFlagNotEqualTo(Integer value) {
            addCriterion("STOP_FLAG <>", value, "stopFlag");
            return (Criteria) this;
        }

        public Criteria andStopFlagGreaterThan(Integer value) {
            addCriterion("STOP_FLAG >", value, "stopFlag");
            return (Criteria) this;
        }

        public Criteria andStopFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("STOP_FLAG >=", value, "stopFlag");
            return (Criteria) this;
        }

        public Criteria andStopFlagLessThan(Integer value) {
            addCriterion("STOP_FLAG <", value, "stopFlag");
            return (Criteria) this;
        }

        public Criteria andStopFlagLessThanOrEqualTo(Integer value) {
            addCriterion("STOP_FLAG <=", value, "stopFlag");
            return (Criteria) this;
        }

        public Criteria andStopFlagIn(List<Integer> values) {
            addCriterion("STOP_FLAG in", values, "stopFlag");
            return (Criteria) this;
        }

        public Criteria andStopFlagNotIn(List<Integer> values) {
            addCriterion("STOP_FLAG not in", values, "stopFlag");
            return (Criteria) this;
        }

        public Criteria andStopFlagBetween(Integer value1, Integer value2) {
            addCriterion("STOP_FLAG between", value1, value2, "stopFlag");
            return (Criteria) this;
        }

        public Criteria andStopFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("STOP_FLAG not between", value1, value2, "stopFlag");
            return (Criteria) this;
        }

        public Criteria andEnteredDatetimeIsNull() {
            addCriterion("ENTERED_DATETIME is null");
            return (Criteria) this;
        }

        public Criteria andEnteredDatetimeIsNotNull() {
            addCriterion("ENTERED_DATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andEnteredDatetimeEqualTo(Date value) {
            addCriterion("ENTERED_DATETIME =", value, "enteredDatetime");
            return (Criteria) this;
        }

        public Criteria andEnteredDatetimeNotEqualTo(Date value) {
            addCriterion("ENTERED_DATETIME <>", value, "enteredDatetime");
            return (Criteria) this;
        }

        public Criteria andEnteredDatetimeGreaterThan(Date value) {
            addCriterion("ENTERED_DATETIME >", value, "enteredDatetime");
            return (Criteria) this;
        }

        public Criteria andEnteredDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ENTERED_DATETIME >=", value, "enteredDatetime");
            return (Criteria) this;
        }

        public Criteria andEnteredDatetimeLessThan(Date value) {
            addCriterion("ENTERED_DATETIME <", value, "enteredDatetime");
            return (Criteria) this;
        }

        public Criteria andEnteredDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("ENTERED_DATETIME <=", value, "enteredDatetime");
            return (Criteria) this;
        }

        public Criteria andEnteredDatetimeIn(List<Date> values) {
            addCriterion("ENTERED_DATETIME in", values, "enteredDatetime");
            return (Criteria) this;
        }

        public Criteria andEnteredDatetimeNotIn(List<Date> values) {
            addCriterion("ENTERED_DATETIME not in", values, "enteredDatetime");
            return (Criteria) this;
        }

        public Criteria andEnteredDatetimeBetween(Date value1, Date value2) {
            addCriterion("ENTERED_DATETIME between", value1, value2, "enteredDatetime");
            return (Criteria) this;
        }

        public Criteria andEnteredDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("ENTERED_DATETIME not between", value1, value2, "enteredDatetime");
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