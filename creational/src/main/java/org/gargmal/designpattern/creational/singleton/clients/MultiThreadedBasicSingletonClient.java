package org.gargmal.designpattern.creational.singleton.clients;

import org.gargmal.designpattern.creational.singleton.impl.lazy.BasicSingleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadedBasicSingletonClient {

    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();

        service.submit(() -> {
           BasicSingleton.getInstance();
        });
    }


}
