class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int[][] dp=new int[n+1][amount+1];
        for(int[] r:dp){
            Arrays.fill(r,-1);
        }
        
        int ans= solve(n,amount,coins,dp);
        return ans==Integer.MAX_VALUE?-1:ans;
    }
    public int solve(int n,int amount,int[] coins,int[][]dp){
        if(n==0 ||amount<0)return Integer.MAX_VALUE;
        if(amount==0)return 0;
        if(dp[n][amount]!=-1)return dp[n][amount];
    
        int take=solve(n,amount-coins[n-1],coins,dp);
        if(take!=Integer.MAX_VALUE){
            take+=1;
        }
        int nottake=solve(n-1,amount,coins,dp);
        return dp[n][amount]=Math.min(take,nottake);
    }
}