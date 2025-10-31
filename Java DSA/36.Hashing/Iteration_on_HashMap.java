import java.util.*;

public class Iteration_on_HashMap {
    public static void main(String args[]) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Indonesia", 6);
        hm.put("Nepal", 5);

        //Iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        //Using for each loop to get values of the keys
        for(String k: keys) {
            System.out.println("Keys="+k+",Values="+hm.get(k));
        }
    }
}
