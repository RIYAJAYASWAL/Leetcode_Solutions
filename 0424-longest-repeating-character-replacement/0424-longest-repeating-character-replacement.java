class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq=new int[26];
        int n=s.length();
        int max_f=0;
        int ans=0;
        int j=0;

        for(int i=0;i<n;i++){
            freq[s.charAt(i) - 'A']++;
            max_f=Math.max(max_f,freq[s.charAt(i)-'A']);
            int size=i-j+1;

            if(size-max_f>k){
                freq[s.charAt(j)-'A']--;
                j++;
            }
            ans=Math.max(ans,i-j+1);
        }
        return ans;
    }
}