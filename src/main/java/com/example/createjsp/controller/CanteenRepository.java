package com.example.createjsp.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.createjsp.model.Canteen;

@Repository
public interface CanteenRepository extends JpaRepository<Canteen, Long> {
    // Define additional query methods if needed
}
