class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int[][] dp=new int[n][n];
        for(int[] r:dp){
            Arrays.fill(r,Integer.MAX_VALUE);
        }
        return solve(0,0,triangle,dp);
    }
    public int solve(int i,int j,List<List<Integer>> arr,int[][] dp){
        if(i==arr.size()-1)return arr.get(i).get(j);
        if(dp[i][j]!=Integer.MAX_VALUE)return dp[i][j];
        int left=solve(i+1,j,arr,dp);
        int top=solve(i+1,j+1,arr,dp);
        return dp[i][j]=arr.get(i).get(j)+Math.min(top,left);
    }
}