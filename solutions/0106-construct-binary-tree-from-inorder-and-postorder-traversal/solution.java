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
    int index;
    public TreeNode buildTree(int[] in, int[] post) {
        index=in.length-1;
        return A(0,in.length-1,in,post);
    }
    public TreeNode A (int left,int right,int in[],int post[])
    {
        if(left>right) return null;

        TreeNode root= new TreeNode(post[index]); 
        int pos= B(in,post[index]);
        index--;
        root.right= A(pos+1,right,in,post);
        root.left= A(left,pos-1,in,post);
        
        return root;
    }

    public int B(int in[],int element)
    {
        for(int i=0;i<in.length;i++)
        {
            if(in[i]==element) return i;
        }
        return -1;
    }
}
