package Blind_75.Trees;

public class SameTree {
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
        Node p = new Node(1);
        p.left = new Node(2);
        p.right = new Node(3);

        Node q = new Node(1);
        q.left = new Node(0);
        q.right = new Node(3);

        boolean ans = isSameTree(p, q);
        System.out.println(ans);
    }
}
