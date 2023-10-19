package com.kv.javabasics.challenges.bankchallenge;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Australian Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Vandana", 50.05);
        bank.addCustomer("Adelaide", "Neel", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addCustomerTransaction("Adelaide", "Vandana", 44.22);
        bank.addCustomerTransaction("Adelaide", "Vandana", 12.44);
        bank.addCustomerTransaction("Adelaide", "Percy", 1.65);

        bank.listCustomers("Adelaide", true);
    }
}
