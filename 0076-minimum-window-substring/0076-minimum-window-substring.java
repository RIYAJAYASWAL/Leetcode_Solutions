class Solution {
    public String minWindow(String s, String t) {

        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:t.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int left=0;
        int count=0;
        int minlen=Integer.MAX_VALUE;
        int start=0;

        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            if(map.containsKey(ch)){
                if(map.get(ch)>0){
                    count++;
                }
                map.put(ch,map.get(ch)-1);
            }
            while(count==t.length()){
                if(right-left+1<minlen){
                    minlen=right-left+1;
                    start=left;
                }
                char leftChar=s.charAt(left);

                if(map.containsKey(leftChar)){
                    map.put(leftChar,map.get(leftChar)+1);

                    if(map.get(leftChar)>0){
                        count--;
                    }
                }
                left++;
            }
        }
        String ans="";
        if(minlen!=Integer.MAX_VALUE){
            ans=s.substring(start,start+minlen);
        }
        return ans;
    }
}