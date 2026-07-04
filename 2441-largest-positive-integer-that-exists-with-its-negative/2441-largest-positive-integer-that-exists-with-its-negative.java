class Solution {
    public int findMaxK(int[] nums) {
        int n=nums.length;
        int max=-1;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==(-1)*nums[j]){
                    max= Math.max(max,Math.abs(nums[i]));
                }
            }
        }
        return max;
    }
}