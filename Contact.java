package com.bl.csvFile;

import java.util.ArrayList;
import java.util.Scanner;

public class Contact {
    public ArrayList<Contact> contactbook = new ArrayList<>();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private String firstName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String lastName;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String email;

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private long phoneNumber;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private String city;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    private String state;

    public long getZip() {
        return zip;
    }

    public void setZip(long zip) {
        this.zip = zip;
    }

    private long zip;

    public Contact(String firstName, String lastName, String city, String state, long phoneNumber, String email, long zip) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.city = city;
        this.state = state;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.zip = zip;
    }

    public Contact() {

    }

    public void addContact() {
        Scanner scan = new Scanner(System.in);
        System.out.println("First Name :");
        this.firstName = scan.nextLine();

        System.out.println("Last Name :");
        this.lastName = scan.nextLine();

        System.out.println("Enter city : ");
        this.city = scan.nextLine();

        System.out.println("Enter state : ");
        this.state = scan.nextLine();

        System.out.println("Enter Phone Number : ");
        this.phoneNumber = scan.nextLong();

        System.out.println("Enter Email : ");
        this.email = scan.next();

        System.out.println("Enter zip : ");
        this.zip = scan.nextLong();


        contactbook.add(new Contact(firstName, lastName, city, state, phoneNumber, email, zip));
    }
    public String toString() {
        return "First Name : "+firstName+"\rLast Name :"+lastName +"\nCity : "+ city
                +"\nState : "+ state +"\nPhone Number : "+phoneNumber+"\nEmail : "+email +"\nZip : "+ zip;
    }
}
