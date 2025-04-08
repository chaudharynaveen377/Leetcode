package Aarray;

public class AraayofSubArray {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int  n=arr.length;
        int brr[][]=new int[(n * (n + 1)) / 2][arr.length];
        for (int i=0;i<arr.length;i++) {
            for (int j = i; j < arr.length; j++) {

                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]);
                    brr[i][j]=arr[k];
                }

                System.out.println();
            }
        }
        for (int i = 0; i <( n * (n + 1)) / 2; i++) {
            for (int j = 0; j < brr[0].length; j++) {
                System.out.print(brr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
