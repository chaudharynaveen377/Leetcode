package Aarray;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int stat=0;
        int end=arr.length-1;
        int temp;
        while(stat<end){
          temp=arr[stat];
          arr[stat]=arr[end];
          arr[end]=temp;
          stat++;
          end--;
        }
        for(int i=0;i<arr.length-1;i++){
            System.out.println(arr[i]);
        }
    }

}