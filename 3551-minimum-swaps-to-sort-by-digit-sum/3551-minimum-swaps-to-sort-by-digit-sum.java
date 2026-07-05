class Solution {
    public int minSwaps(int[] nums) {

        int n=nums.length;
        int[] ans=new int[n];
        int count=0;
        
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int num=nums[i];
            int sum=0;
            while(num>0){
                int digit=num%10;
                sum+=digit;
                num/=10;
            }
            ans[i]=sum;
            
        }
        int[][] arr=new int[n][3];

        for(int i=0;i<n;i++) {
            arr[i][0]=ans[i];
            arr[i][1]=nums[i];
            arr[i][2]=i;
        }

        Arrays.sort(arr,(a,b)->{
            if(a[0]!=b[0])return a[0]-b[0];
            return a[1]-b[1];
        });

        int swap=0;
        boolean[] visit=new boolean[n];
        for(int i=0;i<n;i++){
            if (visit[i] || arr[i][2]==i)continue;
            int len=0;
            for(int j=i;!visit[j];j=arr[j][2]) {
                visit[j]=true;
                len++;
            }
            swap+=len-1;
        }
        return swap;
    }
}