package com.example.OOP;
// Same action, different behavior.
public class Polymorphism {
    public static void main(String[] args) {
            Animal a = new Cat();   // up-casting
            a.speak();  // Meow
    }
}

class Calc {
    // Compile-time (method overloading)
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }
}

// Run-time (method overriding + up-casting)
class Animal { void speak() { System.out.println("?"); } }
class Cat extends Animal { void speak() { System.out.println("Meow"); } }

