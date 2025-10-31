//  \16.Bit Manipulation\Clear_range_of_bits.java

public class Clear_range_of_bits {
    public static int clearRangeItoJ(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int mask = a | b;
        return n & mask;
    }
    public static void main(String args[]){
        System.out.println(clearRangeItoJ(10, 2, 4));
    }
}
