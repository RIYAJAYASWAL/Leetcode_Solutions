class Solution {
    public String reversePrefix(String word, char ch) {
        int idx=word.indexOf(ch);
        StringBuilder ans=new StringBuilder();
        String a=word.substring(0,idx+1);
        String b=word.substring(idx+1);

        ans.append(a);
        ans.reverse();
        ans.append(b);
        return ans.toString();
    }
}