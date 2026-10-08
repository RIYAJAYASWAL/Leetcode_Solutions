class Solution {
    public int[] findRedundantConnection(int[][] edges) {

        int n=edges.length;
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();

        for(int i=0;i<=n;i++){
            graph.add(new ArrayList<>());
        }

        for(int[] e:edges){
            int u=e[0];
            int v=e[1];

            boolean[] visited=new boolean[n+1];
            if(bfs(u,v,graph,visited)){
                return e;
            }
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        return new int[0];
    }
    public boolean bfs(int u,int v,ArrayList<ArrayList<Integer>> ans,boolean[] visited){
        Queue<Integer> q=new LinkedList<>();
        q.add(u);
        visited[u]=true;

        while(!q.isEmpty()){
            int node=q.poll();
            if(node==v)return true;

            for(int x:ans.get(node)){
                if(!visited[x]){
                    visited[x]=true;
                    q.add(x);
                }
            }
        }
        return false;
    }
}