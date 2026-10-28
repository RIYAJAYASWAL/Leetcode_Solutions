class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        boolean[] dp=new boolean[n+1];
       
        dp[0]=true;

        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
                if(dp[j] && j+nums[j]>=i){
                    dp[i]=true;
                    break;
                }
            }

        }
        return dp[n-1];
    }
}