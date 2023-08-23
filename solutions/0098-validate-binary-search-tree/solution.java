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
    long no =Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        
        if(root.left==null && root.right==null)return true;
        return A(root);
    }

    public boolean A(TreeNode root)
    {
        if(root==null)return true;
        if(A(root.left)==false) return false;
        if(no>=root.val) return false;
        else no=root.val;
        if(A(root.right)==false) return false;
        return true;
    }
}
