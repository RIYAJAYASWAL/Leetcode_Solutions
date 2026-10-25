class Solution {
    public int[] findRedundantConnection(int[][] edges) {

        int n=edges.length;
        int[] ans=new int[2];
        DSU dsu=new DSU(n);
        for(int i=0;i<n;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            if(dsu.find(u)==dsu.find(v)){
                ans=edges[i];
            }
            dsu.merge(u,v);
        }
        return ans;
    }
}
class DSU{
    int[] parent;
    int[] size;

    DSU(int n){
        parent=new int[n+1];
        size=new int[n+1];

        for(int i=0;i<n;i++){
            parent[i]=i;
            size[i]=1;
        }
    }
    public int find(int n){
        if(parent[n]==n)return n;
        return parent[n]=find(parent[n]);
    }
    public void merge(int x,int y){
        int rootA=find(x);
        int rootB=find(y);
        if(rootA==rootB)return;
        if(size[rootA]<size[rootB]){
            int temp=rootA;
            rootA=rootB;
            rootB=temp;
        }
        parent[rootB]=rootA;
        size[rootA]+=size[rootB];
    }
}