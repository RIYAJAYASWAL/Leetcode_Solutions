class Solution {
    public int minSubarray(int[] nums, int p) {

        long total =0;
        int n=nums.length;
        int minlen=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            total+=nums[i];
        }

        int target=(int)(total%p);
        if(target==0) return 0;
        int curr=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,0);
        for(int i=1;i<=n;i++){
            curr=(curr+nums[i-1])%p;
            int prev=(curr-target+p)%p;
            if(map.containsKey(prev)){
                minlen=Math.min(minlen,i-map.get(prev));
            }
            map.put(curr,i);
        }
        if(minlen==n) return -1;
        return minlen;
    }
}