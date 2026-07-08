class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        int min=Integer.MAX_VALUE;

        for(int num:nums){
            min=Math.min(min,num);
        }
        for(int num:nums){
            sum+=num-min;
        }
        return sum;
    }
}