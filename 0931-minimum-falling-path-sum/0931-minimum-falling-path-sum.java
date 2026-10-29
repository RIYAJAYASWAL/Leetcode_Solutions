class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int minSum=Integer.MAX_VALUE;
        int[][] dp=new int[n][n];
        for(int[] r:dp){
            Arrays.fill(r,Integer.MAX_VALUE);
        }
        for(int j=0;j<n;j++){
            minSum=Math.min(minSum,solve(0,j,matrix,dp));
        }
        return minSum;
    }
    public int solve(int i,int j,int[][] arr,int[][] dp){
        if(i==arr.length-1)return arr[i][j];
        if(dp[i][j]!=Integer.MAX_VALUE) return dp[i][j];
        int r=(j<arr.length-1)?solve(i+1,j+1,arr,dp):Integer.MAX_VALUE;
        int d=solve(i+1,j,arr,dp);
        int l=(j>0)?solve(i+1,j-1,arr,dp):Integer.MAX_VALUE;
        return dp[i][j]=arr[i][j]+Math.min(d,Math.min(r,l));
    }
}