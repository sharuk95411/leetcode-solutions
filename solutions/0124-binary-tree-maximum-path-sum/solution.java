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
    public int maxPathSum(TreeNode root) {
        int ans[]= new int[1];
        ans[0]= Integer.MIN_VALUE;
        A(root,ans);
        return ans[0];
    }
    
    private int A(TreeNode root,int ans[])
    {
        if(root==null) return 0;
        
        int left_path_sum= Math.max(0,A(root.left,ans));
        int right_path_sum= Math.max(0,A(root.right,ans));
        
        ans[0]= Math.max(ans[0],root.val+left_path_sum+right_path_sum);
        
        return root.val+Math.max(left_path_sum,right_path_sum);
    }
}
