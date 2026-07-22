class Solution {
    public int minDeletion(int[] nums) {

        Stack<Integer> st=new Stack<>();
        int count=0;

        for(int x:nums){
            if(st.size()%2==0){
                st.push(x);
            }else{
                if(st.peek()==x){
                    count++;
                }else{
                    st.push(x);
                }
            }   
        }

        if(st.size()%2 !=0){
            count++;
        }
        return count;
    }
}