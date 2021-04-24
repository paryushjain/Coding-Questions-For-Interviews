package com.coding.designpatterns.creational.builder;

/**
 * Solves telescopic constructor problem
 * static inner class
 * internally call required constructors
 * removes the need for setters
 * Force immutability
 * Complex setters
 *
 * https://howtodoinjava.com/design-patterns/creational/builder-pattern-in-java/
 */
public class BuilderExample {

    public static void main(String[] args) {

        Phone phone = new Phone.Builder().backPanel("DUMMY").
                frontPanel("DUMMY").camera("DUMMY").build();
        System.out.println(phone);

        /**
         * Examples:
         * -StringBuilder
         * -DocumentBuilder
         * -Spring Reactive
         */
    }
}
