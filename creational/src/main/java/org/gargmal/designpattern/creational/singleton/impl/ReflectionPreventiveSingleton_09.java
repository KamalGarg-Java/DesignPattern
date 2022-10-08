package org.gargmal.designpattern.creational.singleton.impl;

import java.io.Serializable;

public class ReflectionPreventiveSingleton_09 implements Serializable, Cloneable {
    private static ReflectionPreventiveSingleton_09 INSTANCE;

    private ReflectionPreventiveSingleton_09() {
      throw new RuntimeException();
    }

    public static ReflectionPreventiveSingleton_09 getInstance() {
      if(INSTANCE == null) {
        synchronized (ReflectionPreventiveSingleton_09.class) {
          if(INSTANCE == null) {
            INSTANCE = new ReflectionPreventiveSingleton_09();
          }
        }
      }
      return INSTANCE;
    }

    @Override
    public ReflectionPreventiveSingleton_09 clone() throws CloneNotSupportedException {
      return getInstance();
    }

    private Object readResolve() {
      return getInstance();
    }
}
