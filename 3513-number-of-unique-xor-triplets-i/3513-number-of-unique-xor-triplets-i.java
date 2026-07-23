class Solution {
    public int uniqueXorTriplets(int[] nums) {

        int n=nums.length;
        int ans=0;

        if(n<=2) return n;
        
        for(int num:nums){
            ans|=num;
        }

        return ans+1;
    }
}