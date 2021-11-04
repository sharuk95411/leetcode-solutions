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
    public int sumOfLeftLeaves(TreeNode root) {
        
         if(root==null) return 0;
         return A(root,false);
        
    }
    
    private int A(TreeNode root,boolean b)
    {
        if(root==null) return 0;
        if(root.left==null && root.right==null)
        {
      if(b==true) return root.val;
        else return 0;
        }
        return A(root.left,true)+A(root.right,false);
        
            
    }
}
