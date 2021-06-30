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
    ArrayList<TreeNode>l =new ArrayList<>();
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int x= p.val;
        int y= q.val;
        TreeNode n=null;
		if(root==null) return null ;
        boolean b= B(root,x); // find first root path  and store it
        ArrayList<TreeNode>l1= new ArrayList<>(l);
        l.clear();
        boolean c= B(root,y); // find second root path and store it.
        if(b==c)       
        {
            for(int i=0;i<Math.min(l.size(),l1.size());i++)
            {
                if(l1.get(i)!=l.get(i))
                {
               n= l.get(i-1);
                break;
                }
            }
        }
        if(n==null)  // ye tb hga jb dno dono notes ek hi path pr ho like 5,4
      {
        if(l.size()<l1.size())
        n=l.get(l.size()-1);
        else
        n=l1.get(l1.size()-1);
      }

        return n;

        
    }
    public boolean B(TreeNode root,int x)
    {
        if(root==null) return false;
        l.add(root);
        if(root.val==x) return true;
        boolean c1= B(root.left,x);
        if(c1==true) return true;
        boolean c2= B(root.right,x);
        if(c2==true) return true;
        else
        {
             l.remove(l.size()-1);
             return false;
        }
    }
}
