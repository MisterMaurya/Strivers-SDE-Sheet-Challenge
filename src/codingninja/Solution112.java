package codingninja;


/**
 * @description: [https://www.codingninjas.com/codestudio/problems/preorder-traversal_8230856?challengeSlug=striver-sde-challenge&leftPanelTab=1]
 * @author: Pawan Maurya
 */
import java.util.*;

public class Solution112 {
    public static List<Integer> getPreOrderTraversal(TreeNode root) {
        // Write your code here.
        List<Integer> ans = new ArrayList<>();
        solve(ans, root);
        return ans;
    }

    public static void solve(List<Integer> ans, TreeNode root) {
        if (root == null)
            return;
        ans.add(root.data);
        solve(ans, root.left);
        solve(ans, root.right);
    }
}