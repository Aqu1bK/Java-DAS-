// \15.Strings\Check_if_Odd_or_Even.java
public class Check_if_Odd_or_Even {

    public static void oddOrEven(int n){
        int bitMask = 1;
        if((n & bitMask )== 0) {
            //even number
            System.out.println("Even number");
        } else {
            //odd number
            System.out.println("Odd number");
        }
        }
    
    public static void main(String args[]){
        oddOrEven(3);
        oddOrEven(11);
        oddOrEven(14);
    }
}
