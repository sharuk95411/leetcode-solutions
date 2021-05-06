// Easy Question h simple logic lgao ho jyga.
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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>l= new ArrayList<>();
        if(root==null) return l;
        Stack<TreeNode>s= new Stack<>();
        s.push(root);
        while(s.size()>0)
        {
            TreeNode node= s.pop();
            l.add(0,node.val); // pehle element 0 index pr ayga phir jo dsra ayag wo pehla ko right shift kr dega and 0 pr wo aa jyga agr direct add use kroge to ans me hme reverse LinkList return krni hgi but asa krne se data sai form me jyga list me.
            if(node.left!=null)
            {
                s.push(node.left);
            }
            if(node.right!=null) 
            {
                s.push(node.right);
            }
        }
        return l;
    }
}
