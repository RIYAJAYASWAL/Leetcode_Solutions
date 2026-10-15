class Solution {
    public int swimInWater(int[][] grid) {
        int n=grid.length;
        int[][] dir={{0,1},{0,-1},{1,0},{-1,0}};
        boolean[][] visited=new boolean[n][n];
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        pq.add(new int[]{grid[0][0],0,0});

        visited[0][0]=true;
        int ans=0;
        while(!pq.isEmpty()){
            int[] curr=pq.poll();
            int t=curr[0];
            int r=curr[1];
            int c=curr[2];
            ans=Math.max(ans,t);

            if(r==n-1 && c==n-1) return ans;

            for(int[] d:dir){
                int nr=r+d[0];
                int nc=c+d[1];
                if(nr>=0 && nr<n && nc>=0 &&nc<n && !visited[nr][nc]){
                    visited[nr][nc]=true;
                    pq.add(new int[]{grid[nr][nc],nr,nc});
                }
            }
        }
        return ans;
    }
}