class Solution {
    public long sumAndMultiply(int n) {
        
        int sum=0;
        int temp=n;
        long num=0;

        int rev=0;
        while(temp>0){
            rev=rev*10+temp%10;
            temp/=10;
        }
        temp=rev;
        
        while(temp>0){
            int digit=temp%10;
            sum+=digit;
            
            if(digit!=0){
                num=num*10+digit;
            }
            temp/=10;
        }
        return num*sum;
    }
}