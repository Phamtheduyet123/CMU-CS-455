package com.example.testconnection2db.dive.dev.secondary.models;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name = "Job_History")
public class JobHistory {
    @Id
    @NotNull
    @Column(columnDefinition = "numeric(18,0)",name = "ID")
    private BigInteger id;
    @ManyToOne
    @JoinColumn(name = "Employee_ID")
    private Personal personal;
    @Column(columnDefinition = "nvarchar(50)",name = "Department")
    private String department;
    @Column(columnDefinition = "nvarchar(50)",name = "Division")
    private String division;
    @Column(name = "Start_Date")
    private Date startDate;
    @Column(name = "End_Date")
    private Date endDate;
    @Column(columnDefinition = "nvarchar(50)",name = "Job_Title")
    private String jobTitle;
    @Column(columnDefinition = "numeric(18,0)",name = "Supervisor")
    private BigInteger supervisor;
    @Column(columnDefinition = "nvarchar(50)",name = "Job_Category")
    private String jobCategory;
    @Column(columnDefinition = "nvarchar(50)",name = "Location")
    private String location;
    @Column(columnDefinition = "numeric(18,0)",name = "Departmen_Code")
    private BigInteger departmenCode;
    @Column(columnDefinition = "numeric(18,0)",name = "Salary_Type")
    private BigInteger salaryType;
    @Column(columnDefinition = "nvarchar(50)",name = "Pay_Period")
    private String payPeriod;
    @Column(columnDefinition = "numeric(18,0)",name = "Hours_per_Week")
    private BigInteger hoursPerWeek;
    @Column(name = "Hazadous_Training")
    private Boolean hazardousTraining;
}
