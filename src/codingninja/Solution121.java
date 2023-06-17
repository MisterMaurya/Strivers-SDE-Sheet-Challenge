package codingninja;

import codingninja.helperclass.BinaryTreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// 121. Level Order Traversal
// https://www.codingninjas.com/codestudio/problems/level-order-traversal_8230716?challengeSlug=striver-sde-challenge
public class Solution121 {

    public static ArrayList<Integer> getLevelOrder(BinaryTreeNode<Integer> root) {

        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) return ans;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                BinaryTreeNode poll = queue.poll();
                ans.add((Integer) poll.val);
                if (poll.left != null) {
                    queue.add(poll.left);
                }
                if (poll.right != null) {
                    queue.add(poll.right);
                }
            }
        }
        return ans;
    }
}