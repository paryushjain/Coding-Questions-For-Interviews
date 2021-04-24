package com.coding.designpatterns.strategy;

public class AdditionStrategy implements Strategy{
    @Override
    public void execute(int n1, int n2) {
        System.out.println(n1+n2);
    }
}
