import java.util.*;

public class Math_table {
    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Table = 1;

        for(int i = 1; i<= 10; i++){
            Table = n * i;
            System.out.println(n + " * "+ i +" = " + Table);
        }

    }
    
}
