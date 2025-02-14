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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        return A(preorder,inorder,0,inorder.length);
    }

    public TreeNode A(int pre[],int in[],int left,int right)
    {
        if(left>=right) return null;
         
         int mid= getMid(pre[index],in);
         TreeNode n= new TreeNode(pre[index]);
         index++;
         n.left= A(pre,in,left,mid);
         n.right= A(pre,in,mid+1,right);
         return n;
         
    }

    public int getMid(int val,int in[])
    {
        int i=0;
        while(i<in.length)
        {
            if(in[i]==val) return i;
            i++;
        }
        return -1;

    }
}
