package com.joe.input.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItDiagnosisDictExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItDiagnosisDictExample() {
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

        public Criteria andDiagnosisCodeIsNull() {
            addCriterion("DIAGNOSIS_CODE is null");
            return (Criteria) this;
        }

        public Criteria andDiagnosisCodeIsNotNull() {
            addCriterion("DIAGNOSIS_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnosisCodeEqualTo(String value) {
            addCriterion("DIAGNOSIS_CODE =", value, "diagnosisCode");
            return (Criteria) this;
        }

        public Criteria andDiagnosisCodeNotEqualTo(String value) {
            addCriterion("DIAGNOSIS_CODE <>", value, "diagnosisCode");
            return (Criteria) this;
        }

        public Criteria andDiagnosisCodeGreaterThan(String value) {
            addCriterion("DIAGNOSIS_CODE >", value, "diagnosisCode");
            return (Criteria) this;
        }

        public Criteria andDiagnosisCodeGreaterThanOrEqualTo(String value) {
            addCriterion("DIAGNOSIS_CODE >=", value, "diagnosisCode");
            return (Criteria) this;
        }

        public Criteria andDiagnosisCodeLessThan(String value) {
            addCriterion("DIAGNOSIS_CODE <", value, "diagnosisCode");
            return (Criteria) this;
        }

        public Criteria andDiagnosisCodeLessThanOrEqualTo(String value) {
            addCriterion("DIAGNOSIS_CODE <=", value, "diagnosisCode");
            return (Criteria) this;
        }

        public Criteria andDiagnosisCodeLike(String value) {
            addCriterion("DIAGNOSIS_CODE like", value, "diagnosisCode");
            return (Criteria) this;
        }

        public Criteria andDiagnosisCodeNotLike(String value) {
            addCriterion("DIAGNOSIS_CODE not like", value, "diagnosisCode");
            return (Criteria) this;
        }

        public Criteria andDiagnosisCodeIn(List<String> values) {
            addCriterion("DIAGNOSIS_CODE in", values, "diagnosisCode");
            return (Criteria) this;
        }

        public Criteria andDiagnosisCodeNotIn(List<String> values) {
            addCriterion("DIAGNOSIS_CODE not in", values, "diagnosisCode");
            return (Criteria) this;
        }

        public Criteria andDiagnosisCodeBetween(String value1, String value2) {
            addCriterion("DIAGNOSIS_CODE between", value1, value2, "diagnosisCode");
            return (Criteria) this;
        }

        public Criteria andDiagnosisCodeNotBetween(String value1, String value2) {
            addCriterion("DIAGNOSIS_CODE not between", value1, value2, "diagnosisCode");
            return (Criteria) this;
        }

        public Criteria andDiagnosisNameIsNull() {
            addCriterion("DIAGNOSIS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDiagnosisNameIsNotNull() {
            addCriterion("DIAGNOSIS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnosisNameEqualTo(String value) {
            addCriterion("DIAGNOSIS_NAME =", value, "diagnosisName");
            return (Criteria) this;
        }

        public Criteria andDiagnosisNameNotEqualTo(String value) {
            addCriterion("DIAGNOSIS_NAME <>", value, "diagnosisName");
            return (Criteria) this;
        }

        public Criteria andDiagnosisNameGreaterThan(String value) {
            addCriterion("DIAGNOSIS_NAME >", value, "diagnosisName");
            return (Criteria) this;
        }

        public Criteria andDiagnosisNameGreaterThanOrEqualTo(String value) {
            addCriterion("DIAGNOSIS_NAME >=", value, "diagnosisName");
            return (Criteria) this;
        }

        public Criteria andDiagnosisNameLessThan(String value) {
            addCriterion("DIAGNOSIS_NAME <", value, "diagnosisName");
            return (Criteria) this;
        }

        public Criteria andDiagnosisNameLessThanOrEqualTo(String value) {
            addCriterion("DIAGNOSIS_NAME <=", value, "diagnosisName");
            return (Criteria) this;
        }

        public Criteria andDiagnosisNameLike(String value) {
            addCriterion("DIAGNOSIS_NAME like", value, "diagnosisName");
            return (Criteria) this;
        }

        public Criteria andDiagnosisNameNotLike(String value) {
            addCriterion("DIAGNOSIS_NAME not like", value, "diagnosisName");
            return (Criteria) this;
        }

        public Criteria andDiagnosisNameIn(List<String> values) {
            addCriterion("DIAGNOSIS_NAME in", values, "diagnosisName");
            return (Criteria) this;
        }

        public Criteria andDiagnosisNameNotIn(List<String> values) {
            addCriterion("DIAGNOSIS_NAME not in", values, "diagnosisName");
            return (Criteria) this;
        }

        public Criteria andDiagnosisNameBetween(String value1, String value2) {
            addCriterion("DIAGNOSIS_NAME between", value1, value2, "diagnosisName");
            return (Criteria) this;
        }

        public Criteria andDiagnosisNameNotBetween(String value1, String value2) {
            addCriterion("DIAGNOSIS_NAME not between", value1, value2, "diagnosisName");
            return (Criteria) this;
        }

        public Criteria andStdIndicatorIsNull() {
            addCriterion("STD_INDICATOR is null");
            return (Criteria) this;
        }

        public Criteria andStdIndicatorIsNotNull() {
            addCriterion("STD_INDICATOR is not null");
            return (Criteria) this;
        }

        public Criteria andStdIndicatorEqualTo(Integer value) {
            addCriterion("STD_INDICATOR =", value, "stdIndicator");
            return (Criteria) this;
        }

        public Criteria andStdIndicatorNotEqualTo(Integer value) {
            addCriterion("STD_INDICATOR <>", value, "stdIndicator");
            return (Criteria) this;
        }

        public Criteria andStdIndicatorGreaterThan(Integer value) {
            addCriterion("STD_INDICATOR >", value, "stdIndicator");
            return (Criteria) this;
        }

        public Criteria andStdIndicatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("STD_INDICATOR >=", value, "stdIndicator");
            return (Criteria) this;
        }

        public Criteria andStdIndicatorLessThan(Integer value) {
            addCriterion("STD_INDICATOR <", value, "stdIndicator");
            return (Criteria) this;
        }

        public Criteria andStdIndicatorLessThanOrEqualTo(Integer value) {
            addCriterion("STD_INDICATOR <=", value, "stdIndicator");
            return (Criteria) this;
        }

        public Criteria andStdIndicatorIn(List<Integer> values) {
            addCriterion("STD_INDICATOR in", values, "stdIndicator");
            return (Criteria) this;
        }

        public Criteria andStdIndicatorNotIn(List<Integer> values) {
            addCriterion("STD_INDICATOR not in", values, "stdIndicator");
            return (Criteria) this;
        }

        public Criteria andStdIndicatorBetween(Integer value1, Integer value2) {
            addCriterion("STD_INDICATOR between", value1, value2, "stdIndicator");
            return (Criteria) this;
        }

        public Criteria andStdIndicatorNotBetween(Integer value1, Integer value2) {
            addCriterion("STD_INDICATOR not between", value1, value2, "stdIndicator");
            return (Criteria) this;
        }

        public Criteria andApprovedIndicatorIsNull() {
            addCriterion("APPROVED_INDICATOR is null");
            return (Criteria) this;
        }

        public Criteria andApprovedIndicatorIsNotNull() {
            addCriterion("APPROVED_INDICATOR is not null");
            return (Criteria) this;
        }

        public Criteria andApprovedIndicatorEqualTo(Integer value) {
            addCriterion("APPROVED_INDICATOR =", value, "approvedIndicator");
            return (Criteria) this;
        }

        public Criteria andApprovedIndicatorNotEqualTo(Integer value) {
            addCriterion("APPROVED_INDICATOR <>", value, "approvedIndicator");
            return (Criteria) this;
        }

        public Criteria andApprovedIndicatorGreaterThan(Integer value) {
            addCriterion("APPROVED_INDICATOR >", value, "approvedIndicator");
            return (Criteria) this;
        }

        public Criteria andApprovedIndicatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("APPROVED_INDICATOR >=", value, "approvedIndicator");
            return (Criteria) this;
        }

        public Criteria andApprovedIndicatorLessThan(Integer value) {
            addCriterion("APPROVED_INDICATOR <", value, "approvedIndicator");
            return (Criteria) this;
        }

        public Criteria andApprovedIndicatorLessThanOrEqualTo(Integer value) {
            addCriterion("APPROVED_INDICATOR <=", value, "approvedIndicator");
            return (Criteria) this;
        }

        public Criteria andApprovedIndicatorIn(List<Integer> values) {
            addCriterion("APPROVED_INDICATOR in", values, "approvedIndicator");
            return (Criteria) this;
        }

        public Criteria andApprovedIndicatorNotIn(List<Integer> values) {
            addCriterion("APPROVED_INDICATOR not in", values, "approvedIndicator");
            return (Criteria) this;
        }

        public Criteria andApprovedIndicatorBetween(Integer value1, Integer value2) {
            addCriterion("APPROVED_INDICATOR between", value1, value2, "approvedIndicator");
            return (Criteria) this;
        }

        public Criteria andApprovedIndicatorNotBetween(Integer value1, Integer value2) {
            addCriterion("APPROVED_INDICATOR not between", value1, value2, "approvedIndicator");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
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

        public Criteria andHealthLevelIsNull() {
            addCriterion("HEALTH_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andHealthLevelIsNotNull() {
            addCriterion("HEALTH_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andHealthLevelEqualTo(String value) {
            addCriterion("HEALTH_LEVEL =", value, "healthLevel");
            return (Criteria) this;
        }

        public Criteria andHealthLevelNotEqualTo(String value) {
            addCriterion("HEALTH_LEVEL <>", value, "healthLevel");
            return (Criteria) this;
        }

        public Criteria andHealthLevelGreaterThan(String value) {
            addCriterion("HEALTH_LEVEL >", value, "healthLevel");
            return (Criteria) this;
        }

        public Criteria andHealthLevelGreaterThanOrEqualTo(String value) {
            addCriterion("HEALTH_LEVEL >=", value, "healthLevel");
            return (Criteria) this;
        }

        public Criteria andHealthLevelLessThan(String value) {
            addCriterion("HEALTH_LEVEL <", value, "healthLevel");
            return (Criteria) this;
        }

        public Criteria andHealthLevelLessThanOrEqualTo(String value) {
            addCriterion("HEALTH_LEVEL <=", value, "healthLevel");
            return (Criteria) this;
        }

        public Criteria andHealthLevelLike(String value) {
            addCriterion("HEALTH_LEVEL like", value, "healthLevel");
            return (Criteria) this;
        }

        public Criteria andHealthLevelNotLike(String value) {
            addCriterion("HEALTH_LEVEL not like", value, "healthLevel");
            return (Criteria) this;
        }

        public Criteria andHealthLevelIn(List<String> values) {
            addCriterion("HEALTH_LEVEL in", values, "healthLevel");
            return (Criteria) this;
        }

        public Criteria andHealthLevelNotIn(List<String> values) {
            addCriterion("HEALTH_LEVEL not in", values, "healthLevel");
            return (Criteria) this;
        }

        public Criteria andHealthLevelBetween(String value1, String value2) {
            addCriterion("HEALTH_LEVEL between", value1, value2, "healthLevel");
            return (Criteria) this;
        }

        public Criteria andHealthLevelNotBetween(String value1, String value2) {
            addCriterion("HEALTH_LEVEL not between", value1, value2, "healthLevel");
            return (Criteria) this;
        }

        public Criteria andInfectIndicatorIsNull() {
            addCriterion("INFECT_INDICATOR is null");
            return (Criteria) this;
        }

        public Criteria andInfectIndicatorIsNotNull() {
            addCriterion("INFECT_INDICATOR is not null");
            return (Criteria) this;
        }

        public Criteria andInfectIndicatorEqualTo(String value) {
            addCriterion("INFECT_INDICATOR =", value, "infectIndicator");
            return (Criteria) this;
        }

        public Criteria andInfectIndicatorNotEqualTo(String value) {
            addCriterion("INFECT_INDICATOR <>", value, "infectIndicator");
            return (Criteria) this;
        }

        public Criteria andInfectIndicatorGreaterThan(String value) {
            addCriterion("INFECT_INDICATOR >", value, "infectIndicator");
            return (Criteria) this;
        }

        public Criteria andInfectIndicatorGreaterThanOrEqualTo(String value) {
            addCriterion("INFECT_INDICATOR >=", value, "infectIndicator");
            return (Criteria) this;
        }

        public Criteria andInfectIndicatorLessThan(String value) {
            addCriterion("INFECT_INDICATOR <", value, "infectIndicator");
            return (Criteria) this;
        }

        public Criteria andInfectIndicatorLessThanOrEqualTo(String value) {
            addCriterion("INFECT_INDICATOR <=", value, "infectIndicator");
            return (Criteria) this;
        }

        public Criteria andInfectIndicatorLike(String value) {
            addCriterion("INFECT_INDICATOR like", value, "infectIndicator");
            return (Criteria) this;
        }

        public Criteria andInfectIndicatorNotLike(String value) {
            addCriterion("INFECT_INDICATOR not like", value, "infectIndicator");
            return (Criteria) this;
        }

        public Criteria andInfectIndicatorIn(List<String> values) {
            addCriterion("INFECT_INDICATOR in", values, "infectIndicator");
            return (Criteria) this;
        }

        public Criteria andInfectIndicatorNotIn(List<String> values) {
            addCriterion("INFECT_INDICATOR not in", values, "infectIndicator");
            return (Criteria) this;
        }

        public Criteria andInfectIndicatorBetween(String value1, String value2) {
            addCriterion("INFECT_INDICATOR between", value1, value2, "infectIndicator");
            return (Criteria) this;
        }

        public Criteria andInfectIndicatorNotBetween(String value1, String value2) {
            addCriterion("INFECT_INDICATOR not between", value1, value2, "infectIndicator");
            return (Criteria) this;
        }

        public Criteria andInputCodeWbIsNull() {
            addCriterion("INPUT_CODE_WB is null");
            return (Criteria) this;
        }

        public Criteria andInputCodeWbIsNotNull() {
            addCriterion("INPUT_CODE_WB is not null");
            return (Criteria) this;
        }

        public Criteria andInputCodeWbEqualTo(String value) {
            addCriterion("INPUT_CODE_WB =", value, "inputCodeWb");
            return (Criteria) this;
        }

        public Criteria andInputCodeWbNotEqualTo(String value) {
            addCriterion("INPUT_CODE_WB <>", value, "inputCodeWb");
            return (Criteria) this;
        }

        public Criteria andInputCodeWbGreaterThan(String value) {
            addCriterion("INPUT_CODE_WB >", value, "inputCodeWb");
            return (Criteria) this;
        }

        public Criteria andInputCodeWbGreaterThanOrEqualTo(String value) {
            addCriterion("INPUT_CODE_WB >=", value, "inputCodeWb");
            return (Criteria) this;
        }

        public Criteria andInputCodeWbLessThan(String value) {
            addCriterion("INPUT_CODE_WB <", value, "inputCodeWb");
            return (Criteria) this;
        }

        public Criteria andInputCodeWbLessThanOrEqualTo(String value) {
            addCriterion("INPUT_CODE_WB <=", value, "inputCodeWb");
            return (Criteria) this;
        }

        public Criteria andInputCodeWbLike(String value) {
            addCriterion("INPUT_CODE_WB like", value, "inputCodeWb");
            return (Criteria) this;
        }

        public Criteria andInputCodeWbNotLike(String value) {
            addCriterion("INPUT_CODE_WB not like", value, "inputCodeWb");
            return (Criteria) this;
        }

        public Criteria andInputCodeWbIn(List<String> values) {
            addCriterion("INPUT_CODE_WB in", values, "inputCodeWb");
            return (Criteria) this;
        }

        public Criteria andInputCodeWbNotIn(List<String> values) {
            addCriterion("INPUT_CODE_WB not in", values, "inputCodeWb");
            return (Criteria) this;
        }

        public Criteria andInputCodeWbBetween(String value1, String value2) {
            addCriterion("INPUT_CODE_WB between", value1, value2, "inputCodeWb");
            return (Criteria) this;
        }

        public Criteria andInputCodeWbNotBetween(String value1, String value2) {
            addCriterion("INPUT_CODE_WB not between", value1, value2, "inputCodeWb");
            return (Criteria) this;
        }

        public Criteria andDiagIndicatorIsNull() {
            addCriterion("DIAG_INDICATOR is null");
            return (Criteria) this;
        }

        public Criteria andDiagIndicatorIsNotNull() {
            addCriterion("DIAG_INDICATOR is not null");
            return (Criteria) this;
        }

        public Criteria andDiagIndicatorEqualTo(Integer value) {
            addCriterion("DIAG_INDICATOR =", value, "diagIndicator");
            return (Criteria) this;
        }

        public Criteria andDiagIndicatorNotEqualTo(Integer value) {
            addCriterion("DIAG_INDICATOR <>", value, "diagIndicator");
            return (Criteria) this;
        }

        public Criteria andDiagIndicatorGreaterThan(Integer value) {
            addCriterion("DIAG_INDICATOR >", value, "diagIndicator");
            return (Criteria) this;
        }

        public Criteria andDiagIndicatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("DIAG_INDICATOR >=", value, "diagIndicator");
            return (Criteria) this;
        }

        public Criteria andDiagIndicatorLessThan(Integer value) {
            addCriterion("DIAG_INDICATOR <", value, "diagIndicator");
            return (Criteria) this;
        }

        public Criteria andDiagIndicatorLessThanOrEqualTo(Integer value) {
            addCriterion("DIAG_INDICATOR <=", value, "diagIndicator");
            return (Criteria) this;
        }

        public Criteria andDiagIndicatorIn(List<Integer> values) {
            addCriterion("DIAG_INDICATOR in", values, "diagIndicator");
            return (Criteria) this;
        }

        public Criteria andDiagIndicatorNotIn(List<Integer> values) {
            addCriterion("DIAG_INDICATOR not in", values, "diagIndicator");
            return (Criteria) this;
        }

        public Criteria andDiagIndicatorBetween(Integer value1, Integer value2) {
            addCriterion("DIAG_INDICATOR between", value1, value2, "diagIndicator");
            return (Criteria) this;
        }

        public Criteria andDiagIndicatorNotBetween(Integer value1, Integer value2) {
            addCriterion("DIAG_INDICATOR not between", value1, value2, "diagIndicator");
            return (Criteria) this;
        }

        public Criteria andNm1IsNull() {
            addCriterion("NM1 is null");
            return (Criteria) this;
        }

        public Criteria andNm1IsNotNull() {
            addCriterion("NM1 is not null");
            return (Criteria) this;
        }

        public Criteria andNm1EqualTo(String value) {
            addCriterion("NM1 =", value, "nm1");
            return (Criteria) this;
        }

        public Criteria andNm1NotEqualTo(String value) {
            addCriterion("NM1 <>", value, "nm1");
            return (Criteria) this;
        }

        public Criteria andNm1GreaterThan(String value) {
            addCriterion("NM1 >", value, "nm1");
            return (Criteria) this;
        }

        public Criteria andNm1GreaterThanOrEqualTo(String value) {
            addCriterion("NM1 >=", value, "nm1");
            return (Criteria) this;
        }

        public Criteria andNm1LessThan(String value) {
            addCriterion("NM1 <", value, "nm1");
            return (Criteria) this;
        }

        public Criteria andNm1LessThanOrEqualTo(String value) {
            addCriterion("NM1 <=", value, "nm1");
            return (Criteria) this;
        }

        public Criteria andNm1Like(String value) {
            addCriterion("NM1 like", value, "nm1");
            return (Criteria) this;
        }

        public Criteria andNm1NotLike(String value) {
            addCriterion("NM1 not like", value, "nm1");
            return (Criteria) this;
        }

        public Criteria andNm1In(List<String> values) {
            addCriterion("NM1 in", values, "nm1");
            return (Criteria) this;
        }

        public Criteria andNm1NotIn(List<String> values) {
            addCriterion("NM1 not in", values, "nm1");
            return (Criteria) this;
        }

        public Criteria andNm1Between(String value1, String value2) {
            addCriterion("NM1 between", value1, value2, "nm1");
            return (Criteria) this;
        }

        public Criteria andNm1NotBetween(String value1, String value2) {
            addCriterion("NM1 not between", value1, value2, "nm1");
            return (Criteria) this;
        }

        public Criteria andNm2IsNull() {
            addCriterion("NM2 is null");
            return (Criteria) this;
        }

        public Criteria andNm2IsNotNull() {
            addCriterion("NM2 is not null");
            return (Criteria) this;
        }

        public Criteria andNm2EqualTo(String value) {
            addCriterion("NM2 =", value, "nm2");
            return (Criteria) this;
        }

        public Criteria andNm2NotEqualTo(String value) {
            addCriterion("NM2 <>", value, "nm2");
            return (Criteria) this;
        }

        public Criteria andNm2GreaterThan(String value) {
            addCriterion("NM2 >", value, "nm2");
            return (Criteria) this;
        }

        public Criteria andNm2GreaterThanOrEqualTo(String value) {
            addCriterion("NM2 >=", value, "nm2");
            return (Criteria) this;
        }

        public Criteria andNm2LessThan(String value) {
            addCriterion("NM2 <", value, "nm2");
            return (Criteria) this;
        }

        public Criteria andNm2LessThanOrEqualTo(String value) {
            addCriterion("NM2 <=", value, "nm2");
            return (Criteria) this;
        }

        public Criteria andNm2Like(String value) {
            addCriterion("NM2 like", value, "nm2");
            return (Criteria) this;
        }

        public Criteria andNm2NotLike(String value) {
            addCriterion("NM2 not like", value, "nm2");
            return (Criteria) this;
        }

        public Criteria andNm2In(List<String> values) {
            addCriterion("NM2 in", values, "nm2");
            return (Criteria) this;
        }

        public Criteria andNm2NotIn(List<String> values) {
            addCriterion("NM2 not in", values, "nm2");
            return (Criteria) this;
        }

        public Criteria andNm2Between(String value1, String value2) {
            addCriterion("NM2 between", value1, value2, "nm2");
            return (Criteria) this;
        }

        public Criteria andNm2NotBetween(String value1, String value2) {
            addCriterion("NM2 not between", value1, value2, "nm2");
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