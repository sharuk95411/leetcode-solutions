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
    private Map < Integer, Integer > map = new HashMap < > ();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
             map.put(inorder[i], i);
         }
         TreeNode root = helper(inorder, 0, inorder.length - 1, preorder, 0, preorder.length - 1);
         return root;
        
    }
     public TreeNode helper(int[] inorder, int inStart, int inEnd, int[] preorder, int preStart, int preEnd) {
         if (preStart > preEnd || inStart > inEnd) {
             return null;
         }
         TreeNode root = new TreeNode(preorder[preStart]);
         int index = map.get(root.val);
         root.left = helper(inorder, inStart , index - 1, preorder, preStart + 1, preStart + index - inStart);  
         root.right = helper(inorder, index + 1, inEnd, preorder, preStart + index - inStart + 1, preEnd);
         return root;
    }
}

