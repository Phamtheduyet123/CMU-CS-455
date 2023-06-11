package com.example.testconnection2db.dive.dev.secondary.models;

import javax.persistence.*;

@Entity
public class EmployeeDetail {
    @Id
    @Column(name = "id")
    private Long id;
    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    private Employee employee;
    private String address;
    // getters and setters

    public EmployeeDetail() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}