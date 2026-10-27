class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        solve(0,nums,ans,new ArrayList<>());
        return ans;
    }
    public void solve(int idx,int[] nums,List<List<Integer>> ans,List<Integer> curr){
        ans.add(new ArrayList<>(curr));
        for(int i=idx;i<nums.length;i++){
            if(i>idx && nums[i]==nums[i-1]){
                continue;
            }
            curr.add(nums[i]);
            solve(i+1,nums,ans,curr);
            curr.remove(curr.size()-1);
        }

    }
}