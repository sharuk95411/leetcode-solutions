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
    int t=0;
    int ans=0;
    public int kthSmallest(TreeNode root, int k) {
        A(root,k);
        return ans;
    }
    public void A(TreeNode root,int k)
    {
        if(root==null)return;
        A(root.left,k);
        t=t+1;
        if(t==k)
        {
            ans=root.val;
            return ;
        }
        A(root.right,k);
    }
    
}
