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
    public TreeNode buildTree(int[] pre, int[] in) {
        
        return A(pre,in,0,0,in.length-1);
    }
    
    public TreeNode A(int pre[], int in[], int pre_index,int start,int end)
    {
        if(start>end)return null;

        TreeNode n= new TreeNode(pre[pre_index]);
        int in_index= find(in,start,end,pre[pre_index]);
        int left_tree_size= in_index-start;
        n.left= A(pre,in,pre_index+1,start,in_index-1);
        n.right= A(pre,in,pre_index+left_tree_size+1,in_index+1,end);
        return n;
    }
    public int find(int in[],int start,int end,int key)
    {
        for(int i=start;i<=end;i++)
        {
            if(in[i]==key)return i;
        }
        return -1;
    }
}
