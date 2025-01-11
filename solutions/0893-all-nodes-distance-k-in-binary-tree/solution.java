/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
     HashMap<TreeNode ,TreeNode>h= new HashMap<>();
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        
        A(root);
        Queue<TreeNode>q= new LinkedList<>();
        List<Integer>list= new ArrayList<>();
        q.add(target);
        while(!q.isEmpty())
        {
            int size=q.size();
            if(k==0) break;
            k--;
            while(size>0)
            {
                TreeNode n = q.poll();
                list.add(n.val);
                
                if(n.left!=null && list.contains(n.left.val)==false)
                {
                           q.add(n.left);
                }
                 if(n.right!=null && list.contains(n.right.val)==false)
                {
                    q.add(n.right);
                }

                if(h.containsKey(n) && list.contains(h.get(n).val)==false)
                {
                    q.add(h.get(n));
                }
                size--;

            }
        }
        list=new ArrayList<>();
        while(!q.isEmpty())
        {
            list.add(q.poll().val);
        }
        return list;
            

        

    }
    public void A(TreeNode root)
    {
        if(root==null) return ;
        if(root.left!=null)
        {
            h.put(root.left,root);
        }
        if(root.right!=null)
        {
              h.put(root.right,root);
        }
        A(root.left);
        A(root.right);
    }

   
}
