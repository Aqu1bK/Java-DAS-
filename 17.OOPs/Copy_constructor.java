// \17.OOPs\Copy_constructor.java

// Definition: A constructor that takes another object of the same class as a parameter and copies its values into the new object.
// Purpose: To create a duplicate object with the same state (data) as an existing object.
// Default vs. Custom:
// Many languages (like C++) provide a default copy constructor.
// You can also define your own to control how objects are copied.

// Benefits:
// Makes it easy to clone objects.
// Helps when you want to copy objects without exposing internal details.
// Useful when working with objects that have complex structures (like deep copies of arrays or objects).

public class Copy_constructor {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Aquib";
        s1.roll = 456;
        s1.password = "abcd";

        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.password = "xyz";

        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class Student{
    String name;
    int roll;
    String password;
    int marks[];

    // copy constructor
    Student(Student s1){
        marks = new int[3];
        this.name =s1.name;
        this.roll =s1.roll;
        this.marks =s1.marks;
    }

    Student(){ // Non-parameterised
        marks = new int[3];
        System.out.println("Constructor is called...");
    }
    Student(String name){ // Parameterised
        marks = new int[3];
        this.name = name;
    }
    Student(int roll){  // Parameterised
        marks = new int[3];
        this.roll = roll;
    }
}