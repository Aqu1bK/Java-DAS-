//AVL Tree

public class AVL_Tree {
    static class Node {
        int data;
        Node left;
        Node right;
        int height;

        public Node(int data) {
            this.data = data;
            this.height = 1;
        }
    }

    public static Node root;

    public static int height(Node root) {
        if(root == null) {
            return 0;
        }
        return root.height;
    }

    static int max(int a, int b) {
        return a > b ? a : b ;
    }

    //Right rotate subtree rooted with y
    public static Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        //Perform rotation
        x.right = y;
        y.left = T2;

        //Update heights
        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;

        // Return new root
        return x;
    }
    
    public static Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        //Perform rotation
        y.left = x;
        x.right = T2;

        //Update heights
        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;

        //Return new root
        return y;    
    }
    
    public static int getBalance(Node root) {
        if(root == null) 
            return 0;
        return height(root.left) - height(root.right);
    }
    
    public static Node insert(Node root, int key) {
        // Perform normal BST insertion
        if(root == null)
            return new Node(key);

        if(key < root.data)
            root.left = insert(root.left, key);
        else if (key > root.data)
            root.right = insert(root.right, key);
        else 
            return root; // Duplicate keys not allowed

        // Update height of this ancestor node
        root.height = 1 + max(height(root.left), height(root.right));

        // Get the balance factor of this ancestor node to check whether
        // this node became unbalanced
        int bf = getBalance(root);

        // If this node becomes unbalanced, then there are 4 cases

        // Left Left Case
        if(bf > 1 && key < root.left.data)
            return rightRotate(root);

        // Right Right Case
        if(bf < -1 && key > root.right.data)
            return leftRotate(root);

        // Left Right Case
        if(bf > 1 && key > root.left.data) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // Right Left Case
        if(bf < -1 && key < root.right.data) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        // Return the (unchanged) node pointer
        return root;
    }
    
    // A utility function to print preorder traversal of the tree.
    // The function also prints height of every node
    public static void preorder(Node root) {
        if(root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static void main(String args[]) {
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
        root = insert(root, 25);

        /*       AVL Tree
         *          30
         *         /  \
         *        20   40
         *       / \    \
         *      10  25   50
         */

         preorder(root);
         System.out.println();
    }
}