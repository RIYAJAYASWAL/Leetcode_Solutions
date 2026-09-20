class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        ArrayList<Integer> ans=new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans.add(matrix[i][j]);
            }
        }
        Collections.sort(ans);
        return ans.get(k-1);
    }
}