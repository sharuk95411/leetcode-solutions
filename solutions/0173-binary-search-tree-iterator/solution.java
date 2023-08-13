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
class BSTIterator {

      Queue<TreeNode>q= new LinkedList<>();
    public BSTIterator(TreeNode root) {
    
       A(root);

    }

public void A(TreeNode root)
{
     if(root==null)return;
        A(root.left);
        q.add(root);
        A(root.right);
}

    
    public int next() {
        
        int data= q.poll().val;
        return data;
    }
    
    public boolean hasNext() {
        if(q.size()>0)return true;
        else return false;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
