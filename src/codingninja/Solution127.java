package codingninja;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


class BinaryTreeNode<T> {
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    public BinaryTreeNode(T data) {
        this.data = data;
    }
}


// 127. Binary Tree Zigzag Traversal
// https://www.codingninjas.com/codestudio/problems/binary-tree-zigzag-traversal_8230796?challengeSlug=striver-sde-challenge
public class Solution127 {

    public static List<Integer> zigZagTraversal(BinaryTreeNode<Integer> root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null)
            return ans;

        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);

        boolean zigzag = true;

        while (!queue.isEmpty()) {
            int size = queue.size();
            LinkedList<Integer> inner = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                BinaryTreeNode<Integer> poll = queue.poll();
                if (zigzag) {
                    inner.addLast(poll.data);

                } else {
                    inner.addFirst(poll.data);
                }
                if (poll.left != null)
                    queue.add(poll.left);

                if (poll.right != null)
                    queue.add(poll.right);
            }
            zigzag = !zigzag;
            ans.addAll(inner);
        }
        return ans;
    }
}
