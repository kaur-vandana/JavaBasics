package com.kv.javaCourse.basic.threads;

public class BattingStatisticsThreadWithRunnable implements Runnable{
    //run	method	without	parameters
    public void run()	{
        for (int i=0;i<10;i++)
            System.out.println("Running	Bowling	Statistics	Thread " +	i);
    }

    public static void main(String[] args) {
        BattingStatisticsThreadWithRunnable obj = new BattingStatisticsThreadWithRunnable();
        obj.run();
    }
}
