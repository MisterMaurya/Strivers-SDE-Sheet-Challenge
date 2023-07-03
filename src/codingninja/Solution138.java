package codingninja;

import codingninja.helperclass.TreeNode;

import java.util.ArrayList;

/****************************************************************

 Following is the class structure of the TreeNode class:

 class TreeNode<T> {
 public T data;
 public TreeNode<T> left;
 public TreeNode<T> right;

 TreeNode(T data) {
 this.data = data;
 left = null;
 right = null;
 }
 }


 *****************************************************************/
// https://www.codingninjas.com/studio/problems/convert-sorted-array-to-bst_8230836?challengeSlug=striver-sde-challenge&leftPanelTab=1
// 138. Convert Sorted Array to BST
public class Solution138 {
    public static TreeNode<Integer> sortedArrToBST(ArrayList<Integer> arr, int n) {
        int low = 0;
        int high = n - 1;
        return solve(low, high, arr);
    }

    public static TreeNode<Integer> solve(int low, int high, ArrayList<Integer> arr) {
        if (low > high)
            return null;
        int mid = low + (high - low) / 2;
        TreeNode<Integer> node = new TreeNode(arr.get(mid));
        node.left = solve(low, mid - 1, arr);
        node.right = solve(mid + 1, high, arr);
        return node;
    }
}