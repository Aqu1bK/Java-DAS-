package Conditional_Statement;
import java.util.*;

public class Calculator {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a :");
        int a = sc.nextInt();
        System.out.println("Enter b :");
        int b = sc.nextInt();
        System.out.println("Enter Operator :");
        String operator = sc.next();
        

        switch (operator) {
            case "+" : System.out.println(a + b);
            break;
            case "-" : System.out.println(a - b);
            break;
            case "*" : System.out.println(a * b);
            break;
            case "/" : System.out.println(a / b);
            break;
            case "%" : System.out.println(a % b);
            break;
            default : System.out.println("Invalid input");
        }
    }
    
}
