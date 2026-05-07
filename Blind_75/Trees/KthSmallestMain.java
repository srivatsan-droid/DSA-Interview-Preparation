package Blind_75.Trees;

class Solution {
    int count = 0;
    Node result = null;

    public int kthSmallest(Node root, int k) {
        helper(root, k);
        return result.data;
    }

    private void helper(Node node, int k) {
        if (node == null)
            return;

        helper(node.left, k);

        count++;

        if (count == k) {
            result = node;
            return;
        }

        helper(node.right, k);
    }
}

public class KthSmallestMain {
    public static void main(String[] args) {

        Node root = new Node(3);
        root.left = new Node(1);
        root.right = new Node(4);
        root.left.right = new Node(2);

        int k = 1;

        Solution sol = new Solution();

        int ans = sol.kthSmallest(root, k);

        System.out.println(ans);
    }
}