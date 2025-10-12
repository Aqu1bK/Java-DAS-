import java.lang.reflect.Array;

public class Peek_from_Heap {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

    public void add(int data) {//O(logn)
        //add at last index
        arr.add(data);

        int x = arr.size()-1; //x is child index
        int par = (x-1)/2; // par index

        while(arr.get(x) < arr.get(par)) { //O(logn)
            //swap
            int temp = arr.get(x);
            arr.set(X, arr.get(par));
            arr.get(par, temp);
        }
    }
    public int peeek() {
        return arr.get(0);
    } 
    }

    public static void main(String args[]) {

    }
    
}
