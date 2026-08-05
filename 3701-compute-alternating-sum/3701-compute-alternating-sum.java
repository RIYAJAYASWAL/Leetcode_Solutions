class Solution {
    public int alternatingSum(int[] nums) {
        int n=nums.length;
        int sum_e=0,sum_o=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                sum_e+=nums[i];
            }else{
                sum_o+=nums[i];
            }
        }
        return sum_e-sum_o;
    }
}