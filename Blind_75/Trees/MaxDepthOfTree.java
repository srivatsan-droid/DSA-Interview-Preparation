package Blind_75.Trees;

class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}

public class MaxDepthOfTree {
    public static int height(Node root) {
        if (root == null)
            return 0;

        // compute the height of left and right subtrees
        int lHeight = height(root.left);
        int rHeight = height(root.right);

        return Math.max(lHeight, rHeight) + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);
        System.out.println(height(root));
    }
}
