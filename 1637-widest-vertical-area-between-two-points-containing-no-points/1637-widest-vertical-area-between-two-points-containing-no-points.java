class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {

        Arrays.sort(points,(a,b)->a[0]-b[0]);

        int n=points.length;
        int diff=0;
        int Maxdiff=0;

        for(int i=0;i<n-1;i++){
            diff=points[i+1][0]-points[i][0];
            Maxdiff=Math.max(diff,Maxdiff);
        }
        return Maxdiff;
    }
}