package codingninja;

import codingninja.helperclass.TreeNode;


/*************************************************************

 Following is the Binary Tree Node structure:

 class TreeNode<T> {
 public T data;
 public BinaryTreeNode<T> left;
 public BinaryTreeNode<T> right;

 TreeNode(T data) {
 this.data = data;
 left = null;
 right = null;
 }
 }
 *************************************************************/
// https://www.codingninjas.com/codestudio/problems/diameter-of-binary-tree_8230762?challengeSlug=striver-sde-challenge
// 123. Diameter Of Binary Tree
public class Solution123 {
    public static int diameterOfBinaryTree(TreeNode<Integer> root) {

        int[] max = new int[1];
        if (root == null)
            return 0;
        solve(root, max);
        return max[0];
    }

    private static int solve(TreeNode<Integer> root, int[] max) {
        if (root == null)
            return 1;
        int left = solve(root.left, max);
        int right = solve(root.right, max);
        max[0] = Math.max(left + right, max[0]);
        return 1 + Math.max(left, right);
    }
}