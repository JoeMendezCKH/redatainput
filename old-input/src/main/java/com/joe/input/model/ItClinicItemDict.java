package com.joe.input.model;

import java.io.Serializable;
import java.util.Date;

public class ItClinicItemDict implements Serializable {
    private String itemClass;

    private String itemCode;

    private String itemName;

    private String inputCode;

    private String expand1;

    private String expand2;

    private String expand3;

    private String expand4;

    private String expand5;

    private Date startDate;

    private Date stopDate;

    private String itemStatus;

    private static final long serialVersionUID = 1L;

    public String getItemClass() {
        return itemClass;
    }

    public void setItemClass(String itemClass) {
        this.itemClass = itemClass;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getInputCode() {
        return inputCode;
    }

    public void setInputCode(String inputCode) {
        this.inputCode = inputCode;
    }

    public String getExpand1() {
        return expand1;
    }

    public void setExpand1(String expand1) {
        this.expand1 = expand1;
    }

    public String getExpand2() {
        return expand2;
    }

    public void setExpand2(String expand2) {
        this.expand2 = expand2;
    }

    public String getExpand3() {
        return expand3;
    }

    public void setExpand3(String expand3) {
        this.expand3 = expand3;
    }

    public String getExpand4() {
        return expand4;
    }

    public void setExpand4(String expand4) {
        this.expand4 = expand4;
    }

    public String getExpand5() {
        return expand5;
    }

    public void setExpand5(String expand5) {
        this.expand5 = expand5;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getStopDate() {
        return stopDate;
    }

    public void setStopDate(Date stopDate) {
        this.stopDate = stopDate;
    }

    public String getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(String itemStatus) {
        this.itemStatus = itemStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", itemClass=").append(itemClass);
        sb.append(", itemCode=").append(itemCode);
        sb.append(", itemName=").append(itemName);
        sb.append(", inputCode=").append(inputCode);
        sb.append(", expand1=").append(expand1);
        sb.append(", expand2=").append(expand2);
        sb.append(", expand3=").append(expand3);
        sb.append(", expand4=").append(expand4);
        sb.append(", expand5=").append(expand5);
        sb.append(", startDate=").append(startDate);
        sb.append(", stopDate=").append(stopDate);
        sb.append(", itemStatus=").append(itemStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}