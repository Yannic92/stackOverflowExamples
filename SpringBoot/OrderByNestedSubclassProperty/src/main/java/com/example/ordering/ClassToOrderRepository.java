package com.example.ordering;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface ClassToOrderRepository extends CrudRepository<ClassToOrder, Integer>{

    List<ClassToOrder> findByNameOrderBySubclassPriceAsc(String name);
    List<ClassToOrder> findByNameOrderBySubclassPriceDesc(String name);
}
