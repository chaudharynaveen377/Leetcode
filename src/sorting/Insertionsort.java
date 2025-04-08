package sorting;

public class Insertionsort {
    static void disp(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    static int [] insertion(int arr[]){
        for (int i=1 ;i<arr.length;i++){
            int key=arr[i];
           int x=i-1;
            while (x>=0 && (key<arr[x])){
                arr[x+1]=arr[x];
                x--;
            }
            arr[x+1]=key;
        }
        return arr;
    }
    static int[] insertion_1(int arr[]){
        int x=0;
        for (int i=1 ;i<arr.length;i++){
            x=i;
            while (x!=0 && (arr[x]<arr[x-1])){
                int temp=arr[x];
                arr[x]=arr[x-1];
                arr[x-1]=temp;
                x--;
            }
        }
        return arr;
    }
    static int[] insertion_sort(int arr[]){
        for (int i=1;i<arr.length;i++){
            int key=arr[i];
            int x=i-1;
            while (x>=0 && key<arr[x]){
                arr[x+1]=key;
                x--;
            }
            arr[x+1]=key;
        }
        return new int[]{1, 2};
    }
    public static void main(String[] args) {
        int[] arr ={9,8,7,6,5,4,3,2,1,0};

//        disp(insertion_1(arr));
      insertion(arr);
      disp(arr);

    }
}
