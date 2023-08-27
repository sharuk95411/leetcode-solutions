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

List<List<Integer>>outer= new ArrayList<>();
    Queue<TreeNode>q= new LinkedList<>();
     if(root==null)return outer;
        q.add(root);
        int i=0;
        while(q.size()>0)
        {
            int size=q.size();
            List<Integer>inner= new ArrayList<>();
            while(size>0)
            {
                TreeNode n=q.poll();
                
                if(i%2==0)
                {
                    inner.add(n.val);
                    if(n.left!=null)q.add(n.left);
                    if(n.right!=null)q.add(n.right);
                }
                else
                {
                         inner.add(0,n.val);
                         if(n.left!=null)q.add(n.left);
                         if(n.right!=null)q.add(n.right);
                }
                size--;
            }
            outer.add(new ArrayList<>(inner));
            i++;
        }
     return outer;   
    }
}
