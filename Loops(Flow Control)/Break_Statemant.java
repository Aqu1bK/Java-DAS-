import java.util.*;

public class Break_Statemant {
    public static void main(String args[]){
        for(int i = 1; i <= 20; i++){
            if(i == 11) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("i am out of the loop");
    }
    
}
