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
    int i=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
     
         return A(preorder,inorder,0,preorder.length-1);
        
    }
    public TreeNode A(int pre[], int in[],int start,int end )
    {
        if(start>end)
        {
         return null;
        }
        
        
       TreeNode n= new TreeNode(pre[i]);
        i++;
        if(start==end)
        {
          return n;
        }
    
        int getInOrderI= get(n.val,in,start,end);
        n.left= A(pre,in,start,getInOrderI-1);
        n.right= A(pre,in,getInOrderI+1,end);
        return n;
        
    }
public int get(int val,int in[],int start,int end)
    {

        for(int j=start;j<=end;j++)
        {
            if(in[j]==val)
            return j;
        }
        return -1;
    }
}
