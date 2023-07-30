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
    boolean b= true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        A(p,q);
        return b;
    }
    public void A(TreeNode p, TreeNode q)
    {
        
        if(p==null && q==null) return ;
        else if(p==null || q==null)
        {
            b=false;
            return ;
        }
        else if(p.val!=q.val)
        {
            b=false;
            return ;
        }
        if(b)
        {
            A(p.left,q.left);
            A(p.right,q.right);
        }
        return ;
    }
}
