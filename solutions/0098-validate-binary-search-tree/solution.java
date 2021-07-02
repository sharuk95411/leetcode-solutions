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
    Stack<Integer>s= new Stack<>();
    public boolean isValidBST(TreeNode root) {
        
         if(root==null) 
        {
            return true;
        }
        
       if(isValidBST(root.left)==false) return false;
        if(s.size()==0)
        {
            s.push(root.val);
        }
        else if(root.val<=s.peek()) return false;
        else
        {
            s.push(root.val);
        }
         return isValidBST(root.right);
         
    }
}
