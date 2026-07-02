class Solution {
    public int countNegatives(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int count=0;
       
        for(int i=0;i<n;i++){
            int start=0;
            int end=m-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(grid[i][mid]<0){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
            count+=(m-start);
        }
        return count;
    }
}