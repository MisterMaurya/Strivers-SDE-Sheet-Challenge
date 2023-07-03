package codingninja;

/*****************************************************************

 Following is the representation for the Binary Tree Node:

 class BinaryTreeNode<T> {
 T data;
 BinaryTreeNode<T> left;
 BinaryTreeNode<T> right;

 public BinaryTreeNode(T data) {
 this.data = data;
 }
 }
 ****************************************************************/

// https://www.codingninjas.com/studio/problems/symmetric-tree_8230686?challengeSlug=striver-sde-challenge&leftPanelTab=2
// 132. Symmetric Tree
public class Solution132 {

    public static boolean isSymmetric(BinaryTreeNode<Integer> root) {

        if (root == null)
            return true;
        return isSymmetric(root.left, root.right);
    }

    public static boolean isSymmetric(BinaryTreeNode<Integer> first, BinaryTreeNode<Integer> second) {
        if (first == null || second == null)
            return first == second;

        if (!first.data.equals(second.data))
            return false;

        return isSymmetric(first.left, second.right) && isSymmetric(first.right, second.left);

    }
}