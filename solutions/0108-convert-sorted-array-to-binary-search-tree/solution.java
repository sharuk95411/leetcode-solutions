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
    public TreeNode sortedArrayToBST(int[] arr) {
        int n= arr.length;
        return A(arr,0,n-1);
    }

    public TreeNode A(int arr[],int left,int right)
    {

        if(left>right) return null;
        int mid= left+(right-left)/2;
        TreeNode n= new TreeNode(arr[mid]);
        n.left= A(arr,left,mid-1);
        n.right= A(arr,mid+1,right);
        return n;
    }
}
