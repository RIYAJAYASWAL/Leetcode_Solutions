class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        
        int n=drones.length;
        int min_r=Integer.MAX_VALUE;
        int idx=-1;

        for(int i=0;i<n;i++){
            int range=Math.abs(drones[i][0]-target[0])+Math.abs(drones[i][1]-target[1]);
            if(range<=drones[i][2]){
                if(range<min_r){
                    min_r=range;
                    idx=i;
                }
            }
        }
        return idx;
    }
}