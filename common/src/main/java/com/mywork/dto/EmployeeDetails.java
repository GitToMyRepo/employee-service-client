package com.mywork.dto;

public class EmployeeDetails {
    private String name;
    private String email;
    private String position;


    public EmployeeDetails() {
    }

    public EmployeeDetails(String name, String email, String position) {
        this.name = name;
        this.email = email;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPosition() {
        return position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
