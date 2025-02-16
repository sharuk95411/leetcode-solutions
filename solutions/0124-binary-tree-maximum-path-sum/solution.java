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
    public int maxPathSum(TreeNode root) {
         A(root);
         return ans;
    }

    public int A(TreeNode root)
    {
        if(root==null)return 0;
        int lpath= root.val+A(root.left);
        int rpath= root.val+A(root.right);

        int cpath= lpath+rpath-root.val;
        int temp=Math.max(Math.max(lpath,rpath),Math.max(cpath,root.val));
        ans=Math.max(ans,temp);

        return Math.max(Math.max(lpath,rpath),root.val);
    }
}
