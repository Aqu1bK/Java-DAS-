// \17.OOPs\Abstract_Classes.java

// Abstraction is the process of hiding implementation details and showing only the essential features of an object.
// Cannot create an instance of abstract class
// Can have abstract/non-abstract methods
// Can have constructors

public class Abstract_Classes {
    public static void main(String args[]){
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();

    }
}

abstract class Animal{

    String color;

    Animal(){
        System.out.println("animal constructor called");
    }
    void eat(){
        System.out.println("Animal Eating");
    }
    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse Constructor called");
    }
    void changeColor(){
        color = "Dark Brown";

    }
    void walk(){
        System.out.println("Walking on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang Constructor called");
    }
}

class Chicken extends Animal{
    void changeColor(){
        color = "Yellow";
    }
    void walk(){
        System.out.println("Walking on 2 legs");
    }
}