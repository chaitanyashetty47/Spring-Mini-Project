package com.example.createjsp.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "canteen")
public class Canteen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;
    
    @Column(name = "dish")
    private String dish;
    
    @Column(name = "price")
    private Integer price;
    
    @Column(name="section")
    private String section; 
    
     
    // Constructors, getters, setters, and other fields/methods
    
    public Canteen() {
        // default constructor
    }
    
    public Canteen(String name, String dish,Integer price, String section) {
    	this.name=name;
    	this.dish = dish;
    	this.price=price;
    	this.section=section;
    	
    }
    
    public Long getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }

    public String getAuthor() {
        return dish;
    }

    public Integer getPrice() {
        return price;
    }

    public String getSection() {
        return section;
    }



}
    




