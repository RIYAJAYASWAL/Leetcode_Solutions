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
        StringBuilder s=new StringBuilder();
        preorder(root,s);
        return s.toString();
    }
    public void preorder(TreeNode root,StringBuilder s){
        if(root==null){
            s.append("#,");
            return;
        };
        s.append(root.val).append(",");
        preorder(root.left,s);
        preorder(root.right,s);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.equals("#"))return null;
        Queue<String> que=new LinkedList<>();
        for(String s:data.split(",")){
            que.add(s);
        }
        return build(que);
    }
    public TreeNode build(Queue<String> que){
        String d=que.poll();
        if(d.equals("#")){
            return null;
        }
        TreeNode root=new TreeNode(Integer.parseInt(d));
        root.left=build(que);
        root.right=build(que);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;