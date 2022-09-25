package org.gargmal.designpattern.creational.singleton.impl.lazy;

import java.io.Serializable;

public class DoubleCheckLockingNotCloneablePreventDeserializationSingleton implements Serializable {
    private static DoubleCheckLockingNotCloneablePreventDeserializationSingleton INSTANCE;

    private DoubleCheckLockingNotCloneablePreventDeserializationSingleton() {}

    public static DoubleCheckLockingNotCloneablePreventDeserializationSingleton getInstance() {
        if(INSTANCE == null) {
            synchronized (DoubleCheckLockingNotCloneablePreventDeserializationSingleton.class) {
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
    public Object readResolve() {
       return INSTANCE;
    }
}
