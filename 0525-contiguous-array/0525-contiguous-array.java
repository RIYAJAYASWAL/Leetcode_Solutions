class Solution {
    public int findMaxLength(int[] nums) {
       HashMap<Integer,Integer> map=new HashMap<>();
       int sum=0,max=0;
       int n=nums.length;

       map.put(0,-1);
       for(int i=0;i<n;i++){
            if(nums[i]==0){
                sum--;
            }else{
                sum++;
            }
            if(map.containsKey(sum)){
                max=Math.max(max,i-map.get(sum));
            }else{
                map.put(sum,i);
            }
       }
       return max;
    }
}