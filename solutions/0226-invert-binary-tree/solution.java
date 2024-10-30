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
        
        A(root);
        return root;
    }

    public void A(TreeNode root)
    {
        if(root==null) return ;

        TreeNode temp= root.left;
        root.left=root.right;
        root.right= temp;
        A(root.left);
        A(root.right);
    }
}
