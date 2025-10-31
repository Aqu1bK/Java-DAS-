// What will be output of this code? (Both classes in same package)

public class Practice_question5 {
    public static void main(String args[]){
        Vehicle obj1 = new Car();
        obj1.print(); //Output : Derived class(Car) because of function overriding

        Vehicle obj2 = new Vehicle();
        obj2.print(); //Output : Base class(Vehicle)        
    }
}

class Vehicle{
    void print(){
        System.out.println("Base class(Vehicle)");
    }
}

class Car extends Vehicle{
    void print(){
        System.out.println("Derived class(Car)");
    }
}
