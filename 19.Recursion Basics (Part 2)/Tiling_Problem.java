//Tiling Problem
//  Given a "2 x n" board and tiles of size "2 x 1",  
//  count the number of ways to tile the given board 
//  using the 2 x 1 tiles.
//  (A tile can either be placed horizontally or vertically)
 

public class Tiling_Problem {
    public static int tilingProblem(int n){
        //base case
        if(n == 0 || n == 1){
            return 1;
        }
        //kaam
        //vertical choice
        int fnm1 = tilingProblem(n-1);
        //horizontal choice
        int fnm2 = tilingProblem(n-2);
        int totalWays = fnm1 + fnm2;
        return totalWays;
    }

    public static void main(String args[]){
        System.out.println(tilingProblem(3));
    }
}
