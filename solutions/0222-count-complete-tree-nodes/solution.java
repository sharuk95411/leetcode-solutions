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
        
        if(root==null)return 0;
        int lh=A(root);
        int rh=B(root);
        // System.out.println("LH AND RH " +lh +" "+rh);
        if(lh==rh)
        {

            
            return (int)(Math.pow(2, lh)-1);
        }
        else
        return 1+countNodes(root.left)+countNodes(root.right);
    }

    public int A(TreeNode n)
    {

        int h=0;
        while(n!=null)
        {
        h=h+1;
        n=n.left;

        }
        return h;
    }
     public int B(TreeNode n)
    {

        int h=0;
        while(n!=null)
        {
        h=h+1;
            n=n.right;

        }
        return h;
    }
}
