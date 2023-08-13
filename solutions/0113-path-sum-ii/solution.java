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
    List<List<Integer>>outer= new ArrayList<>();
    List<Integer>inner= new ArrayList<>();
    int sum=0;
    public List<List<Integer>> pathSum(TreeNode root, int s) {
        
        if(root==null)return outer;
        A(root,s);
         return outer;
   }
       
    public void A(TreeNode root,int s1)
    {
        
        if(root==null) return ;
        sum=sum+root.val;
        inner.add(root.val);
        if(sum==s1 &&(root.left==null && root.right==null))
        {
            outer.add(new ArrayList<>(inner));
             sum=sum-root.val;
              inner.remove(inner.size()-1);
               System.out.println("OKK");
               return ;
        }
        A(root.left,s1);
         A(root.right,s1);
        inner.remove(inner.size()-1);
        sum=sum-root.val;
       

        
    }
}
