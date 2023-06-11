package com.example.testconnection2db.dive.dev.secondary.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "Emergency_Contacts")
public class EmergencyContacts {
    @Id
    @NotNull
    private Integer Employee_ID;
    @OneToOne
    @MapsId
    @JoinColumn(name = "Employee_ID")
    private Personal personal1;
    @Column(columnDefinition = "nvarchar(50)",name = "Emergency_Contact_Name")
    private String emergencyContactName;
    @Column(columnDefinition = "nvarchar(50)",name = "Phone_Number")
    private String phoneNumber;
    @Column(columnDefinition = "nvarchar(50)",name = "Relasionship")
    private String relationship;
}
