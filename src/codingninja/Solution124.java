package codingninja;

import java.util.*;
import java.io.*;

/*************************************************************

 Following is the Binary Tree node structure

 class BinaryTreeNode<T>
 {
 T data;
 BinaryTreeNode<T> left;
 BinaryTreeNode<T> right;

 BinaryTreeNode(T data) {
 this.data = data;
 left = null;
 right = null;
 }
 };

 // https://www.codingninjas.com/studio/problems/is-height-balanced-binary-tree_8230771?challengeSlug=striver-sde-challenge&leftPanelTab=1
 // 124. Is Height Balanced Binary Tree
 *************************************************************/
public class Solution124 {

    public static boolean isBalancedBT(BinaryTreeNode<Integer> root) {
        int ans = findHeight(root);
        return ans != -1;
    }

    public static int findHeight(BinaryTreeNode<Integer> root) {
        if (root == null)
            return 0;

        int left = findHeight(root.left);
        int right = findHeight(root.right);

        if (left == -1 || right == -1)
            return -1;

        if (Math.abs(left - right) > 1) {
            return -1;
        }

        return 1 + Math.max(left, right);

    }
}
