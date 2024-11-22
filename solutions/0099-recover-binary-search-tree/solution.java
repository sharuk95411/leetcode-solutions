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
    List<Integer>l=new ArrayList<>();
     public void recoverTree(TreeNode root) {
         Add(root);
         Collections.sort(l);
         A(root);
    }

    public void Add(TreeNode root)
    {
        if(root==null) return ;
        Add(root.left);
        Add(root.right);
        l.add(root.val);
        
    }
    public void A(TreeNode root)
    {
        if(root==null) return;
        A(root.left);
            root.val=l.remove(0);
        A(root.right);
    }
}
