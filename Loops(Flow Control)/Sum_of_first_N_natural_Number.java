import java.util.*;

public class Sum_of_first_N_natural_Number {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        int i=1;
        while(i <=n) {
            
            sum += i;
            i++;
        }

        System.out.println("sum is : " + sum);
    }
    
}
