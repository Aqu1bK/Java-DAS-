// Friends Pairing Problem

// Given n friends, each one can single or can be paired up with some other friend.
// Each friend can be paired only once. Find out the total  number of ways in which
// friends can remain single or can be paired up.

public class Friends_Pairing_Problem {
    public static int friendsPairing(int n){
        if(n == 1 || n == 2){
            return n;
        }
        //choice
        //single
        int fnm1 = friendsPairing(n-1);

        //pair
        int fnm2 = friendsPairing(n-2);
        int pairWays = (n-1) * fnm2;

        //toWays
        int totalWays = fnm1 + pairWays;
        return totalWays;
    }

    public static void main(String args[]){
        int n = 3;
        System.out.println(friendsPairing(n));

    }
}