package com.coding.designpatterns.strategy;

public class Main {
    public static void main(String[] args) {

        OperationsManager operationsManager = new OperationsManager(new SubstractionStrategy());
        operationsManager.execute(5,2);
    }
}
