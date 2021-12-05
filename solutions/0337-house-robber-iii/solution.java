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
    Map<TreeNode,Integer>h= new HashMap<>();
    public int rob(TreeNode root) {
        if(root==null) return 0;
        
        if(h.containsKey(root)) return h.get(root);
        
        int ans=root.val;
        if(root.left!=null) ans+=rob(root.left.left)+rob(root.left.right);
        if(root.right!=null) ans+= rob(root.right.left)+rob(root.right.right);
        
        int skip=rob(root.left)+rob(root.right);
        
        h.put(root, Math.max(ans,skip));
        return h.get(root);
    }
}
