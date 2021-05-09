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
   int baseLevel= 0;
    public List<Integer> rightSideView(TreeNode root) {
        
        
        List<Integer>l= new ArrayList<>();
        if(root==null) return l;
        return fun(root,1,l);
        
    }
     List<Integer> fun(TreeNode root,int level,List<Integer>l)
    {
        if(root==null)
        {
            return l;
        }
        else if(level>baseLevel)
        {
            l.add(root.val);
            baseLevel= level;
        }
        fun(root.right,level+1,l);
        fun(root.left,level+1,l);
        return l;
        
    }
}
