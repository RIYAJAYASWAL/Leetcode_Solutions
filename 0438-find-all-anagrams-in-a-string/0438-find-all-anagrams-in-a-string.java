class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        ArrayList<Integer> ans=new ArrayList<>();
        HashMap<Character,Integer> map=new HashMap<>();
        int count=p.length();
        int left=0;
        
        for(char c:p.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);
            if(map.containsKey(c)){
                if(map.get(c)>0){
                    count--;
                }
                map.put(c,map.get(c)-1);
            }

            if(right-left+1>p.length()){
                char r=s.charAt(left);
                if(map.containsKey(r)){
                    map.put(r,map.get(r)+1);
                    if(map.get(r)>0){
                        count++;
                    }
                }
                left++;
            }
            if(count==0){
                ans.add(left);
            }
        }
        return ans;
    }
}