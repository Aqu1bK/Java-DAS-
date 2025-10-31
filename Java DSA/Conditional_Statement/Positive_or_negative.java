package Conditional_Statement;

import java.util.*;

public class Positive_or_negative{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int pon = sc.nextInt();

        if(pon < 0){
            System.out.println("Negative");
        } else {
            System.out.println("Positive");
        }
    }
}
