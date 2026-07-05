class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int count=0;
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                count^=nums[i];
            }
        }
        return count;
    }
}