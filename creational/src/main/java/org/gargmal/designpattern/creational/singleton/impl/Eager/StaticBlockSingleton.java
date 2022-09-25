package org.gargmal.designpattern.creational.singleton.impl.Eager;

public class StaticBlockSingleton {
    private static StaticBlockSingleton INSTANCE;

    private StaticBlockSingleton() {}

    static {
      INSTANCE = new StaticBlockSingleton();
    }

    public static StaticBlockSingleton getInstance() {
        return  INSTANCE;
    }
}
