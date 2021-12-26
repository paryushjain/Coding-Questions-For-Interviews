package com.coding.java8.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {
        //Before java 8
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println(comparator.compare(10,20));

        //After java 8
        Comparator<Integer> compLambda = (Integer a, Integer b) -> a.compareTo(b);
        System.out.println(compLambda.compare(20,10));
        Comparator<Integer> compLambda1 = (a, b) -> a.compareTo(b);
        System.out.println(compLambda1.compare(20,20));
    }
}
