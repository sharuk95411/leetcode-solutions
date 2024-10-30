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
    Boolean b= true;
    public boolean isBalanced(TreeNode root) {
        
        A(root);
        return b;
    }

    public int A(TreeNode root)
    {
        if(root==null) return 0;
        int left= A(root.left);
        int right= A(root.right);
        if(Math.abs(left-right)>1)
        {
            b=false;
            return Math.max(left,right);
        }
        // if(b)
        // return 1+Math.max(left,right);
        // return 0;
         return 1+Math.max(left,right);
    }
}
