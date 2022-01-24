package com.kv.javaCourse.Challenges.bank;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
//        BankAccount account = new BankAccount();
        //instead of adding this one by one , we can use a constructor
//        account.setAccountNumber(987654321);
//        account.setBalance(new BigDecimal(500));
//        account.setCustomerName("K Vandana");
//        account.setEmail("xyz@gmail.com");
//        account.setPhoneNumber(987644223);

        BankAccount account =
                new BankAccount(987654321, new BigDecimal(500), "K Vandana",
                        "xyz@gmail.com", 987644223);

        System.out.println("Current amount in the bank is " + account.getBalance());

        //trying to deposit 100 , so balance should be 600
        BigDecimal newdeposit = new BigDecimal(100);
        account.depositFund(newdeposit);
        System.out.println("After a deposit of " + newdeposit + " Current amount in the bank is " + account.getBalance());

        //trying to withdraw 200 , so balance should be 400
        BigDecimal newWithdraw = new BigDecimal(200);
        account.withdrawFunds(newWithdraw);
        System.out.println("After a withdraw of " + newWithdraw + " Current amount in the bank is " + account.getBalance());

        //trying to withdraw 1000 , when balance is 400
        // should respond with insufficient balance
        newWithdraw = new BigDecimal(1000);
        try{
            account.withdrawFunds(newWithdraw);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


// here , as we are not passing any parameters we need a Default Constructor to handle this
        // we can use this() in the default constructor to give the object default values
        BankAccount newAccount = new BankAccount();
        System.out.println(newAccount.getCustomerName());


    }
}
