class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        int n=nums.length;
        int l=0,r=n-1;
        while(l<r){
            ans=Math.max(ans,nums[l]+nums[r]);
            l++;
            r--;
        }
        return ans;
    }
}