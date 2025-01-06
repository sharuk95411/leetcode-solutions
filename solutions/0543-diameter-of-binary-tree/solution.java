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
    int ans=0;
    

    public int diameterOfBinaryTree(TreeNode root) {
        
         A(root);
         return ans;
    }

    public int A(TreeNode root)
    {
        if(root.left==null && root.right==null) return 1;
          int left=0;
          int right=0;
        if(root.left!=null)
        {
            left= A(root.left);
        }
        if(root.right!=null)
        {
             right =A(root.right);
        }
        ans= Math.max(ans,left+right);
        return 1+Math.max(left,right);
         
    }
}
