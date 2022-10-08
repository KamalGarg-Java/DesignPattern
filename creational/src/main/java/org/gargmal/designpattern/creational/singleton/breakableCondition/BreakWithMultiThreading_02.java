package org.gargmal.designpattern.creational.singleton.breakableCondition;

public class BreakWithMultiThreading_02 {

    public static void main(String[] args) throws InterruptedException {
        Runnable instanceCreateTask = () ->{
            try {
                System.out.println("Thread:" + Thread.currentThread().getName() + " going to call the getIntance");
                SynchronizedBlockSingleton instance = SynchronizedBlockSingleton.getInstance();
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

class SynchronizedBlockSingleton {
    private static SynchronizedBlockSingleton INSTANCE;

    private SynchronizedBlockSingleton() {}

    public static SynchronizedBlockSingleton getInstance() throws InterruptedException {
        if(INSTANCE == null) {
            Thread.sleep(2000);
            synchronized (SynchronizedBlockSingleton.class) {
                INSTANCE = new SynchronizedBlockSingleton();
            }
        }
        return  INSTANCE;
    }
}
