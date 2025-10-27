// User function Template for Java

class Solution {
    public int nthFibonacci(int n) {
        // code here
        int  a=0;
     int  b=1;
     int c=0;
     if(n<2){
         return n;
     }
     for(int i=2;i<=n;i++){
     c=a+b;
     a=b;
     b=c;
     }
     return c;
    }
}
