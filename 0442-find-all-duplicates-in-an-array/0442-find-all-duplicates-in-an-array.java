class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        ArrayList<Integer> ans=new ArrayList<>();

        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}