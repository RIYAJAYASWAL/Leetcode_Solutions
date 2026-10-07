class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans=new LinkedList();
        List<Integer> curr=new ArrayList();
        curr.add(0);
        dfs(0,curr,graph,graph.length-1,ans);
        return ans;
    }
    private void dfs(int src,List<Integer> curr,int graph[][],int dest,List<List<Integer>> ans){
        if(src==dest){
            ans.add(new ArrayList(curr));
            return;
        }
        for(int n:graph[src]){
            curr.add(n);
            dfs(n,curr,graph,dest,ans);
            curr.remove(curr.size()-1);
        }
    }
}