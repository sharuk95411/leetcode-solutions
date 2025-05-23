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
    int temp=0;
    public int kthSmallest(TreeNode root, int k) {
        temp=k;
        A(root);
        return ans;
    }
    public void A(TreeNode root)
    {
        if(root==null) return ;
        A(root.left);
        temp--;
        if(temp==0)
        {
            ans= root.val;
            return ;
        }
        A(root.right);
    }
}
