package com.kv.javabasics.challenges.billsburger;

public class DeluxeBurger extends Hamburger{
    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon",   14.54, "Whire");
        super.addHamburgerAddition1( "Chips", 2.75);
        super.addHamburgerAddition2( "Drink", 1.818);
    }

    @Override
    public void addHamburgerAddition1( String name, double price) {
        System.out.println("Cannot add additional item to a Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional item to a Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional item to a Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional item to a Deluxe Burger");
    }
}
