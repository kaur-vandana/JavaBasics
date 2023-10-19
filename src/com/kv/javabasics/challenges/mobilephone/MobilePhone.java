package com.kv.javabasics.challenges.mobilephone;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<>();
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println( i+1 +" "+myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
        }
    }

    public boolean addNewContact(Contact contact) {
        if (myContacts.indexOf(queryContact(contact.getName())) == -1) {
            myContacts.add(contact);
//            System.out.println("New contact added.");
            return true;
        } else {
//            System.out.println("Operation error. Contact " + contact.getName() + " already on your contact list.");
            return false;
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int queryResult = myContacts.indexOf(queryContact(oldContact.getName()));
        if (queryResult >= 0) {
            myContacts.set(queryResult, Contact.createContact(newContact.getName(), newContact.getPhoneNumber()));
            return true;
//            System.out.println("Contact " + oldName + " has been replaced with " + newName + " (phone: " + number + ").");
        } else {
//            System.out.println("Operation error. Contact " + oldName + " was not found on your contact list, so was not updated.");
            return false;
        }
    }

    public Contact queryContact(String contactName) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (contactName.equals(myContacts.get(i).getName())) {
                return myContacts.get(i);
            }
        }
        return null;
    }

//    public void queryContactName(String contactName) {
//        int contactIndex = queryContact(contactName);
//        if (contactIndex >= 0) {
//            System.out.println("Contact " + contactName + " was found on index " + contactIndex + " on your contact list.");
//        } else {
//            System.out.println("Contact " + contactName + " was not found on your contact list.");
//        }
//    }

    private int findContact(Contact contact) {
        int val = myContacts.indexOf(queryContact(contact.getName()));
        return val;
    }

    private int findContact(String name) {
        int val = myContacts.indexOf(queryContact(name));
        return val;
    }

    public boolean removeContact(Contact contact) {
        int contactIndex = myContacts.indexOf(queryContact(contact.getName()));
        if (contactIndex >= 0) {
            myContacts.remove(contactIndex);
            return true;
//            System.out.println("Contact " + contactName + " successfully removed from your contact list.");
        } else {
//            System.out.println("Contact " + contactName + " was not found on your contact list, so not deleted.");
            return false;
        }
    }
}
