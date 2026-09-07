class Solution {
    public int countGoodRotations(int[] nums) {
        int n=nums.length;
        int count=0;
        long sum1=0,sum2=0;

        for(int i=0;i<n/2;i++){
            sum1+=nums[i];
            sum2+=nums[i+n/2];
        }

        for(int i=0;i<n;i++){
            if(sum1>sum2){
                count++;
            }
            int a=nums[i];
            int b=nums[(i+n/2)%n];

            sum1-=a;
            sum1+=b;
            sum2+=a;
            sum2-=b;
        }
        return count;
    }
}