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

    class C
    {
        int index;
        TreeNode node;
        C(TreeNode n,int a)
        {
            index=a;
            node=n;
        }
    }
    int ans=1;
    public int widthOfBinaryTree(TreeNode root) {
          Deque<C> q= new ArrayDeque<>();
        q.add(new C(root,0));
        while(q.size()>0)
        {
            int size=q.size();
            int left=q.getFirst().index;
            int right=q.getLast().index;
            ans=Math.max(ans,right-left+1);
            
            while(size>0)
            {
             C c= q.poll();
              int i=c.index;
              TreeNode n= c.node;
            
              if(n.left!=null)
              {
                      q.add(new C(n.left,2*i+1));
              } 
              if(n.right!=null)
              {
                q.add(new C(n.right,2*i+2));
              }
              size--;
            }
            
        }
        return ans;
    }
}
