package com.joe.input.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ItPatMasterIndexExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItPatMasterIndexExample() {
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

        public Criteria andPatientIdIsNull() {
            addCriterion("PATIENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andPatientIdIsNotNull() {
            addCriterion("PATIENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPatientIdEqualTo(String value) {
            addCriterion("PATIENT_ID =", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotEqualTo(String value) {
            addCriterion("PATIENT_ID <>", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdGreaterThan(String value) {
            addCriterion("PATIENT_ID >", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdGreaterThanOrEqualTo(String value) {
            addCriterion("PATIENT_ID >=", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdLessThan(String value) {
            addCriterion("PATIENT_ID <", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdLessThanOrEqualTo(String value) {
            addCriterion("PATIENT_ID <=", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdLike(String value) {
            addCriterion("PATIENT_ID like", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotLike(String value) {
            addCriterion("PATIENT_ID not like", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdIn(List<String> values) {
            addCriterion("PATIENT_ID in", values, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotIn(List<String> values) {
            addCriterion("PATIENT_ID not in", values, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdBetween(String value1, String value2) {
            addCriterion("PATIENT_ID between", value1, value2, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotBetween(String value1, String value2) {
            addCriterion("PATIENT_ID not between", value1, value2, "patientId");
            return (Criteria) this;
        }

        public Criteria andInpNoIsNull() {
            addCriterion("INP_NO is null");
            return (Criteria) this;
        }

        public Criteria andInpNoIsNotNull() {
            addCriterion("INP_NO is not null");
            return (Criteria) this;
        }

        public Criteria andInpNoEqualTo(String value) {
            addCriterion("INP_NO =", value, "inpNo");
            return (Criteria) this;
        }

        public Criteria andInpNoNotEqualTo(String value) {
            addCriterion("INP_NO <>", value, "inpNo");
            return (Criteria) this;
        }

        public Criteria andInpNoGreaterThan(String value) {
            addCriterion("INP_NO >", value, "inpNo");
            return (Criteria) this;
        }

        public Criteria andInpNoGreaterThanOrEqualTo(String value) {
            addCriterion("INP_NO >=", value, "inpNo");
            return (Criteria) this;
        }

        public Criteria andInpNoLessThan(String value) {
            addCriterion("INP_NO <", value, "inpNo");
            return (Criteria) this;
        }

        public Criteria andInpNoLessThanOrEqualTo(String value) {
            addCriterion("INP_NO <=", value, "inpNo");
            return (Criteria) this;
        }

        public Criteria andInpNoLike(String value) {
            addCriterion("INP_NO like", value, "inpNo");
            return (Criteria) this;
        }

        public Criteria andInpNoNotLike(String value) {
            addCriterion("INP_NO not like", value, "inpNo");
            return (Criteria) this;
        }

        public Criteria andInpNoIn(List<String> values) {
            addCriterion("INP_NO in", values, "inpNo");
            return (Criteria) this;
        }

        public Criteria andInpNoNotIn(List<String> values) {
            addCriterion("INP_NO not in", values, "inpNo");
            return (Criteria) this;
        }

        public Criteria andInpNoBetween(String value1, String value2) {
            addCriterion("INP_NO between", value1, value2, "inpNo");
            return (Criteria) this;
        }

        public Criteria andInpNoNotBetween(String value1, String value2) {
            addCriterion("INP_NO not between", value1, value2, "inpNo");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNamePhoneticIsNull() {
            addCriterion("NAME_PHONETIC is null");
            return (Criteria) this;
        }

        public Criteria andNamePhoneticIsNotNull() {
            addCriterion("NAME_PHONETIC is not null");
            return (Criteria) this;
        }

        public Criteria andNamePhoneticEqualTo(String value) {
            addCriterion("NAME_PHONETIC =", value, "namePhonetic");
            return (Criteria) this;
        }

        public Criteria andNamePhoneticNotEqualTo(String value) {
            addCriterion("NAME_PHONETIC <>", value, "namePhonetic");
            return (Criteria) this;
        }

        public Criteria andNamePhoneticGreaterThan(String value) {
            addCriterion("NAME_PHONETIC >", value, "namePhonetic");
            return (Criteria) this;
        }

        public Criteria andNamePhoneticGreaterThanOrEqualTo(String value) {
            addCriterion("NAME_PHONETIC >=", value, "namePhonetic");
            return (Criteria) this;
        }

        public Criteria andNamePhoneticLessThan(String value) {
            addCriterion("NAME_PHONETIC <", value, "namePhonetic");
            return (Criteria) this;
        }

        public Criteria andNamePhoneticLessThanOrEqualTo(String value) {
            addCriterion("NAME_PHONETIC <=", value, "namePhonetic");
            return (Criteria) this;
        }

        public Criteria andNamePhoneticLike(String value) {
            addCriterion("NAME_PHONETIC like", value, "namePhonetic");
            return (Criteria) this;
        }

        public Criteria andNamePhoneticNotLike(String value) {
            addCriterion("NAME_PHONETIC not like", value, "namePhonetic");
            return (Criteria) this;
        }

        public Criteria andNamePhoneticIn(List<String> values) {
            addCriterion("NAME_PHONETIC in", values, "namePhonetic");
            return (Criteria) this;
        }

        public Criteria andNamePhoneticNotIn(List<String> values) {
            addCriterion("NAME_PHONETIC not in", values, "namePhonetic");
            return (Criteria) this;
        }

        public Criteria andNamePhoneticBetween(String value1, String value2) {
            addCriterion("NAME_PHONETIC between", value1, value2, "namePhonetic");
            return (Criteria) this;
        }

        public Criteria andNamePhoneticNotBetween(String value1, String value2) {
            addCriterion("NAME_PHONETIC not between", value1, value2, "namePhonetic");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("SEX like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("SEX not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthIsNull() {
            addCriterion("DATE_OF_BIRTH is null");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthIsNotNull() {
            addCriterion("DATE_OF_BIRTH is not null");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_OF_BIRTH =", value, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_OF_BIRTH <>", value, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthGreaterThan(Date value) {
            addCriterionForJDBCDate("DATE_OF_BIRTH >", value, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_OF_BIRTH >=", value, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthLessThan(Date value) {
            addCriterionForJDBCDate("DATE_OF_BIRTH <", value, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_OF_BIRTH <=", value, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthIn(List<Date> values) {
            addCriterionForJDBCDate("DATE_OF_BIRTH in", values, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("DATE_OF_BIRTH not in", values, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DATE_OF_BIRTH between", value1, value2, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DATE_OF_BIRTH not between", value1, value2, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceIsNull() {
            addCriterion("BIRTH_PLACE is null");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceIsNotNull() {
            addCriterion("BIRTH_PLACE is not null");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceEqualTo(String value) {
            addCriterion("BIRTH_PLACE =", value, "birthPlace");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceNotEqualTo(String value) {
            addCriterion("BIRTH_PLACE <>", value, "birthPlace");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceGreaterThan(String value) {
            addCriterion("BIRTH_PLACE >", value, "birthPlace");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("BIRTH_PLACE >=", value, "birthPlace");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceLessThan(String value) {
            addCriterion("BIRTH_PLACE <", value, "birthPlace");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceLessThanOrEqualTo(String value) {
            addCriterion("BIRTH_PLACE <=", value, "birthPlace");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceLike(String value) {
            addCriterion("BIRTH_PLACE like", value, "birthPlace");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceNotLike(String value) {
            addCriterion("BIRTH_PLACE not like", value, "birthPlace");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceIn(List<String> values) {
            addCriterion("BIRTH_PLACE in", values, "birthPlace");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceNotIn(List<String> values) {
            addCriterion("BIRTH_PLACE not in", values, "birthPlace");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceBetween(String value1, String value2) {
            addCriterion("BIRTH_PLACE between", value1, value2, "birthPlace");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceNotBetween(String value1, String value2) {
            addCriterion("BIRTH_PLACE not between", value1, value2, "birthPlace");
            return (Criteria) this;
        }

        public Criteria andCitizenshipIsNull() {
            addCriterion("CITIZENSHIP is null");
            return (Criteria) this;
        }

        public Criteria andCitizenshipIsNotNull() {
            addCriterion("CITIZENSHIP is not null");
            return (Criteria) this;
        }

        public Criteria andCitizenshipEqualTo(String value) {
            addCriterion("CITIZENSHIP =", value, "citizenship");
            return (Criteria) this;
        }

        public Criteria andCitizenshipNotEqualTo(String value) {
            addCriterion("CITIZENSHIP <>", value, "citizenship");
            return (Criteria) this;
        }

        public Criteria andCitizenshipGreaterThan(String value) {
            addCriterion("CITIZENSHIP >", value, "citizenship");
            return (Criteria) this;
        }

        public Criteria andCitizenshipGreaterThanOrEqualTo(String value) {
            addCriterion("CITIZENSHIP >=", value, "citizenship");
            return (Criteria) this;
        }

        public Criteria andCitizenshipLessThan(String value) {
            addCriterion("CITIZENSHIP <", value, "citizenship");
            return (Criteria) this;
        }

        public Criteria andCitizenshipLessThanOrEqualTo(String value) {
            addCriterion("CITIZENSHIP <=", value, "citizenship");
            return (Criteria) this;
        }

        public Criteria andCitizenshipLike(String value) {
            addCriterion("CITIZENSHIP like", value, "citizenship");
            return (Criteria) this;
        }

        public Criteria andCitizenshipNotLike(String value) {
            addCriterion("CITIZENSHIP not like", value, "citizenship");
            return (Criteria) this;
        }

        public Criteria andCitizenshipIn(List<String> values) {
            addCriterion("CITIZENSHIP in", values, "citizenship");
            return (Criteria) this;
        }

        public Criteria andCitizenshipNotIn(List<String> values) {
            addCriterion("CITIZENSHIP not in", values, "citizenship");
            return (Criteria) this;
        }

        public Criteria andCitizenshipBetween(String value1, String value2) {
            addCriterion("CITIZENSHIP between", value1, value2, "citizenship");
            return (Criteria) this;
        }

        public Criteria andCitizenshipNotBetween(String value1, String value2) {
            addCriterion("CITIZENSHIP not between", value1, value2, "citizenship");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("NATION is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("NATION is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("NATION =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("NATION <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("NATION >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("NATION >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("NATION <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("NATION <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("NATION like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("NATION not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("NATION in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("NATION not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("NATION between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("NATION not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andIdNoIsNull() {
            addCriterion("ID_NO is null");
            return (Criteria) this;
        }

        public Criteria andIdNoIsNotNull() {
            addCriterion("ID_NO is not null");
            return (Criteria) this;
        }

        public Criteria andIdNoEqualTo(String value) {
            addCriterion("ID_NO =", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotEqualTo(String value) {
            addCriterion("ID_NO <>", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoGreaterThan(String value) {
            addCriterion("ID_NO >", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoGreaterThanOrEqualTo(String value) {
            addCriterion("ID_NO >=", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLessThan(String value) {
            addCriterion("ID_NO <", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLessThanOrEqualTo(String value) {
            addCriterion("ID_NO <=", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLike(String value) {
            addCriterion("ID_NO like", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotLike(String value) {
            addCriterion("ID_NO not like", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoIn(List<String> values) {
            addCriterion("ID_NO in", values, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotIn(List<String> values) {
            addCriterion("ID_NO not in", values, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoBetween(String value1, String value2) {
            addCriterion("ID_NO between", value1, value2, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotBetween(String value1, String value2) {
            addCriterion("ID_NO not between", value1, value2, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdentityIsNull() {
            addCriterion("IDENTITY is null");
            return (Criteria) this;
        }

        public Criteria andIdentityIsNotNull() {
            addCriterion("IDENTITY is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityEqualTo(String value) {
            addCriterion("IDENTITY =", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotEqualTo(String value) {
            addCriterion("IDENTITY <>", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityGreaterThan(String value) {
            addCriterion("IDENTITY >", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityGreaterThanOrEqualTo(String value) {
            addCriterion("IDENTITY >=", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityLessThan(String value) {
            addCriterion("IDENTITY <", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityLessThanOrEqualTo(String value) {
            addCriterion("IDENTITY <=", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityLike(String value) {
            addCriterion("IDENTITY like", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotLike(String value) {
            addCriterion("IDENTITY not like", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityIn(List<String> values) {
            addCriterion("IDENTITY in", values, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotIn(List<String> values) {
            addCriterion("IDENTITY not in", values, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityBetween(String value1, String value2) {
            addCriterion("IDENTITY between", value1, value2, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotBetween(String value1, String value2) {
            addCriterion("IDENTITY not between", value1, value2, "identity");
            return (Criteria) this;
        }

        public Criteria andChargeTypeIsNull() {
            addCriterion("CHARGE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andChargeTypeIsNotNull() {
            addCriterion("CHARGE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andChargeTypeEqualTo(String value) {
            addCriterion("CHARGE_TYPE =", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNotEqualTo(String value) {
            addCriterion("CHARGE_TYPE <>", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeGreaterThan(String value) {
            addCriterion("CHARGE_TYPE >", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CHARGE_TYPE >=", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeLessThan(String value) {
            addCriterion("CHARGE_TYPE <", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeLessThanOrEqualTo(String value) {
            addCriterion("CHARGE_TYPE <=", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeLike(String value) {
            addCriterion("CHARGE_TYPE like", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNotLike(String value) {
            addCriterion("CHARGE_TYPE not like", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeIn(List<String> values) {
            addCriterion("CHARGE_TYPE in", values, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNotIn(List<String> values) {
            addCriterion("CHARGE_TYPE not in", values, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeBetween(String value1, String value2) {
            addCriterion("CHARGE_TYPE between", value1, value2, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNotBetween(String value1, String value2) {
            addCriterion("CHARGE_TYPE not between", value1, value2, "chargeType");
            return (Criteria) this;
        }

        public Criteria andUnitInContractIsNull() {
            addCriterion("UNIT_IN_CONTRACT is null");
            return (Criteria) this;
        }

        public Criteria andUnitInContractIsNotNull() {
            addCriterion("UNIT_IN_CONTRACT is not null");
            return (Criteria) this;
        }

        public Criteria andUnitInContractEqualTo(String value) {
            addCriterion("UNIT_IN_CONTRACT =", value, "unitInContract");
            return (Criteria) this;
        }

        public Criteria andUnitInContractNotEqualTo(String value) {
            addCriterion("UNIT_IN_CONTRACT <>", value, "unitInContract");
            return (Criteria) this;
        }

        public Criteria andUnitInContractGreaterThan(String value) {
            addCriterion("UNIT_IN_CONTRACT >", value, "unitInContract");
            return (Criteria) this;
        }

        public Criteria andUnitInContractGreaterThanOrEqualTo(String value) {
            addCriterion("UNIT_IN_CONTRACT >=", value, "unitInContract");
            return (Criteria) this;
        }

        public Criteria andUnitInContractLessThan(String value) {
            addCriterion("UNIT_IN_CONTRACT <", value, "unitInContract");
            return (Criteria) this;
        }

        public Criteria andUnitInContractLessThanOrEqualTo(String value) {
            addCriterion("UNIT_IN_CONTRACT <=", value, "unitInContract");
            return (Criteria) this;
        }

        public Criteria andUnitInContractLike(String value) {
            addCriterion("UNIT_IN_CONTRACT like", value, "unitInContract");
            return (Criteria) this;
        }

        public Criteria andUnitInContractNotLike(String value) {
            addCriterion("UNIT_IN_CONTRACT not like", value, "unitInContract");
            return (Criteria) this;
        }

        public Criteria andUnitInContractIn(List<String> values) {
            addCriterion("UNIT_IN_CONTRACT in", values, "unitInContract");
            return (Criteria) this;
        }

        public Criteria andUnitInContractNotIn(List<String> values) {
            addCriterion("UNIT_IN_CONTRACT not in", values, "unitInContract");
            return (Criteria) this;
        }

        public Criteria andUnitInContractBetween(String value1, String value2) {
            addCriterion("UNIT_IN_CONTRACT between", value1, value2, "unitInContract");
            return (Criteria) this;
        }

        public Criteria andUnitInContractNotBetween(String value1, String value2) {
            addCriterion("UNIT_IN_CONTRACT not between", value1, value2, "unitInContract");
            return (Criteria) this;
        }

        public Criteria andMailingAddressIsNull() {
            addCriterion("MAILING_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andMailingAddressIsNotNull() {
            addCriterion("MAILING_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andMailingAddressEqualTo(String value) {
            addCriterion("MAILING_ADDRESS =", value, "mailingAddress");
            return (Criteria) this;
        }

        public Criteria andMailingAddressNotEqualTo(String value) {
            addCriterion("MAILING_ADDRESS <>", value, "mailingAddress");
            return (Criteria) this;
        }

        public Criteria andMailingAddressGreaterThan(String value) {
            addCriterion("MAILING_ADDRESS >", value, "mailingAddress");
            return (Criteria) this;
        }

        public Criteria andMailingAddressGreaterThanOrEqualTo(String value) {
            addCriterion("MAILING_ADDRESS >=", value, "mailingAddress");
            return (Criteria) this;
        }

        public Criteria andMailingAddressLessThan(String value) {
            addCriterion("MAILING_ADDRESS <", value, "mailingAddress");
            return (Criteria) this;
        }

        public Criteria andMailingAddressLessThanOrEqualTo(String value) {
            addCriterion("MAILING_ADDRESS <=", value, "mailingAddress");
            return (Criteria) this;
        }

        public Criteria andMailingAddressLike(String value) {
            addCriterion("MAILING_ADDRESS like", value, "mailingAddress");
            return (Criteria) this;
        }

        public Criteria andMailingAddressNotLike(String value) {
            addCriterion("MAILING_ADDRESS not like", value, "mailingAddress");
            return (Criteria) this;
        }

        public Criteria andMailingAddressIn(List<String> values) {
            addCriterion("MAILING_ADDRESS in", values, "mailingAddress");
            return (Criteria) this;
        }

        public Criteria andMailingAddressNotIn(List<String> values) {
            addCriterion("MAILING_ADDRESS not in", values, "mailingAddress");
            return (Criteria) this;
        }

        public Criteria andMailingAddressBetween(String value1, String value2) {
            addCriterion("MAILING_ADDRESS between", value1, value2, "mailingAddress");
            return (Criteria) this;
        }

        public Criteria andMailingAddressNotBetween(String value1, String value2) {
            addCriterion("MAILING_ADDRESS not between", value1, value2, "mailingAddress");
            return (Criteria) this;
        }

        public Criteria andZipCodeIsNull() {
            addCriterion("ZIP_CODE is null");
            return (Criteria) this;
        }

        public Criteria andZipCodeIsNotNull() {
            addCriterion("ZIP_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andZipCodeEqualTo(String value) {
            addCriterion("ZIP_CODE =", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotEqualTo(String value) {
            addCriterion("ZIP_CODE <>", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeGreaterThan(String value) {
            addCriterion("ZIP_CODE >", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ZIP_CODE >=", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLessThan(String value) {
            addCriterion("ZIP_CODE <", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLessThanOrEqualTo(String value) {
            addCriterion("ZIP_CODE <=", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLike(String value) {
            addCriterion("ZIP_CODE like", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotLike(String value) {
            addCriterion("ZIP_CODE not like", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeIn(List<String> values) {
            addCriterion("ZIP_CODE in", values, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotIn(List<String> values) {
            addCriterion("ZIP_CODE not in", values, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeBetween(String value1, String value2) {
            addCriterion("ZIP_CODE between", value1, value2, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotBetween(String value1, String value2) {
            addCriterion("ZIP_CODE not between", value1, value2, "zipCode");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberHomeIsNull() {
            addCriterion("PHONE_NUMBER_HOME is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberHomeIsNotNull() {
            addCriterion("PHONE_NUMBER_HOME is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberHomeEqualTo(String value) {
            addCriterion("PHONE_NUMBER_HOME =", value, "phoneNumberHome");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberHomeNotEqualTo(String value) {
            addCriterion("PHONE_NUMBER_HOME <>", value, "phoneNumberHome");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberHomeGreaterThan(String value) {
            addCriterion("PHONE_NUMBER_HOME >", value, "phoneNumberHome");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberHomeGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE_NUMBER_HOME >=", value, "phoneNumberHome");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberHomeLessThan(String value) {
            addCriterion("PHONE_NUMBER_HOME <", value, "phoneNumberHome");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberHomeLessThanOrEqualTo(String value) {
            addCriterion("PHONE_NUMBER_HOME <=", value, "phoneNumberHome");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberHomeLike(String value) {
            addCriterion("PHONE_NUMBER_HOME like", value, "phoneNumberHome");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberHomeNotLike(String value) {
            addCriterion("PHONE_NUMBER_HOME not like", value, "phoneNumberHome");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberHomeIn(List<String> values) {
            addCriterion("PHONE_NUMBER_HOME in", values, "phoneNumberHome");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberHomeNotIn(List<String> values) {
            addCriterion("PHONE_NUMBER_HOME not in", values, "phoneNumberHome");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberHomeBetween(String value1, String value2) {
            addCriterion("PHONE_NUMBER_HOME between", value1, value2, "phoneNumberHome");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberHomeNotBetween(String value1, String value2) {
            addCriterion("PHONE_NUMBER_HOME not between", value1, value2, "phoneNumberHome");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBusinessIsNull() {
            addCriterion("PHONE_NUMBER_BUSINESS is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBusinessIsNotNull() {
            addCriterion("PHONE_NUMBER_BUSINESS is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBusinessEqualTo(String value) {
            addCriterion("PHONE_NUMBER_BUSINESS =", value, "phoneNumberBusiness");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBusinessNotEqualTo(String value) {
            addCriterion("PHONE_NUMBER_BUSINESS <>", value, "phoneNumberBusiness");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBusinessGreaterThan(String value) {
            addCriterion("PHONE_NUMBER_BUSINESS >", value, "phoneNumberBusiness");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBusinessGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE_NUMBER_BUSINESS >=", value, "phoneNumberBusiness");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBusinessLessThan(String value) {
            addCriterion("PHONE_NUMBER_BUSINESS <", value, "phoneNumberBusiness");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBusinessLessThanOrEqualTo(String value) {
            addCriterion("PHONE_NUMBER_BUSINESS <=", value, "phoneNumberBusiness");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBusinessLike(String value) {
            addCriterion("PHONE_NUMBER_BUSINESS like", value, "phoneNumberBusiness");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBusinessNotLike(String value) {
            addCriterion("PHONE_NUMBER_BUSINESS not like", value, "phoneNumberBusiness");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBusinessIn(List<String> values) {
            addCriterion("PHONE_NUMBER_BUSINESS in", values, "phoneNumberBusiness");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBusinessNotIn(List<String> values) {
            addCriterion("PHONE_NUMBER_BUSINESS not in", values, "phoneNumberBusiness");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBusinessBetween(String value1, String value2) {
            addCriterion("PHONE_NUMBER_BUSINESS between", value1, value2, "phoneNumberBusiness");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBusinessNotBetween(String value1, String value2) {
            addCriterion("PHONE_NUMBER_BUSINESS not between", value1, value2, "phoneNumberBusiness");
            return (Criteria) this;
        }

        public Criteria andNextOfKinIsNull() {
            addCriterion("NEXT_OF_KIN is null");
            return (Criteria) this;
        }

        public Criteria andNextOfKinIsNotNull() {
            addCriterion("NEXT_OF_KIN is not null");
            return (Criteria) this;
        }

        public Criteria andNextOfKinEqualTo(String value) {
            addCriterion("NEXT_OF_KIN =", value, "nextOfKin");
            return (Criteria) this;
        }

        public Criteria andNextOfKinNotEqualTo(String value) {
            addCriterion("NEXT_OF_KIN <>", value, "nextOfKin");
            return (Criteria) this;
        }

        public Criteria andNextOfKinGreaterThan(String value) {
            addCriterion("NEXT_OF_KIN >", value, "nextOfKin");
            return (Criteria) this;
        }

        public Criteria andNextOfKinGreaterThanOrEqualTo(String value) {
            addCriterion("NEXT_OF_KIN >=", value, "nextOfKin");
            return (Criteria) this;
        }

        public Criteria andNextOfKinLessThan(String value) {
            addCriterion("NEXT_OF_KIN <", value, "nextOfKin");
            return (Criteria) this;
        }

        public Criteria andNextOfKinLessThanOrEqualTo(String value) {
            addCriterion("NEXT_OF_KIN <=", value, "nextOfKin");
            return (Criteria) this;
        }

        public Criteria andNextOfKinLike(String value) {
            addCriterion("NEXT_OF_KIN like", value, "nextOfKin");
            return (Criteria) this;
        }

        public Criteria andNextOfKinNotLike(String value) {
            addCriterion("NEXT_OF_KIN not like", value, "nextOfKin");
            return (Criteria) this;
        }

        public Criteria andNextOfKinIn(List<String> values) {
            addCriterion("NEXT_OF_KIN in", values, "nextOfKin");
            return (Criteria) this;
        }

        public Criteria andNextOfKinNotIn(List<String> values) {
            addCriterion("NEXT_OF_KIN not in", values, "nextOfKin");
            return (Criteria) this;
        }

        public Criteria andNextOfKinBetween(String value1, String value2) {
            addCriterion("NEXT_OF_KIN between", value1, value2, "nextOfKin");
            return (Criteria) this;
        }

        public Criteria andNextOfKinNotBetween(String value1, String value2) {
            addCriterion("NEXT_OF_KIN not between", value1, value2, "nextOfKin");
            return (Criteria) this;
        }

        public Criteria andRelationshipIsNull() {
            addCriterion("RELATIONSHIP is null");
            return (Criteria) this;
        }

        public Criteria andRelationshipIsNotNull() {
            addCriterion("RELATIONSHIP is not null");
            return (Criteria) this;
        }

        public Criteria andRelationshipEqualTo(String value) {
            addCriterion("RELATIONSHIP =", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipNotEqualTo(String value) {
            addCriterion("RELATIONSHIP <>", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipGreaterThan(String value) {
            addCriterion("RELATIONSHIP >", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipGreaterThanOrEqualTo(String value) {
            addCriterion("RELATIONSHIP >=", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipLessThan(String value) {
            addCriterion("RELATIONSHIP <", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipLessThanOrEqualTo(String value) {
            addCriterion("RELATIONSHIP <=", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipLike(String value) {
            addCriterion("RELATIONSHIP like", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipNotLike(String value) {
            addCriterion("RELATIONSHIP not like", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipIn(List<String> values) {
            addCriterion("RELATIONSHIP in", values, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipNotIn(List<String> values) {
            addCriterion("RELATIONSHIP not in", values, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipBetween(String value1, String value2) {
            addCriterion("RELATIONSHIP between", value1, value2, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipNotBetween(String value1, String value2) {
            addCriterion("RELATIONSHIP not between", value1, value2, "relationship");
            return (Criteria) this;
        }

        public Criteria andNextOfKinAddrIsNull() {
            addCriterion("NEXT_OF_KIN_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andNextOfKinAddrIsNotNull() {
            addCriterion("NEXT_OF_KIN_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andNextOfKinAddrEqualTo(String value) {
            addCriterion("NEXT_OF_KIN_ADDR =", value, "nextOfKinAddr");
            return (Criteria) this;
        }

        public Criteria andNextOfKinAddrNotEqualTo(String value) {
            addCriterion("NEXT_OF_KIN_ADDR <>", value, "nextOfKinAddr");
            return (Criteria) this;
        }

        public Criteria andNextOfKinAddrGreaterThan(String value) {
            addCriterion("NEXT_OF_KIN_ADDR >", value, "nextOfKinAddr");
            return (Criteria) this;
        }

        public Criteria andNextOfKinAddrGreaterThanOrEqualTo(String value) {
            addCriterion("NEXT_OF_KIN_ADDR >=", value, "nextOfKinAddr");
            return (Criteria) this;
        }

        public Criteria andNextOfKinAddrLessThan(String value) {
            addCriterion("NEXT_OF_KIN_ADDR <", value, "nextOfKinAddr");
            return (Criteria) this;
        }

        public Criteria andNextOfKinAddrLessThanOrEqualTo(String value) {
            addCriterion("NEXT_OF_KIN_ADDR <=", value, "nextOfKinAddr");
            return (Criteria) this;
        }

        public Criteria andNextOfKinAddrLike(String value) {
            addCriterion("NEXT_OF_KIN_ADDR like", value, "nextOfKinAddr");
            return (Criteria) this;
        }

        public Criteria andNextOfKinAddrNotLike(String value) {
            addCriterion("NEXT_OF_KIN_ADDR not like", value, "nextOfKinAddr");
            return (Criteria) this;
        }

        public Criteria andNextOfKinAddrIn(List<String> values) {
            addCriterion("NEXT_OF_KIN_ADDR in", values, "nextOfKinAddr");
            return (Criteria) this;
        }

        public Criteria andNextOfKinAddrNotIn(List<String> values) {
            addCriterion("NEXT_OF_KIN_ADDR not in", values, "nextOfKinAddr");
            return (Criteria) this;
        }

        public Criteria andNextOfKinAddrBetween(String value1, String value2) {
            addCriterion("NEXT_OF_KIN_ADDR between", value1, value2, "nextOfKinAddr");
            return (Criteria) this;
        }

        public Criteria andNextOfKinAddrNotBetween(String value1, String value2) {
            addCriterion("NEXT_OF_KIN_ADDR not between", value1, value2, "nextOfKinAddr");
            return (Criteria) this;
        }

        public Criteria andNextOfKinZipCodeIsNull() {
            addCriterion("NEXT_OF_KIN_ZIP_CODE is null");
            return (Criteria) this;
        }

        public Criteria andNextOfKinZipCodeIsNotNull() {
            addCriterion("NEXT_OF_KIN_ZIP_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andNextOfKinZipCodeEqualTo(String value) {
            addCriterion("NEXT_OF_KIN_ZIP_CODE =", value, "nextOfKinZipCode");
            return (Criteria) this;
        }

        public Criteria andNextOfKinZipCodeNotEqualTo(String value) {
            addCriterion("NEXT_OF_KIN_ZIP_CODE <>", value, "nextOfKinZipCode");
            return (Criteria) this;
        }

        public Criteria andNextOfKinZipCodeGreaterThan(String value) {
            addCriterion("NEXT_OF_KIN_ZIP_CODE >", value, "nextOfKinZipCode");
            return (Criteria) this;
        }

        public Criteria andNextOfKinZipCodeGreaterThanOrEqualTo(String value) {
            addCriterion("NEXT_OF_KIN_ZIP_CODE >=", value, "nextOfKinZipCode");
            return (Criteria) this;
        }

        public Criteria andNextOfKinZipCodeLessThan(String value) {
            addCriterion("NEXT_OF_KIN_ZIP_CODE <", value, "nextOfKinZipCode");
            return (Criteria) this;
        }

        public Criteria andNextOfKinZipCodeLessThanOrEqualTo(String value) {
            addCriterion("NEXT_OF_KIN_ZIP_CODE <=", value, "nextOfKinZipCode");
            return (Criteria) this;
        }

        public Criteria andNextOfKinZipCodeLike(String value) {
            addCriterion("NEXT_OF_KIN_ZIP_CODE like", value, "nextOfKinZipCode");
            return (Criteria) this;
        }

        public Criteria andNextOfKinZipCodeNotLike(String value) {
            addCriterion("NEXT_OF_KIN_ZIP_CODE not like", value, "nextOfKinZipCode");
            return (Criteria) this;
        }

        public Criteria andNextOfKinZipCodeIn(List<String> values) {
            addCriterion("NEXT_OF_KIN_ZIP_CODE in", values, "nextOfKinZipCode");
            return (Criteria) this;
        }

        public Criteria andNextOfKinZipCodeNotIn(List<String> values) {
            addCriterion("NEXT_OF_KIN_ZIP_CODE not in", values, "nextOfKinZipCode");
            return (Criteria) this;
        }

        public Criteria andNextOfKinZipCodeBetween(String value1, String value2) {
            addCriterion("NEXT_OF_KIN_ZIP_CODE between", value1, value2, "nextOfKinZipCode");
            return (Criteria) this;
        }

        public Criteria andNextOfKinZipCodeNotBetween(String value1, String value2) {
            addCriterion("NEXT_OF_KIN_ZIP_CODE not between", value1, value2, "nextOfKinZipCode");
            return (Criteria) this;
        }

        public Criteria andNextOfKinPhoneIsNull() {
            addCriterion("NEXT_OF_KIN_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andNextOfKinPhoneIsNotNull() {
            addCriterion("NEXT_OF_KIN_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andNextOfKinPhoneEqualTo(String value) {
            addCriterion("NEXT_OF_KIN_PHONE =", value, "nextOfKinPhone");
            return (Criteria) this;
        }

        public Criteria andNextOfKinPhoneNotEqualTo(String value) {
            addCriterion("NEXT_OF_KIN_PHONE <>", value, "nextOfKinPhone");
            return (Criteria) this;
        }

        public Criteria andNextOfKinPhoneGreaterThan(String value) {
            addCriterion("NEXT_OF_KIN_PHONE >", value, "nextOfKinPhone");
            return (Criteria) this;
        }

        public Criteria andNextOfKinPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("NEXT_OF_KIN_PHONE >=", value, "nextOfKinPhone");
            return (Criteria) this;
        }

        public Criteria andNextOfKinPhoneLessThan(String value) {
            addCriterion("NEXT_OF_KIN_PHONE <", value, "nextOfKinPhone");
            return (Criteria) this;
        }

        public Criteria andNextOfKinPhoneLessThanOrEqualTo(String value) {
            addCriterion("NEXT_OF_KIN_PHONE <=", value, "nextOfKinPhone");
            return (Criteria) this;
        }

        public Criteria andNextOfKinPhoneLike(String value) {
            addCriterion("NEXT_OF_KIN_PHONE like", value, "nextOfKinPhone");
            return (Criteria) this;
        }

        public Criteria andNextOfKinPhoneNotLike(String value) {
            addCriterion("NEXT_OF_KIN_PHONE not like", value, "nextOfKinPhone");
            return (Criteria) this;
        }

        public Criteria andNextOfKinPhoneIn(List<String> values) {
            addCriterion("NEXT_OF_KIN_PHONE in", values, "nextOfKinPhone");
            return (Criteria) this;
        }

        public Criteria andNextOfKinPhoneNotIn(List<String> values) {
            addCriterion("NEXT_OF_KIN_PHONE not in", values, "nextOfKinPhone");
            return (Criteria) this;
        }

        public Criteria andNextOfKinPhoneBetween(String value1, String value2) {
            addCriterion("NEXT_OF_KIN_PHONE between", value1, value2, "nextOfKinPhone");
            return (Criteria) this;
        }

        public Criteria andNextOfKinPhoneNotBetween(String value1, String value2) {
            addCriterion("NEXT_OF_KIN_PHONE not between", value1, value2, "nextOfKinPhone");
            return (Criteria) this;
        }

        public Criteria andLastVisitDateIsNull() {
            addCriterion("LAST_VISIT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLastVisitDateIsNotNull() {
            addCriterion("LAST_VISIT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastVisitDateEqualTo(Date value) {
            addCriterionForJDBCDate("LAST_VISIT_DATE =", value, "lastVisitDate");
            return (Criteria) this;
        }

        public Criteria andLastVisitDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("LAST_VISIT_DATE <>", value, "lastVisitDate");
            return (Criteria) this;
        }

        public Criteria andLastVisitDateGreaterThan(Date value) {
            addCriterionForJDBCDate("LAST_VISIT_DATE >", value, "lastVisitDate");
            return (Criteria) this;
        }

        public Criteria andLastVisitDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LAST_VISIT_DATE >=", value, "lastVisitDate");
            return (Criteria) this;
        }

        public Criteria andLastVisitDateLessThan(Date value) {
            addCriterionForJDBCDate("LAST_VISIT_DATE <", value, "lastVisitDate");
            return (Criteria) this;
        }

        public Criteria andLastVisitDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LAST_VISIT_DATE <=", value, "lastVisitDate");
            return (Criteria) this;
        }

        public Criteria andLastVisitDateIn(List<Date> values) {
            addCriterionForJDBCDate("LAST_VISIT_DATE in", values, "lastVisitDate");
            return (Criteria) this;
        }

        public Criteria andLastVisitDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("LAST_VISIT_DATE not in", values, "lastVisitDate");
            return (Criteria) this;
        }

        public Criteria andLastVisitDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LAST_VISIT_DATE between", value1, value2, "lastVisitDate");
            return (Criteria) this;
        }

        public Criteria andLastVisitDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LAST_VISIT_DATE not between", value1, value2, "lastVisitDate");
            return (Criteria) this;
        }

        public Criteria andVipIndicatorIsNull() {
            addCriterion("VIP_INDICATOR is null");
            return (Criteria) this;
        }

        public Criteria andVipIndicatorIsNotNull() {
            addCriterion("VIP_INDICATOR is not null");
            return (Criteria) this;
        }

        public Criteria andVipIndicatorEqualTo(Integer value) {
            addCriterion("VIP_INDICATOR =", value, "vipIndicator");
            return (Criteria) this;
        }

        public Criteria andVipIndicatorNotEqualTo(Integer value) {
            addCriterion("VIP_INDICATOR <>", value, "vipIndicator");
            return (Criteria) this;
        }

        public Criteria andVipIndicatorGreaterThan(Integer value) {
            addCriterion("VIP_INDICATOR >", value, "vipIndicator");
            return (Criteria) this;
        }

        public Criteria andVipIndicatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("VIP_INDICATOR >=", value, "vipIndicator");
            return (Criteria) this;
        }

        public Criteria andVipIndicatorLessThan(Integer value) {
            addCriterion("VIP_INDICATOR <", value, "vipIndicator");
            return (Criteria) this;
        }

        public Criteria andVipIndicatorLessThanOrEqualTo(Integer value) {
            addCriterion("VIP_INDICATOR <=", value, "vipIndicator");
            return (Criteria) this;
        }

        public Criteria andVipIndicatorIn(List<Integer> values) {
            addCriterion("VIP_INDICATOR in", values, "vipIndicator");
            return (Criteria) this;
        }

        public Criteria andVipIndicatorNotIn(List<Integer> values) {
            addCriterion("VIP_INDICATOR not in", values, "vipIndicator");
            return (Criteria) this;
        }

        public Criteria andVipIndicatorBetween(Integer value1, Integer value2) {
            addCriterion("VIP_INDICATOR between", value1, value2, "vipIndicator");
            return (Criteria) this;
        }

        public Criteria andVipIndicatorNotBetween(Integer value1, Integer value2) {
            addCriterion("VIP_INDICATOR not between", value1, value2, "vipIndicator");
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

        public Criteria andOperatorIsNull() {
            addCriterion("OPERATOR is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("OPERATOR is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("OPERATOR =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("OPERATOR <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("OPERATOR >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATOR >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("OPERATOR <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("OPERATOR <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("OPERATOR like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("OPERATOR not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("OPERATOR in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("OPERATOR not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("OPERATOR between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("OPERATOR not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andServiceAgencyIsNull() {
            addCriterion("SERVICE_AGENCY is null");
            return (Criteria) this;
        }

        public Criteria andServiceAgencyIsNotNull() {
            addCriterion("SERVICE_AGENCY is not null");
            return (Criteria) this;
        }

        public Criteria andServiceAgencyEqualTo(String value) {
            addCriterion("SERVICE_AGENCY =", value, "serviceAgency");
            return (Criteria) this;
        }

        public Criteria andServiceAgencyNotEqualTo(String value) {
            addCriterion("SERVICE_AGENCY <>", value, "serviceAgency");
            return (Criteria) this;
        }

        public Criteria andServiceAgencyGreaterThan(String value) {
            addCriterion("SERVICE_AGENCY >", value, "serviceAgency");
            return (Criteria) this;
        }

        public Criteria andServiceAgencyGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_AGENCY >=", value, "serviceAgency");
            return (Criteria) this;
        }

        public Criteria andServiceAgencyLessThan(String value) {
            addCriterion("SERVICE_AGENCY <", value, "serviceAgency");
            return (Criteria) this;
        }

        public Criteria andServiceAgencyLessThanOrEqualTo(String value) {
            addCriterion("SERVICE_AGENCY <=", value, "serviceAgency");
            return (Criteria) this;
        }

        public Criteria andServiceAgencyLike(String value) {
            addCriterion("SERVICE_AGENCY like", value, "serviceAgency");
            return (Criteria) this;
        }

        public Criteria andServiceAgencyNotLike(String value) {
            addCriterion("SERVICE_AGENCY not like", value, "serviceAgency");
            return (Criteria) this;
        }

        public Criteria andServiceAgencyIn(List<String> values) {
            addCriterion("SERVICE_AGENCY in", values, "serviceAgency");
            return (Criteria) this;
        }

        public Criteria andServiceAgencyNotIn(List<String> values) {
            addCriterion("SERVICE_AGENCY not in", values, "serviceAgency");
            return (Criteria) this;
        }

        public Criteria andServiceAgencyBetween(String value1, String value2) {
            addCriterion("SERVICE_AGENCY between", value1, value2, "serviceAgency");
            return (Criteria) this;
        }

        public Criteria andServiceAgencyNotBetween(String value1, String value2) {
            addCriterion("SERVICE_AGENCY not between", value1, value2, "serviceAgency");
            return (Criteria) this;
        }

        public Criteria andBusinessZipCodeIsNull() {
            addCriterion("BUSINESS_ZIP_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBusinessZipCodeIsNotNull() {
            addCriterion("BUSINESS_ZIP_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessZipCodeEqualTo(String value) {
            addCriterion("BUSINESS_ZIP_CODE =", value, "businessZipCode");
            return (Criteria) this;
        }

        public Criteria andBusinessZipCodeNotEqualTo(String value) {
            addCriterion("BUSINESS_ZIP_CODE <>", value, "businessZipCode");
            return (Criteria) this;
        }

        public Criteria andBusinessZipCodeGreaterThan(String value) {
            addCriterion("BUSINESS_ZIP_CODE >", value, "businessZipCode");
            return (Criteria) this;
        }

        public Criteria andBusinessZipCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_ZIP_CODE >=", value, "businessZipCode");
            return (Criteria) this;
        }

        public Criteria andBusinessZipCodeLessThan(String value) {
            addCriterion("BUSINESS_ZIP_CODE <", value, "businessZipCode");
            return (Criteria) this;
        }

        public Criteria andBusinessZipCodeLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_ZIP_CODE <=", value, "businessZipCode");
            return (Criteria) this;
        }

        public Criteria andBusinessZipCodeLike(String value) {
            addCriterion("BUSINESS_ZIP_CODE like", value, "businessZipCode");
            return (Criteria) this;
        }

        public Criteria andBusinessZipCodeNotLike(String value) {
            addCriterion("BUSINESS_ZIP_CODE not like", value, "businessZipCode");
            return (Criteria) this;
        }

        public Criteria andBusinessZipCodeIn(List<String> values) {
            addCriterion("BUSINESS_ZIP_CODE in", values, "businessZipCode");
            return (Criteria) this;
        }

        public Criteria andBusinessZipCodeNotIn(List<String> values) {
            addCriterion("BUSINESS_ZIP_CODE not in", values, "businessZipCode");
            return (Criteria) this;
        }

        public Criteria andBusinessZipCodeBetween(String value1, String value2) {
            addCriterion("BUSINESS_ZIP_CODE between", value1, value2, "businessZipCode");
            return (Criteria) this;
        }

        public Criteria andBusinessZipCodeNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_ZIP_CODE not between", value1, value2, "businessZipCode");
            return (Criteria) this;
        }

        public Criteria andPatientClassIsNull() {
            addCriterion("PATIENT_CLASS is null");
            return (Criteria) this;
        }

        public Criteria andPatientClassIsNotNull() {
            addCriterion("PATIENT_CLASS is not null");
            return (Criteria) this;
        }

        public Criteria andPatientClassEqualTo(String value) {
            addCriterion("PATIENT_CLASS =", value, "patientClass");
            return (Criteria) this;
        }

        public Criteria andPatientClassNotEqualTo(String value) {
            addCriterion("PATIENT_CLASS <>", value, "patientClass");
            return (Criteria) this;
        }

        public Criteria andPatientClassGreaterThan(String value) {
            addCriterion("PATIENT_CLASS >", value, "patientClass");
            return (Criteria) this;
        }

        public Criteria andPatientClassGreaterThanOrEqualTo(String value) {
            addCriterion("PATIENT_CLASS >=", value, "patientClass");
            return (Criteria) this;
        }

        public Criteria andPatientClassLessThan(String value) {
            addCriterion("PATIENT_CLASS <", value, "patientClass");
            return (Criteria) this;
        }

        public Criteria andPatientClassLessThanOrEqualTo(String value) {
            addCriterion("PATIENT_CLASS <=", value, "patientClass");
            return (Criteria) this;
        }

        public Criteria andPatientClassLike(String value) {
            addCriterion("PATIENT_CLASS like", value, "patientClass");
            return (Criteria) this;
        }

        public Criteria andPatientClassNotLike(String value) {
            addCriterion("PATIENT_CLASS not like", value, "patientClass");
            return (Criteria) this;
        }

        public Criteria andPatientClassIn(List<String> values) {
            addCriterion("PATIENT_CLASS in", values, "patientClass");
            return (Criteria) this;
        }

        public Criteria andPatientClassNotIn(List<String> values) {
            addCriterion("PATIENT_CLASS not in", values, "patientClass");
            return (Criteria) this;
        }

        public Criteria andPatientClassBetween(String value1, String value2) {
            addCriterion("PATIENT_CLASS between", value1, value2, "patientClass");
            return (Criteria) this;
        }

        public Criteria andPatientClassNotBetween(String value1, String value2) {
            addCriterion("PATIENT_CLASS not between", value1, value2, "patientClass");
            return (Criteria) this;
        }

        public Criteria andEgreeIsNull() {
            addCriterion("EGREE is null");
            return (Criteria) this;
        }

        public Criteria andEgreeIsNotNull() {
            addCriterion("EGREE is not null");
            return (Criteria) this;
        }

        public Criteria andEgreeEqualTo(String value) {
            addCriterion("EGREE =", value, "egree");
            return (Criteria) this;
        }

        public Criteria andEgreeNotEqualTo(String value) {
            addCriterion("EGREE <>", value, "egree");
            return (Criteria) this;
        }

        public Criteria andEgreeGreaterThan(String value) {
            addCriterion("EGREE >", value, "egree");
            return (Criteria) this;
        }

        public Criteria andEgreeGreaterThanOrEqualTo(String value) {
            addCriterion("EGREE >=", value, "egree");
            return (Criteria) this;
        }

        public Criteria andEgreeLessThan(String value) {
            addCriterion("EGREE <", value, "egree");
            return (Criteria) this;
        }

        public Criteria andEgreeLessThanOrEqualTo(String value) {
            addCriterion("EGREE <=", value, "egree");
            return (Criteria) this;
        }

        public Criteria andEgreeLike(String value) {
            addCriterion("EGREE like", value, "egree");
            return (Criteria) this;
        }

        public Criteria andEgreeNotLike(String value) {
            addCriterion("EGREE not like", value, "egree");
            return (Criteria) this;
        }

        public Criteria andEgreeIn(List<String> values) {
            addCriterion("EGREE in", values, "egree");
            return (Criteria) this;
        }

        public Criteria andEgreeNotIn(List<String> values) {
            addCriterion("EGREE not in", values, "egree");
            return (Criteria) this;
        }

        public Criteria andEgreeBetween(String value1, String value2) {
            addCriterion("EGREE between", value1, value2, "egree");
            return (Criteria) this;
        }

        public Criteria andEgreeNotBetween(String value1, String value2) {
            addCriterion("EGREE not between", value1, value2, "egree");
            return (Criteria) this;
        }

        public Criteria andRaceIsNull() {
            addCriterion("RACE is null");
            return (Criteria) this;
        }

        public Criteria andRaceIsNotNull() {
            addCriterion("RACE is not null");
            return (Criteria) this;
        }

        public Criteria andRaceEqualTo(String value) {
            addCriterion("RACE =", value, "race");
            return (Criteria) this;
        }

        public Criteria andRaceNotEqualTo(String value) {
            addCriterion("RACE <>", value, "race");
            return (Criteria) this;
        }

        public Criteria andRaceGreaterThan(String value) {
            addCriterion("RACE >", value, "race");
            return (Criteria) this;
        }

        public Criteria andRaceGreaterThanOrEqualTo(String value) {
            addCriterion("RACE >=", value, "race");
            return (Criteria) this;
        }

        public Criteria andRaceLessThan(String value) {
            addCriterion("RACE <", value, "race");
            return (Criteria) this;
        }

        public Criteria andRaceLessThanOrEqualTo(String value) {
            addCriterion("RACE <=", value, "race");
            return (Criteria) this;
        }

        public Criteria andRaceLike(String value) {
            addCriterion("RACE like", value, "race");
            return (Criteria) this;
        }

        public Criteria andRaceNotLike(String value) {
            addCriterion("RACE not like", value, "race");
            return (Criteria) this;
        }

        public Criteria andRaceIn(List<String> values) {
            addCriterion("RACE in", values, "race");
            return (Criteria) this;
        }

        public Criteria andRaceNotIn(List<String> values) {
            addCriterion("RACE not in", values, "race");
            return (Criteria) this;
        }

        public Criteria andRaceBetween(String value1, String value2) {
            addCriterion("RACE between", value1, value2, "race");
            return (Criteria) this;
        }

        public Criteria andRaceNotBetween(String value1, String value2) {
            addCriterion("RACE not between", value1, value2, "race");
            return (Criteria) this;
        }

        public Criteria andReligionIsNull() {
            addCriterion("RELIGION is null");
            return (Criteria) this;
        }

        public Criteria andReligionIsNotNull() {
            addCriterion("RELIGION is not null");
            return (Criteria) this;
        }

        public Criteria andReligionEqualTo(String value) {
            addCriterion("RELIGION =", value, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionNotEqualTo(String value) {
            addCriterion("RELIGION <>", value, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionGreaterThan(String value) {
            addCriterion("RELIGION >", value, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionGreaterThanOrEqualTo(String value) {
            addCriterion("RELIGION >=", value, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionLessThan(String value) {
            addCriterion("RELIGION <", value, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionLessThanOrEqualTo(String value) {
            addCriterion("RELIGION <=", value, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionLike(String value) {
            addCriterion("RELIGION like", value, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionNotLike(String value) {
            addCriterion("RELIGION not like", value, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionIn(List<String> values) {
            addCriterion("RELIGION in", values, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionNotIn(List<String> values) {
            addCriterion("RELIGION not in", values, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionBetween(String value1, String value2) {
            addCriterion("RELIGION between", value1, value2, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionNotBetween(String value1, String value2) {
            addCriterion("RELIGION not between", value1, value2, "religion");
            return (Criteria) this;
        }

        public Criteria andMotherLanguageIsNull() {
            addCriterion("MOTHER_LANGUAGE is null");
            return (Criteria) this;
        }

        public Criteria andMotherLanguageIsNotNull() {
            addCriterion("MOTHER_LANGUAGE is not null");
            return (Criteria) this;
        }

        public Criteria andMotherLanguageEqualTo(String value) {
            addCriterion("MOTHER_LANGUAGE =", value, "motherLanguage");
            return (Criteria) this;
        }

        public Criteria andMotherLanguageNotEqualTo(String value) {
            addCriterion("MOTHER_LANGUAGE <>", value, "motherLanguage");
            return (Criteria) this;
        }

        public Criteria andMotherLanguageGreaterThan(String value) {
            addCriterion("MOTHER_LANGUAGE >", value, "motherLanguage");
            return (Criteria) this;
        }

        public Criteria andMotherLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("MOTHER_LANGUAGE >=", value, "motherLanguage");
            return (Criteria) this;
        }

        public Criteria andMotherLanguageLessThan(String value) {
            addCriterion("MOTHER_LANGUAGE <", value, "motherLanguage");
            return (Criteria) this;
        }

        public Criteria andMotherLanguageLessThanOrEqualTo(String value) {
            addCriterion("MOTHER_LANGUAGE <=", value, "motherLanguage");
            return (Criteria) this;
        }

        public Criteria andMotherLanguageLike(String value) {
            addCriterion("MOTHER_LANGUAGE like", value, "motherLanguage");
            return (Criteria) this;
        }

        public Criteria andMotherLanguageNotLike(String value) {
            addCriterion("MOTHER_LANGUAGE not like", value, "motherLanguage");
            return (Criteria) this;
        }

        public Criteria andMotherLanguageIn(List<String> values) {
            addCriterion("MOTHER_LANGUAGE in", values, "motherLanguage");
            return (Criteria) this;
        }

        public Criteria andMotherLanguageNotIn(List<String> values) {
            addCriterion("MOTHER_LANGUAGE not in", values, "motherLanguage");
            return (Criteria) this;
        }

        public Criteria andMotherLanguageBetween(String value1, String value2) {
            addCriterion("MOTHER_LANGUAGE between", value1, value2, "motherLanguage");
            return (Criteria) this;
        }

        public Criteria andMotherLanguageNotBetween(String value1, String value2) {
            addCriterion("MOTHER_LANGUAGE not between", value1, value2, "motherLanguage");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageIsNull() {
            addCriterion("FOREIGN_LANGUAGE is null");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageIsNotNull() {
            addCriterion("FOREIGN_LANGUAGE is not null");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageEqualTo(String value) {
            addCriterion("FOREIGN_LANGUAGE =", value, "foreignLanguage");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageNotEqualTo(String value) {
            addCriterion("FOREIGN_LANGUAGE <>", value, "foreignLanguage");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageGreaterThan(String value) {
            addCriterion("FOREIGN_LANGUAGE >", value, "foreignLanguage");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("FOREIGN_LANGUAGE >=", value, "foreignLanguage");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageLessThan(String value) {
            addCriterion("FOREIGN_LANGUAGE <", value, "foreignLanguage");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageLessThanOrEqualTo(String value) {
            addCriterion("FOREIGN_LANGUAGE <=", value, "foreignLanguage");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageLike(String value) {
            addCriterion("FOREIGN_LANGUAGE like", value, "foreignLanguage");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageNotLike(String value) {
            addCriterion("FOREIGN_LANGUAGE not like", value, "foreignLanguage");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageIn(List<String> values) {
            addCriterion("FOREIGN_LANGUAGE in", values, "foreignLanguage");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageNotIn(List<String> values) {
            addCriterion("FOREIGN_LANGUAGE not in", values, "foreignLanguage");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageBetween(String value1, String value2) {
            addCriterion("FOREIGN_LANGUAGE between", value1, value2, "foreignLanguage");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageNotBetween(String value1, String value2) {
            addCriterion("FOREIGN_LANGUAGE not between", value1, value2, "foreignLanguage");
            return (Criteria) this;
        }

        public Criteria andIdTypeIsNull() {
            addCriterion("ID_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andIdTypeIsNotNull() {
            addCriterion("ID_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIdTypeEqualTo(String value) {
            addCriterion("ID_TYPE =", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotEqualTo(String value) {
            addCriterion("ID_TYPE <>", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeGreaterThan(String value) {
            addCriterion("ID_TYPE >", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ID_TYPE >=", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLessThan(String value) {
            addCriterion("ID_TYPE <", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLessThanOrEqualTo(String value) {
            addCriterion("ID_TYPE <=", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLike(String value) {
            addCriterion("ID_TYPE like", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotLike(String value) {
            addCriterion("ID_TYPE not like", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeIn(List<String> values) {
            addCriterion("ID_TYPE in", values, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotIn(List<String> values) {
            addCriterion("ID_TYPE not in", values, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeBetween(String value1, String value2) {
            addCriterion("ID_TYPE between", value1, value2, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotBetween(String value1, String value2) {
            addCriterion("ID_TYPE not between", value1, value2, "idType");
            return (Criteria) this;
        }

        public Criteria andVipNoIsNull() {
            addCriterion("VIP_NO is null");
            return (Criteria) this;
        }

        public Criteria andVipNoIsNotNull() {
            addCriterion("VIP_NO is not null");
            return (Criteria) this;
        }

        public Criteria andVipNoEqualTo(String value) {
            addCriterion("VIP_NO =", value, "vipNo");
            return (Criteria) this;
        }

        public Criteria andVipNoNotEqualTo(String value) {
            addCriterion("VIP_NO <>", value, "vipNo");
            return (Criteria) this;
        }

        public Criteria andVipNoGreaterThan(String value) {
            addCriterion("VIP_NO >", value, "vipNo");
            return (Criteria) this;
        }

        public Criteria andVipNoGreaterThanOrEqualTo(String value) {
            addCriterion("VIP_NO >=", value, "vipNo");
            return (Criteria) this;
        }

        public Criteria andVipNoLessThan(String value) {
            addCriterion("VIP_NO <", value, "vipNo");
            return (Criteria) this;
        }

        public Criteria andVipNoLessThanOrEqualTo(String value) {
            addCriterion("VIP_NO <=", value, "vipNo");
            return (Criteria) this;
        }

        public Criteria andVipNoLike(String value) {
            addCriterion("VIP_NO like", value, "vipNo");
            return (Criteria) this;
        }

        public Criteria andVipNoNotLike(String value) {
            addCriterion("VIP_NO not like", value, "vipNo");
            return (Criteria) this;
        }

        public Criteria andVipNoIn(List<String> values) {
            addCriterion("VIP_NO in", values, "vipNo");
            return (Criteria) this;
        }

        public Criteria andVipNoNotIn(List<String> values) {
            addCriterion("VIP_NO not in", values, "vipNo");
            return (Criteria) this;
        }

        public Criteria andVipNoBetween(String value1, String value2) {
            addCriterion("VIP_NO between", value1, value2, "vipNo");
            return (Criteria) this;
        }

        public Criteria andVipNoNotBetween(String value1, String value2) {
            addCriterion("VIP_NO not between", value1, value2, "vipNo");
            return (Criteria) this;
        }

        public Criteria andENameIsNull() {
            addCriterion("E_NAME is null");
            return (Criteria) this;
        }

        public Criteria andENameIsNotNull() {
            addCriterion("E_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andENameEqualTo(String value) {
            addCriterion("E_NAME =", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameNotEqualTo(String value) {
            addCriterion("E_NAME <>", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameGreaterThan(String value) {
            addCriterion("E_NAME >", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameGreaterThanOrEqualTo(String value) {
            addCriterion("E_NAME >=", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameLessThan(String value) {
            addCriterion("E_NAME <", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameLessThanOrEqualTo(String value) {
            addCriterion("E_NAME <=", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameLike(String value) {
            addCriterion("E_NAME like", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameNotLike(String value) {
            addCriterion("E_NAME not like", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameIn(List<String> values) {
            addCriterion("E_NAME in", values, "eName");
            return (Criteria) this;
        }

        public Criteria andENameNotIn(List<String> values) {
            addCriterion("E_NAME not in", values, "eName");
            return (Criteria) this;
        }

        public Criteria andENameBetween(String value1, String value2) {
            addCriterion("E_NAME between", value1, value2, "eName");
            return (Criteria) this;
        }

        public Criteria andENameNotBetween(String value1, String value2) {
            addCriterion("E_NAME not between", value1, value2, "eName");
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