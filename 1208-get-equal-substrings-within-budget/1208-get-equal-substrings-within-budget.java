class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n=s.length();
        int j=0;
        int max=0;
        int sum=0;

        for(int i=0;i<n;i++){
            sum+=Math.abs(s.charAt(i)-t.charAt(i));
            while(sum>maxCost){
                sum-=Math.abs(s.charAt(j)-t.charAt(j));
                j++;
            }
            max=Math.max(max,i-j+1);
        }
        return max;
    }
}