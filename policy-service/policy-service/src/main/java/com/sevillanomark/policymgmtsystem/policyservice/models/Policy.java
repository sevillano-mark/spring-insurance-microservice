package com.sevillanomark.policymgmtsystem.policyservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

@Entity
public class Policy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger policyId;

    private User owner;

    private String policyNumber;

    private BigDecimal monthlyFee;

    private BigDecimal insuranceAmount;

    private int yearsToPay;

    private Date startDate;

    @CreatedDate
    private Date createdDate;

    @LastModifiedDate
    private Date lastModifiedDate;

    public Policy() {
    }

    public Policy(BigInteger policyId, String policyNumber, BigDecimal monthlyFee, BigDecimal insuranceAmount,
                    int yearsToPay, Date startDate, Date createdDate, Date lastModifiedDate) {
        this.policyId = policyId;
        this.policyNumber = policyNumber;
        this.monthlyFee = monthlyFee;
        this.insuranceAmount = insuranceAmount;
        this.yearsToPay = yearsToPay;
        this.startDate = startDate;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
    }

    public BigInteger getPolicyId() {
        return policyId;
    }

    public void setPolicyId(BigInteger policyId) {
        this.policyId = policyId;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
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
