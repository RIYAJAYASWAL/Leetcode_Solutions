class Solution {
    public boolean isValid(String s1) {
        Stack<Character> st=new Stack<>();

        for(char ch:s1.toCharArray()){
            if(ch=='('){
                st.push(')');
            }else if(ch=='{'){
                st.push('}');
            }else if(ch=='['){
                st.push(']');
            }else if(st.isEmpty() || st.pop()!=ch){
                return false;
            }
        }
        return st.isEmpty();
    }
}