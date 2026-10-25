class Solution {
    public int makeConnected(int n, int[][] connections) {
        DSU dsu =new DSU(n);
        int count=0;
        if(connections.length<n-1)return -1;
        for(int i=0;i<connections.length;i++){
            int u=connections[i][0];
            int v=connections[i][1];
            dsu.merge(u,v);
        }
        
        for(int i=0;i<n;i++){
            if(dsu.find(i)==i) count++;
        }
        return count-1;
    }
}
class DSU{
    int[] parent;
    int[] size;

    DSU(int n){
        parent=new int[n];
        size=new int[n];
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