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

    public int countNodes(TreeNode root) {
        
        return A(root);
    }

    public int A(TreeNode root)
    {
        if(root==null) return 0;

        int left= Left(root.left);
        int right= Right(root.right);
        if(left==right)
        {
            return (int)Math.pow(2,left+1)-1;
        }
        else
        {
            return A(root.left)+A(root.right)+1;
        }
        
    }

    public int Left(TreeNode root)
    {
        if(root==null) return 0;
        return 1+Left(root.left);
    }
    public int Right(TreeNode root)
    {
        if(root==null) return 0;
        return 1+Right(root.right);
    }
}
