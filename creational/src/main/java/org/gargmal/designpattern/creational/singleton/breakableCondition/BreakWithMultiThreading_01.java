package org.gargmal.designpattern.creational.singleton.breakableCondition;

public class BreakWithMultiThreading_01 {

    public static void main(String[] args) throws InterruptedException {
        Runnable instanceCreateTask = () ->{
            try {
                System.out.println("Thread:" + Thread.currentThread().getName() + " going to call the getIntance");
                LazySingleton instance = LazySingleton.getInstance();
                System.out.println("Thread:" + Thread.currentThread().getName() + " got the instance whose hascode:"+instance);
            } catch (Exception e) {
                e.printStackTrace();
            }
        };

        Thread thread1 = new Thread(instanceCreateTask);
        Thread thread2 = new Thread(instanceCreateTask);
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("You can see both instance have difference hascode.");
    }
}

class LazySingleton {
    private static LazySingleton INSTANCE;

    private LazySingleton() {}

    public static  LazySingleton getInstance() throws InterruptedException {
        if(INSTANCE == null) {
            Thread.sleep(2000);
            INSTANCE = new LazySingleton();
        }
        return  INSTANCE;
    }
}
