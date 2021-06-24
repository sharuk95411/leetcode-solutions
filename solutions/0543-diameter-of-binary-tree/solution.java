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
     public int longestPath = 0;
    public int diameterOfBinaryTree(TreeNode root) {
         longestPath(root);
        return longestPath;
    }
     public int longestPath(TreeNode root){
        if(root == null){
            return 0;
        }
        
        int lheight = longestPath(root.left);
        int rheight = longestPath(root.right);
        
        longestPath = Math.max(longestPath, lheight + rheight);
        
        return Math.max(lheight, rheight) + 1;
    }
}
