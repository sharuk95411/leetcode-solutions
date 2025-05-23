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

    public List<Integer> rightSideView(TreeNode root) {
         
         List<Integer>ans =new ArrayList<>();
          if(root==null) return ans;
         Queue<TreeNode>q= new LinkedList<>();
         q.add(root);

         while(!q.isEmpty())
         {
            int size=q.size();
            ans.add(q.peek().val);
            while(size>0)
            {
                TreeNode n= q.poll();
                if(n.right!=null) q.add(n.right);
                if(n.left!=null) q.add(n.left);
                size--;
            }
         }
         return ans;
    }
}
