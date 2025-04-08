package Aarray.medium;

public class Best_Sightseeing_pair {
    static int broute_force(int [] arr){
        int max=0;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                int sight_pair=arr[i]+arr[j]+i-j;
                max=Math.max(max,sight_pair);
            }
        }
        return max;
    }
    static int [] minus_i(int arr[]){
       int[] arr1=new int[arr.length];
        for (int i=0;i<arr.length;i++){
            arr1[i]=arr[i]-i;
        }
        int max=Integer.MIN_VALUE;
        for (int i=arr.length-1;i>=0;i--){
            if (max<arr1[i]){
                max=arr1[i];
            }
            arr1[i]=max;
        }
        return arr1;
    }
    static int [] plus_i(int arr[]){
       int[] arr2=new int[arr.length];
        for (int i=0;i<arr.length;i++){
            arr2[i]=arr[i]+i;
        }
        return arr2;
    }

    static int logic(int arr1[],int []arr2){
        int max=0;
        for (int i=0;i<arr1.length-1;i++){
           int Pair_max=arr1[i]+arr2[i+1];
           max=Math.max(max,Pair_max);
            System.out.println(max +"max ");
        }
        return max;
    }
    public static void main(String[] args) {
        int value[]={1,2}; // 8 6 5 2 1  --> 8 0 3 -1 2  --> .3 3 3 2 2
                                                // 8 2 7 5 10  -->
        // The score of a pair (i < j)of sightseeing spots
//        is values[i] + values[j] + i - j
int arr2[]=minus_i(value);
int arr1[]=plus_i(value);
        System.out.println(logic(arr1,arr2));
    }
}
