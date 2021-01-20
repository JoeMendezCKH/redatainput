package com.joe.reinput.model;

import java.io.Serializable;
import java.util.Date;

public class ItDrugDict implements Serializable {
    private String drugCode;

    private String drugSpec;

    private Integer drugIndicator;

    private String drugName;

    private String units;

    private String drugForm;

    private String toxiProperty;

    private Float dosePerUnit;

    private String doseUnits;

    private String inputCode;

    private String otc;

    private String limitClass;

    private Integer stopFlag;

    private Date enteredDatetime;

    private static final long serialVersionUID = 1L;

    public String getDrugCode() {
        return drugCode;
    }

    public void setDrugCode(String drugCode) {
        this.drugCode = drugCode;
    }

    public String getDrugSpec() {
        return drugSpec;
    }

    public void setDrugSpec(String drugSpec) {
        this.drugSpec = drugSpec;
    }

    public Integer getDrugIndicator() {
        return drugIndicator;
    }

    public void setDrugIndicator(Integer drugIndicator) {
        this.drugIndicator = drugIndicator;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public String getDrugForm() {
        return drugForm;
    }

    public void setDrugForm(String drugForm) {
        this.drugForm = drugForm;
    }

    public String getToxiProperty() {
        return toxiProperty;
    }

    public void setToxiProperty(String toxiProperty) {
        this.toxiProperty = toxiProperty;
    }

    public Float getDosePerUnit() {
        return dosePerUnit;
    }

    public void setDosePerUnit(Float dosePerUnit) {
        this.dosePerUnit = dosePerUnit;
    }

    public String getDoseUnits() {
        return doseUnits;
    }

    public void setDoseUnits(String doseUnits) {
        this.doseUnits = doseUnits;
    }

    public String getInputCode() {
        return inputCode;
    }

    public void setInputCode(String inputCode) {
        this.inputCode = inputCode;
    }

    public String getOtc() {
        return otc;
    }

    public void setOtc(String otc) {
        this.otc = otc;
    }

    public String getLimitClass() {
        return limitClass;
    }

    public void setLimitClass(String limitClass) {
        this.limitClass = limitClass;
    }

    public Integer getStopFlag() {
        return stopFlag;
    }

    public void setStopFlag(Integer stopFlag) {
        this.stopFlag = stopFlag;
    }

    public Date getEnteredDatetime() {
        return enteredDatetime;
    }

    public void setEnteredDatetime(Date enteredDatetime) {
        this.enteredDatetime = enteredDatetime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", drugCode=").append(drugCode);
        sb.append(", drugSpec=").append(drugSpec);
        sb.append(", drugIndicator=").append(drugIndicator);
        sb.append(", drugName=").append(drugName);
        sb.append(", units=").append(units);
        sb.append(", drugForm=").append(drugForm);
        sb.append(", toxiProperty=").append(toxiProperty);
        sb.append(", dosePerUnit=").append(dosePerUnit);
        sb.append(", doseUnits=").append(doseUnits);
        sb.append(", inputCode=").append(inputCode);
        sb.append(", otc=").append(otc);
        sb.append(", limitClass=").append(limitClass);
        sb.append(", stopFlag=").append(stopFlag);
        sb.append(", enteredDatetime=").append(enteredDatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}