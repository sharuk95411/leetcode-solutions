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
List<Integer>l= new ArrayList<>();
        TreeNode root;
        int size=0;
        int index=0;
    public BSTIterator(TreeNode root) {
        this.root=root;
        A(root);
        size=l.size();
    }
    public void A(TreeNode root)
    {
        if(root==null) return ;
        A(root.left);
        l.add(root.val);
        A(root.right);
    }
    
    public int next() {
        
        return l.get(index++);
    }
    
    public boolean hasNext() {
       if(index==l.size())
       return false;
       else return true;   
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
