package com.kv.javabasics.passByValue.Demo4;

public class Driver {
    public static void main(String[] args)
    {
        //create a reference
        InterviewBitTest ibTestObj = new InterviewBitTest(20);
        //Pass the reference to updateObject Method
        updateObject(ibTestObj);
        //After the updateObject is executed, check for the value of num in the object.
        System.out.println(ibTestObj.num);
    }

    public static void updateObject(InterviewBitTest ibObj)
    {
        // no changes are made to point the ibObj to new location
        // Update the value of num
        ibObj.num = 50;
    }

}
