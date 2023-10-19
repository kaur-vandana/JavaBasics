package com.kv.javabasics.basic.generiC;

public class MyGeneric<T> {

    // variable of T type
    private T data;

    public MyGeneric(T data) {
        this.data = data;
    }

    // method that return T type variable
    public T getData() {
        return this.data ;
    }

    public static void main(String[] args) {
        // initialize generic class
        // with Integer data
        MyGeneric<Integer> intObj = new MyGeneric<>(5);
        System.out.println("Generic Class returns: " + intObj.getData());

        // initialize generic class
        // with String data
        MyGeneric<String> stringObj = new MyGeneric<>("Java Programming");
        System.out.println("Generic Class returns: " + stringObj.getData());
    }
}

