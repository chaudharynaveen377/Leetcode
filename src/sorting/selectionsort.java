package sorting;

public class selectionsort {
    private static void swaap(int[] arr, int i, int x) {
        int temp=arr[i];
        arr[i]=arr[x];
        arr[x]=temp;
    }
    public static void main(String[] args) {
        int[] arr ={0,3,1,5,2,6,8};

//        selection sort
        for(int i=0;i< arr.length-1;i++){
            int min=i;
            for (int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            swaap(arr,i,min);
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
}
