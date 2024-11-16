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
    TreeNode n= null;
    public TreeNode searchBST(TreeNode root, int val) {
        
         A(root,val);
        return n;
    }

    public void A(TreeNode root,int val)
    {
               if(root==null) return ;
            else if(root.val==val)
            {
                n= root;
                return ;
            }
            else if(val>root.val) A(root.right,val);
            else A(root.left,val);
    }

}
