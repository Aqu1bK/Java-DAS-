// \17.OOPs\Constructors.java

/*Constructors
 * Constructor is a special type of method which is used to initialize the object of a class.
 
 * Constructor have the same as class or structure.
 * Constructor don't have a return type.
 * Constructor are only called once, at object creation.
 * Memory allocation happens when constructor is called.
 */

public class Constructors {
    public static void main(String args[]){
        Student s1 = new Student("Aquib");
        System.out.println(s1.name);
    }
}

class Student{
    String name;
    int roll;

    Student(String name){
        this.name = name;
    }
}