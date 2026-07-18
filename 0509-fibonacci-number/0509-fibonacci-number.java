class Solution {
    public int fibonacci(int n){
       if(n<=1){
            return n;
        }
        return fib(n-1)+fib(n-2); 
    }
    public int fib(int n) {
        return fibonacci(n);
    }
}