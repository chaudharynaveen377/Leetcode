package Lab_Programs;

public class Add_Mult_2D_Array {

    static int [][] Add(int [][]arr1,int arr2[][]){
        int ans[][]=new int[arr1.length][arr1[0].length];
        for (int i=0;i< arr1.length;i++){
            for (int j=0;j< arr1[0].length;j++){
                ans[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        return ans;
    }

    static int [][] multiply(int [][]arr1,int arr2[][]){
        int ans[][]=new int[arr1.length][arr1[0].length];
        for (int i=0;i< arr1.length;i++){
            for (int j=0;j< arr1[0].length;j++){
                ans[i][j]=helper(arr1,arr2,i,j);
            }
        }
        return ans;
    }
    static int helper(int arr[][],int arr1[][],int i,int j){
        int x=0;
       for (int k=0;k<arr.length;k++){
           x=x+arr[i][k]*arr1[k][j];
        }
        return x;
    }
    static void print2d(int arr[][]){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j< arr[0].length;j++){
                System.out.print( "| "+arr[i][j] +" |");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr1[][]={{1,2,3}
                     ,{4,5,6},
                      {7,8,9}};
        int arr2[][]={{1,2,3}
                     ,{4,5,6},
                      {7,8,9}};
        if (arr1.length!= arr2.length || arr1[0].length!= arr2[0].length){
            System.out.println("addtion  not possible");
            return;
        }

        int [][] add= Add(arr1,arr2);
        int [][] mul= multiply(arr1,arr2);
        System.out.println("matrix1 ");
        print2d(arr1);
        System.out.println("matrix2 ");
        print2d(arr2);

        System.out.println("Addition ");
        print2d(add);
        System.out.println("multiply ");
        print2d(mul);

    }
}
