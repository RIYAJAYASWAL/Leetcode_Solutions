class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n=nums.length;
        int[] ans=new int[n];
        int[] left=new int[n];
        int[] right=new int[n];
        int prefix=1;
       //left side
        for(int i=0;i<n;i++){
            left[i]=prefix;
            prefix*=nums[i];
        }
        //right side;
        int suffix=1;
        for(int i= n-1;i>=0;i--){
            right[i]=suffix;
            suffix*=nums[i];
        }
        //multiply both to get ans
        for(int i=0;i<n;i++){
            ans[i]=left[i]*right[i];
        }
        return ans;
    }
}