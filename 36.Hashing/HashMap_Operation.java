import java.util.HashMap;

public class HashMap_Operation {
    public static void main(String args[]) {
        // Creating new HashMap
        HashMap<String, Integer> hm = new HashMap<>();

        //Inserting Key-Value pair in HashMap using put() function.
        hm.put("India", 120);
        hm.put("China", 150);
        hm.put("US", 30);

        System.out.println(hm);

        // Getting value for a key using get() function.
        int population = hm.get("India");
        System.out.println(population);

        // Checking if a key exists or not using containsKey() function.
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonesia"));

        // Removing a key-value pair using remove() function.
        System.out.println(hm.remove("China"));
        System.out.println(hm);
    } 
}
