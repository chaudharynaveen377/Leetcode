class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        int n=plantTime.length;

        int seeds[][]=new int[n][2];

        //store growtime and plant time 
        for(int i=0;i<n;i++){
            seeds[i][0]=growTime[i];
            seeds[i][1]=plantTime[i];
        }
        //descending order
       Arrays.sort(seeds,(a,b)->(b[0]-a[0]));

       int plantDays = 0;
        int ans = 0;

        for (int[] seed : seeds) {
            plantDays += seed[1];
            ans = Math.max(ans, plantDays + seed[0]);
        }

        return ans;


    }
}