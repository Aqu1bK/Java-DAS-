/* 
You  are  given  an  array prices where prices[i] is  the  price  of  a  given  stock  on  the ith day.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Example 1: Input: prices = [7, 1, 5, 3, 6,  4]

Output: 5 
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5. 
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

Example 2: Input:Prices = [7, 6, 4,  3, 1] 

Output: 0 
Explanation:In this case, no transactions are done and the max profit = 0.
Constraints:•1 <= prices . length <= 105•0   <= prices [ i ] <= 104 

*/
public class Question_3 {
    // My code 
    public static int B_S_Stock(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int sellingPrice = Integer.MIN_VALUE;
        int maxProfit =Integer.MIN_VALUE;
        
        for(int i=0; i<prices.length; i++){
            if(prices[i] < buyPrice){
                buyPrice = prices[i];
                for(int j=i+1; j<prices.length; j++){
                    if(prices[j] > sellingPrice){
                        sellingPrice = prices[j];
                    }
                }
            }
        }
        return  maxProfit = sellingPrice - buyPrice; 
    }

    // Code form sigma 6.0
     public static int buyAndSellStock(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<prices.length; i++) {
            if(buyPrice < prices[i]){ //profit 
                int profit = prices[i] - buyPrice; //today's profit
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }

        return maxProfit;
    }

	public static void main(String[] args) {
		int prices[] = {7,1,5,3,6,4};
		System.out.print(buyAndSellStock(prices));
	}
}
