class Solution {
    public String interpret(String command) {
        int n=command.length();
        StringBuilder ans=new StringBuilder();
        int i=0;
        while(i<n){
            char ch=command.charAt(i);
            if(ch=='G'){
                ans.append("G");
                i++;
            }else if(ch=='('){
                if(command.charAt(i+1)==')'){
                    ans.append("o");
                    i+=2;
                }else{
                    ans.append("a");
                    ans.append("l");
                    i+=3;
                }
            }else{
                i++;
            }
        }
        return ans.toString();
    }

}