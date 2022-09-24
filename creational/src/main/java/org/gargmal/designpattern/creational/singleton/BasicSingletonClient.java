package org.gargmal.designpattern.creational.singleton;

public class BasicSingletonClient {
    public static void main(String[] args) {

        //Create first instance of singleton class
        BasicSingleton instance1 = BasicSingleton.getInstance();
        boolean isAllSame = true;

        //Try to create multiple instances by calling the getInstance and compare the reference from first object. if different, update isAllSame flag
        for(int i=0; i<1000; i++){
          if(instance1 != BasicSingleton.getInstance()) {
            isAllSame = false;
          }
        }

        // Check if all instances was same or difference, it must be same
        if(isAllSame) {
          System.out.println("Great :) :: All instance are same.");
        } else{
          System.out.println("Ohh no :(, Multiple Objects Created.");
        }
    }
}
