package Blind_75.Trees;

import java.util.HashMap;
import java.util.Map;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

public class ConstructBinaryTree {

    public static Node buildTree(int[] preOrder, int[] inOrder) {

        Map<Integer, Integer> inMap = new HashMap<>();

        for (int i = 0; i < inOrder.length; i++) {
            inMap.put(inOrder[i], i);
        }

        return buildTree(
                preOrder,
                0,
                preOrder.length - 1,
                inOrder,
                0,
                inOrder.length - 1,
                inMap);
    }

    public static Node buildTree(
            int[] preOrder,
            int preStart,
            int preEnd,
            int[] inOrder,
            int inStart,
            int inEnd,
            Map<Integer, Integer> inMap) {

        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }

        // Root value from preorder
        int rootValue = preOrder[preStart];

        // Create root node
        Node root = new Node(rootValue);

        // Find root index in inorder
        int inRoot = inMap.get(rootValue);

        // Number of nodes in left subtree
        int numsLeft = inRoot - inStart;

        // Build left subtree
        root.left = buildTree(
                preOrder,
                preStart + 1,
                preStart + numsLeft,
                inOrder,
                inStart,
                inRoot - 1,
                inMap);

        // Build right subtree
        root.right = buildTree(
                preOrder,
                preStart + numsLeft + 1,
                preEnd,
                inOrder,
                inRoot + 1,
                inEnd,
                inMap);

        return root;
    }

    // Inorder traversal for checking
    public static void printInorder(Node root) {
        if (root == null) {
            return;
        }

        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }

    public static void main(String[] args) {

        int[] preOrder = { 3, 9, 20, 15, 7 };
        int[] inOrder = { 9, 3, 15, 20, 7 };

        Node root = buildTree(preOrder, inOrder);

        System.out.println("Inorder Traversal:");
        printInorder(root);
    }
}