class Solution {
    public int gcd(int a,int b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
    public int gcdOfOddEvenSums(int n) {

        int sum1=0,sum2=0;
        for(int i=1;i<=n*2;i++){
            if(i%2==0){
                sum1+=i; 
            }else{
                sum2+=i;
            }
        }
        return gcd(sum1,sum2);
    }
}