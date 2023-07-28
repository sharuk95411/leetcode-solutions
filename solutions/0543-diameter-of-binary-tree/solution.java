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
class Solution {
    int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
          A(root);
        return max-1;

    }
    public int A(TreeNode root)
    {
        int h=0;
        if(root==null) return 0;
        int left= A(root.left);
        int right =A(root.right);
         max=Math.max(1+left+right,max);
         return 1+Math.max(left,right);
    }
}
