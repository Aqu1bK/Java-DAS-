public class revers_of_a_number{
    public static void main(String arg[]){
        int n = 234567;
       while(n > 0) {
        int lastDigit = n % 10;
        System.out.print(lastDigit);
        n=n /10; 
       }
       System.out.println();
    }
}