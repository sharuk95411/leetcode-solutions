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

List<List<Integer>>ans= new ArrayList<>();
List<Integer>inner=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        A(root,0,targetSum);
        return ans;

    }

    public void A(TreeNode root,int target,int sum)
    {
        if(root==null) return ;
        inner.add(root.val);
         A(root.left,target+root.val,sum);
         A(root.right,target+root.val,sum);
         if((root.left==null && root.right==null)&&(target+root.val==sum))
        {
                 ans.add(new ArrayList<>(inner));
        }
        inner.remove(inner.size()-1);
        
    }
}






























































