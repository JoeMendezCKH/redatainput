package com.joe.input.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ItClinicMasterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItClinicMasterExample() {
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

        public Criteria andVisitNoIsNull() {
            addCriterion("VISIT_NO is null");
            return (Criteria) this;
        }

        public Criteria andVisitNoIsNotNull() {
            addCriterion("VISIT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andVisitNoEqualTo(Integer value) {
            addCriterion("VISIT_NO =", value, "visitNo");
            return (Criteria) this;
        }

        public Criteria andVisitNoNotEqualTo(Integer value) {
            addCriterion("VISIT_NO <>", value, "visitNo");
            return (Criteria) this;
        }

        public Criteria andVisitNoGreaterThan(Integer value) {
            addCriterion("VISIT_NO >", value, "visitNo");
            return (Criteria) this;
        }

        public Criteria andVisitNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("VISIT_NO >=", value, "visitNo");
            return (Criteria) this;
        }

        public Criteria andVisitNoLessThan(Integer value) {
            addCriterion("VISIT_NO <", value, "visitNo");
            return (Criteria) this;
        }

        public Criteria andVisitNoLessThanOrEqualTo(Integer value) {
            addCriterion("VISIT_NO <=", value, "visitNo");
            return (Criteria) this;
        }

        public Criteria andVisitNoIn(List<Integer> values) {
            addCriterion("VISIT_NO in", values, "visitNo");
            return (Criteria) this;
        }

        public Criteria andVisitNoNotIn(List<Integer> values) {
            addCriterion("VISIT_NO not in", values, "visitNo");
            return (Criteria) this;
        }

        public Criteria andVisitNoBetween(Integer value1, Integer value2) {
            addCriterion("VISIT_NO between", value1, value2, "visitNo");
            return (Criteria) this;
        }

        public Criteria andVisitNoNotBetween(Integer value1, Integer value2) {
            addCriterion("VISIT_NO not between", value1, value2, "visitNo");
            return (Criteria) this;
        }

        public Criteria andVisitDateIsNull() {
            addCriterion("VISIT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andVisitDateIsNotNull() {
            addCriterion("VISIT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andVisitDateEqualTo(Date value) {
            addCriterion("VISIT_DATE =", value, "visitDate");
            return (Criteria) this;
        }

        public Criteria andVisitDateNotEqualTo(Date value) {
            addCriterion("VISIT_DATE <>", value, "visitDate");
            return (Criteria) this;
        }

        public Criteria andVisitDateGreaterThan(Date value) {
            addCriterion("VISIT_DATE >", value, "visitDate");
            return (Criteria) this;
        }

        public Criteria andVisitDateGreaterThanOrEqualTo(Date value) {
            addCriterion("VISIT_DATE >=", value, "visitDate");
            return (Criteria) this;
        }

        public Criteria andVisitDateLessThan(Date value) {
            addCriterion("VISIT_DATE <", value, "visitDate");
            return (Criteria) this;
        }

        public Criteria andVisitDateLessThanOrEqualTo(Date value) {
            addCriterion("VISIT_DATE <=", value, "visitDate");
            return (Criteria) this;
        }

        public Criteria andVisitDateIn(List<Date> values) {
            addCriterion("VISIT_DATE in", values, "visitDate");
            return (Criteria) this;
        }

        public Criteria andVisitDateNotIn(List<Date> values) {
            addCriterion("VISIT_DATE not in", values, "visitDate");
            return (Criteria) this;
        }

        public Criteria andVisitDateBetween(Date value1, Date value2) {
            addCriterion("VISIT_DATE between", value1, value2, "visitDate");
            return (Criteria) this;
        }

        public Criteria andVisitDateNotBetween(Date value1, Date value2) {
            addCriterion("VISIT_DATE not between", value1, value2, "visitDate");
            return (Criteria) this;
        }

        public Criteria andClinicLabelIsNull() {
            addCriterion("CLINIC_LABEL is null");
            return (Criteria) this;
        }

        public Criteria andClinicLabelIsNotNull() {
            addCriterion("CLINIC_LABEL is not null");
            return (Criteria) this;
        }

        public Criteria andClinicLabelEqualTo(String value) {
            addCriterion("CLINIC_LABEL =", value, "clinicLabel");
            return (Criteria) this;
        }

        public Criteria andClinicLabelNotEqualTo(String value) {
            addCriterion("CLINIC_LABEL <>", value, "clinicLabel");
            return (Criteria) this;
        }

        public Criteria andClinicLabelGreaterThan(String value) {
            addCriterion("CLINIC_LABEL >", value, "clinicLabel");
            return (Criteria) this;
        }

        public Criteria andClinicLabelGreaterThanOrEqualTo(String value) {
            addCriterion("CLINIC_LABEL >=", value, "clinicLabel");
            return (Criteria) this;
        }

        public Criteria andClinicLabelLessThan(String value) {
            addCriterion("CLINIC_LABEL <", value, "clinicLabel");
            return (Criteria) this;
        }

        public Criteria andClinicLabelLessThanOrEqualTo(String value) {
            addCriterion("CLINIC_LABEL <=", value, "clinicLabel");
            return (Criteria) this;
        }

        public Criteria andClinicLabelLike(String value) {
            addCriterion("CLINIC_LABEL like", value, "clinicLabel");
            return (Criteria) this;
        }

        public Criteria andClinicLabelNotLike(String value) {
            addCriterion("CLINIC_LABEL not like", value, "clinicLabel");
            return (Criteria) this;
        }

        public Criteria andClinicLabelIn(List<String> values) {
            addCriterion("CLINIC_LABEL in", values, "clinicLabel");
            return (Criteria) this;
        }

        public Criteria andClinicLabelNotIn(List<String> values) {
            addCriterion("CLINIC_LABEL not in", values, "clinicLabel");
            return (Criteria) this;
        }

        public Criteria andClinicLabelBetween(String value1, String value2) {
            addCriterion("CLINIC_LABEL between", value1, value2, "clinicLabel");
            return (Criteria) this;
        }

        public Criteria andClinicLabelNotBetween(String value1, String value2) {
            addCriterion("CLINIC_LABEL not between", value1, value2, "clinicLabel");
            return (Criteria) this;
        }

        public Criteria andVisitTimeDescIsNull() {
            addCriterion("VISIT_TIME_DESC is null");
            return (Criteria) this;
        }

        public Criteria andVisitTimeDescIsNotNull() {
            addCriterion("VISIT_TIME_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andVisitTimeDescEqualTo(String value) {
            addCriterion("VISIT_TIME_DESC =", value, "visitTimeDesc");
            return (Criteria) this;
        }

        public Criteria andVisitTimeDescNotEqualTo(String value) {
            addCriterion("VISIT_TIME_DESC <>", value, "visitTimeDesc");
            return (Criteria) this;
        }

        public Criteria andVisitTimeDescGreaterThan(String value) {
            addCriterion("VISIT_TIME_DESC >", value, "visitTimeDesc");
            return (Criteria) this;
        }

        public Criteria andVisitTimeDescGreaterThanOrEqualTo(String value) {
            addCriterion("VISIT_TIME_DESC >=", value, "visitTimeDesc");
            return (Criteria) this;
        }

        public Criteria andVisitTimeDescLessThan(String value) {
            addCriterion("VISIT_TIME_DESC <", value, "visitTimeDesc");
            return (Criteria) this;
        }

        public Criteria andVisitTimeDescLessThanOrEqualTo(String value) {
            addCriterion("VISIT_TIME_DESC <=", value, "visitTimeDesc");
            return (Criteria) this;
        }

        public Criteria andVisitTimeDescLike(String value) {
            addCriterion("VISIT_TIME_DESC like", value, "visitTimeDesc");
            return (Criteria) this;
        }

        public Criteria andVisitTimeDescNotLike(String value) {
            addCriterion("VISIT_TIME_DESC not like", value, "visitTimeDesc");
            return (Criteria) this;
        }

        public Criteria andVisitTimeDescIn(List<String> values) {
            addCriterion("VISIT_TIME_DESC in", values, "visitTimeDesc");
            return (Criteria) this;
        }

        public Criteria andVisitTimeDescNotIn(List<String> values) {
            addCriterion("VISIT_TIME_DESC not in", values, "visitTimeDesc");
            return (Criteria) this;
        }

        public Criteria andVisitTimeDescBetween(String value1, String value2) {
            addCriterion("VISIT_TIME_DESC between", value1, value2, "visitTimeDesc");
            return (Criteria) this;
        }

        public Criteria andVisitTimeDescNotBetween(String value1, String value2) {
            addCriterion("VISIT_TIME_DESC not between", value1, value2, "visitTimeDesc");
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

        public Criteria andAgeIsNull() {
            addCriterion("AGE is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("AGE is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("AGE =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("AGE <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("AGE >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("AGE >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("AGE <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("AGE <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("AGE in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("AGE not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("AGE between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("AGE not between", value1, value2, "age");
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

        public Criteria andInsuranceTypeIsNull() {
            addCriterion("INSURANCE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeIsNotNull() {
            addCriterion("INSURANCE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeEqualTo(String value) {
            addCriterion("INSURANCE_TYPE =", value, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeNotEqualTo(String value) {
            addCriterion("INSURANCE_TYPE <>", value, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeGreaterThan(String value) {
            addCriterion("INSURANCE_TYPE >", value, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("INSURANCE_TYPE >=", value, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeLessThan(String value) {
            addCriterion("INSURANCE_TYPE <", value, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeLessThanOrEqualTo(String value) {
            addCriterion("INSURANCE_TYPE <=", value, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeLike(String value) {
            addCriterion("INSURANCE_TYPE like", value, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeNotLike(String value) {
            addCriterion("INSURANCE_TYPE not like", value, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeIn(List<String> values) {
            addCriterion("INSURANCE_TYPE in", values, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeNotIn(List<String> values) {
            addCriterion("INSURANCE_TYPE not in", values, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeBetween(String value1, String value2) {
            addCriterion("INSURANCE_TYPE between", value1, value2, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeNotBetween(String value1, String value2) {
            addCriterion("INSURANCE_TYPE not between", value1, value2, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andInsuranceNoIsNull() {
            addCriterion("INSURANCE_NO is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceNoIsNotNull() {
            addCriterion("INSURANCE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceNoEqualTo(String value) {
            addCriterion("INSURANCE_NO =", value, "insuranceNo");
            return (Criteria) this;
        }

        public Criteria andInsuranceNoNotEqualTo(String value) {
            addCriterion("INSURANCE_NO <>", value, "insuranceNo");
            return (Criteria) this;
        }

        public Criteria andInsuranceNoGreaterThan(String value) {
            addCriterion("INSURANCE_NO >", value, "insuranceNo");
            return (Criteria) this;
        }

        public Criteria andInsuranceNoGreaterThanOrEqualTo(String value) {
            addCriterion("INSURANCE_NO >=", value, "insuranceNo");
            return (Criteria) this;
        }

        public Criteria andInsuranceNoLessThan(String value) {
            addCriterion("INSURANCE_NO <", value, "insuranceNo");
            return (Criteria) this;
        }

        public Criteria andInsuranceNoLessThanOrEqualTo(String value) {
            addCriterion("INSURANCE_NO <=", value, "insuranceNo");
            return (Criteria) this;
        }

        public Criteria andInsuranceNoLike(String value) {
            addCriterion("INSURANCE_NO like", value, "insuranceNo");
            return (Criteria) this;
        }

        public Criteria andInsuranceNoNotLike(String value) {
            addCriterion("INSURANCE_NO not like", value, "insuranceNo");
            return (Criteria) this;
        }

        public Criteria andInsuranceNoIn(List<String> values) {
            addCriterion("INSURANCE_NO in", values, "insuranceNo");
            return (Criteria) this;
        }

        public Criteria andInsuranceNoNotIn(List<String> values) {
            addCriterion("INSURANCE_NO not in", values, "insuranceNo");
            return (Criteria) this;
        }

        public Criteria andInsuranceNoBetween(String value1, String value2) {
            addCriterion("INSURANCE_NO between", value1, value2, "insuranceNo");
            return (Criteria) this;
        }

        public Criteria andInsuranceNoNotBetween(String value1, String value2) {
            addCriterion("INSURANCE_NO not between", value1, value2, "insuranceNo");
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

        public Criteria andClinicTypeIsNull() {
            addCriterion("CLINIC_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andClinicTypeIsNotNull() {
            addCriterion("CLINIC_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andClinicTypeEqualTo(String value) {
            addCriterion("CLINIC_TYPE =", value, "clinicType");
            return (Criteria) this;
        }

        public Criteria andClinicTypeNotEqualTo(String value) {
            addCriterion("CLINIC_TYPE <>", value, "clinicType");
            return (Criteria) this;
        }

        public Criteria andClinicTypeGreaterThan(String value) {
            addCriterion("CLINIC_TYPE >", value, "clinicType");
            return (Criteria) this;
        }

        public Criteria andClinicTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CLINIC_TYPE >=", value, "clinicType");
            return (Criteria) this;
        }

        public Criteria andClinicTypeLessThan(String value) {
            addCriterion("CLINIC_TYPE <", value, "clinicType");
            return (Criteria) this;
        }

        public Criteria andClinicTypeLessThanOrEqualTo(String value) {
            addCriterion("CLINIC_TYPE <=", value, "clinicType");
            return (Criteria) this;
        }

        public Criteria andClinicTypeLike(String value) {
            addCriterion("CLINIC_TYPE like", value, "clinicType");
            return (Criteria) this;
        }

        public Criteria andClinicTypeNotLike(String value) {
            addCriterion("CLINIC_TYPE not like", value, "clinicType");
            return (Criteria) this;
        }

        public Criteria andClinicTypeIn(List<String> values) {
            addCriterion("CLINIC_TYPE in", values, "clinicType");
            return (Criteria) this;
        }

        public Criteria andClinicTypeNotIn(List<String> values) {
            addCriterion("CLINIC_TYPE not in", values, "clinicType");
            return (Criteria) this;
        }

        public Criteria andClinicTypeBetween(String value1, String value2) {
            addCriterion("CLINIC_TYPE between", value1, value2, "clinicType");
            return (Criteria) this;
        }

        public Criteria andClinicTypeNotBetween(String value1, String value2) {
            addCriterion("CLINIC_TYPE not between", value1, value2, "clinicType");
            return (Criteria) this;
        }

        public Criteria andFirstVisitIndicatorIsNull() {
            addCriterion("FIRST_VISIT_INDICATOR is null");
            return (Criteria) this;
        }

        public Criteria andFirstVisitIndicatorIsNotNull() {
            addCriterion("FIRST_VISIT_INDICATOR is not null");
            return (Criteria) this;
        }

        public Criteria andFirstVisitIndicatorEqualTo(Integer value) {
            addCriterion("FIRST_VISIT_INDICATOR =", value, "firstVisitIndicator");
            return (Criteria) this;
        }

        public Criteria andFirstVisitIndicatorNotEqualTo(Integer value) {
            addCriterion("FIRST_VISIT_INDICATOR <>", value, "firstVisitIndicator");
            return (Criteria) this;
        }

        public Criteria andFirstVisitIndicatorGreaterThan(Integer value) {
            addCriterion("FIRST_VISIT_INDICATOR >", value, "firstVisitIndicator");
            return (Criteria) this;
        }

        public Criteria andFirstVisitIndicatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("FIRST_VISIT_INDICATOR >=", value, "firstVisitIndicator");
            return (Criteria) this;
        }

        public Criteria andFirstVisitIndicatorLessThan(Integer value) {
            addCriterion("FIRST_VISIT_INDICATOR <", value, "firstVisitIndicator");
            return (Criteria) this;
        }

        public Criteria andFirstVisitIndicatorLessThanOrEqualTo(Integer value) {
            addCriterion("FIRST_VISIT_INDICATOR <=", value, "firstVisitIndicator");
            return (Criteria) this;
        }

        public Criteria andFirstVisitIndicatorIn(List<Integer> values) {
            addCriterion("FIRST_VISIT_INDICATOR in", values, "firstVisitIndicator");
            return (Criteria) this;
        }

        public Criteria andFirstVisitIndicatorNotIn(List<Integer> values) {
            addCriterion("FIRST_VISIT_INDICATOR not in", values, "firstVisitIndicator");
            return (Criteria) this;
        }

        public Criteria andFirstVisitIndicatorBetween(Integer value1, Integer value2) {
            addCriterion("FIRST_VISIT_INDICATOR between", value1, value2, "firstVisitIndicator");
            return (Criteria) this;
        }

        public Criteria andFirstVisitIndicatorNotBetween(Integer value1, Integer value2) {
            addCriterion("FIRST_VISIT_INDICATOR not between", value1, value2, "firstVisitIndicator");
            return (Criteria) this;
        }

        public Criteria andVisitDeptIsNull() {
            addCriterion("VISIT_DEPT is null");
            return (Criteria) this;
        }

        public Criteria andVisitDeptIsNotNull() {
            addCriterion("VISIT_DEPT is not null");
            return (Criteria) this;
        }

        public Criteria andVisitDeptEqualTo(String value) {
            addCriterion("VISIT_DEPT =", value, "visitDept");
            return (Criteria) this;
        }

        public Criteria andVisitDeptNotEqualTo(String value) {
            addCriterion("VISIT_DEPT <>", value, "visitDept");
            return (Criteria) this;
        }

        public Criteria andVisitDeptGreaterThan(String value) {
            addCriterion("VISIT_DEPT >", value, "visitDept");
            return (Criteria) this;
        }

        public Criteria andVisitDeptGreaterThanOrEqualTo(String value) {
            addCriterion("VISIT_DEPT >=", value, "visitDept");
            return (Criteria) this;
        }

        public Criteria andVisitDeptLessThan(String value) {
            addCriterion("VISIT_DEPT <", value, "visitDept");
            return (Criteria) this;
        }

        public Criteria andVisitDeptLessThanOrEqualTo(String value) {
            addCriterion("VISIT_DEPT <=", value, "visitDept");
            return (Criteria) this;
        }

        public Criteria andVisitDeptLike(String value) {
            addCriterion("VISIT_DEPT like", value, "visitDept");
            return (Criteria) this;
        }

        public Criteria andVisitDeptNotLike(String value) {
            addCriterion("VISIT_DEPT not like", value, "visitDept");
            return (Criteria) this;
        }

        public Criteria andVisitDeptIn(List<String> values) {
            addCriterion("VISIT_DEPT in", values, "visitDept");
            return (Criteria) this;
        }

        public Criteria andVisitDeptNotIn(List<String> values) {
            addCriterion("VISIT_DEPT not in", values, "visitDept");
            return (Criteria) this;
        }

        public Criteria andVisitDeptBetween(String value1, String value2) {
            addCriterion("VISIT_DEPT between", value1, value2, "visitDept");
            return (Criteria) this;
        }

        public Criteria andVisitDeptNotBetween(String value1, String value2) {
            addCriterion("VISIT_DEPT not between", value1, value2, "visitDept");
            return (Criteria) this;
        }

        public Criteria andVisitSpecialClinicIsNull() {
            addCriterion("VISIT_SPECIAL_CLINIC is null");
            return (Criteria) this;
        }

        public Criteria andVisitSpecialClinicIsNotNull() {
            addCriterion("VISIT_SPECIAL_CLINIC is not null");
            return (Criteria) this;
        }

        public Criteria andVisitSpecialClinicEqualTo(String value) {
            addCriterion("VISIT_SPECIAL_CLINIC =", value, "visitSpecialClinic");
            return (Criteria) this;
        }

        public Criteria andVisitSpecialClinicNotEqualTo(String value) {
            addCriterion("VISIT_SPECIAL_CLINIC <>", value, "visitSpecialClinic");
            return (Criteria) this;
        }

        public Criteria andVisitSpecialClinicGreaterThan(String value) {
            addCriterion("VISIT_SPECIAL_CLINIC >", value, "visitSpecialClinic");
            return (Criteria) this;
        }

        public Criteria andVisitSpecialClinicGreaterThanOrEqualTo(String value) {
            addCriterion("VISIT_SPECIAL_CLINIC >=", value, "visitSpecialClinic");
            return (Criteria) this;
        }

        public Criteria andVisitSpecialClinicLessThan(String value) {
            addCriterion("VISIT_SPECIAL_CLINIC <", value, "visitSpecialClinic");
            return (Criteria) this;
        }

        public Criteria andVisitSpecialClinicLessThanOrEqualTo(String value) {
            addCriterion("VISIT_SPECIAL_CLINIC <=", value, "visitSpecialClinic");
            return (Criteria) this;
        }

        public Criteria andVisitSpecialClinicLike(String value) {
            addCriterion("VISIT_SPECIAL_CLINIC like", value, "visitSpecialClinic");
            return (Criteria) this;
        }

        public Criteria andVisitSpecialClinicNotLike(String value) {
            addCriterion("VISIT_SPECIAL_CLINIC not like", value, "visitSpecialClinic");
            return (Criteria) this;
        }

        public Criteria andVisitSpecialClinicIn(List<String> values) {
            addCriterion("VISIT_SPECIAL_CLINIC in", values, "visitSpecialClinic");
            return (Criteria) this;
        }

        public Criteria andVisitSpecialClinicNotIn(List<String> values) {
            addCriterion("VISIT_SPECIAL_CLINIC not in", values, "visitSpecialClinic");
            return (Criteria) this;
        }

        public Criteria andVisitSpecialClinicBetween(String value1, String value2) {
            addCriterion("VISIT_SPECIAL_CLINIC between", value1, value2, "visitSpecialClinic");
            return (Criteria) this;
        }

        public Criteria andVisitSpecialClinicNotBetween(String value1, String value2) {
            addCriterion("VISIT_SPECIAL_CLINIC not between", value1, value2, "visitSpecialClinic");
            return (Criteria) this;
        }

        public Criteria andDoctorIsNull() {
            addCriterion("DOCTOR is null");
            return (Criteria) this;
        }

        public Criteria andDoctorIsNotNull() {
            addCriterion("DOCTOR is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorEqualTo(String value) {
            addCriterion("DOCTOR =", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorNotEqualTo(String value) {
            addCriterion("DOCTOR <>", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorGreaterThan(String value) {
            addCriterion("DOCTOR >", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorGreaterThanOrEqualTo(String value) {
            addCriterion("DOCTOR >=", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorLessThan(String value) {
            addCriterion("DOCTOR <", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorLessThanOrEqualTo(String value) {
            addCriterion("DOCTOR <=", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorLike(String value) {
            addCriterion("DOCTOR like", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorNotLike(String value) {
            addCriterion("DOCTOR not like", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorIn(List<String> values) {
            addCriterion("DOCTOR in", values, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorNotIn(List<String> values) {
            addCriterion("DOCTOR not in", values, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorBetween(String value1, String value2) {
            addCriterion("DOCTOR between", value1, value2, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorNotBetween(String value1, String value2) {
            addCriterion("DOCTOR not between", value1, value2, "doctor");
            return (Criteria) this;
        }

        public Criteria andMrProvideIndicatorIsNull() {
            addCriterion("MR_PROVIDE_INDICATOR is null");
            return (Criteria) this;
        }

        public Criteria andMrProvideIndicatorIsNotNull() {
            addCriterion("MR_PROVIDE_INDICATOR is not null");
            return (Criteria) this;
        }

        public Criteria andMrProvideIndicatorEqualTo(Integer value) {
            addCriterion("MR_PROVIDE_INDICATOR =", value, "mrProvideIndicator");
            return (Criteria) this;
        }

        public Criteria andMrProvideIndicatorNotEqualTo(Integer value) {
            addCriterion("MR_PROVIDE_INDICATOR <>", value, "mrProvideIndicator");
            return (Criteria) this;
        }

        public Criteria andMrProvideIndicatorGreaterThan(Integer value) {
            addCriterion("MR_PROVIDE_INDICATOR >", value, "mrProvideIndicator");
            return (Criteria) this;
        }

        public Criteria andMrProvideIndicatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("MR_PROVIDE_INDICATOR >=", value, "mrProvideIndicator");
            return (Criteria) this;
        }

        public Criteria andMrProvideIndicatorLessThan(Integer value) {
            addCriterion("MR_PROVIDE_INDICATOR <", value, "mrProvideIndicator");
            return (Criteria) this;
        }

        public Criteria andMrProvideIndicatorLessThanOrEqualTo(Integer value) {
            addCriterion("MR_PROVIDE_INDICATOR <=", value, "mrProvideIndicator");
            return (Criteria) this;
        }

        public Criteria andMrProvideIndicatorIn(List<Integer> values) {
            addCriterion("MR_PROVIDE_INDICATOR in", values, "mrProvideIndicator");
            return (Criteria) this;
        }

        public Criteria andMrProvideIndicatorNotIn(List<Integer> values) {
            addCriterion("MR_PROVIDE_INDICATOR not in", values, "mrProvideIndicator");
            return (Criteria) this;
        }

        public Criteria andMrProvideIndicatorBetween(Integer value1, Integer value2) {
            addCriterion("MR_PROVIDE_INDICATOR between", value1, value2, "mrProvideIndicator");
            return (Criteria) this;
        }

        public Criteria andMrProvideIndicatorNotBetween(Integer value1, Integer value2) {
            addCriterion("MR_PROVIDE_INDICATOR not between", value1, value2, "mrProvideIndicator");
            return (Criteria) this;
        }

        public Criteria andRegistrationStatusIsNull() {
            addCriterion("REGISTRATION_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationStatusIsNotNull() {
            addCriterion("REGISTRATION_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationStatusEqualTo(Integer value) {
            addCriterion("REGISTRATION_STATUS =", value, "registrationStatus");
            return (Criteria) this;
        }

        public Criteria andRegistrationStatusNotEqualTo(Integer value) {
            addCriterion("REGISTRATION_STATUS <>", value, "registrationStatus");
            return (Criteria) this;
        }

        public Criteria andRegistrationStatusGreaterThan(Integer value) {
            addCriterion("REGISTRATION_STATUS >", value, "registrationStatus");
            return (Criteria) this;
        }

        public Criteria andRegistrationStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("REGISTRATION_STATUS >=", value, "registrationStatus");
            return (Criteria) this;
        }

        public Criteria andRegistrationStatusLessThan(Integer value) {
            addCriterion("REGISTRATION_STATUS <", value, "registrationStatus");
            return (Criteria) this;
        }

        public Criteria andRegistrationStatusLessThanOrEqualTo(Integer value) {
            addCriterion("REGISTRATION_STATUS <=", value, "registrationStatus");
            return (Criteria) this;
        }

        public Criteria andRegistrationStatusIn(List<Integer> values) {
            addCriterion("REGISTRATION_STATUS in", values, "registrationStatus");
            return (Criteria) this;
        }

        public Criteria andRegistrationStatusNotIn(List<Integer> values) {
            addCriterion("REGISTRATION_STATUS not in", values, "registrationStatus");
            return (Criteria) this;
        }

        public Criteria andRegistrationStatusBetween(Integer value1, Integer value2) {
            addCriterion("REGISTRATION_STATUS between", value1, value2, "registrationStatus");
            return (Criteria) this;
        }

        public Criteria andRegistrationStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("REGISTRATION_STATUS not between", value1, value2, "registrationStatus");
            return (Criteria) this;
        }

        public Criteria andRegisteringDateIsNull() {
            addCriterion("REGISTERING_DATE is null");
            return (Criteria) this;
        }

        public Criteria andRegisteringDateIsNotNull() {
            addCriterion("REGISTERING_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteringDateEqualTo(Date value) {
            addCriterionForJDBCDate("REGISTERING_DATE =", value, "registeringDate");
            return (Criteria) this;
        }

        public Criteria andRegisteringDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("REGISTERING_DATE <>", value, "registeringDate");
            return (Criteria) this;
        }

        public Criteria andRegisteringDateGreaterThan(Date value) {
            addCriterionForJDBCDate("REGISTERING_DATE >", value, "registeringDate");
            return (Criteria) this;
        }

        public Criteria andRegisteringDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("REGISTERING_DATE >=", value, "registeringDate");
            return (Criteria) this;
        }

        public Criteria andRegisteringDateLessThan(Date value) {
            addCriterionForJDBCDate("REGISTERING_DATE <", value, "registeringDate");
            return (Criteria) this;
        }

        public Criteria andRegisteringDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("REGISTERING_DATE <=", value, "registeringDate");
            return (Criteria) this;
        }

        public Criteria andRegisteringDateIn(List<Date> values) {
            addCriterionForJDBCDate("REGISTERING_DATE in", values, "registeringDate");
            return (Criteria) this;
        }

        public Criteria andRegisteringDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("REGISTERING_DATE not in", values, "registeringDate");
            return (Criteria) this;
        }

        public Criteria andRegisteringDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("REGISTERING_DATE between", value1, value2, "registeringDate");
            return (Criteria) this;
        }

        public Criteria andRegisteringDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("REGISTERING_DATE not between", value1, value2, "registeringDate");
            return (Criteria) this;
        }

        public Criteria andSymptomIsNull() {
            addCriterion("SYMPTOM is null");
            return (Criteria) this;
        }

        public Criteria andSymptomIsNotNull() {
            addCriterion("SYMPTOM is not null");
            return (Criteria) this;
        }

        public Criteria andSymptomEqualTo(String value) {
            addCriterion("SYMPTOM =", value, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomNotEqualTo(String value) {
            addCriterion("SYMPTOM <>", value, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomGreaterThan(String value) {
            addCriterion("SYMPTOM >", value, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomGreaterThanOrEqualTo(String value) {
            addCriterion("SYMPTOM >=", value, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomLessThan(String value) {
            addCriterion("SYMPTOM <", value, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomLessThanOrEqualTo(String value) {
            addCriterion("SYMPTOM <=", value, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomLike(String value) {
            addCriterion("SYMPTOM like", value, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomNotLike(String value) {
            addCriterion("SYMPTOM not like", value, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomIn(List<String> values) {
            addCriterion("SYMPTOM in", values, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomNotIn(List<String> values) {
            addCriterion("SYMPTOM not in", values, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomBetween(String value1, String value2) {
            addCriterion("SYMPTOM between", value1, value2, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomNotBetween(String value1, String value2) {
            addCriterion("SYMPTOM not between", value1, value2, "symptom");
            return (Criteria) this;
        }

        public Criteria andRegistFeeIsNull() {
            addCriterion("REGIST_FEE is null");
            return (Criteria) this;
        }

        public Criteria andRegistFeeIsNotNull() {
            addCriterion("REGIST_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andRegistFeeEqualTo(Float value) {
            addCriterion("REGIST_FEE =", value, "registFee");
            return (Criteria) this;
        }

        public Criteria andRegistFeeNotEqualTo(Float value) {
            addCriterion("REGIST_FEE <>", value, "registFee");
            return (Criteria) this;
        }

        public Criteria andRegistFeeGreaterThan(Float value) {
            addCriterion("REGIST_FEE >", value, "registFee");
            return (Criteria) this;
        }

        public Criteria andRegistFeeGreaterThanOrEqualTo(Float value) {
            addCriterion("REGIST_FEE >=", value, "registFee");
            return (Criteria) this;
        }

        public Criteria andRegistFeeLessThan(Float value) {
            addCriterion("REGIST_FEE <", value, "registFee");
            return (Criteria) this;
        }

        public Criteria andRegistFeeLessThanOrEqualTo(Float value) {
            addCriterion("REGIST_FEE <=", value, "registFee");
            return (Criteria) this;
        }

        public Criteria andRegistFeeIn(List<Float> values) {
            addCriterion("REGIST_FEE in", values, "registFee");
            return (Criteria) this;
        }

        public Criteria andRegistFeeNotIn(List<Float> values) {
            addCriterion("REGIST_FEE not in", values, "registFee");
            return (Criteria) this;
        }

        public Criteria andRegistFeeBetween(Float value1, Float value2) {
            addCriterion("REGIST_FEE between", value1, value2, "registFee");
            return (Criteria) this;
        }

        public Criteria andRegistFeeNotBetween(Float value1, Float value2) {
            addCriterion("REGIST_FEE not between", value1, value2, "registFee");
            return (Criteria) this;
        }

        public Criteria andClinicFeeIsNull() {
            addCriterion("CLINIC_FEE is null");
            return (Criteria) this;
        }

        public Criteria andClinicFeeIsNotNull() {
            addCriterion("CLINIC_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andClinicFeeEqualTo(Float value) {
            addCriterion("CLINIC_FEE =", value, "clinicFee");
            return (Criteria) this;
        }

        public Criteria andClinicFeeNotEqualTo(Float value) {
            addCriterion("CLINIC_FEE <>", value, "clinicFee");
            return (Criteria) this;
        }

        public Criteria andClinicFeeGreaterThan(Float value) {
            addCriterion("CLINIC_FEE >", value, "clinicFee");
            return (Criteria) this;
        }

        public Criteria andClinicFeeGreaterThanOrEqualTo(Float value) {
            addCriterion("CLINIC_FEE >=", value, "clinicFee");
            return (Criteria) this;
        }

        public Criteria andClinicFeeLessThan(Float value) {
            addCriterion("CLINIC_FEE <", value, "clinicFee");
            return (Criteria) this;
        }

        public Criteria andClinicFeeLessThanOrEqualTo(Float value) {
            addCriterion("CLINIC_FEE <=", value, "clinicFee");
            return (Criteria) this;
        }

        public Criteria andClinicFeeIn(List<Float> values) {
            addCriterion("CLINIC_FEE in", values, "clinicFee");
            return (Criteria) this;
        }

        public Criteria andClinicFeeNotIn(List<Float> values) {
            addCriterion("CLINIC_FEE not in", values, "clinicFee");
            return (Criteria) this;
        }

        public Criteria andClinicFeeBetween(Float value1, Float value2) {
            addCriterion("CLINIC_FEE between", value1, value2, "clinicFee");
            return (Criteria) this;
        }

        public Criteria andClinicFeeNotBetween(Float value1, Float value2) {
            addCriterion("CLINIC_FEE not between", value1, value2, "clinicFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeIsNull() {
            addCriterion("OTHER_FEE is null");
            return (Criteria) this;
        }

        public Criteria andOtherFeeIsNotNull() {
            addCriterion("OTHER_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andOtherFeeEqualTo(Float value) {
            addCriterion("OTHER_FEE =", value, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeNotEqualTo(Float value) {
            addCriterion("OTHER_FEE <>", value, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeGreaterThan(Float value) {
            addCriterion("OTHER_FEE >", value, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeGreaterThanOrEqualTo(Float value) {
            addCriterion("OTHER_FEE >=", value, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeLessThan(Float value) {
            addCriterion("OTHER_FEE <", value, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeLessThanOrEqualTo(Float value) {
            addCriterion("OTHER_FEE <=", value, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeIn(List<Float> values) {
            addCriterion("OTHER_FEE in", values, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeNotIn(List<Float> values) {
            addCriterion("OTHER_FEE not in", values, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeBetween(Float value1, Float value2) {
            addCriterion("OTHER_FEE between", value1, value2, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeNotBetween(Float value1, Float value2) {
            addCriterion("OTHER_FEE not between", value1, value2, "otherFee");
            return (Criteria) this;
        }

        public Criteria andClinicChargeIsNull() {
            addCriterion("CLINIC_CHARGE is null");
            return (Criteria) this;
        }

        public Criteria andClinicChargeIsNotNull() {
            addCriterion("CLINIC_CHARGE is not null");
            return (Criteria) this;
        }

        public Criteria andClinicChargeEqualTo(Float value) {
            addCriterion("CLINIC_CHARGE =", value, "clinicCharge");
            return (Criteria) this;
        }

        public Criteria andClinicChargeNotEqualTo(Float value) {
            addCriterion("CLINIC_CHARGE <>", value, "clinicCharge");
            return (Criteria) this;
        }

        public Criteria andClinicChargeGreaterThan(Float value) {
            addCriterion("CLINIC_CHARGE >", value, "clinicCharge");
            return (Criteria) this;
        }

        public Criteria andClinicChargeGreaterThanOrEqualTo(Float value) {
            addCriterion("CLINIC_CHARGE >=", value, "clinicCharge");
            return (Criteria) this;
        }

        public Criteria andClinicChargeLessThan(Float value) {
            addCriterion("CLINIC_CHARGE <", value, "clinicCharge");
            return (Criteria) this;
        }

        public Criteria andClinicChargeLessThanOrEqualTo(Float value) {
            addCriterion("CLINIC_CHARGE <=", value, "clinicCharge");
            return (Criteria) this;
        }

        public Criteria andClinicChargeIn(List<Float> values) {
            addCriterion("CLINIC_CHARGE in", values, "clinicCharge");
            return (Criteria) this;
        }

        public Criteria andClinicChargeNotIn(List<Float> values) {
            addCriterion("CLINIC_CHARGE not in", values, "clinicCharge");
            return (Criteria) this;
        }

        public Criteria andClinicChargeBetween(Float value1, Float value2) {
            addCriterion("CLINIC_CHARGE between", value1, value2, "clinicCharge");
            return (Criteria) this;
        }

        public Criteria andClinicChargeNotBetween(Float value1, Float value2) {
            addCriterion("CLINIC_CHARGE not between", value1, value2, "clinicCharge");
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

        public Criteria andReturnedDateIsNull() {
            addCriterion("RETURNED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andReturnedDateIsNotNull() {
            addCriterion("RETURNED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andReturnedDateEqualTo(Date value) {
            addCriterionForJDBCDate("RETURNED_DATE =", value, "returnedDate");
            return (Criteria) this;
        }

        public Criteria andReturnedDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("RETURNED_DATE <>", value, "returnedDate");
            return (Criteria) this;
        }

        public Criteria andReturnedDateGreaterThan(Date value) {
            addCriterionForJDBCDate("RETURNED_DATE >", value, "returnedDate");
            return (Criteria) this;
        }

        public Criteria andReturnedDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RETURNED_DATE >=", value, "returnedDate");
            return (Criteria) this;
        }

        public Criteria andReturnedDateLessThan(Date value) {
            addCriterionForJDBCDate("RETURNED_DATE <", value, "returnedDate");
            return (Criteria) this;
        }

        public Criteria andReturnedDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RETURNED_DATE <=", value, "returnedDate");
            return (Criteria) this;
        }

        public Criteria andReturnedDateIn(List<Date> values) {
            addCriterionForJDBCDate("RETURNED_DATE in", values, "returnedDate");
            return (Criteria) this;
        }

        public Criteria andReturnedDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("RETURNED_DATE not in", values, "returnedDate");
            return (Criteria) this;
        }

        public Criteria andReturnedDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RETURNED_DATE between", value1, value2, "returnedDate");
            return (Criteria) this;
        }

        public Criteria andReturnedDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RETURNED_DATE not between", value1, value2, "returnedDate");
            return (Criteria) this;
        }

        public Criteria andReturnedOperatorIsNull() {
            addCriterion("RETURNED_OPERATOR is null");
            return (Criteria) this;
        }

        public Criteria andReturnedOperatorIsNotNull() {
            addCriterion("RETURNED_OPERATOR is not null");
            return (Criteria) this;
        }

        public Criteria andReturnedOperatorEqualTo(String value) {
            addCriterion("RETURNED_OPERATOR =", value, "returnedOperator");
            return (Criteria) this;
        }

        public Criteria andReturnedOperatorNotEqualTo(String value) {
            addCriterion("RETURNED_OPERATOR <>", value, "returnedOperator");
            return (Criteria) this;
        }

        public Criteria andReturnedOperatorGreaterThan(String value) {
            addCriterion("RETURNED_OPERATOR >", value, "returnedOperator");
            return (Criteria) this;
        }

        public Criteria andReturnedOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("RETURNED_OPERATOR >=", value, "returnedOperator");
            return (Criteria) this;
        }

        public Criteria andReturnedOperatorLessThan(String value) {
            addCriterion("RETURNED_OPERATOR <", value, "returnedOperator");
            return (Criteria) this;
        }

        public Criteria andReturnedOperatorLessThanOrEqualTo(String value) {
            addCriterion("RETURNED_OPERATOR <=", value, "returnedOperator");
            return (Criteria) this;
        }

        public Criteria andReturnedOperatorLike(String value) {
            addCriterion("RETURNED_OPERATOR like", value, "returnedOperator");
            return (Criteria) this;
        }

        public Criteria andReturnedOperatorNotLike(String value) {
            addCriterion("RETURNED_OPERATOR not like", value, "returnedOperator");
            return (Criteria) this;
        }

        public Criteria andReturnedOperatorIn(List<String> values) {
            addCriterion("RETURNED_OPERATOR in", values, "returnedOperator");
            return (Criteria) this;
        }

        public Criteria andReturnedOperatorNotIn(List<String> values) {
            addCriterion("RETURNED_OPERATOR not in", values, "returnedOperator");
            return (Criteria) this;
        }

        public Criteria andReturnedOperatorBetween(String value1, String value2) {
            addCriterion("RETURNED_OPERATOR between", value1, value2, "returnedOperator");
            return (Criteria) this;
        }

        public Criteria andReturnedOperatorNotBetween(String value1, String value2) {
            addCriterion("RETURNED_OPERATOR not between", value1, value2, "returnedOperator");
            return (Criteria) this;
        }

        public Criteria andModeCodeIsNull() {
            addCriterion("MODE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andModeCodeIsNotNull() {
            addCriterion("MODE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andModeCodeEqualTo(String value) {
            addCriterion("MODE_CODE =", value, "modeCode");
            return (Criteria) this;
        }

        public Criteria andModeCodeNotEqualTo(String value) {
            addCriterion("MODE_CODE <>", value, "modeCode");
            return (Criteria) this;
        }

        public Criteria andModeCodeGreaterThan(String value) {
            addCriterion("MODE_CODE >", value, "modeCode");
            return (Criteria) this;
        }

        public Criteria andModeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("MODE_CODE >=", value, "modeCode");
            return (Criteria) this;
        }

        public Criteria andModeCodeLessThan(String value) {
            addCriterion("MODE_CODE <", value, "modeCode");
            return (Criteria) this;
        }

        public Criteria andModeCodeLessThanOrEqualTo(String value) {
            addCriterion("MODE_CODE <=", value, "modeCode");
            return (Criteria) this;
        }

        public Criteria andModeCodeLike(String value) {
            addCriterion("MODE_CODE like", value, "modeCode");
            return (Criteria) this;
        }

        public Criteria andModeCodeNotLike(String value) {
            addCriterion("MODE_CODE not like", value, "modeCode");
            return (Criteria) this;
        }

        public Criteria andModeCodeIn(List<String> values) {
            addCriterion("MODE_CODE in", values, "modeCode");
            return (Criteria) this;
        }

        public Criteria andModeCodeNotIn(List<String> values) {
            addCriterion("MODE_CODE not in", values, "modeCode");
            return (Criteria) this;
        }

        public Criteria andModeCodeBetween(String value1, String value2) {
            addCriterion("MODE_CODE between", value1, value2, "modeCode");
            return (Criteria) this;
        }

        public Criteria andModeCodeNotBetween(String value1, String value2) {
            addCriterion("MODE_CODE not between", value1, value2, "modeCode");
            return (Criteria) this;
        }

        public Criteria andCardNameIsNull() {
            addCriterion("CARD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCardNameIsNotNull() {
            addCriterion("CARD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCardNameEqualTo(String value) {
            addCriterion("CARD_NAME =", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotEqualTo(String value) {
            addCriterion("CARD_NAME <>", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameGreaterThan(String value) {
            addCriterion("CARD_NAME >", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_NAME >=", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameLessThan(String value) {
            addCriterion("CARD_NAME <", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameLessThanOrEqualTo(String value) {
            addCriterion("CARD_NAME <=", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameLike(String value) {
            addCriterion("CARD_NAME like", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotLike(String value) {
            addCriterion("CARD_NAME not like", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameIn(List<String> values) {
            addCriterion("CARD_NAME in", values, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotIn(List<String> values) {
            addCriterion("CARD_NAME not in", values, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameBetween(String value1, String value2) {
            addCriterion("CARD_NAME between", value1, value2, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotBetween(String value1, String value2) {
            addCriterion("CARD_NAME not between", value1, value2, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNoIsNull() {
            addCriterion("CARD_NO is null");
            return (Criteria) this;
        }

        public Criteria andCardNoIsNotNull() {
            addCriterion("CARD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCardNoEqualTo(String value) {
            addCriterion("CARD_NO =", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotEqualTo(String value) {
            addCriterion("CARD_NO <>", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThan(String value) {
            addCriterion("CARD_NO >", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_NO >=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThan(String value) {
            addCriterion("CARD_NO <", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThanOrEqualTo(String value) {
            addCriterion("CARD_NO <=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLike(String value) {
            addCriterion("CARD_NO like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotLike(String value) {
            addCriterion("CARD_NO not like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoIn(List<String> values) {
            addCriterion("CARD_NO in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotIn(List<String> values) {
            addCriterion("CARD_NO not in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoBetween(String value1, String value2) {
            addCriterion("CARD_NO between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotBetween(String value1, String value2) {
            addCriterion("CARD_NO not between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andAcctDateTimeIsNull() {
            addCriterion("ACCT_DATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAcctDateTimeIsNotNull() {
            addCriterion("ACCT_DATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAcctDateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("ACCT_DATE_TIME =", value, "acctDateTime");
            return (Criteria) this;
        }

        public Criteria andAcctDateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("ACCT_DATE_TIME <>", value, "acctDateTime");
            return (Criteria) this;
        }

        public Criteria andAcctDateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("ACCT_DATE_TIME >", value, "acctDateTime");
            return (Criteria) this;
        }

        public Criteria andAcctDateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ACCT_DATE_TIME >=", value, "acctDateTime");
            return (Criteria) this;
        }

        public Criteria andAcctDateTimeLessThan(Date value) {
            addCriterionForJDBCDate("ACCT_DATE_TIME <", value, "acctDateTime");
            return (Criteria) this;
        }

        public Criteria andAcctDateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ACCT_DATE_TIME <=", value, "acctDateTime");
            return (Criteria) this;
        }

        public Criteria andAcctDateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("ACCT_DATE_TIME in", values, "acctDateTime");
            return (Criteria) this;
        }

        public Criteria andAcctDateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("ACCT_DATE_TIME not in", values, "acctDateTime");
            return (Criteria) this;
        }

        public Criteria andAcctDateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ACCT_DATE_TIME between", value1, value2, "acctDateTime");
            return (Criteria) this;
        }

        public Criteria andAcctDateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ACCT_DATE_TIME not between", value1, value2, "acctDateTime");
            return (Criteria) this;
        }

        public Criteria andAcctNoIsNull() {
            addCriterion("ACCT_NO is null");
            return (Criteria) this;
        }

        public Criteria andAcctNoIsNotNull() {
            addCriterion("ACCT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andAcctNoEqualTo(String value) {
            addCriterion("ACCT_NO =", value, "acctNo");
            return (Criteria) this;
        }

        public Criteria andAcctNoNotEqualTo(String value) {
            addCriterion("ACCT_NO <>", value, "acctNo");
            return (Criteria) this;
        }

        public Criteria andAcctNoGreaterThan(String value) {
            addCriterion("ACCT_NO >", value, "acctNo");
            return (Criteria) this;
        }

        public Criteria andAcctNoGreaterThanOrEqualTo(String value) {
            addCriterion("ACCT_NO >=", value, "acctNo");
            return (Criteria) this;
        }

        public Criteria andAcctNoLessThan(String value) {
            addCriterion("ACCT_NO <", value, "acctNo");
            return (Criteria) this;
        }

        public Criteria andAcctNoLessThanOrEqualTo(String value) {
            addCriterion("ACCT_NO <=", value, "acctNo");
            return (Criteria) this;
        }

        public Criteria andAcctNoLike(String value) {
            addCriterion("ACCT_NO like", value, "acctNo");
            return (Criteria) this;
        }

        public Criteria andAcctNoNotLike(String value) {
            addCriterion("ACCT_NO not like", value, "acctNo");
            return (Criteria) this;
        }

        public Criteria andAcctNoIn(List<String> values) {
            addCriterion("ACCT_NO in", values, "acctNo");
            return (Criteria) this;
        }

        public Criteria andAcctNoNotIn(List<String> values) {
            addCriterion("ACCT_NO not in", values, "acctNo");
            return (Criteria) this;
        }

        public Criteria andAcctNoBetween(String value1, String value2) {
            addCriterion("ACCT_NO between", value1, value2, "acctNo");
            return (Criteria) this;
        }

        public Criteria andAcctNoNotBetween(String value1, String value2) {
            addCriterion("ACCT_NO not between", value1, value2, "acctNo");
            return (Criteria) this;
        }

        public Criteria andPayWayIsNull() {
            addCriterion("PAY_WAY is null");
            return (Criteria) this;
        }

        public Criteria andPayWayIsNotNull() {
            addCriterion("PAY_WAY is not null");
            return (Criteria) this;
        }

        public Criteria andPayWayEqualTo(String value) {
            addCriterion("PAY_WAY =", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotEqualTo(String value) {
            addCriterion("PAY_WAY <>", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThan(String value) {
            addCriterion("PAY_WAY >", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_WAY >=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThan(String value) {
            addCriterion("PAY_WAY <", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThanOrEqualTo(String value) {
            addCriterion("PAY_WAY <=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLike(String value) {
            addCriterion("PAY_WAY like", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotLike(String value) {
            addCriterion("PAY_WAY not like", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayIn(List<String> values) {
            addCriterion("PAY_WAY in", values, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotIn(List<String> values) {
            addCriterion("PAY_WAY not in", values, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayBetween(String value1, String value2) {
            addCriterion("PAY_WAY between", value1, value2, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotBetween(String value1, String value2) {
            addCriterion("PAY_WAY not between", value1, value2, "payWay");
            return (Criteria) this;
        }

        public Criteria andMrProvidedIndicatorIsNull() {
            addCriterion("MR_PROVIDED_INDICATOR is null");
            return (Criteria) this;
        }

        public Criteria andMrProvidedIndicatorIsNotNull() {
            addCriterion("MR_PROVIDED_INDICATOR is not null");
            return (Criteria) this;
        }

        public Criteria andMrProvidedIndicatorEqualTo(Integer value) {
            addCriterion("MR_PROVIDED_INDICATOR =", value, "mrProvidedIndicator");
            return (Criteria) this;
        }

        public Criteria andMrProvidedIndicatorNotEqualTo(Integer value) {
            addCriterion("MR_PROVIDED_INDICATOR <>", value, "mrProvidedIndicator");
            return (Criteria) this;
        }

        public Criteria andMrProvidedIndicatorGreaterThan(Integer value) {
            addCriterion("MR_PROVIDED_INDICATOR >", value, "mrProvidedIndicator");
            return (Criteria) this;
        }

        public Criteria andMrProvidedIndicatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("MR_PROVIDED_INDICATOR >=", value, "mrProvidedIndicator");
            return (Criteria) this;
        }

        public Criteria andMrProvidedIndicatorLessThan(Integer value) {
            addCriterion("MR_PROVIDED_INDICATOR <", value, "mrProvidedIndicator");
            return (Criteria) this;
        }

        public Criteria andMrProvidedIndicatorLessThanOrEqualTo(Integer value) {
            addCriterion("MR_PROVIDED_INDICATOR <=", value, "mrProvidedIndicator");
            return (Criteria) this;
        }

        public Criteria andMrProvidedIndicatorIn(List<Integer> values) {
            addCriterion("MR_PROVIDED_INDICATOR in", values, "mrProvidedIndicator");
            return (Criteria) this;
        }

        public Criteria andMrProvidedIndicatorNotIn(List<Integer> values) {
            addCriterion("MR_PROVIDED_INDICATOR not in", values, "mrProvidedIndicator");
            return (Criteria) this;
        }

        public Criteria andMrProvidedIndicatorBetween(Integer value1, Integer value2) {
            addCriterion("MR_PROVIDED_INDICATOR between", value1, value2, "mrProvidedIndicator");
            return (Criteria) this;
        }

        public Criteria andMrProvidedIndicatorNotBetween(Integer value1, Integer value2) {
            addCriterion("MR_PROVIDED_INDICATOR not between", value1, value2, "mrProvidedIndicator");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoIsNull() {
            addCriterion("INVOICE_NO is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoIsNotNull() {
            addCriterion("INVOICE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoEqualTo(String value) {
            addCriterion("INVOICE_NO =", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotEqualTo(String value) {
            addCriterion("INVOICE_NO <>", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoGreaterThan(String value) {
            addCriterion("INVOICE_NO >", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_NO >=", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoLessThan(String value) {
            addCriterion("INVOICE_NO <", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_NO <=", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoLike(String value) {
            addCriterion("INVOICE_NO like", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotLike(String value) {
            addCriterion("INVOICE_NO not like", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoIn(List<String> values) {
            addCriterion("INVOICE_NO in", values, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotIn(List<String> values) {
            addCriterion("INVOICE_NO not in", values, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoBetween(String value1, String value2) {
            addCriterion("INVOICE_NO between", value1, value2, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotBetween(String value1, String value2) {
            addCriterion("INVOICE_NO not between", value1, value2, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andClinicNoIsNull() {
            addCriterion("CLINIC_NO is null");
            return (Criteria) this;
        }

        public Criteria andClinicNoIsNotNull() {
            addCriterion("CLINIC_NO is not null");
            return (Criteria) this;
        }

        public Criteria andClinicNoEqualTo(String value) {
            addCriterion("CLINIC_NO =", value, "clinicNo");
            return (Criteria) this;
        }

        public Criteria andClinicNoNotEqualTo(String value) {
            addCriterion("CLINIC_NO <>", value, "clinicNo");
            return (Criteria) this;
        }

        public Criteria andClinicNoGreaterThan(String value) {
            addCriterion("CLINIC_NO >", value, "clinicNo");
            return (Criteria) this;
        }

        public Criteria andClinicNoGreaterThanOrEqualTo(String value) {
            addCriterion("CLINIC_NO >=", value, "clinicNo");
            return (Criteria) this;
        }

        public Criteria andClinicNoLessThan(String value) {
            addCriterion("CLINIC_NO <", value, "clinicNo");
            return (Criteria) this;
        }

        public Criteria andClinicNoLessThanOrEqualTo(String value) {
            addCriterion("CLINIC_NO <=", value, "clinicNo");
            return (Criteria) this;
        }

        public Criteria andClinicNoLike(String value) {
            addCriterion("CLINIC_NO like", value, "clinicNo");
            return (Criteria) this;
        }

        public Criteria andClinicNoNotLike(String value) {
            addCriterion("CLINIC_NO not like", value, "clinicNo");
            return (Criteria) this;
        }

        public Criteria andClinicNoIn(List<String> values) {
            addCriterion("CLINIC_NO in", values, "clinicNo");
            return (Criteria) this;
        }

        public Criteria andClinicNoNotIn(List<String> values) {
            addCriterion("CLINIC_NO not in", values, "clinicNo");
            return (Criteria) this;
        }

        public Criteria andClinicNoBetween(String value1, String value2) {
            addCriterion("CLINIC_NO between", value1, value2, "clinicNo");
            return (Criteria) this;
        }

        public Criteria andClinicNoNotBetween(String value1, String value2) {
            addCriterion("CLINIC_NO not between", value1, value2, "clinicNo");
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