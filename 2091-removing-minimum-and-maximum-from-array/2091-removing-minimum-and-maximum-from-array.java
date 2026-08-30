class Solution {
    public int minimumDeletions(int[] nums) {

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        if(n<2) return 1;
        int max_idx=0,min_idx=0;
        int ans=0;

        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
                max_idx=i;
            }
            if(nums[i]<min){
                min=nums[i];
                min_idx=i;
            }
        }

        int left=Math.min(min_idx,max_idx);
        int right=Math.max(min_idx,max_idx);

        int front=right+1;
        int back=n-left;
        int both=(left+1)+(n-right);
        ans=Math.min(front,Math.min(back,both));
        return ans;
    }
}