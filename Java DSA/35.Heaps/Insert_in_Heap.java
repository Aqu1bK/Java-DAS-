import java.lang.reflect.Array;

public class Insert_in_Heap {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            // add at Last idx
            arr.add(data);

            int x = arr.size()-1; //x is child index
            int par = (X-1)/2; // par index

            while(arr.get(x) < arr.get(par)) {
                // swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.get(par, temp);
            }
        }
    }

    public static void main(String args[]) {

    }
}
