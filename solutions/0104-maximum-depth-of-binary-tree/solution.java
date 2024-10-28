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
    int ans=Integer.MIN_VALUE;
    public int maxDepth(TreeNode root) {
         
         A(root,0);
         return ans;
    }

    public void A(TreeNode root,int h)
    {

      if(root==null)
      {
        ans=Math.max(h,ans);
        return ;
      }
      A(root.left,h+1);
      A(root.right,h+1);

    }
}
