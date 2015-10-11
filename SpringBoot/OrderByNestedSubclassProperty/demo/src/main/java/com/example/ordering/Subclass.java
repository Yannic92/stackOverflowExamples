package com.example.ordering;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Subclass {
    
    @Id
    @GeneratedValue
    private Integer id;
    
    private double price;

    public Subclass(){
        
    }
    
    public Subclass(double price) {
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
