//Transform to sum Tree
//        1
//      /   \
//     2     3 
//   /  \   /  \ 
//   4   5  6  7

public class Transform_to_Sum_Tree {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int transform(Node root) {
        if(root == null) {
            return 0;
        }
        
        // For leaf nodes, store their data and set to 0
        if(root.left == null && root.right == null) {
            int temp = root.data;
            root.data = 0;
            return temp;
        }
        
        int leftChild = transform(root.left);
        int rightChild = transform(root.right);

        int data = root.data;
        
        int newLeft = root.left == null ? 0 : root.left.data; 
        int newRight = root.right == null ? 0 : root.right.data;

        root.data = newLeft + leftChild + newRight + rightChild;
        return data;
    }

    // Fixed: Use print instead of println for better formatting
    public static void preorder(Node root) {
        if(root == null) {
            return;
        }

        System.out.print(root.data + " ");  // Changed to print and added space
        preorder(root.left);
        preorder(root.right);
    }
    
    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Original tree:");
        preorder(root);
        System.out.println();
        
        transform(root);
        
        System.out.println("Sum tree:");
        preorder(root);  // This was missing!
        System.out.println();
    }
}