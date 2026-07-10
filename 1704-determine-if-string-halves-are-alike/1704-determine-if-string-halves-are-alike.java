class Solution {
    public boolean halvesAreAlike(String s) {
        s=s.toLowerCase();
        int n=s.length();
        String a=s.substring(0,n/2);
        String b=s.substring(n/2);
        int counta=0,countb=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'){
                counta++;
            }
        }
        for(int i=0;i<b.length();i++){
            if(b.charAt(i)=='a'||b.charAt(i)=='e'||b.charAt(i)=='i'||b.charAt(i)=='o'||b.charAt(i)=='u'){
                countb++;
            }
        }
        return counta==countb;
    }
}