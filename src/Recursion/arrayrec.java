package Recursion;

public class arrayrec {
    static int trgt(int []arr,int target,int i){
        if (arr[i]==target){
            System.out.println(i);
            return i;
        }
       return trgt(arr,target,i+1);
    }
    static Boolean sort(int []arr,int i){
        if (arr[i]<=arr[i+1] && i<arr.length-1){
            return true;
        }
        if (arr[i]>arr[i+1] ){
            return false;
        }
       return sort(arr,i+1);
    }
    public static void main(String[] args) {
        int arr[]={21,3,4,5,6,7};
        System.out.println(trgt(arr,5,0));
        System.out.println(sort(arr,0));
    }
}
