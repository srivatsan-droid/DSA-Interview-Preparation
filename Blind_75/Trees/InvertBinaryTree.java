package Blind_75.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree {
    public static Node invertTree(Node root) {
        if (root == null)
            return null;

        // swap
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        // recurse
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    public static void printTree(Node root) {
        if (root == null)
            return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                Node curr = q.poll();
                System.out.print(curr.data + " ");

                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);
            }
            System.out.println(); // new level
        }
    }

    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right = new Node(7);
        root.right.left = new Node(6);
        root.right.right = new Node(9);

        invertTree(root);
        printTree(root);
    }

}
