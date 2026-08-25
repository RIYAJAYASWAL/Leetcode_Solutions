class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        for(int i=1;i<100000;i++){
            int num=i*k;
            if(!set.contains(num)){
                return num;
            }
        }
        return 1;
    }
}