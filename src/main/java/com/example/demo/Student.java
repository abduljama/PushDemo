package com.example.demo;

public class Student {
    String regNo;
    String firstName;
    String lastName;

    public Student( String firstName, String lastName  , String regNo) {
        this.regNo = regNo;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
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
}
