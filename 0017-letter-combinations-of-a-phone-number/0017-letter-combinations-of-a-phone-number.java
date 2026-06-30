class Solution {
    private void f(int idx,StringBuilder s,List<String> ans,String digits,String []key){
        if(idx==digits.length()){
            ans.add(s.toString());
            return;
        }String curr=key[digits.charAt(idx)-'0'];
        for(int i=0;i<curr.length();i++){
            s.append(curr.charAt(i));
            f(idx+1,s,ans,digits,key);
            s.deleteCharAt(s.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
        String[] key={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        StringBuilder s=new StringBuilder();
        f(0,s,ans,digits,key);
        return ans;
    }
}