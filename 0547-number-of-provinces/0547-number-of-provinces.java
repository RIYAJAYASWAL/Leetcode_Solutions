class Solution {
    
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int[] parent=new int[n];
        int[] size=new int[n];

        for(int i=0;i<n;i++){
            parent[i]=i;
            size[i]=1;
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(isConnected[i][j]==1){
                    merge(i,j,parent,size);
                }
            }
        }
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(find(i,parent));
        }
        return set.size();
    }
    public int find(int x,int[]parent){
        if(parent[x]==x){
            return x;
        }
        return parent[x]=find(parent[x],parent);
    }
    public void merge(int a,int b,int[] parent,int[]size){
        int rootA=find(a,parent);
        int rootB=find(b,parent);
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