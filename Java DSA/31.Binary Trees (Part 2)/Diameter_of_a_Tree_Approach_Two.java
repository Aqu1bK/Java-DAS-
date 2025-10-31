// Diameter of a Tree Approach Two

// (d, h) lInfo =diam(root.left);
// (d, h) rInfo =diam(root.right);

// finalDiam = max(lInfo.d, rInfo.d, lh+rh+1)
// finalHt = max(lInfo.h, rInfo.h) + 1
// return newInfo(Diam, ht)

public class Diameter_of_a_Tree_Approach_Two {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root) {
        if(root == null) {
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }
    
    // First approach with O(n^2) time complexity
    public static int diameterSlow(Node root) { //TC = O(n^2)
        if(root == null) {
            return 0;
        }

        int leftDiam = diameterSlow(root.left);
        int leftHt = height(root.left);
        int rightDiam = diameterSlow(root.right);
        int rightHt = height(root.right);

        int selfDiam = leftHt + rightHt + 1;

        return Math.max(selfDiam, Math.max(leftDiam, rightDiam));
    }

    static class Info {
        int diam;
        int ht;

        public Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }

    // Optimized approach with O(n) time complexity
    public static Info diameter(Node root) {
        if(root == null) {
            return new Info(0, 0);
        }
        
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(diam, ht);
    }

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Info result = diameter(root);
        System.out.println("Diameter: " + result.diam);
        System.out.println("Height: " + result.ht);
    }
}