package Aarray;
import java.util.Random;
public class IId1605_medium {
    public static void main(String[] args) {
        int rowSum[]={5,6,10};
        int colSum[]={8,6,8};
        int dummy=0;
        Random random = new Random();

        int arr[][]=new int[rowSum.length][colSum.length];

        for (int i=0;i<rowSum.length-1;i++){
            for (int j=0;j< colSum.length-1;j++){
                arr[i][j]=random.nextInt(0,(Math.min(rowSum[i],colSum[i] )-dummy+1));
                dummy=dummy+arr[i][j];
            }
            arr[i][colSum.length-1]=rowSum[i]-dummy;
            dummy=0;
        }

        dummy=0;
        for (int i=0;i< rowSum.length;i++) {
            for (int j = 0; j < colSum.length - 1; j++) {
                dummy = dummy + arr[j][i];
            }

            arr[colSum.length-1][i]= colSum[i]-dummy;
            dummy=0;
        }
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}
