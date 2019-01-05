package com.ayowole.singleton;

import java.util.Objects;

class ProductionEnvironment {
    
    private static ProductionEnvironment productionEnvironment;
    
    protected ProductionEnvironment() {
    }
    
    public static ProductionEnvironment getInstance() {
        if (Objects.isNull(productionEnvironment)) {
            System.out.println("instance don't exist, creating...");
                        
            return productionEnvironment = new ProductionEnvironment();
        }
        else {
            System.out.println("catching existing instance... ");
            
            return productionEnvironment; 
        }
    }
    
    public void execute() {
        System.out.println("this is an singleton example");
        
    }
}
