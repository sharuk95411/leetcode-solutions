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
    List<Integer>list= new ArrayList<>();
    int base_level=-1;
    public List<Integer> rightSideView(TreeNode root) {

        A(root,0);
        return list;

    }
    public void A(TreeNode root,int curr_level)
    {
        if(root==null) return ;
        if(curr_level>base_level)
        {
             base_level=curr_level;
            list.add(root.val);
        }
           
        A(root.right,curr_level+1);
        A(root.left,curr_level+1);


    }
}
