// Tree Traversal
// c. Postorder Traversal
// Left Subtree -> Right Subtree-> Root

public class Postorder_Traversal {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree { 
        static int idx = -1;
        public static Node buildTree(int nodes[]) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
        
        //Postorder Traversal
        public static void postorder(Node root) {
            if(root == null) {
                return;
            }
            // Left Subtree traversal
            postorder(root.left);
            // Right Subtree traversal
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }
    public static void main(String args[]) {
        int nodes[] = {1, 2 ,4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);

        tree.postorder(root);
    }
}
