//Print sum of N natural numbers

public class Sum_of_N_natural_numbers {
    public static int calcSum(int n) {
        if (n == 1) {
            return 1;
        }
        int Snm1 = calcSum(n - 1);
        int Sn = n + Snm1;
        return Sn;
    }

    public static void main(String args[]) {
        int n = 5;
        int ans = calcSum(n);
        System.out.println(ans);
    }
}
