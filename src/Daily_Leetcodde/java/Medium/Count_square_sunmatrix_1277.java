package Daily_Leetcodde.java.Medium;

public class Count_square_sunmatrix_1277 {
    static int count=0;
//  [0,1,1,1],
//  [1,1,1,1],
//  [0,1,1,1]
    static int dsf(int arr[][],int i,int j){
        if (i<0 || i>arr.length-1 || j<0 || j>arr[0].length-1 || arr[i][j]==-1){
            return 0;
        }
        if (arr[i][j]==1){
            count=count+1;
            arr[i][j]=-1;
        }
        dsf(arr,i,j+1);
        dsf(arr,i+1,j);
        dsf(arr,i,j-1);
        dsf(arr,i-1,j);
        return count;
    }

    static int check(int arr[][],int i,int j){
        int count=0;
       for (int k=0;k<arr.length -i && k<arr[0].length -j;k++){
           boolean flag=true;
             for (int x=i;x<=i+k;x++){
                 for (int y=j;y<=j+k;y++){
                     if (arr[x][y]!=1){
                         flag=false;
                     }
             }
           }
               if (flag){
                   count++;
               }
               else {
                   break;
               }

       }
        return count;
    }
    static int useFl(int arr[][]){
        int count=0;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
count=count+check(arr,i,j);

            }
        }
        return count;
    }
    public static void main(String[] args) {
//        Input: matrix =
//[
//][[1,1,0,0,1],[1,0,1,1,1],[1,1,1,1,1],[1,0,1,0,1],[0,0,1,0,1]]
        int arr[][]={{1,1,0,0,1}, {1,0,1,1,1},{1,1,1,1,1},{1,0,1,0,1},{0,0,1,0,1}};
//        System.out.println(dsf(arr,0,0));
        System.out.println(useFl(arr));
//        System.out.println(check(arr,2,2));
    }
}
