package org.gargmal.designpattern.creational.singleton.impl.Eager;

public class BasicSingleton {
    private static BasicSingleton INSTANCE = new BasicSingleton();

    private BasicSingleton() {}

    public static BasicSingleton getInstance() {
        return  INSTANCE;
    }
}
