class Solution {
    public long sumAndMultiply(int n) {
        int sum=0;
        long mul=0;
        int k=1;
        while(n!=0){
            if(n%10!=0){
                sum=sum+n%10;
            mul=mul+(n%10)*k;
                k=k*10;
            }
            n=n/10;
        }
        return sum*mul;
    }
}