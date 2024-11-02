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

    public List<List<Integer>> levelOrder(TreeNode root1) {
        
        List<List<Integer>>ans= new ArrayList<>();
        if(root1==null) return ans;
        
        Queue<TreeNode>q= new LinkedList<>();
        

        q.add(root1);
        while(!q.isEmpty())
        {
            int size= q.size();
            List<Integer>inner = new ArrayList<>();
            while(size>0)
            {
                 TreeNode root= q.poll();
                 inner.add(root.val);
                 if(root.left!=null) q.add(root.left);
                 if(root.right!=null) q.add(root.right);
                 size--;
            }
            ans.add(new ArrayList<>(inner));
        }
        return ans;

    }
}
