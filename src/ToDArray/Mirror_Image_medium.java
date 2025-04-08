package ToDArray;

public class Mirror_Image_medium {
    static void transpose(int matrix[][]){
        for (int i=0;i<matrix.length;i++){
            for (int j=i;j<matrix[0].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
            for (int j=0;j<matrix[0].length/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j]=temp;
            }

        }


    }
    public static void main(String[] args) {
        int [][]matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        transpose(matrix);
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                System.out.println(matrix[i][j]);
            }
        }
    }
}
