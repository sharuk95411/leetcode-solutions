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

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode>q= new LinkedList<>();
        List<List<Integer>>outer= new ArrayList<>();
        List<Integer>inner=new ArrayList<>();
        if(root==null)return outer;
        int level=0;
        
        q.add(root);
        while(q.size()>0)
        {
            int size=q.size();
            inner=new ArrayList<>();
            while(size>0)
            {
                TreeNode n= q.poll();
                if(level%2==0) inner.add(n.val);
                else inner.add(0,n.val);
                 if(n.left!=null)  q.add(n.left);
                  if(n.right!=null)q.add(n.right);
                size--;
            }
            outer.add(new ArrayList<>(inner));
            level++;
        }
        return outer;

    }
}
