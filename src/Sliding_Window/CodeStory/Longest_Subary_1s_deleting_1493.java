package Sliding_Window.CodeStory;

public class Longest_Subary_1s_deleting_1493 {
    public static void main(String[] args) {
    int arr[]={1,1,0,1,1,1,0,1,1,1,0,1,1,0,1,1};
    int i=0;
    int pointer=0;
    int zeroCount=0;
    int ans=0,count=0;
    boolean flag=true;
    while (i<arr.length){
        if (arr[i]==0){
            flag=false;
            zeroCount++;
            if (zeroCount==1){
                pointer=i;
            }
        }else count++;
        if (zeroCount==2){
            count=0;
            zeroCount=0;
            i=pointer;
        }

        ans=Math.max(ans,count);
        i++;
    }
    if (flag==true){
        System.out.println(arr.length-1);
    }
        System.out.println(ans);

}
}
