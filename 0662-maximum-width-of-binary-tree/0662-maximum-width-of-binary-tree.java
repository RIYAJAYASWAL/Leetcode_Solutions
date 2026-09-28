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
    class pair{
        TreeNode node;
        long index;
        pair(TreeNode node,long index){
            this.node=node;
            this.index=index;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null)return 0;
        Queue<pair> que=new LinkedList<>();
        que.offer(new pair(root,0L));
        int max=0;
        while(!que.isEmpty()){
            int size=que.size();
            long first=que.peek().index;
            long last=first;
            for(int i=0;i<size;i++){
                pair p=que.poll();
                
                long curr=p.index-first;
                last=curr;
                if(p.node.left!=null){
                    que.offer(new pair(p.node.left,2*curr+1));
                }
                if(p.node.right!=null){
                    que.offer(new pair(p.node.right,2*curr+2));
                }
            }
            max=Math.max(max,(int)(last+1));
        }
        return max;
    }
}