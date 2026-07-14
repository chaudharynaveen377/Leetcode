class Solution {
     static boolean solve(int[] arr, int t, int totalTrips) {
        int count = 0;
        for (int time : arr) {
            if(time<t){
                count++;
            }
            else{
                int step=(time%t==0)?0:1;
                count=count+time/t + step;
            }
            
            if (count > totalTrips) return false;  
        }
        return count <= totalTrips;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int val:piles){
            max=Math.max(max,val);
        }
        int l=1;
        int r=max;
        int ans=r;
    while(l<r){
        int mid=(l+(r-l)/2);
        if(solve(piles,mid,h)){
            ans=Math.min(ans,mid);
            r=mid;
        }else{
            l=mid+1;
        }
    }

       return l; 
    }
}