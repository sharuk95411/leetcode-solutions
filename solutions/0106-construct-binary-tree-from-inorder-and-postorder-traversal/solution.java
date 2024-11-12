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

int n;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
            n= inorder.length-1;
            return A(0,inorder.length-1,inorder,postorder);
    }
    public TreeNode A(int left,int right,int in[],int post[])
    {
                 if(left>right) return null;
                 TreeNode node= new TreeNode(post[n]);
        
                 int Mid= mid(post[n],in);   
                 n--;
                 node.right= A(Mid+1,right,in,post);
                 node.left= A(left,Mid-1,in,post);
                 
                 return node; 
    }
   
   public int mid(int a,int in[])
   {
         for(int i=0;i<in.length;i++)
         {
            if(in[i]==a) return i;
         }
         return -1;
   }
    
}
