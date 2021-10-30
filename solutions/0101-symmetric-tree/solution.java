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
    public boolean isSymmetric(TreeNode root) {
        
        if(root==null) return true;
        
        return A(root.left,root.right);
        
        
        
    }
    private boolean A( TreeNode root1,TreeNode root2)
    {
     if( root1==null && root2==null)  return true;
        
    if(root1==null || root2==null) return false;
        
        
        if(root1.val==root2.val)
        {
            return (A(root1.left,root2.right) && A(root1.right,root2.left));
        }
        else
             return false;
        
    }
}
