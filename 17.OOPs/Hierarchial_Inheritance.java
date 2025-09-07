// Hierarchial Inheritance

/*               Base Class
 *                   |
 *                   |
 *          -------------------- 
 *          |                  |
 *          |                  |
 *          |                  |
 *   Derived Class 1    Derived Class 2
 */

public class Hierarchial_Inheritance {
    public static void main(String args[]){
        Dog dobby = new Dog();
        dobby.eat();
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
class Mammal extends Animal {
    void walk(){
        System.out.println("walks");
    }
}

class Fish extends Animal {
    void swim(){
        System.out.println("swims");
    }
}

class Bird extends Animal {
    void fly(){
        System.out.println("fly");
    }
}