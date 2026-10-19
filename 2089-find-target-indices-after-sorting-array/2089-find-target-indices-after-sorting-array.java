class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        int start=0,end=n-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(nums[mid]==target){
                start=mid;
                end=mid;
                while(start>=0 && nums[start]==target) start--;
                while(end<n && nums[end]==target) end++;

                List<Integer>ans=new ArrayList<>();

                for(int i=start+1;i<=end-1;i++) {
                    ans.add(i);
                }
                return ans;
            }else if(nums[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return new ArrayList<>();
    }
}