// Lowest Common Ancestor
// n1 = 4 n2 = 7
//        1
//      /   \
//     2     3
//   /  \   /  \
//   4   5  6  7

//Output: 1

// sudo
// 1. root = null
//    root = n1
//    root = n2
//    leftLca (4)
//    rigthLca 

// 2 rightLCA = null --> leftlca
//   leftLCA = null --> rightlca
//   right & left = null --> return root

import java.util.*;

public class Lowest_Comman_Ancestor_Approach_Two {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node lca2(Node root, int n1, int n2) {
        if(root == null) {
            return null;
        }

        if(root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftlca = lca2(root.left, n1, n2);
        Node rightlca = lca2(root.right, n1, n2);

        //leftLCA = val rightlca =null
        if(rightlca == null) {
            return leftlca;
        }

        if(leftlca == null) {
            return rightlca;
        }

        return root;
    }
    
    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1 = 4, n2 = 7;
        Node result = lca2(root, n1, n2);  // Call the lca method
        System.out.println(result.data);  // Print the data of LCA node
    }   
}