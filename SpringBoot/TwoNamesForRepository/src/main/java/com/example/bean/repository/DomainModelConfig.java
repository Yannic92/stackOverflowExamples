package com.example.bean.repository;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DomainModelConfig {
    
    @Bean(name = {"defaultMyRepo", "myRepo"})
    public DomainModelRepository domainModelRepository(DomainModelRepository domainModelRepository){
        return domainModelRepository;
    }
}
