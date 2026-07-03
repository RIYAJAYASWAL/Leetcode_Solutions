class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        int count=1;
        int max=0;

        Arrays.sort(nums);

        if(n<2) return n;

        for(int i=0;i<n-1;i++){
            if(nums[i]!=nums[i+1]){
                if(nums[i]==nums[i+1]-1){
                    count++;
                }else{
                    count=1;
                }
            }
            max=Math.max(max,count);
        }
        return max; 
    }
}