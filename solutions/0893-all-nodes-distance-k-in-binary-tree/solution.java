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
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        
        List<Integer>ans= new ArrayList<>();
        if(k==0)
        {
            ans.add(target.val);
            return ans;
        }
        HashMap<TreeNode,TreeNode>h= new HashMap<>();
        A(root,h);
        HashSet<TreeNode> check = new HashSet<>();
        Queue<TreeNode>q= new LinkedList<>();
        q.add(target);
        while(q.size()>0)
        {
            int s=q.size();
            while(s>0)
            {
                TreeNode n=q.poll();
                if(n.left!=null && !check.contains(n.left))
                {
                    q.add(n.left);
                    check.add(n.left);
                }
                if(n.right!=null && !check.contains(n.right))
                {
                    q.add(n.right);
                    check.add(n.right);
                }
                if(h.containsKey(n)==true && !check.contains(n))
                {
                    q.add(h.get(n));
                    check.add(n);
                }
                s--;
            }
            k--;
            if(k==0) break;
        }
        
        
            while(q.size()>0)
            {
                ans.add(q.poll().val);
            }
        return ans;

    }

    public void A(TreeNode root,HashMap<TreeNode,TreeNode>h)
    {
        if(root==null)return ;
        
        if(root.left!=null)
        {
            h.put(root.left,root);
            A(root.left,h);
        }
        if(root.right!=null)
        {
            h.put(root.right,root);
            A(root.right,h);
        }
    }
}
