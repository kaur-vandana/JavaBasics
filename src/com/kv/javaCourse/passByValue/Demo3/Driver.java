package com.kv.javaCourse.passByValue.Demo3;

//When the object is pointed to another location
public class Driver {

    public static void updateObject(InterviewBitTest ibObj)
    {
        ibObj = new InterviewBitTest();	// Point the object to new reference
        ibObj.num = 50;	       // Update the value
    }

    public static void main(String[] args)
    {
        //create a reference
        InterviewBitTest ibTestObj = new InterviewBitTest(20);
        updateObject(ibTestObj);	//Pass the reference to updateObject Method

        System.out.println(ibTestObj.num);	//After the updateObject is executed, check for the value of num in the object.
    }

}
