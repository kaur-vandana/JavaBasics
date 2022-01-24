package com.kv.javaCourse.basic.threads;

public class BattingStatisticsThreadWithThread extends Thread {
    //run	method	without	parameters
    public void run()	{
        for (int i=0;i<10;i++)
            System.out.println("Running	Batting	Statistics	Thread " +	i);
    }

    public static void main(String[] args) {
        BattingStatisticsThreadWithThread threadInterface = new BattingStatisticsThreadWithThread();
        Thread thread = new Thread(threadInterface);
        thread.start();
    }
}
