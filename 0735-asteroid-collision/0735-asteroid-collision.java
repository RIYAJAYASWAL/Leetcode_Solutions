class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int nums:asteroids){
            if(nums>0){
                st.push(nums);
            }else{
                while(!st.isEmpty() && st.peek()>0 && st.peek()<Math.abs(nums)){
                    st.pop();
                }if(st.isEmpty() || st.peek()<0){
                    st.push(nums);
                }if(st.peek()==Math.abs(nums)){
                    st.pop();
                }
            }
        }
        int[] ans=new int[st.size()];
        int idx=0;
        for(int n:st){
            ans[idx++]=n;
        }
        return ans;
    }
}