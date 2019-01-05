package com.ayowole.singleton;

class Main {
    
    public static void main(String[] args) {
        ProductionEnvironment environment = ProductionEnvironment
                .getInstance();
        
        environment.execute();
        
        environment = ProductionEnvironment
                .getInstance();
        
        environment.execute();
    }
    
}
