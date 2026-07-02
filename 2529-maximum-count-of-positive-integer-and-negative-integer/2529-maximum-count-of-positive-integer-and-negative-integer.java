class Solution {
    public int maximumCount(int[] nums) {
        int n=nums.length;
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]<0){
                start=mid+1;
            }else{
                end=mid-1;                
            }
        }
        int negatives=start;

        start=0;end=n-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]<=0){
                start=mid+1;
            }else{
                end=mid-1;                
            }
        }
        int positives=n-start;

    return Math.max(positives,negatives);
    }
}