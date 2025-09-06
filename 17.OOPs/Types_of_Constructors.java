// \17.OOPs\Types_of_Constructors.java

// Non-parameterised
// Parameterised
// Copy Constructor

public class Types_of_Constructors {
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student("Aquib");
        Student s3 = new Student(123);
    }
}

class Student{
    String name;
    int roll;

    Student(){ // Non-parameterised
        System.out.println("Constructor is called...");
    }
    Student(String name){ // Parameterised
        this.name = name;
    }
    Student(int roll){  // Parameterised
        this.roll = roll;
    }
}
