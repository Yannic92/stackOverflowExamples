package com.example.ordering;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class ClassToOrder {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private Subclass subclass;

    public ClassToOrder() {
    }


    public ClassToOrder(Subclass subclass, String name) {

        this.subclass = subclass;
        this.name = name;
    }

    public Integer getId() {

        return id;
    }


    public void setId(Integer id) {

        this.id = id;
    }


    public Subclass getSubclass() {

        return subclass;
    }


    public void setSubclass(Subclass subclass) {

        this.subclass = subclass;
    }


    public String getName() {

        return name;
    }


    public void setName(String name) {

        this.name = name;
    }
}
