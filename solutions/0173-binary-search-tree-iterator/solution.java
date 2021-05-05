// Logic- Naresh gupta.
// Tum Explanation dekh lo Question smjh aa jyga ki kb kya return krna h call hne pr
/* Stack use krne se Question asan ho gya h So tree k question me iterate wle me Stack k perspective se soch lena */
/* Ab Niche Question Smjhaya gya h
 isme hme Tree ka Inorder Traversal nikalana h jiska root node given h.
 isme next k call hne pr hme data InOrder Traversal k form me dena h jb jb next call ho
 jb hasNext Call ho agr hmne tree to pura traverse abhi ni kia h hm tree k kisi node pr still h to return true other return false. */

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

  Stack<TreeNode> s= new Stack<>();
    public BSTIterator(TreeNode root) {
      
         pushLeft(root);
        
    }
    
    public int next() {
        TreeNode node= s.pop();
        if(node.right!=null)
        {
            pushLeft(node.right);
        }
        return node.val;
        
    }
    
    public boolean hasNext() {
        if(s.size()>0) return true;
        else return false;
        
    }
    
     public void pushLeft(TreeNode root)
    {
        while(root!=null)
        {
            s.push(root);
            root=root.left;
        }
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
