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
    // ye logic striver ka h but isse TC km kse hgi wo smjh ni a rha h zyda hi a ri h progrm ko dry run krne pr
    public int countNodes(TreeNode root) {
        
        if(root==null) return 0;
        
        int left= getLeft(root.left);
        int right= getRight(root.right);
        
       // System.out.println(left);
        //System.out.println(right);
        if(left==right) return (int)(Math.pow(2,left)-1);
        
       else return (1+ countNodes(root.left)+countNodes(root.right));
    }
    private int getLeft(TreeNode root)
    {
        int count=1;
        while(root!=null)
        {
            count++;
            root=root.left;
        }
        return count;
    }
    private int getRight(TreeNode root)
    {
        int count=1;
        while(root!=null)
        {
            count++;
            root=root.right;
        }
        return count;
    }
    
}
