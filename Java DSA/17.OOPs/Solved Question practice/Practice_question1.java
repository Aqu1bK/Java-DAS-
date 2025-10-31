//Find out the correct statement to assign name to object.
public class Practice_question1 {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Aquib";
        System.out.println(s1.name);
    }
}

class Student {
    String name;
    int marks;
}
