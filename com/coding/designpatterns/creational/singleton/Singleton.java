package com.coding.designpatterns.creational.singleton;

import java.util.Objects;

public class Singleton {

    //Lazy Loading
    private static volatile Singleton singleton = null;

    private Singleton() {
    }

    public static Singleton getSingleton() {
        if (Objects.isNull(singleton)) {
            synchronized (Singleton.class) {
                if (Objects.isNull(singleton)) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
