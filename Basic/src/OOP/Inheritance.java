package OOP;
// Reuse & extend existing code.
public class Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // inherited
        d.bark();  // own
    }
}

class Animal {
    void eat() { System.out.println("Eating"); }
}

class Dog extends Animal {
    void bark() { System.out.println("Woof"); }
    void eat() { System.out.println("Eating bread"); }
}
