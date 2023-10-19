package com.kv.javaCourse.basic.threads.Calculator;

class Calculator extends Thread	{
    long sumUptoMillion;
    long sumUptoTenMillion;

    public void run()	{
        synchronized (this)	{
            calculateSumUptoMillion();
            notify();
        }
        calculateSumUptoTenMillion();
    }

    private void calculateSumUptoMillion() {
        for (int i=0;	i<1000000;	i++)	{
            sumUptoMillion +=	i;
        }
        System.out.println("Million	done");
    }

    private void calculateSumUptoTenMillion() {
        for (int i=0;	i<10000000;	i++)	{
            sumUptoTenMillion +=	i;
        }
        System.out.println("Ten	Million	done");
    }

}
