class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        int[][] idx=new int[n][2];
        for(int i=0;i<n;i++) idx[i]=new int[]{i,score[i]};
        Arrays.sort(idx,(a,b)->(b[1]-a[1]));
        String[] ans=new String[n];

        for(int i=0;i<n;i++){
            if(i==0){
                ans[idx[i][0]]="Gold Medal";
            }else if(i==1){
                ans[idx[i][0]]="Silver Medal";
            }else if(i==2){
                ans[idx[i][0]]="Bronze Medal";
            }else{
                ans[idx[i][0]]=String.valueOf(i+1);
            }
        }
        return ans;
    }
}