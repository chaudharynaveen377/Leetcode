package calculation;

public class Swap {
   static void swap(int a,int b,int []arr){
int temp=arr[a];
arr[a]=arr[b];
arr[b]=temp;
    }
    public static void main(String[] args) {
        int a=0,b=1;
        int arr[]={2,6};
  swap(a,b,arr);
        System.out.println(arr[0]+" "+arr[1]);
    }
}
