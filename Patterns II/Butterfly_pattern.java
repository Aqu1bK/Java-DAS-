public class Butterfly_pattern {
    public static void butterfly(int n){
       for (int i=1; i<=n; i++) {
        //stars -1
        for (int j=1; j<=i; j++){
            System.out.print("*");
        }

        //spaces -2(n-i)
        for(int j=1; j<=2*(n-i); j++){
            System.out.print(" ");
        }

        //stars -1
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
       }


       //2nd Half
       for(int i=n; i>=1; i--){
        //stars -1
        for (int j=1; j<=i; j++){
            System.out.print("*");
        }

        //spaces -2(n-i)
        for(int j=1; j<=2*(n-i); j++){
            System.out.print(" ");
        }

        //stars -1
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
       }
    }

    public static void main(String args[]){
        butterfly(3);
    }
}
