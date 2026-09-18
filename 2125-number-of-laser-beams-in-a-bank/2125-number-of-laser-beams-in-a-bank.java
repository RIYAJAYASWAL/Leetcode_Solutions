class Solution {
    public int numberOfBeams(String[] bank) {
        int prev=0;
        int ans=0;
        int n=bank.length;
        
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<bank[i].length();j++){
                if(bank[i].charAt(j)=='1'){
                    count++;
                }
            }
            if(count>0){
                ans+=prev*count;
                prev=count;
            }
        }
        return ans;
    }
}