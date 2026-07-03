class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int[] ans=new int[n];

        for(int i=1;i<n;i+=2){
            ans[i-1]=nums[i];
        }
        for(int j=0;j<n-1;j+=2){
            ans[j+1]=nums[j];
        }
        
        return ans;
    }
}