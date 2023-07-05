package codingninja;

import java.util.*;
import java.io.*;

/************************************************************

 Following is the Tree node structure

 class TreeNode {
 int data;
 TreeNode left;
 TreeNode right;

 TreeNode(int data) {
 this.data = data;
 this.left = null;
 this.right = null;
 }

 }
 ************************************************************/

// 129. Maximum Path Sum Between Two Leaves
// https://www.codingninjas.com/studio/problems/maximum-path-sum-between-two-leaves_8230713?challengeSlug=striver-sde-challenge&leftPanelTab=0
public class Solution129 {

    static int countLeaf = 0;

    public static long findMaxSumPath(TreeNode root) {

        long ans[] = new long[1];
        ans[0] = -1;
        findMaxSumPath(root, ans);
        //System.out.println("countLeafX : "+countLeaf);
        long res = countLeaf == 1 ? -1 : ans[0];
        countLeaf = 0;
        return res;
    }


    public static long findMaxSumPath(TreeNode root, long ans[]) {
        if (root == null)
            return 0L;

        if (root.left == null && root.right == null) {
            countLeaf++;
        }

        long left = findMaxSumPath(root.left, ans);
        //System.out.println("countLeaf : "+countLeaf);
        long right = findMaxSumPath(root.right, ans);

        int val = root.data;
        ans[0] = Math.max(ans[0], left + right + val);

        return val + Math.max(left, right);
    }
}