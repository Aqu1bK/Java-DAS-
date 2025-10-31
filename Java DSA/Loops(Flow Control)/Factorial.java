import java.util.*;

//Factorial using for loop

// public class Factorial {
//     public static void main(String args[]) {

//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int factorial = 1;

//         for(int i = 1; i <= n; i++){
//             factorial = factorial * i;
//         }
//         System.out.println("factorial is :" + factorial);
//     }
    
// }


// Factorial using while loop

import java.util.*;

public class  Factorial{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 1;

        int i=1;
        while(i <= n) {
            
            sum *= i;
            i++;
        }

        System.out.println("sum is : " + sum);
    }
    
}



