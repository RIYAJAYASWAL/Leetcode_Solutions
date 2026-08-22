class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int ans=0;
        while(i<j){
            int min_h=Math.min(height[j],height[i]);
            int currentArea=min_h*(j-i);
            ans=Math.max(ans,currentArea);
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return ans;
    }
}