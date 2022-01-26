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
    List<Integer>list1= new ArrayList<>();
    List<Integer>list2= new ArrayList<>();
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        
        inorder1(root1);
        inorder2(root2);
        System.out.println(list1);
        System.out.println(list2);
        List<Integer>ans= new ArrayList<>();
        
        int i=0,j=0;
        while(i<list1.size()&& j<list2.size())
        {
            int a= list1.get(i);
            int b= list2.get(j);
          if(a>=b)
          {
              ans.add(b);
              j++;
              
          }
            else
            {
                ans.add(a);
                i++;
            }
        }
        while(i<list1.size())
        {
            ans.add(list1.get(i));
            i++;
        }
        while(j<list2.size())
        {
            ans.add(list2.get(j));
            j++;
        }
        return ans;
    }
    
private void inorder1(TreeNode root1)
{
    if(root1==null) return ;
    
    inorder1(root1.left);
    list1.add(root1.val);
    inorder1(root1.right);
}
    private void inorder2(TreeNode root1)
{
    if(root1==null) return ;
    
    inorder2(root1.left);
    list2.add(root1.val);
    inorder2(root1.right);
}
}
