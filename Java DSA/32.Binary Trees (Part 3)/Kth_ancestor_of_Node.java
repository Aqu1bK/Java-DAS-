// Kth Ancestor of Node
// K = 3
//        1
//      /   \
//     2     3 
//   /  \   /  \ 
//   4   5  6  7

public class Kth_ancestor_of_Node {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int kthAncestor(Node root, int n, int k) {
        // Base case: if root is null, return -1 (node not found)
        if (root == null) {
            return -1;
        }
        
        // If we found the target node
        if (root.data == n) {
            return 0;
        }

        // Recursively search in left and right subtrees
        int leftDist = kthAncestor(root.left, n, k);
        int rightDist = kthAncestor(root.right, n, k);

        // If node not found in either subtree
        if (leftDist == -1 && rightDist == -1) {
            return -1;
        }

        // Get the distance from the target node
        int max = Math.max(leftDist, rightDist);
        
        // If we've reached the kth ancestor, print it
        if (max + 1 == k) {
            System.out.println(root.data);
            return -1; // Special indicator that we found the kth ancestor
        }
        
        // Return the distance to the target node
        return max + 1;
    }
    
    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n = 5, k = 1;
        kthAncestor(root, n, k); // Don't print the return value
    }
}