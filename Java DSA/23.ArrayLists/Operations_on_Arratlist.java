import java.lang.reflect.Array;
import java.util.ArrayList;

public class Operations_on_Arratlist {
    public static void main(String args[]){
        //ClassName objectName = new ClassName();
        ArrayList <Integer> list = new ArrayList<>();
        ArrayList <String> list2 = new ArrayList<>();
        ArrayList <Boolean> list3 = new ArrayList<>();

        // Add Element operation
        list.add(1); //O(n)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1, 9);
        System.out.println(list);

        //Get Element operation
        int element = list.get(2);
        System.out.println(element);

        //Delete Element operation
        list.remove(2);
        System.out.println(list);

        //Set Element operation
        list.set(2, 10);
        System.out.println(list);

        //Contains Element operation
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));
    }
}
