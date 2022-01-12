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
    // Logic- Self
    public TreeNode insertIntoBST(TreeNode root, int val) {
     
        if(root==null) 
        {
        TreeNode n= new TreeNode(val);
            return n;
        }
       boolean b= A(root,val);
        return root;
    }
    private boolean A(TreeNode root,int val)
    {      
        if(root==null) return  true;
        if(val>root.val)
        {
            if(A(root.right,val))
            {
                TreeNode n= new TreeNode(val);
                root.right=n;
                return false;
                
            }
        }
        else
        {
            if(A(root.left,val))
            {
                 TreeNode n= new TreeNode(val);
                root.left= n;
                return false;
            }
        }
        return false;
  
    }
}
