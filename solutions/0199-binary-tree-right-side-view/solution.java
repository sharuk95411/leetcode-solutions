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
    int baseLevel= 0;
   List<Integer>l= new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
     A(root,1);
        return l;
    }
     public void A(TreeNode root,int currLevel)
    {
        if(root==null) return ;
        if(currLevel>baseLevel)
        {
            l.add(root.val);
            baseLevel=currLevel;
        }
         A(root.right,currLevel+1);
        A(root.left,currLevel+1);
       
    }
}
