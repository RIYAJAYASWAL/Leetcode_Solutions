class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int sum=0;
        int l=0;

        while(l<k){
            sum+=cardPoints[l];
            l++;
        }
        int max=sum;
        l=k-1;
        for(int r=n-1;r>=n-k;r--){
            sum-=cardPoints[l];
            sum+=cardPoints[r];
            l--;
            max=Math.max(max,sum);
        }
        return max;
    }
}