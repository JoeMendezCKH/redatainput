package com.joe.input.model;

import java.util.ArrayList;
import java.util.List;

public class ItDeptDictExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItDeptDictExample() {
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

        public Criteria andDeptCodeIsNull() {
            addCriterion("DEPT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIsNotNull() {
            addCriterion("DEPT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andDeptCodeEqualTo(String value) {
            addCriterion("DEPT_CODE =", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotEqualTo(String value) {
            addCriterion("DEPT_CODE <>", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeGreaterThan(String value) {
            addCriterion("DEPT_CODE >", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_CODE >=", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLessThan(String value) {
            addCriterion("DEPT_CODE <", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLessThanOrEqualTo(String value) {
            addCriterion("DEPT_CODE <=", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLike(String value) {
            addCriterion("DEPT_CODE like", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotLike(String value) {
            addCriterion("DEPT_CODE not like", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIn(List<String> values) {
            addCriterion("DEPT_CODE in", values, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotIn(List<String> values) {
            addCriterion("DEPT_CODE not in", values, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeBetween(String value1, String value2) {
            addCriterion("DEPT_CODE between", value1, value2, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotBetween(String value1, String value2) {
            addCriterion("DEPT_CODE not between", value1, value2, "deptCode");
            return (Criteria) this;
        }

        public Criteria andSerialNoIsNull() {
            addCriterion("SERIAL_NO is null");
            return (Criteria) this;
        }

        public Criteria andSerialNoIsNotNull() {
            addCriterion("SERIAL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSerialNoEqualTo(Integer value) {
            addCriterion("SERIAL_NO =", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoNotEqualTo(Integer value) {
            addCriterion("SERIAL_NO <>", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoGreaterThan(Integer value) {
            addCriterion("SERIAL_NO >", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("SERIAL_NO >=", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoLessThan(Integer value) {
            addCriterion("SERIAL_NO <", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoLessThanOrEqualTo(Integer value) {
            addCriterion("SERIAL_NO <=", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoIn(List<Integer> values) {
            addCriterion("SERIAL_NO in", values, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoNotIn(List<Integer> values) {
            addCriterion("SERIAL_NO not in", values, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoBetween(Integer value1, Integer value2) {
            addCriterion("SERIAL_NO between", value1, value2, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoNotBetween(Integer value1, Integer value2) {
            addCriterion("SERIAL_NO not between", value1, value2, "serialNo");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNull() {
            addCriterion("DEPT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNotNull() {
            addCriterion("DEPT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDeptNameEqualTo(String value) {
            addCriterion("DEPT_NAME =", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotEqualTo(String value) {
            addCriterion("DEPT_NAME <>", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThan(String value) {
            addCriterion("DEPT_NAME >", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_NAME >=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThan(String value) {
            addCriterion("DEPT_NAME <", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThanOrEqualTo(String value) {
            addCriterion("DEPT_NAME <=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLike(String value) {
            addCriterion("DEPT_NAME like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotLike(String value) {
            addCriterion("DEPT_NAME not like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameIn(List<String> values) {
            addCriterion("DEPT_NAME in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotIn(List<String> values) {
            addCriterion("DEPT_NAME not in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameBetween(String value1, String value2) {
            addCriterion("DEPT_NAME between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotBetween(String value1, String value2) {
            addCriterion("DEPT_NAME not between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptAliasIsNull() {
            addCriterion("DEPT_ALIAS is null");
            return (Criteria) this;
        }

        public Criteria andDeptAliasIsNotNull() {
            addCriterion("DEPT_ALIAS is not null");
            return (Criteria) this;
        }

        public Criteria andDeptAliasEqualTo(String value) {
            addCriterion("DEPT_ALIAS =", value, "deptAlias");
            return (Criteria) this;
        }

        public Criteria andDeptAliasNotEqualTo(String value) {
            addCriterion("DEPT_ALIAS <>", value, "deptAlias");
            return (Criteria) this;
        }

        public Criteria andDeptAliasGreaterThan(String value) {
            addCriterion("DEPT_ALIAS >", value, "deptAlias");
            return (Criteria) this;
        }

        public Criteria andDeptAliasGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_ALIAS >=", value, "deptAlias");
            return (Criteria) this;
        }

        public Criteria andDeptAliasLessThan(String value) {
            addCriterion("DEPT_ALIAS <", value, "deptAlias");
            return (Criteria) this;
        }

        public Criteria andDeptAliasLessThanOrEqualTo(String value) {
            addCriterion("DEPT_ALIAS <=", value, "deptAlias");
            return (Criteria) this;
        }

        public Criteria andDeptAliasLike(String value) {
            addCriterion("DEPT_ALIAS like", value, "deptAlias");
            return (Criteria) this;
        }

        public Criteria andDeptAliasNotLike(String value) {
            addCriterion("DEPT_ALIAS not like", value, "deptAlias");
            return (Criteria) this;
        }

        public Criteria andDeptAliasIn(List<String> values) {
            addCriterion("DEPT_ALIAS in", values, "deptAlias");
            return (Criteria) this;
        }

        public Criteria andDeptAliasNotIn(List<String> values) {
            addCriterion("DEPT_ALIAS not in", values, "deptAlias");
            return (Criteria) this;
        }

        public Criteria andDeptAliasBetween(String value1, String value2) {
            addCriterion("DEPT_ALIAS between", value1, value2, "deptAlias");
            return (Criteria) this;
        }

        public Criteria andDeptAliasNotBetween(String value1, String value2) {
            addCriterion("DEPT_ALIAS not between", value1, value2, "deptAlias");
            return (Criteria) this;
        }

        public Criteria andClinicAttrIsNull() {
            addCriterion("CLINIC_ATTR is null");
            return (Criteria) this;
        }

        public Criteria andClinicAttrIsNotNull() {
            addCriterion("CLINIC_ATTR is not null");
            return (Criteria) this;
        }

        public Criteria andClinicAttrEqualTo(Integer value) {
            addCriterion("CLINIC_ATTR =", value, "clinicAttr");
            return (Criteria) this;
        }

        public Criteria andClinicAttrNotEqualTo(Integer value) {
            addCriterion("CLINIC_ATTR <>", value, "clinicAttr");
            return (Criteria) this;
        }

        public Criteria andClinicAttrGreaterThan(Integer value) {
            addCriterion("CLINIC_ATTR >", value, "clinicAttr");
            return (Criteria) this;
        }

        public Criteria andClinicAttrGreaterThanOrEqualTo(Integer value) {
            addCriterion("CLINIC_ATTR >=", value, "clinicAttr");
            return (Criteria) this;
        }

        public Criteria andClinicAttrLessThan(Integer value) {
            addCriterion("CLINIC_ATTR <", value, "clinicAttr");
            return (Criteria) this;
        }

        public Criteria andClinicAttrLessThanOrEqualTo(Integer value) {
            addCriterion("CLINIC_ATTR <=", value, "clinicAttr");
            return (Criteria) this;
        }

        public Criteria andClinicAttrIn(List<Integer> values) {
            addCriterion("CLINIC_ATTR in", values, "clinicAttr");
            return (Criteria) this;
        }

        public Criteria andClinicAttrNotIn(List<Integer> values) {
            addCriterion("CLINIC_ATTR not in", values, "clinicAttr");
            return (Criteria) this;
        }

        public Criteria andClinicAttrBetween(Integer value1, Integer value2) {
            addCriterion("CLINIC_ATTR between", value1, value2, "clinicAttr");
            return (Criteria) this;
        }

        public Criteria andClinicAttrNotBetween(Integer value1, Integer value2) {
            addCriterion("CLINIC_ATTR not between", value1, value2, "clinicAttr");
            return (Criteria) this;
        }

        public Criteria andOutpOrInpIsNull() {
            addCriterion("OUTP_OR_INP is null");
            return (Criteria) this;
        }

        public Criteria andOutpOrInpIsNotNull() {
            addCriterion("OUTP_OR_INP is not null");
            return (Criteria) this;
        }

        public Criteria andOutpOrInpEqualTo(Integer value) {
            addCriterion("OUTP_OR_INP =", value, "outpOrInp");
            return (Criteria) this;
        }

        public Criteria andOutpOrInpNotEqualTo(Integer value) {
            addCriterion("OUTP_OR_INP <>", value, "outpOrInp");
            return (Criteria) this;
        }

        public Criteria andOutpOrInpGreaterThan(Integer value) {
            addCriterion("OUTP_OR_INP >", value, "outpOrInp");
            return (Criteria) this;
        }

        public Criteria andOutpOrInpGreaterThanOrEqualTo(Integer value) {
            addCriterion("OUTP_OR_INP >=", value, "outpOrInp");
            return (Criteria) this;
        }

        public Criteria andOutpOrInpLessThan(Integer value) {
            addCriterion("OUTP_OR_INP <", value, "outpOrInp");
            return (Criteria) this;
        }

        public Criteria andOutpOrInpLessThanOrEqualTo(Integer value) {
            addCriterion("OUTP_OR_INP <=", value, "outpOrInp");
            return (Criteria) this;
        }

        public Criteria andOutpOrInpIn(List<Integer> values) {
            addCriterion("OUTP_OR_INP in", values, "outpOrInp");
            return (Criteria) this;
        }

        public Criteria andOutpOrInpNotIn(List<Integer> values) {
            addCriterion("OUTP_OR_INP not in", values, "outpOrInp");
            return (Criteria) this;
        }

        public Criteria andOutpOrInpBetween(Integer value1, Integer value2) {
            addCriterion("OUTP_OR_INP between", value1, value2, "outpOrInp");
            return (Criteria) this;
        }

        public Criteria andOutpOrInpNotBetween(Integer value1, Integer value2) {
            addCriterion("OUTP_OR_INP not between", value1, value2, "outpOrInp");
            return (Criteria) this;
        }

        public Criteria andInternalOrSergeryIsNull() {
            addCriterion("INTERNAL_OR_SERGERY is null");
            return (Criteria) this;
        }

        public Criteria andInternalOrSergeryIsNotNull() {
            addCriterion("INTERNAL_OR_SERGERY is not null");
            return (Criteria) this;
        }

        public Criteria andInternalOrSergeryEqualTo(Integer value) {
            addCriterion("INTERNAL_OR_SERGERY =", value, "internalOrSergery");
            return (Criteria) this;
        }

        public Criteria andInternalOrSergeryNotEqualTo(Integer value) {
            addCriterion("INTERNAL_OR_SERGERY <>", value, "internalOrSergery");
            return (Criteria) this;
        }

        public Criteria andInternalOrSergeryGreaterThan(Integer value) {
            addCriterion("INTERNAL_OR_SERGERY >", value, "internalOrSergery");
            return (Criteria) this;
        }

        public Criteria andInternalOrSergeryGreaterThanOrEqualTo(Integer value) {
            addCriterion("INTERNAL_OR_SERGERY >=", value, "internalOrSergery");
            return (Criteria) this;
        }

        public Criteria andInternalOrSergeryLessThan(Integer value) {
            addCriterion("INTERNAL_OR_SERGERY <", value, "internalOrSergery");
            return (Criteria) this;
        }

        public Criteria andInternalOrSergeryLessThanOrEqualTo(Integer value) {
            addCriterion("INTERNAL_OR_SERGERY <=", value, "internalOrSergery");
            return (Criteria) this;
        }

        public Criteria andInternalOrSergeryIn(List<Integer> values) {
            addCriterion("INTERNAL_OR_SERGERY in", values, "internalOrSergery");
            return (Criteria) this;
        }

        public Criteria andInternalOrSergeryNotIn(List<Integer> values) {
            addCriterion("INTERNAL_OR_SERGERY not in", values, "internalOrSergery");
            return (Criteria) this;
        }

        public Criteria andInternalOrSergeryBetween(Integer value1, Integer value2) {
            addCriterion("INTERNAL_OR_SERGERY between", value1, value2, "internalOrSergery");
            return (Criteria) this;
        }

        public Criteria andInternalOrSergeryNotBetween(Integer value1, Integer value2) {
            addCriterion("INTERNAL_OR_SERGERY not between", value1, value2, "internalOrSergery");
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

        public Criteria andPositionIsNull() {
            addCriterion("POSITION is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("POSITION is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("POSITION =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("POSITION <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("POSITION >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("POSITION >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("POSITION <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("POSITION <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("POSITION like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("POSITION not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("POSITION in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("POSITION not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("POSITION between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("POSITION not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andSignIsNull() {
            addCriterion("SIGN is null");
            return (Criteria) this;
        }

        public Criteria andSignIsNotNull() {
            addCriterion("SIGN is not null");
            return (Criteria) this;
        }

        public Criteria andSignEqualTo(String value) {
            addCriterion("SIGN =", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotEqualTo(String value) {
            addCriterion("SIGN <>", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignGreaterThan(String value) {
            addCriterion("SIGN >", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignGreaterThanOrEqualTo(String value) {
            addCriterion("SIGN >=", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLessThan(String value) {
            addCriterion("SIGN <", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLessThanOrEqualTo(String value) {
            addCriterion("SIGN <=", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLike(String value) {
            addCriterion("SIGN like", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotLike(String value) {
            addCriterion("SIGN not like", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignIn(List<String> values) {
            addCriterion("SIGN in", values, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotIn(List<String> values) {
            addCriterion("SIGN not in", values, "sign");
            return (Criteria) this;
        }

        public Criteria andSignBetween(String value1, String value2) {
            addCriterion("SIGN between", value1, value2, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotBetween(String value1, String value2) {
            addCriterion("SIGN not between", value1, value2, "sign");
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

        public Criteria andDispensingCumulateIsNull() {
            addCriterion("DISPENSING_CUMULATE is null");
            return (Criteria) this;
        }

        public Criteria andDispensingCumulateIsNotNull() {
            addCriterion("DISPENSING_CUMULATE is not null");
            return (Criteria) this;
        }

        public Criteria andDispensingCumulateEqualTo(Integer value) {
            addCriterion("DISPENSING_CUMULATE =", value, "dispensingCumulate");
            return (Criteria) this;
        }

        public Criteria andDispensingCumulateNotEqualTo(Integer value) {
            addCriterion("DISPENSING_CUMULATE <>", value, "dispensingCumulate");
            return (Criteria) this;
        }

        public Criteria andDispensingCumulateGreaterThan(Integer value) {
            addCriterion("DISPENSING_CUMULATE >", value, "dispensingCumulate");
            return (Criteria) this;
        }

        public Criteria andDispensingCumulateGreaterThanOrEqualTo(Integer value) {
            addCriterion("DISPENSING_CUMULATE >=", value, "dispensingCumulate");
            return (Criteria) this;
        }

        public Criteria andDispensingCumulateLessThan(Integer value) {
            addCriterion("DISPENSING_CUMULATE <", value, "dispensingCumulate");
            return (Criteria) this;
        }

        public Criteria andDispensingCumulateLessThanOrEqualTo(Integer value) {
            addCriterion("DISPENSING_CUMULATE <=", value, "dispensingCumulate");
            return (Criteria) this;
        }

        public Criteria andDispensingCumulateIn(List<Integer> values) {
            addCriterion("DISPENSING_CUMULATE in", values, "dispensingCumulate");
            return (Criteria) this;
        }

        public Criteria andDispensingCumulateNotIn(List<Integer> values) {
            addCriterion("DISPENSING_CUMULATE not in", values, "dispensingCumulate");
            return (Criteria) this;
        }

        public Criteria andDispensingCumulateBetween(Integer value1, Integer value2) {
            addCriterion("DISPENSING_CUMULATE between", value1, value2, "dispensingCumulate");
            return (Criteria) this;
        }

        public Criteria andDispensingCumulateNotBetween(Integer value1, Integer value2) {
            addCriterion("DISPENSING_CUMULATE not between", value1, value2, "dispensingCumulate");
            return (Criteria) this;
        }

        public Criteria andVirtualCabinetIsNull() {
            addCriterion("VIRTUAL_CABINET is null");
            return (Criteria) this;
        }

        public Criteria andVirtualCabinetIsNotNull() {
            addCriterion("VIRTUAL_CABINET is not null");
            return (Criteria) this;
        }

        public Criteria andVirtualCabinetEqualTo(Integer value) {
            addCriterion("VIRTUAL_CABINET =", value, "virtualCabinet");
            return (Criteria) this;
        }

        public Criteria andVirtualCabinetNotEqualTo(Integer value) {
            addCriterion("VIRTUAL_CABINET <>", value, "virtualCabinet");
            return (Criteria) this;
        }

        public Criteria andVirtualCabinetGreaterThan(Integer value) {
            addCriterion("VIRTUAL_CABINET >", value, "virtualCabinet");
            return (Criteria) this;
        }

        public Criteria andVirtualCabinetGreaterThanOrEqualTo(Integer value) {
            addCriterion("VIRTUAL_CABINET >=", value, "virtualCabinet");
            return (Criteria) this;
        }

        public Criteria andVirtualCabinetLessThan(Integer value) {
            addCriterion("VIRTUAL_CABINET <", value, "virtualCabinet");
            return (Criteria) this;
        }

        public Criteria andVirtualCabinetLessThanOrEqualTo(Integer value) {
            addCriterion("VIRTUAL_CABINET <=", value, "virtualCabinet");
            return (Criteria) this;
        }

        public Criteria andVirtualCabinetIn(List<Integer> values) {
            addCriterion("VIRTUAL_CABINET in", values, "virtualCabinet");
            return (Criteria) this;
        }

        public Criteria andVirtualCabinetNotIn(List<Integer> values) {
            addCriterion("VIRTUAL_CABINET not in", values, "virtualCabinet");
            return (Criteria) this;
        }

        public Criteria andVirtualCabinetBetween(Integer value1, Integer value2) {
            addCriterion("VIRTUAL_CABINET between", value1, value2, "virtualCabinet");
            return (Criteria) this;
        }

        public Criteria andVirtualCabinetNotBetween(Integer value1, Integer value2) {
            addCriterion("VIRTUAL_CABINET not between", value1, value2, "virtualCabinet");
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