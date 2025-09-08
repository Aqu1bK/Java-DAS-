//Which variable(s) can the class Person access in the following code?
//a. name 
//b. weight
//c. rollNumber
//d. schoolName

public class Practice_question2 {
    public static void main(String args[]){
        Person p = new Person();
        p.weight = 120; 
        System.out.println(p.weight);
        p.name = "Aquib";
        System.out.println(p.name);
    }
}

class Person {
    String name;
    int weight;
}

class Student extends Person {
    int rollNumber;
    String schoolName;
}
