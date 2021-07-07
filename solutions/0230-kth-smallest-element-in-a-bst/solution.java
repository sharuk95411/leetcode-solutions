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
    public int kthSmallest(TreeNode root, int k) {
        
        if(root==null) return 1;
        TreeNode curr= root;
        while(curr!=null)
        {
            TreeNode left= curr.left;
            if(left==null)
            {
                k--;
                if(k==0) return curr.val;
                else curr= curr.right;
            }
            else
            {
                
                TreeNode rightMost= getRightMost(left,curr);
                if(rightMost.right==null) // Make a thread
                {
                    
                 rightMost.right=curr;
                 curr=curr.left;
                }
                else // break the thread
                {
                    rightMost=null;
                    k--;
                    if(k==0) return curr.val;
                    else curr=curr.right;
                }
            }
        }
        return -1;
    }
    public TreeNode getRightMost(TreeNode left,TreeNode curr)
    {
        while(left.right!=null && left.right!=curr)
        {
            left=left.right;
        }
        return left;
    }
}
