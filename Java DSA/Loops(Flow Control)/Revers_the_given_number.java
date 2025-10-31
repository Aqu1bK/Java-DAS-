public class Revers_the_given_number{
    public static void main(String arg[]){
        int n = 234567;
        int rev = 0;


       while(n > 0) {
        int lastDigit = n % 10;
        rev = (rev*10) + lastDigit;
        n= n/10; 
       }
       System.out.println(rev);
    }
}

// Working of above code.

/*
 * rev = (rev * 10) + lastDigit
 * rev = 0
 * rev = (0*0) + 9 = 9
 * rev = (9*10) + 9 = 99
 * rev = (99*10) + 8 = 990 + 8 = 998
 * rev = (998*10) + 0 = 9980
 * rev = (9980*10) + 1 = 99800 + 1 = 99801
 */