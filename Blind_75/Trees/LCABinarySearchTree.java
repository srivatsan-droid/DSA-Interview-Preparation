package Blind_75.Trees;

public class LCABinarySearchTree {
    public static Node LCA(Node root, Node p, Node q) {
        while (root != null) {
            if (p.data < root.data && q.data < root.data) {
                root = root.left;
            }
            if (p.data > root.data && q.data > root.data) {
                root = root.right;
            } else {
                return root;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Node root = new Node(6);
        root.left = new Node(2);
        root.right = new Node(8);
        root.left.left = new Node(0);
        root.left.right = new Node(4);
        root.left.right.left = new Node(3);
        root.left.right.right = new Node(5);
        root.right.left = new Node(7);
        root.right.right = new Node(9);
        Node p = new Node(2);
        Node q = new Node(8);
        Node ans = LCA(root, p, q);
        System.out.println(ans.data);
    }
}
