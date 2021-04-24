package com.coding.designpatterns.strategy;

public class OperationsManager {
    private Strategy strategy;
    public OperationsManager(Strategy strategy){
        this.strategy = strategy;
    }
    public void execute(int n1, int n2){
        strategy.execute(n1,n2);
    }

}
