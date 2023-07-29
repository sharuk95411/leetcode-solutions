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
    public TreeNode mergeTrees(TreeNode r1, TreeNode r2) {
        
        return A(r1,r2);
    }
    public TreeNode A(TreeNode r1, TreeNode r2)
    {
        // if(r1==null && r2==null) return null;
         if(r1!=null && r2!=null)
        {
            r1.val= r1.val+r2.val;
            r1.left=A(r1.left,r2.left);
            r1.right= A(r1.right,r2.right);
        }
        else if (r1==null && r2!=null) return r2;
        return r1;
    }
}
