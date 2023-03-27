package com.sevillanomark.policymgmtsystem.policyservice.dtos;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

public class PolicyDto {
    private String policyNumber;
    private BigInteger owner;
    private BigDecimal monthlyFee;
    private BigDecimal insuranceAmount;
    private int yearsToPay;
    private Date startDate;

    public PolicyDto(String policyNumber, BigInteger owner, BigDecimal monthlyFee, BigDecimal insuranceAmount, int yearsToPay, Date startDate) {
        this.policyNumber = policyNumber;
        this.owner = owner;
        this.monthlyFee = monthlyFee;
        this.insuranceAmount = insuranceAmount;
        this.yearsToPay = yearsToPay;
        this.startDate = startDate;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public BigInteger getOwner() {
        return owner;
    }

    public void setOwner(BigInteger owner) {
        this.owner = owner;
    }

    public BigDecimal getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(BigDecimal monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public BigDecimal getInsuranceAmount() {
        return insuranceAmount;
    }

    public void setInsuranceAmount(BigDecimal insuranceAmount) {
        this.insuranceAmount = insuranceAmount;
    }

    public int getYearsToPay() {
        return yearsToPay;
    }

    public void setYearsToPay(int yearsToPay) {
        this.yearsToPay = yearsToPay;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
}
