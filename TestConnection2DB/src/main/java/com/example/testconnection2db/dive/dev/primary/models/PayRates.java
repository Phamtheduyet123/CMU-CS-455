package com.example.testconnection2db.dive.dev.primary.models;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class PayRates {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPay_Rates")
    private Integer idPayRates;
    @Column(columnDefinition = "varchar(40)",name = "Pay_Rate_Name")
    private String payRateName;
    @Column(columnDefinition = "DECIMAL(10,0)",name = "Value")
    private BigDecimal value;
    @Column(columnDefinition = "DECIMAL(10,0)",name = "Tax_Percentage")
    private BigDecimal taxPercenage;
    @Column(name = "Pay_Type")
    private Integer payType;
    @Column(columnDefinition = "DECIMAL(10,0)",name = "Pay_Amount")
    private BigDecimal payAmount;
    @Column(columnDefinition = "DECIMAL(10,0)",name = "PT_Level_C")
    private BigDecimal ptLevelC;

    public PayRates() {
    }

    public PayRates(Integer idPayRates, String payRateName, BigDecimal value,
                    BigDecimal taxPercenage, Integer payType, BigDecimal payAmount, BigDecimal ptLevelC) {
        this.idPayRates = idPayRates;
        this.payRateName = payRateName;
        this.value = value;
        this.taxPercenage = taxPercenage;
        this.payType = payType;
        this.payAmount = payAmount;
        this.ptLevelC = ptLevelC;
    }

    public Integer getIdPayRates() {
        return idPayRates;
    }

    public void setIdPayRates(Integer idPayRates) {
        this.idPayRates = idPayRates;
    }

    public String getPayRateName() {
        return payRateName;
    }

    public void setPayRateName(String payRateName) {
        this.payRateName = payRateName;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getTaxPercenage() {
        return taxPercenage;
    }

    public void setTaxPercenage(BigDecimal taxPercenage) {
        this.taxPercenage = taxPercenage;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    public BigDecimal getPtLevelC() {
        return ptLevelC;
    }

    public void setPtLevelC(BigDecimal ptLevelC) {
        this.ptLevelC = ptLevelC;
    }
}
