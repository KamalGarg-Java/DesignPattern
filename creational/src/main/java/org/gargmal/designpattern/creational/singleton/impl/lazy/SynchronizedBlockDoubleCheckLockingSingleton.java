package org.gargmal.designpattern.creational.singleton.impl.lazy;


public class SynchronizedBlockDoubleCheckLockingSingleton {
    private static SynchronizedBlockDoubleCheckLockingSingleton INSTANCE;

    private SynchronizedBlockDoubleCheckLockingSingleton() {}

    public static SynchronizedBlockDoubleCheckLockingSingleton getInstance() {
     if(INSTANCE == null) {
         synchronized (SynchronizedBlockDoubleCheckLockingSingleton.class) {
           if(INSTANCE == null) {
               INSTANCE = new SynchronizedBlockDoubleCheckLockingSingleton();
           }
         }
     }
     return  INSTANCE;
    }
}



