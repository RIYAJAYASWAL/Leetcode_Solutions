class Solution {
    public int[] concatWithReverse(int[] nums) {
        
        int n=nums.length;
        int[] ans=new int[n*2];
        int count=0;
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
            count++;
        }
        for(int j=n-1;j>=0;j--){
            ans[count]=nums[j];
            count++;
        }
        return ans;
    }
}