class Solution {
    public static int steps(int num){
        int count=0;
        while(num>0){
            if(num%2==0){
                num/=2;
            }else{
                num--;
            }
            count++;
        }
        return count;

    }
    public int numberOfSteps(int num) {
        return steps(num);
    }
}