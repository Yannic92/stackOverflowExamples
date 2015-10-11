package com.example.ordering;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class ClassToOrderService {
    
    private final ClassToOrderRepository classToOrderRepository;

    @Autowired
    public ClassToOrderService(ClassToOrderRepository classToOrderRepository) {
        this.classToOrderRepository = classToOrderRepository;
    }
  
    @PostConstruct
    public void fill(){
        
        for(int i = 0; i < 10; i++){
            Subclass subclass = new Subclass(i);
            ClassToOrder classToOrder = new ClassToOrder(subclass, "Test");
            classToOrderRepository.save(classToOrder);
        }

        List<ClassToOrder> allOrderBySubclassPriceAsc = classToOrderRepository.findByNameOrderBySubclassPriceAsc("Test");
        List<ClassToOrder> allOrderBySubclassPriceDesc = classToOrderRepository.findByNameOrderBySubclassPriceDesc("Test");
        
        for(ClassToOrder classToOrder : allOrderBySubclassPriceAsc){
            System.out.println(classToOrder.getSubclass().getPrice());
        }

        for(ClassToOrder classToOrder : allOrderBySubclassPriceDesc){
            System.out.println(classToOrder.getSubclass().getPrice());
        }
    }
    
    
}
