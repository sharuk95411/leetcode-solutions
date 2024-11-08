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
    Queue<TreeNode>q= new LinkedList<>();
    public void flatten(TreeNode root) {
        A(root);
        if(root==null) return ;
        System.out.println("SIZE "+q.size());
        root.right=null;
        root.left=null;
        q.remove();
    while(!q.isEmpty())
    {
        TreeNode n= q.remove();
        n.left=null;
        n.right=null;
        root.right=n;
        root=root.right;
    }
    }

    public void A(TreeNode root)
    {
        if(root==null) return ;
        q.add(root);
        A(root.left);
        A(root.right); 
    }
}
