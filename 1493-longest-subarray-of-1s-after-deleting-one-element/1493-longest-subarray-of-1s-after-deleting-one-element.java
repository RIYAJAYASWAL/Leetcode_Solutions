class Solution {
    public int longestSubarray(int[] nums) {
        int count_z=0;
        int n=nums.length;
        int ans=Integer.MIN_VALUE;
        int j=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0) count_z++;

            while(count_z>1){
                if(nums[j]==0){
                    count_z--;
                }
                j++;
            }
            ans=Math.max(ans,i-j);
        }
        return ans;
    }
}