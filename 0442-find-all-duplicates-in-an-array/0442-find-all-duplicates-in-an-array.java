class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> ans=new ArrayList<>();

        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int num:map.keySet()){
            if(map.get(num)==2){
                ans.add(num);
            }
        }
        return ans;
    }
}