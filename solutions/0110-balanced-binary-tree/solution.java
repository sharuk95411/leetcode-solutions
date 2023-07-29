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
    boolean check=true;
    public boolean isBalanced(TreeNode root) {
        
         A(root);
         return check;
    }
    
    public int A(TreeNode root)
    {
        if(root==null) return 0;
        int h1= A(root.left);
        int h2= A(root.right);
        if(Math.abs(h1-h2)>1) 
        {
            check=false;
            return 0;
        }
        if(check)
        {
         return Math.max(h1,h2)+1;
        }
        return 0 ; /* This is Formality purpose because hme end me kuch na kuch to return krna h and ye hmre koi use ka ni h */
      
    }

}
