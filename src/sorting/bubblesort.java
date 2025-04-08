package sorting;

import java.util.Arrays;
import java.util.Collections;

public class bubblesort {
    public static void swap(int[] arr, int j){
        int temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
    }
//    Ascending order
    static void bubbleSortasc(int[]arr){
        boolean flag;

        for (int i=0;i<arr.length-1;i++){
            flag=true;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j);
                    flag=false;
                }
            }
            if(flag==true){
                break;
            }
        }
    }
//    descending order
static void bubbleSortdesc(int[]arr){
    boolean flag;
    flag=true;
    for (int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length-1-i;j++){
            if(arr[j]<arr[j+1]){
                swap(arr,j);
                flag=false;
            }
        }
        if(flag==true){
            break;
        }
    }
}
    static void disp(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
    public static void main(String[] args) {

        System.out.println("bubble sort");
        int[] arr ={9,8,7,6,5,4,3,2,1,0};
//       Arrays.sort(arr);
        System.out.print(" array :");
        disp(arr);
        System.out.print("\n ascending order: ");
        bubbleSortasc(arr);
        disp(arr);
        System.out.print("\n descinding order : ");
        bubbleSortdesc(arr);
        disp(arr);

    }

}
