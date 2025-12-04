package com.example.mlservice.controller;

/**
 * Représente une requête client contenant l'âge et le revenu.
 */
public class CustomerRequest {
    private double age;
    private double income;

    public CustomerRequest() {}

    public CustomerRequest(double age, double income) {
        this.age = age;
        this.income = income;
    }

    public double getAge() {
        return age;
    }

    public double getIncome() {
        return income;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void setIncome(double income) {
        this.income = income;
    }
}
