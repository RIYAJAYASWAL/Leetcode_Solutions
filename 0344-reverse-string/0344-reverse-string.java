class Solution {
    public void reverseString(char[] s) {

        int n=s.length;
        int left=0;
        int right=n-1;
        reverse(s,left,right);
    }
    public void reverse(char[] s,int left,int right){
        if(left>=right)return;
        char temp=s[left];
        s[left]=s[right];
        s[right]=temp;

        reverse(s,left+1,right-1);
    }
}