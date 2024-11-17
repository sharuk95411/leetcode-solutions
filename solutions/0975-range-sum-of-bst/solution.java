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
    private int ans;
    public int rangeSumBST(TreeNode root, int low, int high) {
        
        A(root,low,high);
        return ans;

    }
    public void A(TreeNode n, int low, int high)
    {
        if(n==null) return ;
        if (n.val >= low)
        A(n.left,low,high);
        if(low<=n.val && n.val<=high)
        ans=ans+n.val;
         if (n.val <= high)
        A(n.right,low,high);
    }
}
