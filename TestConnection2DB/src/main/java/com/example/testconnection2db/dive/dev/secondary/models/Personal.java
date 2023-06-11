package com.example.testconnection2db.dive.dev.secondary.models;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
public class Personal {
    @Id
    @NotNull
    private Integer Employee_ID;
    @OneToOne(mappedBy = "personal", cascade = CascadeType.ALL)
    private Employment employment;
    @OneToOne(mappedBy = "personal1", cascade = CascadeType.ALL)
    private EmergencyContacts emergencyContacts;
    @Column(columnDefinition = "nvarchar(50)",name = "First_Name")
    private String firstName;
    @Column(columnDefinition = "nvarchar(50)",name = "Last_Name")
    private String lastName;
    @Column(columnDefinition = "nvarchar(50)",name = "Middle_Initial")
    private String middleInitial;
    @Column(columnDefinition = "nvarchar(50)",name = "Address1")
    private String address1;
    @Column(columnDefinition = "nvarchar(50)",name = "Address2")
    private String address2;
    @Column(columnDefinition = "nvarchar(50)",name = "City")
    private String city;
    @Column(columnDefinition = "nvarchar(50)",name = "State")
    private String state;
    @Column(columnDefinition = "numeric(18,0)",name = "Zip")
    private BigInteger zip;
    @Column(columnDefinition = "nvarchar(50)",name = "Email")
    private String email;
    @Column(columnDefinition = "nvarchar(50)",name = "Phone_Number")
    private String phoneNumber;
    @Column(columnDefinition = "nvarchar(50)",name = "Social_Security_Number")
    private String socialSecurityNumber;
    @Column(columnDefinition = "nvarchar(50)",name = "Drivers_License")
    private String driversLicense;
    @Column(columnDefinition = "nvarchar(50)",name = "Marital_Status")
    private String maritalStatus;
    @Column(name = "Gender")
    private Boolean gender;
    @Column(name = "Shareholder_Status")
    private Boolean shareholderStatus;
    @ManyToOne
    @JoinColumn(name = "Benefit_Plans")
    private BenefitPlans benefitPlans;
    @Column(columnDefinition = "nvarchar(50)",name = "Ethnicity")
    private String ethnicity;

}
