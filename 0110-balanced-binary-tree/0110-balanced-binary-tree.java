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
    boolean flag=true;
    public int height(TreeNode root){
        if(root==null)return 0;
        int left=height(root.left);
        int right=height(root.right);
        int ans=Math.abs(left-right);
        if(ans>1) flag=false;
        return 1+Math.max(right,left);

    }
    public boolean isBalanced(TreeNode root) {
        height(root);
        return flag;

    }
}