class Solution {
    public int[] getAverages(int[] nums, int k) {

        int n=nums.length;long sum=0;
        int size=2*k+1;
        int[] avg_a=new int[n];
        Arrays.fill(avg_a,-1);

        if(size>n){
            return avg_a;
        }
        for(int i=0;i<size;i++){
            sum+=nums[i];
        }
        avg_a[k]=(int)(sum/size);
        for(int i=k+1;i<n-k;i++){
            sum-=nums[i-k-1];
            sum+=nums[i+k];
            avg_a[i]=(int)(sum/size);
        }
        return avg_a;
    }
}