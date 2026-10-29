class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n=obstacleGrid.length;
        int m=obstacleGrid[0].length;
        int[][] dp=new int[n][m];
        for(int[] r:dp){
            Arrays.fill(r,-1);
        }
        return solve(n-1,m-1,obstacleGrid,dp);
    }
    public int solve(int n,int m,int[][]arr,int[][]dp){
        if(n==0 && m==0 && arr[n][m]!=1)return 1;
        if(n<0 ||m<0 || arr[n][m]==1)return 0;
        if(dp[n][m]!=-1)return dp[n][m];
        return dp[n][m]=solve(n-1,m,arr,dp)+solve(n,m-1,arr,dp);
    }
}