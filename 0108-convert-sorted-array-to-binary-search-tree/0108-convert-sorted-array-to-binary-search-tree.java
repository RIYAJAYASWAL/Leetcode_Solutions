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
    public TreeNode sortedArrayToBST(int[] nums) {
        int n=nums.length;
        int s=0;
        int e=n-1;
        return solve(nums,s,e);
    }
    public TreeNode solve(int[] arr,int s,int e){
        if(s>e) return null;
        int mid=s+(e-s)/2;
        TreeNode root=new TreeNode(arr[mid]);
        root.left=solve(arr,s,mid-1);
        root.right=solve(arr,mid+1,e);
        return root;
    }
}