package Lab_Programs.DSA_lab;

public class Transpose_matrix {

    static int[][] transpose(int matrix[][]){
         int[][] matrix2=new int[matrix[0].length][matrix.length];
        for (int i=0;i<matrix2.length;i++){
            for (int j=0;j<matrix2[0].length;j++){
               matrix2[i][j]=matrix[j][i];
            }
        }
        return matrix2;
    }
    static void print2d(int arr[][]){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j< arr[i].length;j++){
                System.out.print( " "+arr[i][j] +" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][]={{1,2},{4,5},{6,7}};
        print2d(arr);
        System.out.println("after transpose ");

        print2d(transpose(arr));

    }
}
