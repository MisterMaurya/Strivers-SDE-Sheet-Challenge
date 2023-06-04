package codingninja;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: [https://www.codingninjas.com/codestudio/problems/inorder-traversal_8230857?challengeSlug=striver-sde-challenge]
 * @author: Pawan Maurya
 */
public class Solution111 {
    public static List<Integer> getInOrderTraversal(TreeNode root) {

        // Write your code here.
        List<Integer> ans = new ArrayList<>();
        solve(ans, root);
        return ans;
    }

    public static void solve(List<Integer> ans, TreeNode root) {
        if (root == null)
            return;
        solve(ans, root.left);
        ans.add(root.data);
        solve(ans, root.right);
    }
}

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.data = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.data = val;
        this.left = left;
        this.right = right;
    }
}