class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long ans=0;
        if(need1==0 && need2==0)return 0;
        long cost=(long)need1*cost1+(long)need2*cost2;
        long both=(long)Math.max(need1,need2)*costBoth;
        long mixed=(long)Math.min(need1,need2)*costBoth;
        if(need1>need2) {
            mixed+=(long)(need1-need2)*cost1;
        }else{
            mixed+=(long)(need2-need1)*cost2;
        }
        ans=Math.min(cost,Math.min(both,mixed));
        return ans;
    }
}