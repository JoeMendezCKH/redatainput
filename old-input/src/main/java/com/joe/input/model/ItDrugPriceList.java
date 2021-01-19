package com.joe.input.model;

import java.io.Serializable;
import java.util.Date;

public class ItDrugPriceList implements Serializable {
    private String drugCode;

    private String drugSpec;

    private String firmId;

    private Date startDate;

    private String units;

    private Float tradePrice;

    private Float retailPrice;

    private Integer amountPerPackage;

    private String minSpec;

    private String minUnits;

    private Date stopDate;

    private String memos;

    private String classOnInpRcpt;

    private String classOnOutpRcpt;

    private String classOnReckoning;

    private String subjCode;

    private String classOnMr;

    private Float hlimitPrice;

    private String priceClass;

    private String passNo;

    private Integer gmp;

    private String changedMemo;

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

    public String getFirmId() {
        return firmId;
    }

    public void setFirmId(String firmId) {
        this.firmId = firmId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public Float getTradePrice() {
        return tradePrice;
    }

    public void setTradePrice(Float tradePrice) {
        this.tradePrice = tradePrice;
    }

    public Float getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(Float retailPrice) {
        this.retailPrice = retailPrice;
    }

    public Integer getAmountPerPackage() {
        return amountPerPackage;
    }

    public void setAmountPerPackage(Integer amountPerPackage) {
        this.amountPerPackage = amountPerPackage;
    }

    public String getMinSpec() {
        return minSpec;
    }

    public void setMinSpec(String minSpec) {
        this.minSpec = minSpec;
    }

    public String getMinUnits() {
        return minUnits;
    }

    public void setMinUnits(String minUnits) {
        this.minUnits = minUnits;
    }

    public Date getStopDate() {
        return stopDate;
    }

    public void setStopDate(Date stopDate) {
        this.stopDate = stopDate;
    }

    public String getMemos() {
        return memos;
    }

    public void setMemos(String memos) {
        this.memos = memos;
    }

    public String getClassOnInpRcpt() {
        return classOnInpRcpt;
    }

    public void setClassOnInpRcpt(String classOnInpRcpt) {
        this.classOnInpRcpt = classOnInpRcpt;
    }

    public String getClassOnOutpRcpt() {
        return classOnOutpRcpt;
    }

    public void setClassOnOutpRcpt(String classOnOutpRcpt) {
        this.classOnOutpRcpt = classOnOutpRcpt;
    }

    public String getClassOnReckoning() {
        return classOnReckoning;
    }

    public void setClassOnReckoning(String classOnReckoning) {
        this.classOnReckoning = classOnReckoning;
    }

    public String getSubjCode() {
        return subjCode;
    }

    public void setSubjCode(String subjCode) {
        this.subjCode = subjCode;
    }

    public String getClassOnMr() {
        return classOnMr;
    }

    public void setClassOnMr(String classOnMr) {
        this.classOnMr = classOnMr;
    }

    public Float getHlimitPrice() {
        return hlimitPrice;
    }

    public void setHlimitPrice(Float hlimitPrice) {
        this.hlimitPrice = hlimitPrice;
    }

    public String getPriceClass() {
        return priceClass;
    }

    public void setPriceClass(String priceClass) {
        this.priceClass = priceClass;
    }

    public String getPassNo() {
        return passNo;
    }

    public void setPassNo(String passNo) {
        this.passNo = passNo;
    }

    public Integer getGmp() {
        return gmp;
    }

    public void setGmp(Integer gmp) {
        this.gmp = gmp;
    }

    public String getChangedMemo() {
        return changedMemo;
    }

    public void setChangedMemo(String changedMemo) {
        this.changedMemo = changedMemo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", drugCode=").append(drugCode);
        sb.append(", drugSpec=").append(drugSpec);
        sb.append(", firmId=").append(firmId);
        sb.append(", startDate=").append(startDate);
        sb.append(", units=").append(units);
        sb.append(", tradePrice=").append(tradePrice);
        sb.append(", retailPrice=").append(retailPrice);
        sb.append(", amountPerPackage=").append(amountPerPackage);
        sb.append(", minSpec=").append(minSpec);
        sb.append(", minUnits=").append(minUnits);
        sb.append(", stopDate=").append(stopDate);
        sb.append(", memos=").append(memos);
        sb.append(", classOnInpRcpt=").append(classOnInpRcpt);
        sb.append(", classOnOutpRcpt=").append(classOnOutpRcpt);
        sb.append(", classOnReckoning=").append(classOnReckoning);
        sb.append(", subjCode=").append(subjCode);
        sb.append(", classOnMr=").append(classOnMr);
        sb.append(", hlimitPrice=").append(hlimitPrice);
        sb.append(", priceClass=").append(priceClass);
        sb.append(", passNo=").append(passNo);
        sb.append(", gmp=").append(gmp);
        sb.append(", changedMemo=").append(changedMemo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}