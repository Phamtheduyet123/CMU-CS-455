package com.example.testconnection2db.dive.dev.secondary.repo;

import com.example.testconnection2db.dive.dev.secondary.models.Personal;
import com.example.testconnection2db.dive.dev.secondary.models.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface UserRepository extends JpaRepository<Personal, Integer> {
}
