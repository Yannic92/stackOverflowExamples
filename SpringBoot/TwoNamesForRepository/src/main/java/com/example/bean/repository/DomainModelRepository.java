package com.example.bean.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DomainModelRepository extends CrudRepository<DomainModel, Integer>{
}
