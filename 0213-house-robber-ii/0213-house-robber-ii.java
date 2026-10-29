class Solution {
    public int rob(int[] nums) {

        int n=nums.length;

        if(n==1)return nums[0];
        int[] dp=new int[n+1];

        Arrays.fill(dp,-1);
        int a=solve(nums,dp,0,n-2);
        Arrays.fill(dp,-1);
        int b=solve(nums,dp,1,n-1);

        return Math.max(a,b); 
    }
    public int solve(int[] nums,int[] dp,int start,int n){
        if(n<start)return 0;
        if(n==start){
            return nums[n];
        }
        if(dp[n]!=-1)return dp[n];

        int pick=nums[n]+solve(nums,dp,start,n-2);
        int notp=solve(nums,dp,start,n-1);
        dp[n]=Math.max(pick,notp);
        return dp[n];
    }

}