package leetcode;

public class RemoveOneElementtoMaketheArrayStrictlyIncreasing1909 {
    public static void main(String[] args) {
        int arr[]={2,3,1,2};
        int brr[]=new int[4];
        int count=0;
        for (int i=0;i<arr.length-1;i++){
            if (arr[i]<=arr[i+1]){
                brr[i]=arr[i];
            }
        }
for (int i=0;i<4;i++){
    System.out.println(brr[i]);
}


    }
}
