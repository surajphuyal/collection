/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.CollectionExample.entity;

/**
 *
 * @author user
 */
public class Students {
    private int id;
    private String firstName, lastName, Email, ContactNo, Dob,Gender;
    boolean status;

    public Students() {
    }

    public Students(int id, String firstName, String lastName, String Email, String ContactNo, String Dob, String Gender, boolean status) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.Email = Email;
        this.ContactNo = ContactNo;
        this.Dob = Dob;
        this.Gender = Gender;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getContactNo() {
        return ContactNo;
    }

    public void setContactNo(String ContactNo) {
        this.ContactNo = ContactNo;
    }

    public String getDob() {
        return Dob;
    }

    public void setDob(String Dob) {
        this.Dob = Dob;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Students{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", Email=" + Email + ", ContactNo=" + ContactNo + ", Dob=" + Dob + ", Gender=" + Gender + ", status=" + status + '}';
    }

   
    
    
    
}
