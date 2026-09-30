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
    static TreeNode prev=null;
    static TreeNode p=null;
    static TreeNode q=null;
    public void recoverTree(TreeNode root) {
        prev=null;
        p=null;
        q=null;
        solve(root);
        if(p!=null && q!=null){
            int temp=p.val;
            p.val=q.val;
            q.val=temp;
        }
    }
    public void solve(TreeNode root){
        if(root==null)return ;
        solve(root.left);
        if(prev!=null &&prev.val>root.val){
            if(p==null){
                p=prev;
            }
            q=root;
        }
        prev=root;
        solve(root.right);
    }
}