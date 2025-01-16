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
    public TreeNode bstFromPreorder(int[] pre) {
        
        return A(pre,0,pre.length-1);

    }
    public TreeNode A(int pre[],int left,int right)
    {
        if(left>right) return null;
        TreeNode root= new TreeNode(pre[index]);
        // find the elemnt position which less than root so we put left side of root
        int pos= B(pre,pre[index],index+1); 
        index++;
        root.left=A(pre,index,pos);
        root.right=A(pre,pos+1,right);
        return root;
    }


    public int B(int pre[],int a,int index)
    {
        while(index<pre.length)
        {
            if(pre[index]>a) return index-1;
            index++;
        }
        return pre.length-1;
    }
}
