package Divide_Conqu;
//import javafx.util.Pair;
public class Min_Max_Array {

    public static int maxInArray(int arr[],int l,int r){
       if (l>=r) return arr[l];
       int mid= (l+r)/2;
       int left= maxInArray(arr,l,mid);
       int right= maxInArray(arr,mid+1,r);
       return Math.max(left,right);
    }


    public static int minInArray(int arr[],int l,int r){
       if (l>=r) return arr[l];
       int mid= (l+r)/2;
       int left= minInArray(arr,l,mid);
       int right=  minInArray(arr,mid+1,r);
       return Math.min(left,right);
    }


    public static void main(String[] args) {
        int arr[]={1,2,31,4,-5,6};
        System.out.println("Max element of an array: "+ maxInArray(arr,0,arr.length-1));
        System.out.println("Min element of an array: " +minInArray(arr,0,arr.length-1));
    }
}
