// Subtree of another tree
// Given the root of two binary trees root and subRoot, return true if there is a subtree 
// of root with the same structure and node values of subRoot and false otherwise.

// 1. find subRoot in tree
// 2. check identical

// non - identical
// 1. node.data != subRoot.data
// 2. node = null || subRoot = null
// 3. leftSubtre -> non-identical
// 4. rightSubtre -> non-identical

public class Subtree_of_another_tree {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean isIdentical(Node root, Node subRoot) {
        if (root == null && subRoot == null) {
            return true;
        } else if (root == null || subRoot == null || root.data != subRoot.data) {
            return false;
        }

        if (!isIdentical(root.left, subRoot.left)) {
            return false;
        }

        if (!isIdentical(root.right, subRoot.right)) {
            return false; // Fixed: Added missing 'false' value
        }
        return true;
    }
    
    public static boolean isSubtree(Node root, Node subRoot) {
        if(root == null) {
            return false;
        }

        if(root.data == subRoot.data) {
            if(isIdentical(root, subRoot)) {
                return true;
            }
        }

        boolean left = isSubtree(root.left, subRoot); // lsubtree -> true
        boolean right = isSubtree(root.right, subRoot);

        return left || right;
    }
    
    public static void main (String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);
        System.out.println(isSubtree(root, subRoot));
    }
}