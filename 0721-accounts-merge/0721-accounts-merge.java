class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        int n=accounts.size();
        DSU dsu=new DSU(n);
        Map<String,Integer> etou=new HashMap<>();
        Map<Integer,TreeSet<String>> merge=new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=1;j<accounts.get(i).size();j++){
                String email=accounts.get(i).get(j);

                if(etou.containsKey(email)){
                    dsu.merge(etou.get(email),i);
                }else{
                    etou.put(email,i);
                }
            }
        }
        for(String email:etou.keySet()){
            int parent=dsu.find(etou.get(email));
            if(!merge.containsKey(parent)){
                merge.put(parent, new TreeSet<>());
            }
            merge.get(parent).add(email);
        }
        List<List<String>> ans=new ArrayList<>();
        for(int parent:merge.keySet()){
            List<String> account = new ArrayList<>();
            account.add(accounts.get(parent).get(0));
            account.addAll(merge.get(parent));

            ans.add(account);
        }
        return ans;
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
        if(parent[x]==x)return x;
        return parent[x]=find(parent[x]);
    }
    public void merge(int x,int y){
        int rootA=find(x);
        int rootB=find(y);
        if(rootA==rootB) return;
        if(size[rootA]<size[rootB]){
            int temp=rootA;
            rootA=rootB;
            rootB=temp;
        }
        parent[rootB]=rootA;
        size[rootA]+=size[rootB];
    }
}