import java.util.Scanner;

public class String_input_and_output {
    public static void main(String args[]){
        char arr[] = {'a', 'b','c','d'};
        String str = "abcd";
        String str2 = new String("abcd");

        //String are IMMUTABLE
        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();
        System.out.println(name);
    }
}
