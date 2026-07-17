class Solution {
    long gcd(long a,long b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public long gcdSum(int[] nums) {

        int n=nums.length;
        long[] pre=new long[n];
        long max=-1;

        for (int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            pre[i]=gcd(max,nums[i]);
        }

        Arrays.sort(pre);
        long sum=0;
        int start=0;
        int end=n-1;

        while(start<end){
            long x=gcd(pre[start],pre[end]);
            sum+=x;
            start++;
            end--;
        }
        return sum;
    }
}