class Solution {
    public int smallestIndex(int[] nums) {
        int n=nums.length;
        
        for(int i=0;i<n;i++){
            int count=0;
            int temp=nums[i];
            while(temp!=0){
                count+=temp%10;
                temp/=10;
            }
            if(count==i) return i;
        }
        return -1;
    }
}