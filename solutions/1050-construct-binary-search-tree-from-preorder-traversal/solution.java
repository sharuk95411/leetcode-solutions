/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
// Solution by https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/discuss/252232/JavaC%2B%2BPython-O(N)-Solution
//ye lee215 ka solution h and iske sre solution awesome hte h

class Solution {
    int i=0;
    public TreeNode bstFromPreorder(int[] preorder) {
        return bstFromPreorder(preorder, Integer.MAX_VALUE);
    }
    
    public TreeNode bstFromPreorder(int[] A, int bound) {
        if (i == A.length || A[i] > bound) return null;
        TreeNode root = new TreeNode(A[i++]);
        root.left = bstFromPreorder(A, root.val);
        root.right = bstFromPreorder(A,bound);
        return root;
    }

}
