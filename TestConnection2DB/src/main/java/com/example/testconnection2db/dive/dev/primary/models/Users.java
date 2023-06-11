package com.example.testconnection2db.dive.dev.primary.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "User_ID")
    private Integer userId;
    @Column(name = "User_Name")
    private String userName;
    @Column(columnDefinition = "TEXT", name = "Password")
    private String password;
    @Column(name = "Email")
    private String email;
    @Column(columnDefinition = "TINYINT(1)",name = "Active")
    private Boolean active;
    @OneToMany(mappedBy = "users")
    @JsonBackReference
    private Set<Employee> employeeSet;

    public Users() {
    }

    public Users(Integer userId, String userName, String password, String email, Boolean active) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.active = active;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getActive() {
        return this.active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
