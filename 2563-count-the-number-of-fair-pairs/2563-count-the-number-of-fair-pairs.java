class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return count(nums,upper)-count(nums,lower-1);
    }
    public long count(int[] nums,int limit){
        int left=0;
        int right=nums.length-1;
        long count=0;

        while(left<right){
            if(nums[left]+nums[right]<=limit) {
                count+=right-left;
                left++;
            }else{
                right--;
            }
        }
        return count;
    }
}