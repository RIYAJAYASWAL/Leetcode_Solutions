class Solution {
    public int[] leftRightDifference(int[] nums) {

        int n=nums.length;
        int[] left=new int[n];
        int[] right=new int[n];
        int sum=0;

        for(int i=0;i<n;i++){
            left[i]=sum;
            sum+=nums[i];
        }

        sum=0;
        for(int i=n-1;i>=0;i--){
            right[i]=sum;
            sum+=nums[i];
        }
        
        for(int j=0;j<n;j++){
            nums[j]=Math.abs(left[j]-right[j]);
        }
        return nums;
    }
}