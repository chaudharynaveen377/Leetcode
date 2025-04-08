package Aarray.Easy;

public class Reverse_Array {
    static void swap(int arr[],int idx1,int idx2){
       int temp=arr[idx1];
       arr[idx1]=arr[idx2];
       arr[idx2]=temp;
    }
    static void disp(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        
        int i=0;
        int j=arr.length-1;
        while (i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
        disp(arr);
        System.out.println("na");
    }
}
