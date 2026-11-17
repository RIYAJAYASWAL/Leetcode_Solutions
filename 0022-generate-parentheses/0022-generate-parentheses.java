class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        int open=0,close=0 ;
        solve(ans,n,open,close,"");
        return ans;
    }
    public void solve(List<String> ans,int n,int open,int close,String curr){
        if(open==close && open==n){
            ans.add(curr);
            return;
        }
        if(open<=n){
            solve(ans,n,open+1,close,curr+"(");
        }
        if(close<open){
            solve(ans,n,open,close+1,curr+")");
        }
    }
}