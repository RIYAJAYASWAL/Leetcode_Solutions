class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        solve(0,0,ans,n,"");
        return ans;
    }
    public void solve(int open,int close,List<String>ans,int n,String curr){
        if(open==close && open==n){
            ans.add(curr);
            return;
        }
        if(open<n){
            solve(open+1,close,ans,n,curr+"(");
        }
        if(close<open){
            solve(open,close+1,ans,n,curr+")");
        }
    }
}