import java.util.*;

// My code using while Loop

// public class Question_break_keyword {
//     public static void main (String arg[]) {
//         Scanner sc = new Scanner(System.in);

//         while(true) {
//             int i = sc.nextInt();
//             if(i == 20){
//                 break;
//             }
//             System.out.println(i);
//         }
//         System.out.println("out of Loop");
//     }
    
// }


// Code from course

public class Question_break_keyword{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("enter your number");
            int n = sc.nextInt();

            if(n % 10 == 0) {
                break;
            }
            System.out.println(n);
        } while(true);
    }
}
