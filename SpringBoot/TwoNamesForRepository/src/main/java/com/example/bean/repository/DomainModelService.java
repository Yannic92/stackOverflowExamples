package com.example.bean.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class DomainModelService {
    
    private final DomainModelRepository domainModelRepository;

    @Autowired
    public DomainModelService(@Qualifier("myRepo")DomainModelRepository domainModelRepository) {
        this.domainModelRepository = domainModelRepository;
    }
    
    @PostConstruct
    public void doSomeThing(){

        DomainModel domainModel = new DomainModel();
        this.domainModelRepository.save(domainModel);
    }
}
