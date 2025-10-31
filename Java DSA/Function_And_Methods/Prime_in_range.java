public class Prime_in_range {
    public static boolean isPrime(int n){
        boolean isPrime = true;
        //edge case
        if (n == 2){
            return true;
        }
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void PrimeInRange(int n){
        for(int i=2; i<=n; i++){
            if(isPrime(i)) { //true
                System.out.println(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        PrimeInRange(20);
    }
} 

