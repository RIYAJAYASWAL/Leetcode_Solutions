class Solution {
    public int calPoints(String[] operations) {

        int sum=0;
        int n=operations.length;
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<n;i++){
            if(operations[i].equals("C")){
                st.pop();
            }else if(operations[i].equals("D")){
                st.push(st.peek()*2);
            }else if(operations[i].equals("+")){
                int last=st.pop();
                int secondl=st.peek();
                st.push(last);
                st.push(last+secondl);
            }else{
                st.push(Integer.parseInt(operations[i]));
            }
        }
        
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        
        return sum;
    }
}