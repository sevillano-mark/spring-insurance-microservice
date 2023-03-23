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
    private BigDecimal monthlyFee;
    private BigDecimal insuranceAmount;
    private int yearsToPay;
    private Date startDate;

}
