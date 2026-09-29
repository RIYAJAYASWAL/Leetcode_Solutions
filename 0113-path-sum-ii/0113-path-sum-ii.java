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
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        solve(root,0,targetSum,new ArrayList<>());
        return ans;
    }
    void solve(TreeNode root,int sum,int targetSum,List<Integer>path){
        if(root==null)return ;
        path.add(root.val);
        sum+=root.val;

        if(root.left==null && root.right==null && sum==targetSum)ans.add(new ArrayList<>(path));

        solve(root.left,sum,targetSum,path);
        solve(root.right,sum,targetSum,path);

        path.remove(path.size()-1);
    }
}