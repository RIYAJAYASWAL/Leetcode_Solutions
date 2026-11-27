class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        int n=asteroids.length;
        if(n==0)return true;
        long sum=mass;
        if(sum<asteroids[0])return false;
        for(int i=0;i<n-1;i++){
            sum+=asteroids[i];
            if(sum<asteroids[i+1]){
                return false;
            }
        }
        return true;
    }
}