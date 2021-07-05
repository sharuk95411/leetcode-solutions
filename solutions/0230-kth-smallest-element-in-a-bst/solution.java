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
// TC O(h+k) and Space C O(h) bcz reursiin call ho rha h 
class Solution {
    private int numElements = 0;
    private int kthSmallest = 0;
    public int kthSmallest(TreeNode root, int k) {
          helper(root, k);
        return kthSmallest;
    }
     private void helper(TreeNode root, int targetCount) {
        if (root == null) return;
        
        helper(root.left, targetCount);
        if (++numElements == targetCount) { //++ pehle lgne se value 1 increaemnt ho jti h thn check hta h and ye value phr whi rhti h 
            kthSmallest = root.val;
            return;
        }
        helper(root.right, targetCount);
    } 
}
