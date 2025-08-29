package com.example.OOP;
// Show what, hide how.
public class Abstraction {
    
}

abstract class Shape {
    abstract double area(); // what is the area of the shape
}

class Circle extends Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    double area() { // how to calculate the area of a circle
        return Math.PI * radius * radius;
    }
}
