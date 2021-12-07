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
    int max_level=0;
    int sum=0;
    public int deepestLeavesSum(TreeNode root) {
        if(root==null) return 0;
         A(1,root);
        return sum;
    }
    
    private void A(int level,TreeNode root)
    {
        if(root==null) return;
        if(root.left==null && root.right==null)
        {
            if(level>max_level)
            {
                max_level=level;
                sum= root.val;
            }
            else if(level<max_level)
            {
             return ;   
            }
            else if(level==max_level)
            {
                sum= sum+root.val;
            }
        }
        A(level+1,root.left);
        A(level+1,root.right);
        
        
    }
}
