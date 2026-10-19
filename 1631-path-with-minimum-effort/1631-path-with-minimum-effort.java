class Solution {
    public int minimumEffortPath(int[][] heights) {
        int m=heights.length;
        int n=heights[0].length;

        int[][] dist=new int[m][n];
        for(int[] row:dist){
            Arrays.fill(row,Integer.MAX_VALUE);
        }
        dist[0][0]=0;
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        pq.add(new int[]{0, 0, 0});

        int[] dr={-1, 1, 0, 0};
        int[] dc={0, 0, -1, 1};

        while(!pq.isEmpty()){
            int[] curr=pq.poll();
            int effort=curr[0];
            int r=curr[1];
            int c=curr[2];

            if(r==m-1 && c==n-1)return effort;
            if(effort>dist[r][c])continue;

            for(int i=0;i<4;i++) {
                int nr=r+dr[i];
                int nc=c+dc[i];

                if (nr<0||nr>=m||nc<0||nc>=n) continue;

                int diff=Math.abs(heights[r][c]-heights[nr][nc]);
                int newEffort = Math.max(effort,diff);

                if (newEffort<dist[nr][nc]){
                    dist[nr][nc]=newEffort;
                    pq.add(new int[]{newEffort,nr,nc});
                }
            }
        }
        return 0;
    }
}
