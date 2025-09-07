// \17.OOPs\Inheritance.java

// Inheritance: It is a mechanism in which one class acquires the properties and methods of another class.

public class Inheritance {
    public static void main(String args[]){
        Fish shark = new Fish();
        shark.eat();
    }
}

//Base Class
class Animal {
    String name;

    void eat() {
        System.out.println("eat");
    }

    void breath() {
        System.out.println("breathe");
    }
}

//Derived Class
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("swim");
    }
}

// This is a single level inheritance
//  Base Class ------> Derived Class