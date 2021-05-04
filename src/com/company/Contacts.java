package com.company;

import java.util.Scanner;

public class Contacts{

    public static String firstName;
    public static String lastName;
    public static String address;
    public static String city;
    public static String state;
    public static int zipCode;
    public static int phoneNumber;
    public static String email;
    public  Contacts(String firstName, String lastName, String address, String city, String state, int zipCode, int phoneNumber, String email) {
    }
        public void add(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter First Name");
            this.firstName = sc.nextLine();
            System.out.println("Enter Last Name");
            this.lastName = sc.nextLine();
            System.out.println("Enter Address");
            this.address = sc.nextLine();
            System.out.println("Enter City");
            this.city = sc.nextLine();
            System.out.println("Enter State");
            this.state = sc.nextLine();
            System.out.println("Enter Zipcode");
            this.zipCode = sc.nextInt();
            System.out.println("Enter Phone Number");
            this.phoneNumber = sc.nextInt();
            System.out.println("Enter Email");
            this.email = sc.next();
        }
        public String toString(){
            return ("The entered details are: \nfirst name " +firstName+"\nlast name "+ lastName+ "\nAddress "+address+"\ncity "+city+"\nstate " +state+"\nzip code "+zipCode+"\nphone number "+phoneNumber+"\nemail "+email);

        }
    }


