package codingninja;

import codingninja.helperclass.TreeNode;

import java.util.*;
import java.io.*;

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

// 143. Floor in BST
// https://www.codingninjas.com/studio/problems/floor-in-bst_8230753?challengeSlug=striver-sde-challenge&leftPanelTab=1
public class Solution143 {

    public static int floorInBST(TreeNode<Integer> root, int X) {
        int ans = Integer.MIN_VALUE;
        while (root != null) {
            if (root.data > X) {
                root = root.left;
            } else {
                ans = Math.max(ans, root.data);
                root = root.right;
            }
        }
        return ans == Integer.MIN_VALUE ? -1 : ans;
    }
}