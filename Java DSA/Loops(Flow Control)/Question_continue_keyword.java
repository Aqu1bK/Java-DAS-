import java.util.*;

public class Question_continue_keyword {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("enter your number ");
            int n = sc.nextInt();

            if(n % 10 == 0) {
                continue;
            }
            System.out.println(n);
        } while(true);
    }
    
}
