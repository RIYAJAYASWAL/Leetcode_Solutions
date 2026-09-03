class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=nums1.length;
        int count=0;
        int min_o=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(nums1[i]%2!=0){
                min_o=Math.min(min_o,nums1[i]);
            }
        }
        if(min_o==Integer.MAX_VALUE) return true;

        for(int i=0;i<n;i++){
            if(nums1[i]%2==0 && nums1[i]<=min_o) return false;
        }
        return true;
    }
}