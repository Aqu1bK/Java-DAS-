import java.util.*;
public class Factorial {
    int fact = 1; 
    public static int Factorial(int n, int fact){
        for(int j = 1; j <= n; j++){
            fact *= j; 
        }
         return fact;
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        int pfact = Factorial(n, fact);
        System.err.println("Factorial is " + pfact); 
    }
}
