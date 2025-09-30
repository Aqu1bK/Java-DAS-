// Multi dimensional ArrayList
import java.util.*;

public class Multi_dimensional_ArrayList {
    // public static void main(String args[]) {
    //     ArrayList<ArrayList<Integer>>mainList = new ArrayList<>();

    //     ArrayList<Integer> list = new ArrayList<>();
    //     list.add(1); list.add(2);
    //     mainList.add(list);

    //     ArrayList<Integer> list2 = new ArrayList<>();
    //     list2.add(3); list2.add(4);
    //     mainList.add(list2);

    //     for(int i=0; i<mainList.size(); i++){
    //         ArrayList<Integer> currList = mainList.get(i);
    //         for(int j=0; j<currList.size(); j++) {
    //             System.out.print(currList.get(j)+ " ");
    //         }
    //         System.out.println();
    //     }
    //     System.out.println(mainList);
    // }

    public static void main(String[] args) {
		ArrayList<ArrayList<Integer>>mainList = new ArrayList<>();
		
		ArrayList<Integer>list1 = new ArrayList<>();
		list1.add(1); list1.add(2); list1.add(3); list1.add(4); list1.add(5);
		mainList.add(list1);
		
		ArrayList<Integer>list2 = new ArrayList<>();
		list2.add(2); list2.add(4); list2.add(6); list2.add(8); list2.add(10);
		mainList.add(list2);
		
		ArrayList<Integer>list3 = new ArrayList<>();
		list3.add(3); list3.add(6); list3.add(9); list3.add(12); list3.add(15);
		mainList.add(list3);
		
		for(int i = 0; i<mainList.size(); i++){
		    System.out.print(mainList.get(i) + " "); // print elements with  brakets for some reasion.
		    
		  //  ArrayList<Integer> currList = mainList.get(i); //this do not print with brackets.
		  //  for(int j=0; j<currList.size(); j++){
		  //      System.out.print(currList.get(j) + " ");
		  //  }
		    System.out.println();
		}
		System.out.println(mainList);
	}
}
