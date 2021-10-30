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
    public List<List<Integer>> levelOrder(TreeNode root) {
        // logic int Notes
        Queue<TreeNode> q= new LinkedList<>();
        List<List<Integer>>l2= new ArrayList<>();
        List<Integer>l1= new ArrayList<>();
        if(root==null) return l2;
    l1.add(root.val);
      l2.add(l1);
        q.add(root);
            while(q.size()>0)
            {
                l1= new ArrayList<>();
                int val= q.size();
                for(int i=0;i<val;i++)
                {
                TreeNode n= q.poll();
                if(n.left!=null)
                {
                    l1.add(n.left.val);
                    q.add(n.left);
                    
                }
                if(n.right!=null)
                {
                    l1.add(n.right.val);
                    q.add(n.right);
                }
                }
                if(l1.size()>0)
                l2.add(l1);
            }
        return l2;
    }
}
