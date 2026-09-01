class Solution {
    public int numberOfSubstrings(String s) {

        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0;int count=0;
        for(int right=0;right<n;right++){
            char ch=s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);

            while(map.size()==3){
                count+=n-right;
                char leftchar=s.charAt(left);
                map.put(leftchar,map.get(leftchar)-1);
                if(map.get(leftchar)==0){
                    map.remove(leftchar);
                }
                left++;
            }
        }
        return count;
    }
}