class Solution {
    public boolean areOccurrencesEqual(String s) {
        int n=s.length();
        int[] freq=new int[26];

        for(int x:s.toCharArray()){
            freq[x-'a']++;
        }
        for(int i=0;i<n-1;i++){
            if(freq[s.charAt(i+1)-'a']-freq[s.charAt(i)-'a']!=0){
                return false;
            }
        }
        return true;
    }
}