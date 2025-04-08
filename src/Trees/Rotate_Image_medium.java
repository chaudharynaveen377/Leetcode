package Trees;

public class Rotate_Image_medium {
    public static void main(String[] args) {
        int matrix1[][] = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        int matrix2[][] = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        for (int i=0;i<matrix1.length;i++){
            for (int j=0;j<matrix1[0].length;j++){
                matrix2[j][matrix1.length-1-i]=matrix1[i][j];
            }
        }
        for (int i=0;i<matrix1.length;i++){
            for (int j=0;j<matrix1[0].length;j++){
                System.out.print(matrix2[i][j] +" ");
            }
            System.out.println();
        }

    }
}
