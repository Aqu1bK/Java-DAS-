// \17.OOPs\Shallow_and_Deep_Copy.java

// shallow copy: when we copy one object to another object, both the objects point to the same memory location.
// deep copy: when we copy one object to another object, both the objects point to different memory location.

public class Shallow_and_Deep_Copy {
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
        s1.marks[2] = 100;

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

    //Shallow copy constructor
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name =s1.name;
    //     this.roll =s1.roll;
    //     this.marks =s1.marks;
    // }

    // Deep copy constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0; i<marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
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