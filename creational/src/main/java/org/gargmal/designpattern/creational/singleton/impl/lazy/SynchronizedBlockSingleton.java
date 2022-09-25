package org.gargmal.designpattern.creational.singleton.impl.lazy;


public class SynchronizedBlockSingleton {
    private static SynchronizedBlockSingleton INSTANCE;

    private SynchronizedBlockSingleton() {}

    public static SynchronizedBlockSingleton getInstance() {
     if(INSTANCE == null) {
         synchronized (SynchronizedBlockSingleton.class) {
           INSTANCE = new SynchronizedBlockSingleton();
         }
     }
     return  INSTANCE;
    }
}



