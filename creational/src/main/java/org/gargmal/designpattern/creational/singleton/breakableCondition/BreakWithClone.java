package org.gargmal.designpattern.creational.singleton.breakableCondition;


public class BreakWithClone implements Cloneable {

    public static void main(String[] args) throws CloneNotSupportedException {
        CloneableSingleton instance1 = CloneableSingleton.getInstance();
        CloneableSingleton instance2;
        instance2 = (CloneableSingleton) instance1.clone();
        System.out.println("instance1 :"+instance1);
        System.out.println("instance2 :"+instance2);
        System.out.println("You can see both instance have difference hascode.");
    }
}

class CloneableSingleton implements Cloneable {
    private static CloneableSingleton INSTANCE;

    private CloneableSingleton() {}

    @Override
    public Cloneable clone() throws CloneNotSupportedException {
       return (CloneableSingleton)super.clone();
    }

    public static CloneableSingleton getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new CloneableSingleton();
        }
        return  INSTANCE;
    }
}
