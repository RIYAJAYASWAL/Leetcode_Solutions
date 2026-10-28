class Solution {
    public int numDecodings(String s) {
        int n=s.length();
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return solve(dp,s,0);
    }
    public int solve(int[] dp,String s,int idx){
        if(idx==s.length()) return 1;
        if(s.charAt(idx)=='0')return 0;

        if(dp[idx]!=-1)return dp[idx];
        int one=solve(dp,s,idx+1);
        int two=0;
        if(idx+1<s.length() &&(s.charAt(idx)=='1' ||(s.charAt(idx)=='2' && s.charAt(idx+1)<='6'))){
            two=solve(dp,s,idx+2);
        }
        dp[idx]=one+two;
        return dp[idx];
    }
}