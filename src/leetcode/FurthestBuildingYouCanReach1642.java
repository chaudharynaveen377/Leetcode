package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FurthestBuildingYouCanReach1642 {
    public static void main(String[] args) {
        int height[]={1,5,1,2,3,4,1000};
        Arrays.sort(height);
        int briks=4;
        int ladders=1;
        int count=0;
        for (int i=0;i<height.length-1;i++){
            if (height[i+1]<=height[i]){
                count++;

            }
            else if (height[i+1]-height[i]<=briks){
                    briks=briks-(height[i+1]-height[i]);
                    count++;
                }
            else if(ladders>0){
                count++;
                ladders--;
            }
            else {
                break;
            }


        }

        System.out.println(count);
    }
}
