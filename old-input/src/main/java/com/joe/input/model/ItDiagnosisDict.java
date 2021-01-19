package com.joe.input.model;

import java.io.Serializable;
import java.util.Date;

public class ItDiagnosisDict implements Serializable {
    private String diagnosisCode;

    private String diagnosisName;

    private Integer stdIndicator;

    private Integer approvedIndicator;

    private Date createDate;

    private String inputCode;

    private String healthLevel;

    private String infectIndicator;

    private String inputCodeWb;

    private Integer diagIndicator;

    private String nm1;

    private String nm2;

    private static final long serialVersionUID = 1L;

    public String getDiagnosisCode() {
        return diagnosisCode;
    }

    public void setDiagnosisCode(String diagnosisCode) {
        this.diagnosisCode = diagnosisCode;
    }

    public String getDiagnosisName() {
        return diagnosisName;
    }

    public void setDiagnosisName(String diagnosisName) {
        this.diagnosisName = diagnosisName;
    }

    public Integer getStdIndicator() {
        return stdIndicator;
    }

    public void setStdIndicator(Integer stdIndicator) {
        this.stdIndicator = stdIndicator;
    }

    public Integer getApprovedIndicator() {
        return approvedIndicator;
    }

    public void setApprovedIndicator(Integer approvedIndicator) {
        this.approvedIndicator = approvedIndicator;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getInputCode() {
        return inputCode;
    }

    public void setInputCode(String inputCode) {
        this.inputCode = inputCode;
    }

    public String getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(String healthLevel) {
        this.healthLevel = healthLevel;
    }

    public String getInfectIndicator() {
        return infectIndicator;
    }

    public void setInfectIndicator(String infectIndicator) {
        this.infectIndicator = infectIndicator;
    }

    public String getInputCodeWb() {
        return inputCodeWb;
    }

    public void setInputCodeWb(String inputCodeWb) {
        this.inputCodeWb = inputCodeWb;
    }

    public Integer getDiagIndicator() {
        return diagIndicator;
    }

    public void setDiagIndicator(Integer diagIndicator) {
        this.diagIndicator = diagIndicator;
    }

    public String getNm1() {
        return nm1;
    }

    public void setNm1(String nm1) {
        this.nm1 = nm1;
    }

    public String getNm2() {
        return nm2;
    }

    public void setNm2(String nm2) {
        this.nm2 = nm2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", diagnosisCode=").append(diagnosisCode);
        sb.append(", diagnosisName=").append(diagnosisName);
        sb.append(", stdIndicator=").append(stdIndicator);
        sb.append(", approvedIndicator=").append(approvedIndicator);
        sb.append(", createDate=").append(createDate);
        sb.append(", inputCode=").append(inputCode);
        sb.append(", healthLevel=").append(healthLevel);
        sb.append(", infectIndicator=").append(infectIndicator);
        sb.append(", inputCodeWb=").append(inputCodeWb);
        sb.append(", diagIndicator=").append(diagIndicator);
        sb.append(", nm1=").append(nm1);
        sb.append(", nm2=").append(nm2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}