class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        if(n<2) return 0;
        int j=1;
        int diff=0;
        int Maxdiff=0;

        for(int i=0;i<n-1;i++){
            diff=nums[j]-nums[i];
            Maxdiff=Math.max(diff,Maxdiff);
            j++;
        }
        return Maxdiff;
    }
}