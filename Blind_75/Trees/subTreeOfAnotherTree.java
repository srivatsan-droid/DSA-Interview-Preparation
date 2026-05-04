package Blind_75.Trees;

public class subTreeOfAnotherTree {
    public static boolean isSubTree(Node root, Node subRoot) {
        if (root == null)
            return false;

        if (isSameTree(root, subRoot))
            return true;

        return isSubTree(root.left, subRoot) ||
                isSubTree(root.right, subRoot);
    }

    public static boolean isSameTree(Node p, Node q) {
        if (p == null && q == null)
            return true;
        if (p == null || q == null)
            return false;
        if (p.data != q.data)
            return false;
        boolean left = isSameTree(p.left, q.left);
        boolean right = isSameTree(p.right, q.right);
        return left && right;
    }

    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(4);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(2);

        Node subRoot = new Node(4);
        subRoot.left = new Node(1);
        subRoot.right = new Node(2);

        boolean ans = isSubTree(root, subRoot);
        System.out.println(ans);
    }
}
