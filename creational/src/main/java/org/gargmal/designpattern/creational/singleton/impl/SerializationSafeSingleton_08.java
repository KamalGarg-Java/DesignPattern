package org.gargmal.designpattern.creational.singleton.impl;

import java.io.Serializable;

public class SerializationSafeSingleton_08 implements Cloneable, Serializable {
    private static SerializationSafeSingleton_08 INSTANCE;

    private SerializationSafeSingleton_08() {}

    public static SerializationSafeSingleton_08 getInstance() {
        if(INSTANCE == null) {
            synchronized (SerializationSafeSingleton_08.class) {
                if(INSTANCE == null) {
                    INSTANCE = new SerializationSafeSingleton_08();
                }
            }
        }
        return INSTANCE;
    }

    @Override
    public SerializationSafeSingleton_08 clone() {
      return getInstance();
    }
    public Object readResolve() {
      return INSTANCE;
    }
}
