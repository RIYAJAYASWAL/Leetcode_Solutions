class Solution {
    public boolean equationsPossible(String[] equations) {
        int n=equations.length;
        DSU dsu=new DSU(26);
        for(String s:equations){
            int u=s.charAt(0)-'a';
            int v=s.charAt(3)-'a';

            if(s.charAt(1)=='='){
                dsu.merge(u,v);
            }  
        }
        for(String s:equations){
            int u=s.charAt(0)-'a';
            int v=s.charAt(3)-'a';
            if(s.charAt(1)=='!'){
                if(dsu.find(u)==dsu.find(v)){
                    return false;
                }
            }
        }
        return true;
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
    public int find(int x){
        if(parent[x]==x) return x;
        return parent[x]=find(parent[x]);
    }
    public void merge(int x,int y){
        int rootA=find(x);
        int rootB=find(y);
        if(size[rootA]<size[rootB]){
            int temp=rootA;
            rootA=rootB;
            rootB=temp;
        }
        parent[rootB]=rootA;
        size[rootA]+=size[rootB];
    }
}