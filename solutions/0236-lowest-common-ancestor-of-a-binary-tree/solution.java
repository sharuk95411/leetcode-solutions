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
    List<TreeNode>l1= new ArrayList<>();
    List<TreeNode>l2= new ArrayList<>();
    boolean b=true;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        A(root,p);
        b=true;
        B(root,q);   
        // System.out.println("L! "+l1);
        // System.out.println("L2 "+l2);
        int a=Math.min(l1.size(),l2.size());
        
        for(int i=0;i<a;i++)
        {
             if(l1.get(i).val==l2.get(i).val)
             {
                 p=l1.get(i);
             }
             else break;
        }
        return p;
    }

    public void A(TreeNode root, TreeNode p)
    {
       if(root==null)return ;
        l1.add(root);
        if(root.val==p.val)
        {
            b=false;
        }
        if(b)
        A(root.left,p);
        if(b)
        A(root.right,p);
        if(b)
        l1.remove(l1.size()-1);
    }
     public void B(TreeNode root, TreeNode q)
    {
        if(root==null)return ;
        l2.add(root);
        if(root.val==q.val)
        {
            b=false;
        }
        if(b)
        B(root.left,q);
        if(b)
        B(root.right,q);
        if(b)
        l2.remove(l2.size()-1);
        }
    
}
