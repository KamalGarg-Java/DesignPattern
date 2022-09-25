package org.gargmal.designpattern.creational.singleton.impl.lazy;


public class SynchronizedMethodSingleton {
    private static SynchronizedMethodSingleton INSTANCE;

    private SynchronizedMethodSingleton() {}

    public synchronized static SynchronizedMethodSingleton getInstance() {
     if(INSTANCE == null) {
         INSTANCE = new SynchronizedMethodSingleton();
     }
     return  INSTANCE;
    }
}



