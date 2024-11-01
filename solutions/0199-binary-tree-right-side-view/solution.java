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
    List<Integer>ans= new ArrayList<>();
    List<Integer>l= new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {

        A(root,0);
        return ans;
    }
    public void A(TreeNode root,int height)
    {
        if(root==null) return ;
        if(l.contains(height)==false)
        {
            ans.add(root.val);
            l.add(height);
        }
        A(root.right,height+1);
        A(root.left,height+1);
    }
}
