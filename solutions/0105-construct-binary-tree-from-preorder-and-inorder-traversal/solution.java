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
    int index=0;
    public TreeNode buildTree(int[] pre, int[] in) {
        
        return A(pre,in,0,in.length-1);
    }

    public TreeNode A (int pre[],int in[],int left,int right)
    {
               if(left>right) return null;
               TreeNode n= new TreeNode(pre[index]);
               int position= findRootPosn(in,pre[index]);
               index++;
               n.left= A(pre,in,left,position-1);
               n.right=A(pre,in,position+1,right);
               return n;

    }

    public int findRootPosn(int in[],int element)
    {
        for(int i=0;i<in.length;i++)
        {
            if(in[i]==element) return i;
        }
    return -1;
    }
}

