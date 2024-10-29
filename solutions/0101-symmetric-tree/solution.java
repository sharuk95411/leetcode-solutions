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
    Boolean b=true;
    public boolean isSymmetric(TreeNode root) {
        
       A(root.left,root.right);
       return b;

    }
    public void A(TreeNode root1,TreeNode root2)
    {
        if(root1==null & root2==null) return;
        else if((root1==null & root2!=null)|| root1!=null & root2==null) 
        {
            b=false;
            return;
        } 
        else if(root1.val!=root2.val) 
        {
            b=false;
            return ;
        }
         else
         A(root1.left,root2.right);
         A(root1.right,root2.left);


        
    }
}
