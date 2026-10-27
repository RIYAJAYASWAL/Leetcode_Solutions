class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int[] ans=nums;
        int count=0;
        for(int i=0;i<n;i++){
            if(ans[i]!=0){
                nums[count]=ans[i];
                count++;
            }
        }
        for(int j=count;j<n;j++){
            nums[count]=0;
            count++;
        }
    }
}