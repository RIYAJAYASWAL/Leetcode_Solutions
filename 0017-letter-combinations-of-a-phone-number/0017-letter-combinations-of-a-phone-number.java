class Solution {
    public List<String> letterCombinations(String digits) {
        String[] arr={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> ans=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        solve(0,ans,digits,sb,arr);
        return ans;
    }
    public void solve(int idx,List<String> ans,String digits,StringBuilder sb,String[] arr){
        if(idx==digits.length()){
            ans.add(sb.toString());
            return;
        }
        String curr=arr[digits.charAt(idx)-'0'];
        for(int i=0;i<curr.length();i++){
            sb.append(curr.charAt(i));
            solve(idx+1,ans,digits,sb,arr);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}