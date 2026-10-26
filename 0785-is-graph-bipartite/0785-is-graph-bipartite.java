class Solution {
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int[] color=new int[n];
        for(int i=0;i<n;i++){
            if(color[i]==0){
                if(!bfs(graph,i,color))return false;
            }
        }
        return true;
    }
    public boolean bfs(int[][] graph,int s,int[] color){
        Queue<Integer> q=new LinkedList<>();
        color[s]=1;
        q.offer(s);
        while(!q.isEmpty()){
            int curr=q.poll();
            for(int next:graph[curr]){
                if(color[next]==color[curr])return false;
                else if(color[next]==0){
                    if(color[curr]==1){
                        color[next]=2;
                    }else{
                        color[next]=1;
                    }
                    q.offer(next);
                }
            }
        }
        return true;
    }
}