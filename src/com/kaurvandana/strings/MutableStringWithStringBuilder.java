package com.kaurvandana.strings;

public class MutableStringWithStringBuilder {
    public static void main(String[] args) {

        StringBuilder str1 = new StringBuilder("Learning");
        System.out.println("Value of str2 before change :" + str1);

        str1.append(" website");
        System.out.println("Value of str2 after change :" + str1);

    }
}
