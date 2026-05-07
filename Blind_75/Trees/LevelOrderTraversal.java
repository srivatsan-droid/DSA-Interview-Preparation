package Blind_75.Trees;

import java.util.ArrayList;
import java.util.List;

public class LevelOrderTraversal {
    public static void levelOrderRecu(Node root, int level, List<List<Integer>> res) {
        if (root == null)
            return;
        if (res.size() <= level)
            res.add(new ArrayList<>());
        res.get(level).add(root.data);
        levelOrderRecu(root.left, level + 1, res);
        levelOrderRecu(root.right, level + 1, res);
    }

    public static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        levelOrderRecu(root, 0, result);
        return result;
    }

    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);
        List<List<Integer>> result = levelOrder(root);
        for (List<Integer> val : result) {
            System.out.println(val + " ");
        }
        System.out.println();
    }
}
