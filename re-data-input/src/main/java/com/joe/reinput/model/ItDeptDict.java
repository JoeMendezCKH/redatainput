package com.joe.reinput.model;

import java.io.Serializable;

public class ItDeptDict implements Serializable {
    private String deptCode;

    private Integer serialNo;

    private String deptName;

    private String deptAlias;

    private Integer clinicAttr;

    private Integer outpOrInp;

    private Integer internalOrSergery;

    private String inputCode;

    private String position;

    private String sign;

    private String inputCodeWb;

    private Integer dispensingCumulate;

    private Integer virtualCabinet;

    private static final long serialVersionUID = 1L;

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public Integer getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(Integer serialNo) {
        this.serialNo = serialNo;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptAlias() {
        return deptAlias;
    }

    public void setDeptAlias(String deptAlias) {
        this.deptAlias = deptAlias;
    }

    public Integer getClinicAttr() {
        return clinicAttr;
    }

    public void setClinicAttr(Integer clinicAttr) {
        this.clinicAttr = clinicAttr;
    }

    public Integer getOutpOrInp() {
        return outpOrInp;
    }

    public void setOutpOrInp(Integer outpOrInp) {
        this.outpOrInp = outpOrInp;
    }

    public Integer getInternalOrSergery() {
        return internalOrSergery;
    }

    public void setInternalOrSergery(Integer internalOrSergery) {
        this.internalOrSergery = internalOrSergery;
    }

    public String getInputCode() {
        return inputCode;
    }

    public void setInputCode(String inputCode) {
        this.inputCode = inputCode;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getInputCodeWb() {
        return inputCodeWb;
    }

    public void setInputCodeWb(String inputCodeWb) {
        this.inputCodeWb = inputCodeWb;
    }

    public Integer getDispensingCumulate() {
        return dispensingCumulate;
    }

    public void setDispensingCumulate(Integer dispensingCumulate) {
        this.dispensingCumulate = dispensingCumulate;
    }

    public Integer getVirtualCabinet() {
        return virtualCabinet;
    }

    public void setVirtualCabinet(Integer virtualCabinet) {
        this.virtualCabinet = virtualCabinet;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", deptCode=").append(deptCode);
        sb.append(", serialNo=").append(serialNo);
        sb.append(", deptName=").append(deptName);
        sb.append(", deptAlias=").append(deptAlias);
        sb.append(", clinicAttr=").append(clinicAttr);
        sb.append(", outpOrInp=").append(outpOrInp);
        sb.append(", internalOrSergery=").append(internalOrSergery);
        sb.append(", inputCode=").append(inputCode);
        sb.append(", position=").append(position);
        sb.append(", sign=").append(sign);
        sb.append(", inputCodeWb=").append(inputCodeWb);
        sb.append(", dispensingCumulate=").append(dispensingCumulate);
        sb.append(", virtualCabinet=").append(virtualCabinet);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}