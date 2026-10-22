class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int start=1,end=Integer.MAX_VALUE,ans=Integer.MAX_VALUE;

        while(start<=end){
            int rate=start+(end-start)/2;
            int totalHour=0;
            for(int i=0;i<n;i++){
                long hour=(long)Math.ceil((double)piles[i]/(double)rate);
                totalHour+=hour;
            }
            if(totalHour<=h){
                    ans=rate;
                    end=rate-1;
                }else{
                    start=rate+1;
                }

        }
        return ans;
    }
}