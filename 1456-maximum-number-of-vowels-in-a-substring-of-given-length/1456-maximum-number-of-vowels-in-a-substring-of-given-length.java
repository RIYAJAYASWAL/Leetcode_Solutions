class Solution {
    public int maxVowels(String s, int k) {
        int n=s.length();
        int count=0;
        for(int i=0;i<k;i++){
            if(s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u'){
                count++;
            }
        }
        int max=count;
        for(int i=1;i<n-k+1;i++){
            char ch=s.charAt(i-1);
            if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u'){
                count--;
            }
            ch=s.charAt(i+k-1);
            if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u'){
                count++;
            }
            max=Math.max(count,max);
        }
        return max;
    }
}