class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int ans=0;
        int sum=0;

        for(int val:nums){
            sum+=val;
            int rem=sum-k;

            if(map.containsKey(rem)){
                ans+=map.get(rem);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}
