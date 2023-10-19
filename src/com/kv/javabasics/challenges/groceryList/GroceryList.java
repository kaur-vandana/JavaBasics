package com.kv.javabasics.challenges.groceryList;

import java.util.ArrayList;

public class GroceryList {

    //ArrayList holds objects
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("Grocery List:");
        for(int i=0;i<groceryList.size();i++) {
            System.out.println(i+1 + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position,newItem);
        System.out.println("Grocery ietm:" + (position+1) + "has been modified");
    }

    public void removeGroceryList(int position) {
        String item= groceryList.get(position);
        groceryList.remove(position);
    }

    public String findItem(String searchItem) {
//        boolean exists = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        if(position>=0)
            return groceryList.get(position);
        return null;
    }
}
