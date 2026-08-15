class Solution {
    public void reverseString(char[] s) {

        int n=s.length;
        char[] rev=new char[n];

        for(int i=0;i<n;i++){
            rev[i]=s[n-i-1];
        }
        System.arraycopy(rev, 0, s, 0, n);
    }
}