package com.kv.javaCourse.Challenges.bank;

import java.math.BigDecimal;

public class BankAccount {
    private long accountNumber;
    private BigDecimal balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public BankAccount(long accountNumber, BigDecimal balance, String customerName, String email, int phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
   /*
   this is the second way to do  parameterized Constructors
   we don't use this,
   1. this is a point where object is being created, so consequently, some aspects of the initialization may not have been
   finished while you are in the constructor
   2.

   public BankAccount(long accountNumber, BigDecimal balance, String customerName, String email, int phoneNumber) {
       setAccountNumber(accountNumber);
       setBalance(balance);
       setCustomerName(customerName);
       setEmail(email);
       setPhoneNumber(phoneNumber);
    }*/

    public BankAccount() {
        this(1234566268, new BigDecimal(100), "James Bond",
                "abc@gmail.com", 123456789);
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //deposit fund
    public void depositFund(BigDecimal amount) {
        //BigDecimal uses add() method
        this.balance = this.balance.add(amount);
    }

    //withdraw fund
    public void withdrawFunds(BigDecimal amount) {
        if(this.balance.compareTo(amount)>=0)
            this.balance = this.balance.subtract(amount);
        else
            throw new RuntimeException("Insufficient balance");
    }
}
