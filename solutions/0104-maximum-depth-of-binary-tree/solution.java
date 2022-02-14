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
    int ans=1;
    public int maxDepth(TreeNode root) {
        
        if(root==null) return 0;
        return A(root,0);
    
    }
    
    private int A(TreeNode root,int temp)
    {
        if(root==null)
            return temp;
        
        int left= A(root.left,temp+1);
        int right= A(root.right,temp+1);
        return Math.max(left,right);
    }
}
