package leetcode.HARD;

public class Maxrainwatertraping {
    public static void main(String[] args) {
        int []arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        int p1=0;
        int p2=0;
        int max=arr[p1];
        int ans=0;
        while (p2!=arr.length){
            if (arr[p1]<max){
                ans=ans+max-arr[p1];
            }
            else {
                max = arr[p2];
                p1=p2;
            }
            if (p2==arr.length&&p1!=p2){
                
            }
        }
    }
}
