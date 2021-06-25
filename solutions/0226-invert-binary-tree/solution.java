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
    public TreeNode invertTree(TreeNode root) {
        
        TreeNode n1=null;
        TreeNode n2=null;
         if(root==null && root==null) return root;
         if(root.left!=null)  n1= root.left;
         if(root.right!=null) n2= root.right;
         if(root.left==null && root.right!=null) 
         {
             root.left=n2;
             root.right= null;
             
         }
         else if(root.right==null && root.left!=null)
         {
             root.right=n1;
             root.left=null;
         }
         else
         {
             root.left=n2;
             root.right=n1;
         }
        invertTree(root.left);
         invertTree(root.right);
        return root;
    }
}
