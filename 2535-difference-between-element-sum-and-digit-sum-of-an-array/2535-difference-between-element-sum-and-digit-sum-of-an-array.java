class Solution {
    public int differenceOfSum(int[] nums) {
        int n=nums.length;
        int sum=0;
        int digit_sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            while(nums[i]>0){
                int digit=nums[i]%10;
                digit_sum+=digit;
                nums[i]/=10;
            }
        }
        return Math.abs(sum-digit_sum);
    }
}