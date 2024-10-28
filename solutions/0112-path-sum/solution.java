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
    Boolean b=false;
    public boolean hasPathSum(TreeNode root, int sum) {
        

        A(root,sum,0);
        return b;
    }

    public void A(TreeNode root,int sum,int a)
    {
        if(root==null) return;
           a=a+root.val;
           if(root.left==null && root.right==null)
           {
               if(a==sum)
               {
                b=true;
                return ;
               }
           }
           A(root.left,sum,a);
           A(root.right,sum,a);
            a=a-root.val;
        //    sum=sum+root.val;
         


    }
}
