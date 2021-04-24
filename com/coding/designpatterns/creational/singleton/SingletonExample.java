package com.coding.designpatterns.creational.singleton;

/**
 * -static in nature
 * -thread Safe
 * -private constructor
 * -private instance of class
 * -no-arg constructor
 */
public class SingletonExample {
    public static void main(String[] args) {
        Singleton singletonOne = Singleton.getSingleton();
        System.out.println(singletonOne);
        Singleton singletonTwo = Singleton.getSingleton();
        System.out.println(singletonTwo);

        /**
         * Examples of Singleton:
         * -Logger
         * -Spring Beans
         * -Runtime.runtime()
         */
    }
}
