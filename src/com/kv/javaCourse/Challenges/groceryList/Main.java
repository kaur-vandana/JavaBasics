package com.kv.javaCourse.Challenges.groceryList;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void printInstruction() {
        System.out.println("enter choice" + "\n");
        System.out.println("1. print list");
        System.out.println("2. add item");
        System.out.println("3. modify item");
        System.out.println("4. remove item");
        System.out.println("5. find item");
        System.out.println("6. quit");

    }

    public static void addItem() {
        System.out.println("enter grocery item");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.println("enter item number");
        int itemNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("enter replacement item");
        String newItem =  scanner.nextLine();
        groceryList.modifyGroceryItem(itemNumber-1, newItem);

    }

    public static void removeItem() {
        System.out.println("enter item number");
        int itemNumber = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryList(itemNumber);
    }

    public static void searchItem() {
        System.out.println("enter item to search for");
        String searchItem = scanner.nextLine();
        if(groceryList.findItem(searchItem) != null)
            System.out.println("search item found " + searchItem);
        else
            System.out.println("search item NOT found " + searchItem);
    }


    public static void main(String[] args) {
        boolean quit = false;
        int choice =0;

        while(!quit) {
            System.out.println("Enter your choice");
            choice = scanner.nextInt();

            switch (choice) {
                case 0 : printInstruction();
                         break;
                case 1 : groceryList.printGroceryList();
                         break;
                case 2 : addItem();
                         break;
                case 3 : modifyItem();
                         break;
                case 4 : removeItem();
                         break;
                case 5 : searchItem();
                         break;
                case 6 : quit=true;
                         break;
            }
        }
    }

}
