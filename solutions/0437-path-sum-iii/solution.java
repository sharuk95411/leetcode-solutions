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
    int count=0;
    ArrayList<Integer>l= new ArrayList<>();
    public int pathSum(TreeNode root, int targetSum) {
       
        if(root==null) return 0;
        
        l.add(root.val);
        pathSum(root.left,targetSum);
        pathSum(root.right,targetSum);
        
        int sum=0;
        for(int i= l.size()-1;i>=0;i--)
        {
            sum= sum+l.get(i);
            if(sum==targetSum)
            {
             count++;
            }
        }
            l.remove(l.size()-1);
        
        
        return count;
    }
}
