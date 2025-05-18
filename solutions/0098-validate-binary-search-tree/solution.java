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
    long min =Long.MIN_VALUE;
    boolean b=true;
    public boolean isValidBST(TreeNode root) {
        
        A(root);
        return b;
    }
    public void A(TreeNode root)
    {
        if(root==null) return ;

        A(root.left);
        if(min>=root.val)
        {
            b=false;
            return ;
        }
      else  min= root.val;
        A(root.right);
    }
}
