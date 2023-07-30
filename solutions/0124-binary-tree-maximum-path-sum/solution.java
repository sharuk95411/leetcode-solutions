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

// Take all the path sum and choose between them 
// Cases - All +ve, All -ve, some +ve some -ve
class Solution {
    int maxAll=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {

        A(root);
        return maxAll;        

    }

    public int A(TreeNode root)
    {
        if(root==null) return 0;
        int left= A(root.left);
        int right = A(root.right);
        
        int lpath= root.val+left;
        int rpath= root.val +right;
        int cpath= left+right+root.val;
        int max= Math.max(Math.max(lpath,rpath),Math.max(root.val,cpath));
         maxAll= Math.max(maxAll,max);
        return Math.max(Math.max(lpath,rpath),root.val);
    }
}
