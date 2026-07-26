class Solution {
    public int maximumProduct(int[] nums) {

        int n=nums.length;
        Arrays.sort(nums);
        int pr1=nums[0]*nums[1]*nums[n-1];
        int pr2=nums[n-1]*nums[n-2]*nums[n-3];
        return Math.max(pr1,pr2);
    }
}