package Aarray;

public class Maxelement {
    public static void main(String[] args) {
//        int arr[]={200,5,4,1,74,5};
////        to find max element in array
//        int max=Integer.MIN_VALUE;
////        or    =arr[0]
//        for (int i=0;i<arr.length;i++){
//            max=Math.max(max,arr[i]);
//        }
//        System.out.println(max);
//    }

//best time to buy and  sell stock
        int max=0;
        int arr[]={7,6,5,4,3,2};
        for (int i=0;i<arr.length;i++){
            for (int j=i;j<arr.length;j++){
                max=Math.max(max,arr[j]-arr[i]);
            }
        }
        System.out.println(max);
    }
}