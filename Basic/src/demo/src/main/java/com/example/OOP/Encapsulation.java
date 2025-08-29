package com.example.OOP;
// Encapsulation --> Hide data, expose safe access.
public class Encapsulation {
    public static void main(String[] args) {
        
    }
}

class BankAccount{
    private double balance;

    public void deposit(double amt){
        if (amt > 0) {
            balance += amt;
        }
    }

    public Double getBalance() {
        return balance;
    }
}