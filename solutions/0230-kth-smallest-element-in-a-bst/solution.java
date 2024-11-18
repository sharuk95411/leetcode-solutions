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
    private int ans;
    Boolean b=false;
    private int a;
    public int kthSmallest(TreeNode root, int k) {
        a=k;
        A(root,k);
        return ans;
    }
    public void A(TreeNode root,int k)
    {
        if(root==null) return  ;
         
       A(root.left,k);
        a--;
        if(a==0 && b==false) 
        {
            ans=root.val;
            b=true;
        }
        A(root.right,k);
        
    }
}
