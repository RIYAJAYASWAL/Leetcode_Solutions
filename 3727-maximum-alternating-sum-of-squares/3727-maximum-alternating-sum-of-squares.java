class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        int[] sq=new int[n];
        for(int i=0;i<n;i++){
            sq[i]=nums[i]*nums[i];
        }
        Arrays.sort(sq);
        int i=0,j=n-1;
        long ans=0;
        while(i<j){
            ans-=sq[i];
            ans+=sq[j];
            i++;
            j--;
        }
        if(i==j)ans+=sq[i];
        return ans;
    }
}