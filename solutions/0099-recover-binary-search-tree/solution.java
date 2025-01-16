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
   TreeNode first,second,p;
      long prev =Long.MIN_VALUE;
       Boolean b=true;
    public void recoverTree(TreeNode root) {
         
         A(root);
         int temp= first.val;
         first.val= second.val;
         second.val= temp;
         

    }

    public void A(TreeNode root)
    {
        if(root==null) return ;
        A(root.left);
        int current = root.val;
        if(current>prev)
        {
            prev= current;
            p=root;
        }
        else
        {     
            second= root;
            if(b)
            {
              first=p;
              b=false;
            }  
              prev= current;
        }
        A(root.right);
    }
}
