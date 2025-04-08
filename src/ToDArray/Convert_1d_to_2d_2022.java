package ToDArray;

public class Convert_1d_to_2d_2022 {
    public static int[][] convert(int arr[],int m,int n){
        if (arr.length/n==m && arr.length/m==n){
            int newarr[][]=new int[m][n];
            int k=0;
            for (int i=0;i<m;i++){
                for (int j=0;j<n;j++){
                    newarr[i][j]=arr[k++];
                }
            }
            return newarr;
        }
        return new int[0][0];
    }

    static void display(int arr[][]){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4};
        int  m=4;
        int n=1;
        display(convert(arr,m,n));
    }
}
