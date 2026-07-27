class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> fr=new HashSet<>();
        for(int f:friends){
            fr.add(f);
        }
        List<Integer> result=new ArrayList<>();
        for(int o:order){
            if(fr.contains(o)){
                result.add(o);
            }
        }
        
        int[] ans=new int[result.size()];
        for(int i=0;i<result.size();i++){
            ans[i]=result.get(i);
        }
        return ans;
    }
}