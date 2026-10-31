class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length(),m=text2.length();
        int dp[][]=new int[n][m];
        for(int[] r:dp){
            Arrays.fill(r,-1);
        }
        return solve(text1,text2,n-1,m-1,dp);
    }
    public int solve(String t1,String t2,int i,int j,int[][] dp){
        if(i<0 ||j<0)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(t1.charAt(i)==t2.charAt(j)){
            return dp[i][j]=1+solve(t1,t2,i-1,j-1,dp);
        }
        int o1=solve(t1,t2,i-1,j,dp);
        int o2=solve(t1,t2,i,j-1,dp);

        return dp[i][j]=Math.max(o1,o2);
    }
}