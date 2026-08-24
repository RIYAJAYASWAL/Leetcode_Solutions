class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int [] match:matches){
            int loser=match[1];
            map.put(loser,map.getOrDefault(loser,0)+1);
            map.putIfAbsent(match[0],0);
        }
        ArrayList<Integer> win=new ArrayList<>();
        ArrayList<Integer> loss=new ArrayList<>();

        for(int player:map.keySet()){
            if(map.get(player)==0){
                win.add(player);
            }else if(map.get(player)==1){
                loss.add(player);
            }
        }
        Collections.sort(win);
        Collections.sort(loss);
        return Arrays.asList(win,loss);
    }
}