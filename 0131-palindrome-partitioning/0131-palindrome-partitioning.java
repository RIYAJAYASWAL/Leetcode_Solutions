class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        solve(0,ans,s,new ArrayList<>());
        return ans;
    }
    public void solve(int idx,List<List<String>> ans,String s,List<String> curr){
        if(idx==s.length()){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=idx;i<s.length();i++){
            String sub=s.substring(idx,i+1);
            if(isPalindrome(sub)){
                curr.add(sub);
                solve(i+1,ans,s,curr);
                curr.remove(curr.size()-1);
            }
        }
    }
    public boolean isPalindrome(String sub){
        int left=0;
        int right=sub.length()-1;
        while(left<right){
            if(sub.charAt(left)!=sub.charAt(right))return false;
            right--;
            left++;
        }
        return true;
    }
}