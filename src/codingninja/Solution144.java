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
//144. Ceil from BST
// https://www.codingninjas.com/studio/problems/ceil-from-bst_8230754?challengeSlug=striver-sde-challenge&leftPanelTab=0
public class Solution144 {


    public static int findCeil(TreeNode<Integer> node, int x) {
        int ans = Integer.MAX_VALUE;

        while (node != null) {
            if (node.data == x)
                return x;
            if (node.data < x) {
                node = node.right;
            } else {
                ans = Math.min(ans, node.data);
                node = node.left;
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
