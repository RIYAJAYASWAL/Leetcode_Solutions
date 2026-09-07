class Solution {
    public int longestContinuousSubstring(String s) {
        int count=0;
        int max=0;
        int n=s.length();
        for(int i=1;i<n;i++){
            char c=s.charAt(i-1);
            char d=s.charAt(i);
            if(d-c==1){
                count++;
                max=Math.max(count,max);
            }else{
                count=0;
            }
        }
        return max+1;
    }
}