package OOP;
// In this source code explane the concept of Class
// Class --> blueprint
// Object --> real thing from the blueprint
public class ClassConcept {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
    }
}

class Car {
    String color = "red";
    void drive() {
        System.out.println("Moving....");
    }
}
