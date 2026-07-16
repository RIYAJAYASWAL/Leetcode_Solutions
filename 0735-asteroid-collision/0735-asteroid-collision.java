class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> st=new Stack<>();
        for(int num:asteroids){
            if(num>0){
                st.push(num);
            }else{
                while(!st.isEmpty() &&st.peek()>0 && st.peek()<Math.abs(num)){
                    st.pop();
                }if(st.isEmpty()||st.peek()<0){
                    st.push(num);
                }if(st.peek()==Math.abs(num)){
                    st.pop();
                }
            }
        }
        int[] ans=new int[st.size()];
        int idx=0;
        for(int num:st){
            ans[idx++]=num;
        }
        return ans;
    }
}