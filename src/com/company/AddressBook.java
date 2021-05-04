package com.company;


import java.util.*;

public class AddressBook {
    public static String firstName;
    public static String lastName;
    public static String address;
    public static String city;
    public static String state;
    public static int zipCode;
    public static int phoneNumber;
    public static String email;

    public AddressBook(String firstName, String lastName, String address,String city,String state,int zipCode,int phoneNumber,String email){
        this.firstName = firstName;
        this.lastName =lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public static void main(String[] args){
      System.out.println("Welcome to Address Book System");
      ArrayList<Contacts> contacts = new ArrayList<>();
      Contacts ab = new Contacts(firstName, lastName, address, city, state, zipCode,phoneNumber,email);
        System.out.println("Enter 1 to add contact: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch(choice) {
            case 1:
                ab.add();
                ab.toString();
                contacts.add(ab);
                System.out.println(contacts.get(0));
                break;
            default:
                System.out.println("Enter valid number");
                break;
        }
    }
}
