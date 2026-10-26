class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        solve(0,nums,ans,new ArrayList<>());
        return ans;
        
    }
    public void solve(int idx,int[]nums,List<List<Integer>>ans,List<Integer>curr){
        if(idx==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        solve(idx+1,nums,ans,curr);
        curr.add(nums[idx]);
        solve(idx+1,nums,ans,curr);
        curr.remove(curr.size()-1);

    }
}