package com.kv.javaCourse.basic.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new Runnable() {

            @Override
            public void run() {
                System.out.println("ExecutorService");

            }
        });
        System.out.println("End of Main");
        executorService.shutdown();
    }
}
