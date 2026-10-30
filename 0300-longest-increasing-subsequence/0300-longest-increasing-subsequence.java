class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[][] dp=new int[n+1][n+1];
        for(int[] r:dp){
            Arrays.fill(r,-1);
        }
        return solve(0,-1,nums,dp);
    }
    public int solve(int idx,int prev,int[] nums,int[][] dp){
        if(idx>=nums.length)return 0;
        if(dp[idx][prev+1]!=-1)return dp[idx][prev+1];
        int take=0;
        if(prev==-1 || nums[idx]>nums[prev]){
            take=1+solve(idx+1,idx,nums,dp);
        }
        int nottake=solve(idx+1,prev,nums,dp);
        return dp[idx][prev+1]=Math.max(take,nottake);
    }

}