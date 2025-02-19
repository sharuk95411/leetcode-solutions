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
    public TreeNode trimBST(TreeNode root, int low, int high) {
        
        return A(root,low,high);
    }

    public TreeNode A(TreeNode root,int low,int high)
    {
        if(root==null) return null;
        if(root.val<low)
        {
        return A(root.right,low,high);
        }
        if(root.val>high) 
        {
            return A(root.left,low,high);
        }

        if(root.val>=low && root.val<=high)
        {
            root.left= A(root.left,low,high);
            root.right= A(root.right,low,high);
        }
        return root;
    }
}
