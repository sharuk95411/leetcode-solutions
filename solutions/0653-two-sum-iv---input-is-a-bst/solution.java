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
    List<Integer>list= new ArrayList<>();
    public boolean findTarget(TreeNode root, int k) {
        
        A(root);
        System.out.println(list);
        
        int i=0;
        int j= list.size()-1;
        while(i<j)
        {
          int sum= list.get(i)+list.get(j);
            if(sum==k) return true;
            else if(sum>k)j--;
            else i++;
        }
        return false;
        
    }
    
    
    private void A(TreeNode root)
    {
        if(root==null) return ;
        A(root.left);
        list.add(root.val);
        A(root.right);
    }
}
