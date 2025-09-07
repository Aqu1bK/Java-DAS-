public class Method_Overloading {
    public static void main(String[] args) {
        Calculator clac = new Calculator();
        System.out.println(clac.sum(1,2));
        System.out.println(clac.sum(1,2,3));
        System.out.println(clac.sum(1.1f,2.2f));
    }
}

class Calculator { 
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }
}