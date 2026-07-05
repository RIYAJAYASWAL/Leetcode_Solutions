class Solution {
    public int maxDistinct(String s) {
        int[] freq=new int[26];
        int n=s.length();
        for(char x:s.toCharArray()){
            freq[x-'a']++;
        }
        int count=0;
        for(int ch:freq){
            if(ch>0){
                count++;
            }
        }
        return count;
    }
}