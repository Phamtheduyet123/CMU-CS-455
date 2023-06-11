package com.example.testconnection2db.dive.dev.primary.repo;

import com.example.testconnection2db.dive.dev.primary.models.Employee;
import com.example.testconnection2db.dive.dev.primary.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends JpaRepository<Employee, Integer> {
}
