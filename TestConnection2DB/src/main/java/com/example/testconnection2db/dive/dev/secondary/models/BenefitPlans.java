package com.example.testconnection2db.dive.dev.secondary.models;

import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;

@Entity
@Table(name = "Benefit_Plans")
public class BenefitPlans {
    @Id
    @Column(columnDefinition = "numeric(18,0)",name = "Benefit_Plan_ID")
    @NotNull
    private BigInteger benefitPlansId;
    @Column(columnDefinition = "nvarchar(50)",name = "Plan_Name")
    private String planName;
    @Column(columnDefinition = "numeric(18,0)",name = "Deductable")
    private BigInteger deductable;
    @Column(name = "Percentage_CoPay")
    private Integer percentageCoPay;

}
