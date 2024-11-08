/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //base case
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        //thats mean p and q are lies are different sides
        if(left!=null && right!= null) {
            return root;
        }
        // thats mean same branch me same path me h 
        else if(left == null) {
            return right;
        }
        // thats mean same branch me same path me h  
        else {
            return left;
        }
    }
}
