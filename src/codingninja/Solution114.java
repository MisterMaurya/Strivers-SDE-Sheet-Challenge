package codingninja;

import codingninja.helperclass.TreeNode;

import java.util.ArrayList;

/**
 * @description: [https://www.codingninjas.com/codestudio/problems/left-view-of-a-binary-tree_8230757?challengeSlug=striver-sde-challenge&leftPanelTab=1]
 * @author: Pawan Maurya
 */

//  114. Left View Of a Binary Tree
public class Solution114 {
    public static ArrayList<Integer> getLeftView(TreeNode<Integer> root) {
        ArrayList<Integer> ans = new ArrayList<>();
        leftView(ans, root, 0);
        return ans;
    }

    public static void leftView(ArrayList<Integer> ans, TreeNode<Integer> root, int size) {
        if (root == null)
            return;

        if (size == ans.size()) {
            ans.add(root.data);
        }
        leftView(ans, root.left, size + 1);
        leftView(ans, root.right, size + 1);

    }
}