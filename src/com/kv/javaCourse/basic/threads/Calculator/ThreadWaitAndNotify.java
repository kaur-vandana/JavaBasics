package com.kv.javaCourse.basic.threads.Calculator;

public class ThreadWaitAndNotify {
    public static void main(String[] args)	throws InterruptedException	{
        Calculator thread	=	new Calculator();
        synchronized(thread) {
            thread.start();
            thread.wait();
        }
        System.out.println(thread.sumUptoMillion);
    }
}