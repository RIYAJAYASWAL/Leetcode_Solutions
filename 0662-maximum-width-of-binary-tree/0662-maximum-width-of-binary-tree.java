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
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair<TreeNode,Integer>> que=new LinkedList<>();
        que.add(new Pair<>(root,0));
        int max=0;
        while(!que.isEmpty()){
            int size=que.size();
            int start=que.peek().getValue();
            int idx=0;
            for(int i=0;i<size;i++){
                Pair<TreeNode,Integer> pair=que.poll();
                TreeNode node=pair.getKey();
                idx=pair.getValue();
                if(node.left!=null){
                    que.add(new Pair<>(node.left,2*idx+1));
                }
                if(node.right!=null){
                    que.add(new Pair<>(node.right,2*idx+2));
                }
            }
            max=Math.max(max,idx-start+1);
        }
        return max;
    }
}