public class Multi_level_inheritance {
    public static void main(String args[]){
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
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

class Mammal extends Animal {
    int legs;
}

class Dog extends Mammal {
    String breed;
}

// This is multi level inheritance

// Base Class ---------> Derived Class ----------> Derived Class