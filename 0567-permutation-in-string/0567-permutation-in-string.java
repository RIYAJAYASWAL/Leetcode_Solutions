class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        int a=s1.length(),b=s2.length();
        if(a>b) return false;
        int[] count_a=new int[26];
        int[] count_b=new int[26];

        for(int i=0;i<a;i++){
            count_a[s1.charAt(i)-'a']++;
            count_b[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(count_a,count_b))return true;

        for(int i=1;i<b-a+1;i++){
            count_b[s2.charAt(i-1)-'a']--;
            count_b[s2.charAt(i+a-1)-'a']++;

            if(Arrays.equals(count_a,count_b)) return true;
        }
        return false;
    }
}