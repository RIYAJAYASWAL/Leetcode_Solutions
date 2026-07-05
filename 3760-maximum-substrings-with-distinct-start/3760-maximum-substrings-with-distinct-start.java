class Solution {
    public int maxDistinct(String s) {
        boolean[] seen=new boolean[26];
        int n=s.length();
        int count=0;

        for(int i=0;i<n;i++){
            int idx=s.charAt(i)-'a';

            if(!seen[idx]){
                seen[idx]=true;
                count++;
            }
        }
        return count;
    }
}