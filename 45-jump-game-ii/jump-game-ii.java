class Solution {

 


    public int jump(int[] nums) {
        int counter = 0;
        int farest = 0;
        int currentEnd = 0;
        
        for(int i = 0; i < nums.length-1 ; i++){
            farest = Math.max(farest, i+nums[i]);
            if(currentEnd==i){
                counter++;
                currentEnd = farest;
            }
        }


        return counter;
    }




   
}