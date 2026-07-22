class Solution {
    public String removeStars(String s) {

        Stack<Character> st=new Stack<>();
        for( char x:s.toCharArray()){
            if(x=='*' && !st.isEmpty()){
                st.pop();
            }else{
                st.push(x);
            }
        }

        StringBuilder str=new StringBuilder();
        for(char ch:st){
            str.append(ch);
        }
        return str.toString();
    }
}