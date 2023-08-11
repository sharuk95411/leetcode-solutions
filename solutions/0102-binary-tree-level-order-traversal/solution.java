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
    List<List<Integer>>outer= new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
      
      if(root==null)return outer;
      Queue<TreeNode> q= new LinkedList<>();
      q.add(root);
      int size=0;
      while(q.size()>0)
      {
          size=q.size();
          List<Integer>inner= new ArrayList<>();
          while(size>0)
          {
            TreeNode n=q.poll();
            inner.add(n.val);
            if(n.left!=null)q.add(n.left);
            if(n.right!=null)q.add(n.right);
            size--;
            
          }
          outer.add(new ArrayList<>(inner));
      }
      return outer;

    }
}
