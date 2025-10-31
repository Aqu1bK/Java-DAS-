// Indian Coins
// We are given an infinite supply of denominations of [1, 2, 5, 10, 20, 50, 100, 500, 1000].
// Find min no. of coins/notes to make change for a value V.

// V = 121
// ans = 3(100 + 20 + 1)

// V = 590
// ans = 4(500 + 50 + 20 + 20)
import java.lang.reflect.Array;
import java.util.*;

public class Indian_Coins {
    public static void main(String args[]) {
        Integer coins[] =  {1, 2, 5, 10, 20, 50, 100, 500, 1000};

        Arrays.sort(coins, Collections.reverseOrder());

        int amount = 590;
        int countofCoins = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<coins.length; i++) {
            if(coins[i] <= amount) {
                while(coins[i] <= amount) {
                    countofCoins++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }

        System.out.println("total (min) coin used = " + countofCoins);

        for(int i=0; i<ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
    
}
