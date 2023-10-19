package com.kv.javabasics.basic.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceFuture {

    public static void main(String[] args) throws InterruptedException, java.util.concurrent.ExecutionException{
        ExecutorService executorService1 = Executors.newSingleThreadExecutor();
        Future future = executorService1.submit(new Runnable() {
            public void run() {
                System.out.println("From executorService1");
            }
        });
        future.get(); // returns null if the task has finished correctly.
    }
}
