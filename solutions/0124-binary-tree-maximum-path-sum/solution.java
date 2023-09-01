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
    int m=0;
    public int maxPathSum(TreeNode root) {
        if(root.left==null && root.right==null)return root.val;
        A(root);
        return ans;
    }

    public int A(TreeNode root)
    {
        if(root==null)return 0;
        int l= A(root.left);
        int r= A(root.right);
        int lpath= root.val+l;
        int rpath=root.val+r;
        int cpath= l+r+root.val;
        int currmax=Math.max(Math.max(lpath,rpath),Math.max(cpath,root.val));
        ans=Math.max(currmax,ans);
        return Math.max(Math.max(lpath,rpath),root.val);
    }
}
