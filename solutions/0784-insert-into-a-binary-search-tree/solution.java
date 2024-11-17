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
    public TreeNode insertIntoBST(TreeNode root, int val) {

        A(root,val);
        if(root==null) return new TreeNode(val);
        return root;
    }
    public int A(TreeNode root,int val)
    {
        if(root==null) return 0;
        if(val>root.val)
        {
            if(A(root.right,val)==0)
            root.right=new TreeNode(val);
        }
        else
        {
              if(A(root.left,val)==0)
              root.left=new TreeNode(val);
        }
        return -1;
       
    }
}
