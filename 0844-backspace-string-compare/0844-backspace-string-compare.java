class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack <Character> st=new Stack<>();
        Stack <Character> tt=new Stack<>();

        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i)=='#'){
                if(!st.isEmpty()){
                   st.pop(); 
                }
            }else{
                st.push(s.charAt(i));
            }
        }
        StringBuilder ans=new StringBuilder();
        for(char ch:st){
            ans.append(ch);
        }


        for(int j=0;j<t.length();j++){
            if(t.charAt(j)=='#'){
                if(!tt.isEmpty()){
                     tt.pop();
                }
            }else{
                tt.push(t.charAt(j));
            }
        }
        StringBuilder str=new StringBuilder();
        for(char ch:tt){
            str.append(ch);
        }

    return ans.toString().equals(str.toString());
    }
}