import java.util.*;

public class Num_from_1_to_n {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int Counter = 1;
        int UserInput = sc.nextInt();
        while (Counter <= UserInput) {
            System.out.println(Counter);
            Counter++;
        }

    }
    
}


// public class Num_from_1_to_n {
//     public static void main(String arg[]) {
//         Scanner sc = new Scanner(System.in);
//         int Counter = 1;
//         int UserInput = sc.nextInt();
//         while (Counter < UserInput) {
//             System.out.print(Counter + "+");
//             Counter++;
//         }
//             System.out.print(UserInput);
//     }
    
// }

