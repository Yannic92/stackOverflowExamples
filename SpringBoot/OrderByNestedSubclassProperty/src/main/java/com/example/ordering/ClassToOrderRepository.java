package com.example.ordering;

import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface ClassToOrderRepository extends CrudRepository<ClassToOrder, Integer> {

    List<ClassToOrder> findByNameOrderBySubclassPriceAsc(String name);


    List<ClassToOrder> findByNameOrderBySubclassPriceDesc(String name);
}
