class Solution {
    public void reverseString(char[] s) {

        int n=s.length;
        StringBuilder ans= new StringBuilder(String.valueOf(s));
        ans.reverse();

        for(int i=0;i<n;i++){
            s[i]=ans.charAt(i);
        }
    }
}