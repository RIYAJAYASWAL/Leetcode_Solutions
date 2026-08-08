class Solution {
    public int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);
        int n=price.length;
        int e=price[n-1];
        int s=0;
        int ans=0;

        while(s<=e){
            int mid=s+(e-s)/2;
            int last=price[0];
            int candy=1;

            for(int i=1;i<n;i++){
                if(Math.abs(price[i]-last)>=mid){
                    last=price[i];
                    candy++;
                }
            }
            if(candy>=k){
                ans=mid;
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return ans;
    }
}