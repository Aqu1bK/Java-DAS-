// What would be the output of the following code?
class Test {
    static int a = 10;
    static int b;
    static void changeB(){
        b = a * 3;
    }
}

public class Practice_question10 {
    public static void main(String args[]){
    Test t=new Test();
    t.changeB();
    System.out.println(Test.a+Test.b); 
}
   
}
