package com.example.bean.repository;


import javax.persistence.*;

@Entity
public class DomainModel {
    @Id
    @GeneratedValue
    private Integer id;
    
    private String name;
    
 

    public DomainModel(){
        
    }
    


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
