package com.kv.javaCourse.dataStructures.linkedlist.Notes;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Notes customer = new Notes("Vandana", 54.96);

//        Java is actually assigning the second customer class to point to the first class
//        in other words, it just saved the memory address & it did not create the separate class
//        Both the objects customer and secondCustomer points to the same memory location
        Notes secondCustomer = customer;
//      when we use setBalance() on secondCustomer , it updated balance for first one also
        secondCustomer.setBalance(12.18);

        if(customer.getBalance() == secondCustomer.getBalance())
            System.out.println("i am same");

        //ArrayList
        ArrayList<String> myPlaces = new ArrayList<>();
        myPlaces.add("New York");
        myPlaces.add("London");
        myPlaces.add("California");
        myPlaces.add("Canada");
        myPlaces.add("Korea");

        printArrayList(myPlaces);

        myPlaces.add(1, "India");
        printArrayList(myPlaces);

        //Starting LinkedList
        LinkedList<String> places = new LinkedList<>();
        places.add("Bangalore");
        places.add("China");
        places.add("Goa");
        places.add("Japan");
        places.add("Noida");




        printLinkedList(places);
        places.add(1, "Pune");
        printLinkedList(places);

        addInOrder(places, "America");
        printLinkedList(places);

        addInOrder(places, "SriLanka");
        printLinkedList(places);
        addInOrder(places, "Australia");
        printLinkedList(places);

    }

    private static void printLinkedList(LinkedList<String> linkedList) {
        System.out.println(" i am LinkedList");
        Iterator<String> i = linkedList.iterator();

        while(i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println();
    }

    private static void printArrayList(ArrayList<String> arrayList) {
        System.out.println(" i am arrayList");
        Iterator<String> i = arrayList.iterator();

        while(i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println();
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);

            if(comparison == 0) {
                //equal, do not add
                System.out.println("already exists");
                return false;
            }
            else if(comparison>0) {
                //newCity should appear before this one
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }
            else {
//                newCity should appear after this one
                stringListIterator.nextIndex();
                stringListIterator.add(newCity);
                return true;
            }
        }
        stringListIterator.add(newCity);
        return true;
    }


}
