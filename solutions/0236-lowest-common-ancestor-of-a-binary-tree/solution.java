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
        
        return A(root,p.val,q.val);
    }
    public TreeNode A(TreeNode root, int a,int b)
    {
        if(root==null || root.val==a || root.val==b) return root;

        TreeNode left= A(root.left,a,b);
        TreeNode right= A(root.right,a,b);

        if(left==null)return right;
        else if(right==null)return left;
        else return root;
    }
}
