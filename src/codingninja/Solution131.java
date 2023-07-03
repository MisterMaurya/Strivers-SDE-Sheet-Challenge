package codingninja;

/*
    Following is the Binary Tree node structure:

	class BinaryTreeNode<T> {
	    public T data;
	    public BinaryTreeNode<T> left;
	    public BinaryTreeNode<T> right;

	    BinaryTreeNode(T data) {
	        this.data = data;
	        this.left = null;
	        this.right = null;
	    }
	}
*/

// https://www.codingninjas.com/studio/problems/search-in-bst_8230841?challengeSlug=striver-sde-challenge&leftPanelTab=1
// 131. Search In BST

public class Solution131 {
    public static Boolean searchInBST(BinaryTreeNode<Integer> root, int x) {
        if (root == null)
            return false;

        if (root.data == x)
            return true;

        if (root.data < x) {
            return searchInBST(root.right, x);
        }
        return searchInBST(root.left, x);
    }
}