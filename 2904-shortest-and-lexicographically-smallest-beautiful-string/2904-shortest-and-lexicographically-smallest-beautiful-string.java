class Solution {
    public String shortestBeautifulSubstring(String s, int k) {

        int n=s.length();
        int start=-1,end=-1;
        int count=0,i=0;
        int ans=Integer.MAX_VALUE;

        for(int j=0;j<n;j++){

            char ch=s.charAt(j);

            if(ch=='1'){
                count++;
            }
            while(count>=k){
                int length=j-i+1;
                if((ans>length) || (ans==length && s.substring(i,j+1).compareTo(s.substring(start,end+1))<0)){
                    ans=j-i+1;
                    start=i;
                    end=j;
                }
                if(s.charAt(i)=='1'){
                    count--;
                }
                i++;
            }
        }
        return (start==-1)?"":s.substring(start,end+1);
    }
}