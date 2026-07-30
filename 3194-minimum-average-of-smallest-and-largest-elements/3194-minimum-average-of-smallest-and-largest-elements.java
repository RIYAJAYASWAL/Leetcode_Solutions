class Solution {
    public double minimumAverage(int[] nums) {

        int n=nums.length;
        Arrays.sort(nums);
        int i=0,j=n-1;
        double min=Double.MAX_VALUE;
        
        while(i<j){
            double avg=(double)(nums[i]+nums[j])/2;
            if(avg<min){
                min=(double)Math.min(avg,min);
            }
            i++;j--;
        }
        return min;
    }
}