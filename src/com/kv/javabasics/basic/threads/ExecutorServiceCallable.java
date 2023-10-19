package com.kv.javabasics.basic.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceCallable {

    public static void main(String[] args) throws InterruptedException, java.util.concurrent.ExecutionException {

        ExecutorService executorService1 = Executors.newSingleThreadExecutor();

        Future futureFromCallable = executorService1.submit(new Callable() {
            public String call() throws Exception {
                return "RESULT";
            }
        });

        System.out.println("futureFromCallable.get() = " + futureFromCallable.get());
    }
}
