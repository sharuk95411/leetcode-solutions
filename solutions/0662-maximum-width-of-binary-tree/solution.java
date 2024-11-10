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

   class A
   {
      TreeNode n;
      int i;
      A(TreeNode node,int value)
      {
        n=node;
        i=value;
      }
   }

    public int widthOfBinaryTree(TreeNode root) {
        
        if(root==null) return 0;
        Deque<A>q= new LinkedList<>();
        int left=0;
        int right=0;
        int ans=0;
        q.add(new A(root,0));
        while(!q.isEmpty())
        {
            int size=q.size();
             left=q.peekFirst().i;
            right=q.peekLast().i;
            ans=Math.max(ans,right-left+1);
            while(size>0)
            {
                A a= q.pop();
                int level= a.i;
                TreeNode node= a.n;
                if(node.left!=null)
                {
                    q.add(new A(node.left,2*level+1));
                }
                if(node.right!=null)
                {
                    q.add(new A(node.right,2*level+2));
                }
                size--;
            }
           

        }
       return ans;
    }
}
