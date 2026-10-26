class Solution {
    public int climbStairs(int n) {
        if(n<=3)return n;
        return 2*climbStairs(n-2)+climbStairs(n-3);
    }
}