package codingninja;

import java.util.*;

/**
 * @description: [https://www.codingninjas.com/codestudio/problems/postorder-traversal_8230858?challengeSlug=striver-sde-challenge&leftPanelTab=1]
 * @author: Pawan Maurya
 */
public class Solution113 {
    public static List<Integer> getPostOrderTraversal(TreeNode root) {
        // Write your code here.
        List<Integer> ans = new ArrayList<>();
        solve(ans, root);
        return ans;
    }

    public static void solve(List<Integer> ans, TreeNode root) {
        if (root == null)
            return;
        solve(ans, root.left);
        solve(ans, root.right);
        ans.add(root.data);
    }
}