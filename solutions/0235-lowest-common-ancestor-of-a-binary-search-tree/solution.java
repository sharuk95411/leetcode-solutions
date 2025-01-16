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
        
        return A(root,p,q);
    }

    public TreeNode A (TreeNode root, TreeNode p, TreeNode q )
    {
        if(root==null) return null;
        if(root.val==p.val) return p;
        if(root.val==q.val) return q;
        root.left= A(root.left,p,q);
        root.right= A(root.right,p,q);
        if(root.left!=null && root.right!=null) return root;
        else if(root.left==null && root.right==null) return null;
    else if(root.left==null) return root.right;
        else return root.left;
    }
}
