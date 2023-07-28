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

    public TreeNode sortedArrayToBST(int[] nums) {
        
        int l=0;
        int r=nums.length-1;
        return A(l,r,nums.length,nums); 
    }


    public TreeNode A(int l, int r,int n,int arr[])
    {
      if(r<l)return null;
      int mid= l+(r-l)/2;
       TreeNode root=new TreeNode(arr[mid]);
        root.left= A(l,mid-1,n,arr);
        root.right= A(mid+1,r,n,arr);
     return root;

    }
}
