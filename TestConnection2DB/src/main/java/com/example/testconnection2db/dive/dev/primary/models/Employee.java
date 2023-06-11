package com.example.testconnection2db.dive.dev.primary.models;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Employee_Number")
    private Integer employeeNumber;

    @ManyToOne
    @JoinColumn(name = "idEmployee")
    private Users users;
    @Column(name = "Last_Name")
    private String lastName;
    @Column(name = "First_Name")
    private String firstName;
    @Column(columnDefinition = "DECIMAL(10,0)",name = "SSN")
    private BigDecimal ssn;
    @Column(name = "Pay_Rate")
    private String payRate;
    @ManyToOne
    @JoinColumn(name = "PayRates_id")
    private PayRates payRates;

    @Column(name = "Cavation_Days")
    private Integer vacationDays;
    @Column(columnDefinition = "DECIMAL(2,0)",name = "Paid_To_Date")
    private BigDecimal paidToDate;
    @Column(columnDefinition = "DECIMAL(2,0)",name = "Paid_Last_Year")
    private BigDecimal paidLastYear;

    public Employee() {
    }

    public Employee(Integer employeeNumber, Users users, String lastName, String firstName, BigDecimal ssn,
                    String payRate, PayRates payRates, Integer vacationDays, BigDecimal paidToDate,
                    BigDecimal paidLastYear) {
        this.employeeNumber = employeeNumber;
        this.users = users;
        this.lastName = lastName;
        this.firstName = firstName;
        this.ssn = ssn;
        this.payRate = payRate;
        this.payRates = payRates;
        this.vacationDays = vacationDays;
        this.paidToDate = paidToDate;
        this.paidLastYear = paidLastYear;
    }

    public Integer getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(Integer employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public BigDecimal getSsn() {
        return ssn;
    }

    public void setSsn(BigDecimal ssn) {
        this.ssn = ssn;
    }

    public String getPayRate() {
        return payRate;
    }

    public void setPayRate(String payRate) {
        this.payRate = payRate;
    }

    public PayRates getPayRates() {
        return payRates;
    }

    public void setPayRates(PayRates payRates) {
        this.payRates = payRates;
    }

    public Integer getVacationDays() {
        return vacationDays;
    }

    public void setVacationDays(Integer vacationDays) {
        this.vacationDays = vacationDays;
    }

    public BigDecimal getPaidToDate() {
        return paidToDate;
    }

    public void setPaidToDate(BigDecimal paidToDate) {
        this.paidToDate = paidToDate;
    }

    public BigDecimal getPaidLastYear() {
        return paidLastYear;
    }

    public void setPaidLastYear(BigDecimal paidLastYear) {
        this.paidLastYear = paidLastYear;
    }
}
