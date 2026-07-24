class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int[] ans=new int[n];
        int k=0;

        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<m;j++){
                sum+=matrix[i][j];
            }
            ans[i]=sum;
            k++;
        }
        return ans;
    }
}