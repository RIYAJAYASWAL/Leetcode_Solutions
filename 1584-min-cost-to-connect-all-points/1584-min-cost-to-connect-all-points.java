class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n=points.length;
        DSU dsu=new DSU(n);
        ArrayList<int[]> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int dist=Math.abs(points[i][0]-points[j][0])+Math.abs(points[i][1]-points[j][1]);
                res.add(new int[]{dist,i,j});
            }
        }
        res.sort((a,b)->Integer.compare(a[0],b[0]));
        int cost=0;
        int count=0;
        for(int[] edge:res){
            int d=edge[0];
            int u=edge[1];
            int v=edge[2];
            if(dsu.find(u)!=dsu.find(v)){
                dsu.merge(u,v);
                cost+=d;
                count++;

                if(count==n-1)break;
            }
        }
        return cost;
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