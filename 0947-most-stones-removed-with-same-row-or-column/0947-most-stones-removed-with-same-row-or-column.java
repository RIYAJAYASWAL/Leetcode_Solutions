class Solution {
    public int removeStones(int[][] stones) {
        int n=stones.length;
        DSU dsu =new DSU(20002);
        
        for(int[] stone:stones){
            int x=stone[0];
            int y=stone[1]+10001;
            dsu.merge(x,y);
        }
        int count=0;
        Set<Integer> set=new HashSet<>();
        for(int[] stone:stones){
            set.add(dsu.find(stone[0]));
        }
        return n-set.size();
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
    public int find(int x){
        if(parent[x]==x)return x;
        return parent[x]=find(parent[x]);
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