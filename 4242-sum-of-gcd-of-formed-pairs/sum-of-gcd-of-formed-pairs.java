class Solution {
    static int gcd(int a,int b){
        while(b!=0){
            int t=a%b;
            a=b;
            b=t;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int n=nums.length;
        long[]prefix=new long[n];
        int mxi=0;
        for(int i=0;i<n;i++){
            mxi=Math.max(mxi,nums[i]);
            prefix[i]=gcd(nums[i],mxi);
        }
        Arrays.sort(prefix);
        long ans=0;

        int l=0;
        int r=n-1;
        while(l<r){
            ans+=gcd((int)prefix[l],(int)prefix[r]);
            l++;
            r--;
        }
        return ans;
    }
}