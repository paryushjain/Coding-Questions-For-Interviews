package com.coding.java8.lambdas;

public class RunnableLambdaExample {
    public static void main(String[] args) {
        //Before java8
        Runnable runnable= new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };
        new Thread(runnable).start();

        //After java 8
        Runnable runnable1 = () -> System.out.println("Inside Runnable java8");
        new Thread(runnable1).start();
        new Thread(() -> System.out.println("Inside Runnable java8 2")).start();
    }
}
