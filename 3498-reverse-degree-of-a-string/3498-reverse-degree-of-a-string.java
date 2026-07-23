class Solution {
    public int reverseDegree(String s) {

        int n=s.length();
        int sum=0;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            sum+=(i+1)*(26-(c-'a'));
        }
        return sum;
    }
}