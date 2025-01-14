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

int ans=-2147483648;
boolean b=true;
boolean first=true;
    public boolean isValidBST(TreeNode root) {
        
        if(root.left==null && root.right==null) return true;
     A(root);
     return b;
    }

    public void A(TreeNode root)
    {
        if(root==null) return ;
        A(root.left);
        int a= root.val;
        if(first) 
        {
          first=false;
          ans=a;
        }
        else
        {
            if(ans>=a)
            {
                b=false;
                return;
            }
            else
             ans=a;
        }
       
        A(root.right);

    }
}
