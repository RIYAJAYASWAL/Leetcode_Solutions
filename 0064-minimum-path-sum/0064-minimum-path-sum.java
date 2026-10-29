class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp=new int[m][n];
        for(int[] r:dp){
            Arrays.fill(r,-1);
        }
        return solve(m-1,n-1,grid,dp);
    }
    public int solve(int m,int n,int[][]arr,int[][] dp){
        if(n==0 && m==0)return arr[m][n];
        if(dp[m][n]!=-1)return dp[m][n];
        int left=arr[m][n]+(n-1<0?solve(m-1,n,arr,dp):solve(m,n-1,arr,dp));
        int top=arr[m][n]+(m-1<0?solve(m,n-1,arr,dp):solve(m-1,n,arr,dp));
        return dp[m][n]=Math.min(left,top);
    }
}