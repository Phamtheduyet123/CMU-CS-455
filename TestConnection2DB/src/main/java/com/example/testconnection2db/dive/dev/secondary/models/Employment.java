package com.example.testconnection2db.dive.dev.secondary.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

@Entity
public class Employment {
    @Id
    @NotNull
    private Integer Employee_ID;
    @OneToOne
    @MapsId
    @JoinColumn(name = "Employee_ID")
    private Personal personal;
    @Column(columnDefinition = "nvarchar(50)",name = "Employment_Status")
    private String employmentStatus;
    @Column(name = "Hire_Date")
    private Date hireDate;
    @Column(columnDefinition = "nvarchar(50)",name = "Workers_Comp_Code")
    private String workersCompCode;
    @Column(name = "Termination_Date")
    private Date terminationDate;
    @Column(name = "Rehire_Date")
    private Date rehireDate;
    @Column(name = "Last_Review_Date")
    private Date lastReviewDate;

}
