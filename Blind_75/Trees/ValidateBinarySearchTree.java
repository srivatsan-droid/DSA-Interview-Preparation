package Blind_75.Trees;

public class ValidateBinarySearchTree {
    public static boolean isValidBST(Node root) {
        return isHelper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static boolean isHelper(Node root, long min, long max) {
        if (root == null)
            return true;
        if (root.data <= min || root.data >= max)
            return false;
        return isHelper(root.left, min, root.data) && isHelper(root.right, root.data, max);
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(1);
        root.right = new Node(3);

        boolean ans = isValidBST(root);
        System.out.println(ans);
    }
}
