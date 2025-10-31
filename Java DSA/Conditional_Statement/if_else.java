package Conditional_Statement;
import java.util.*;

public class if_else {
    public static void main(String arg[]){
        int age = 15;
        if(age >= 18) {
            System.out.println("adult : drive, vote");
        }
        if (age > 13 && age < 18) {
            System.out.println("teenager");
        }else {
            System.out.println("not adult");
        }
    }
    
}
