
class Solution {
    int ans=0;
    public int pathSum(TreeNode root, int targetSum) {
        
        if(root==null) return 0;
         
         Calculate(root,targetSum);
         pathSum(root.left,targetSum);
         pathSum(root.right,targetSum);
        
        return ans;
    }

    private void Calculate(TreeNode root,long target )
    {
         if(root==null) return ;
         target=target-root.val;
         if(target==0) 
         {
            ans++;
         }
        Calculate(root.left,target);
        Calculate(root.right,target);
    }
}
