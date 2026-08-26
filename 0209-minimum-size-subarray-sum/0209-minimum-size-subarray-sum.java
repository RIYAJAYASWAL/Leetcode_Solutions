class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int n=nums.length;
        int i=0;int j=0;
        int minimum=Integer.MAX_VALUE;
        while(j<n){
            sum+=nums[j];
            while(sum>=target){
               sum-=nums[i];
               minimum=Math.min((j-i+1),minimum);
               i++;
            }
            j++;
        }
        if(minimum==Integer.MAX_VALUE) return 0;
        return minimum;
    }
    
}