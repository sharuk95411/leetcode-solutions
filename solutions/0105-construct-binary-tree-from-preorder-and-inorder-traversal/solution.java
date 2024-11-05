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
    int p=0;//preorder array pointer
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper( 0, inorder.length-1, preorder, inorder);
    }
    public TreeNode helper( int start, int end, int[] preorder, int[] inorder){
        if(start>end) return null;
int j = find(preorder[p], inorder, start, end); //find the root of the present subtree in inorder array
        TreeNode node = new TreeNode(preorder[p]);//create new node of the sub tree
        p++;
        node.left = helper( start, j-1, preorder, inorder);//build left sub tree
        node.right = helper( j+1, end, preorder, inorder);//build right sub tree
        return node;
    }

    public int find(int val, int[] inorder,int start, int end){
         for (int i = start; i <= end; i++) {
            if (inorder[i] == val) return i;
        }
        return -1;
    }
}
