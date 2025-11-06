public class Word_Break_Probleam {
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;

        public Node() {
            for(int i = 0; i < children.length; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for(int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if(curr.children[idx] == null) {  // Fixed typo: childern -> children
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean search(String key) { // O(L)
        Node curr = root;
        for(int level = 0; level < key.length(); level++) {
            int idx = key.charAt(level) - 'a';
            if(curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }

        return curr.eow == true;
    }

    public static boolean wordBreak(String key) {  // Fixed parameter: was args[], now key
        if(key.length() == 0) {  // Now key is properly defined
            return true;
        }
        for(int i = 1; i <= key.length(); i++) {  // Changed condition to <= key.length()
            if(search(key.substring(0, i)) && wordBreak(key.substring(i))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        String arr[] = {"i", "like", "sam", "samsung", "mobile", "ice"};
        for(int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }

        String key = "ilikesung";
        System.out.println(wordBreak(key));  // Added output to test the function
    }
}