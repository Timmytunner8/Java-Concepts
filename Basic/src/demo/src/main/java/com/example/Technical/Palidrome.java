package com.example.Technical;

public class Palidrome {
    public static Boolean isPalidrome(String str) {
        String reverse = new StringBuilder(str).reverse().toString();
        if (str.equals(reverse)) {
            System.out.printf("Palidrome: Original -> %s ; Reverse %s%n", str, reverse);
            return true;
        } else {
            System.out.printf("Palidrome: Original -> %s ; Reverse %s%n", str, reverse);
            return false;
        }
    }
}
