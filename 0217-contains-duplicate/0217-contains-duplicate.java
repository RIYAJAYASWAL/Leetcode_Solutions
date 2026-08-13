class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int num:map.keySet()){
            if(map.get(num)>1){
                return true;
            }
        }
        return false;
    }
}