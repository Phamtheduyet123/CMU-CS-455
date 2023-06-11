package com.example.testconnection2db.dive.dev.primary.controller;

import com.example.testconnection2db.dive.dev.primary.models.Employee;
import com.example.testconnection2db.dive.dev.primary.models.Users;
import com.example.testconnection2db.dive.dev.primary.repo.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestaurantController {
    @Autowired
    RestaurantRepository restaurantRepository;
    @GetMapping("/restaurants")
    List<Employee> getRestaurants(){
        return restaurantRepository.findAll();
    }
//
//    @PostMapping(path = "/restaurants")
//    List<Users> addRestaurant(@RequestBody Users restaurant){
//        restaurantRepository.save(restaurant);
//        return restaurantRepository.findAll();
//    }
}
