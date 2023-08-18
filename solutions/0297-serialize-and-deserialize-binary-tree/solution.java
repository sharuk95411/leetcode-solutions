/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null)return "";

        Queue<TreeNode>q= new LinkedList<>();
        q.add(root);
          StringBuilder str= new StringBuilder();
            while(q.size()>0)
            {
                int size=q.size();
                while(size>0)
                {
                TreeNode n=q.poll();
                if(n==null) str.append("null,");
                else 
                {
                str.append(n.val +",");
                q.add(n.left);
                q.add(n.right);
                }
                size--;
                }
          }
      
        return str.toString();

    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
     if (data == "") return null;
        Queue<TreeNode> q = new LinkedList<>();
        String[] values = data.split(",");
        TreeNode root = new TreeNode(Integer.parseInt(values[0]));
        q.add(root);
        for (int i = 1; i < values.length; i++) {
            TreeNode parent = q.poll();
            if (!values[i].equals("null")) {
                TreeNode left = new TreeNode(Integer.parseInt(values[i]));
                parent.left = left;
                q.add(left);
            }
            if (!values[++i].equals("null")) {
                TreeNode right = new TreeNode(Integer.parseInt(values[i]));
                parent.right = right;
                q.add(right);
            }
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
