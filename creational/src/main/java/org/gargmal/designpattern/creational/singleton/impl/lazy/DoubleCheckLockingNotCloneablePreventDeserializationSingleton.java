package org.gargmal.designpattern.creational.singleton.impl.lazy;

public class DoubleCheckLockingNotCloneablePreventDeserializationSingleton {
    private static DoubleCheckLockingNotCloneablePreventDeserializationSingleton INSTANCE;

    private DoubleCheckLockingNotCloneablePreventDeserializationSingleton() {}

    public static DoubleCheckLockingNotCloneablePreventDeserializationSingleton getInstance() {
        if(INSTANCE == null) {
            synchronized (SynchronizedBlockDoubleCheckLockingSingleton.class) {
                if(INSTANCE == null) {
                    INSTANCE = new DoubleCheckLockingNotCloneablePreventDeserializationSingleton();
                }
            }
        }
        return INSTANCE;
    }

    @Override
    public DoubleCheckLockingNotCloneablePreventDeserializationSingleton clone() throws CloneNotSupportedException {
      throw new CloneNotSupportedException();
    }
}
