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
    public boolean hasPathSum(TreeNode root, int target) {
          
          return A(0,target,root);
    }
     public boolean A(int sum,int target,TreeNode root)
    {
        if(root==null) return false;
        sum=sum+root.val;
        if(sum==target && (root.left==null && root.right==null)) return true;
        return (A(sum,target,root.left) || A(sum,target,root.right));
    

    }
}
