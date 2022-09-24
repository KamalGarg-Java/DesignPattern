package org.gargmal.designpattern.creational.singleton;


final class BasicSingleton {
    private static BasicSingleton INSTANCE;

    private BasicSingleton() {}

    public static BasicSingleton getInstance() {
     if(INSTANCE == null) {
         INSTANCE = new BasicSingleton();
     }
     return  INSTANCE;
    }
}



