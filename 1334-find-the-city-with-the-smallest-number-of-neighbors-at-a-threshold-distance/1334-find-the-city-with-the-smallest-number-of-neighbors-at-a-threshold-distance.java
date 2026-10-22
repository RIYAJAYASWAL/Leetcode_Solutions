class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] dist=new int[n][n];
        for(int[] d:dist){
            Arrays.fill(d,Integer.MAX_VALUE);
        }
        for(int a=0;a<n;a++){
            dist[a][a]=0;
        }
        for(int[] edge:edges){
            int node1=edge[0],node2=edge[1],dis=edge[2];
            dist[node1][node2]=dis;
            dist[node2][node1]=dis;
        }
        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(dist[i][k]<Integer.MAX_VALUE && dist[k][j]<Integer.MAX_VALUE){
                        dist[i][j]=Math.min(dist[i][j],dist[i][k]+dist[k][j]);
                    }
                }
            }
        }
        int min=n;
        int ans=-1;

        for(int i=0;i<n;i++){
            int source=0;
            for(int j=0;j<n;j++){
                if(dist[i][j]<=distanceThreshold){
                    source++;
                }
            }
            if(source<=min){
                min=source;
                ans=i;
            }
        }
        return ans;
    }
}