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
      List<List<Integer>>l= new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       
        
        if(root==null) return l ;
        B(root,1);
        return (l);
        
        
    }
     public void B(TreeNode root,int level)
    {
        Stack<TreeNode>s1= new Stack<>();
        Stack<TreeNode>s2= new Stack<>();
        s1.add(root);
        while(s1.size()>0)
        {
        List<Integer>l1= new ArrayList<>();
        int size= s1.size();
        while(size>0)
        {
        TreeNode n= s1.pop();
        l1.add(n.val);
            if(level%2!=0 ) // odd level 
            {
                if(n.left!=null)
                s2.add(n.left);
                if(n.right!=null)
                s2.add(n.right);
            }
            else // evem level
            {
                if(n.right!=null)
                s2.add(n.right);
                if(n.left!=null)
                s2.add(n.left);
            }
            size--;
        }
        l.add(l1);
        level++;
        s1= s2;
        s2= new Stack<>();
        
        }
    }
}
