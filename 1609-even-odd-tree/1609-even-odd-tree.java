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
    public boolean isEvenOddTree(TreeNode root) {
        if(root==null)return false;
        Queue<TreeNode> que=new LinkedList<>();
        que.offer(root);
        int level=0;
        while(!que.isEmpty()){
            int size=que.size();
            Integer prev=null;
            for(int i=0;i<size;i++){
                TreeNode curr=que.poll();
                int val=curr.val;

                if(level%2==0){
                    if(val%2==0)return false;
                    if(prev!=null && val<=prev)return false;
                }else{
                    if(val%2!=0)return false;
                    if(prev!=null && val>=prev)return false;
                }
                prev=val;
                if(curr.left!=null)que.offer(curr.left);
                if(curr.right!=null)que.offer(curr.right);
            }
            level++;
        }
        return true;
    }
}