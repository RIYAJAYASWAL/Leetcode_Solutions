class Solution {
    public int gcd(int a,int b){
        if(a==0)return b;
        return gcd(b%a,a);
    }
    public List<String> simplifiedFractions(int n) {
        List<String> ans=new ArrayList<>();

        for(int den=2;den<=n;den++){
            for(int num=1;num<=den;num++){
                if(gcd(num,den)==1) ans.add(num+"/"+den);
            }
        }
        return ans;
    }
}