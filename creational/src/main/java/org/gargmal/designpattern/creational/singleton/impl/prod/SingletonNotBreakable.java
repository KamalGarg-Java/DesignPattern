package org.gargmal.designpattern.creational.singleton.impl.prod;

import java.io.Serializable;

public class SingletonNotBreakable implements Serializable {
    private static SingletonNotBreakable INSTANCE;

    private SingletonNotBreakable(){
      throw new IllegalStateException();
    }

    public static SingletonNotBreakable getInstance() {
      if(INSTANCE == null) {
        synchronized (SingletonNotBreakable.class) {
          if(INSTANCE == null) {
            INSTANCE = new SingletonNotBreakable();
          }
        }
      }
      return INSTANCE;
    }

    @Override
    public SingletonNotBreakable clone() throws CloneNotSupportedException {
      throw new CloneNotSupportedException();
    }

    private Object readResolve() {
      return INSTANCE;
    }
}
