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
    int sum=0;
    public int findTilt(TreeNode root) {
     if(root==null) return sum;
       int set_the_values= A(root);
        B(root);
        return sum;
    }
    
    private int A(TreeNode root)
    {
        if(root==null) return 0;
        if(root.left==null && root.right==null)
        {
            int value= root.val;
            root.val= 0;
            return value;
        }
        
        int left= A(root.left);
        int right= A(root.right);
        int total= left+right+root.val;
        root.val= Math.abs(left-right);
         return total;
    
    }
    private void B(TreeNode root)
    {
        if(root==null) return ;
        B(root.left);
        sum=sum+root.val;
        B(root.right);
        
        
    }
}
