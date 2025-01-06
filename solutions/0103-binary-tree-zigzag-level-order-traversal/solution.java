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

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        if(root==null) return ans;
        List<Integer>a= new ArrayList<>();
        a.add(root.val);
        ans.add(new ArrayList<>(a));
        int level=0;
        Queue<TreeNode>q= new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            List<Integer>inner= new ArrayList<>();
            int size=q.size();
             while(size>0)
            {

            TreeNode node= q.poll();
            if(level%2==0)
            {
                if(node.right!=null)
                {
                    q.add(node.right);
                    inner.add(node.right.val);
                }
                
            
                if(node.left!=null) 
                {
                        q.add(node.left);
                        inner.add(node.left.val);
                } 
            }
            else
            {
                 if(node.right!=null)
                {
                    q.add(node.right);
                    inner.add(0,node.right.val);
                }
                
            
                if(node.left!=null) 
                {
                        q.add(node.left);
                        inner.add(0,node.left.val);
                } 

            }
         size--;

             }
             level++;
             if(inner.size()>0)
             ans.add(new ArrayList<>(inner));

        }
        return ans;
    }

}
