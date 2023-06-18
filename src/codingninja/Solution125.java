package codingninja;

import codingninja.helperclass.TreeNode;

/************************************************************

 Following is the TreeNode class structure

 class TreeNode<T>
 {
 public:
 T data;
 TreeNode<T> left;
 TreeNode<T> right;

 TreeNode(T data)
 {
 this.data = data;
 left = null;
 right = null;
 }
 };
 ************************************************************/

// 125. LCA Of Binary Tree
// https://www.codingninjas.com/codestudio/problems/lca-of-binary-tree_8230760?challengeSlug=striver-sde-challenge&leftPanelTab=0
public class Solution125 {
    public static int lowestCommonAncestor(TreeNode<Integer> root, int x, int y) {
        if (root == null) {
            return -1;
        }

        if (root.data == x) return x;
        if (root.data == y) return y;

        int left = lowestCommonAncestor(root.left, x, y);
        int right = lowestCommonAncestor(root.right, x, y);

        if (left != -1 && right != -1)
            return root.data;
        if (left == -1)
            return right;
        else
            return left;
    }
}
