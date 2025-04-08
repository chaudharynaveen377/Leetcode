package Studymaterial.Arrayquestions;

public class Q__2__Reverse_the_Array {
    static void swap(int i,int j,int arr[]){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int arr[]={2,4,1,6,5,7};
        for (int i=0;i<arr.length;i++) {
            if (i < arr.length - i - 1) {
                swap(i, arr.length - i - 1, arr);
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
