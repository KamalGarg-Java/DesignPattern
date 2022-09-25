package org.gargmal.designpattern.creational.singleton.impl.lazy;

public class DoubleCheckLockingNotCloneableSingleton {
    private static DoubleCheckLockingNotCloneableSingleton INSTANCE;

    private DoubleCheckLockingNotCloneableSingleton() {}

    public static DoubleCheckLockingNotCloneableSingleton getInstance() {
        if(INSTANCE == null) {
            synchronized (SynchronizedBlockDoubleCheckLockingSingleton.class) {
                if(INSTANCE == null) {
                    INSTANCE = new DoubleCheckLockingNotCloneableSingleton();
                }
            }
        }
        return INSTANCE;
    }

    @Override
    public DoubleCheckLockingNotCloneableSingleton clone() throws CloneNotSupportedException {
      throw new CloneNotSupportedException();
    }
}
