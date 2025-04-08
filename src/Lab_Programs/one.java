package Lab_Programs;

import java.util.ArrayList;

public class one {
    static ArrayList<Integer> lt=new ArrayList<>();
    static void firstRow(int arr[][],int idx1,int idx2){
        for (int i=0;i<arr[0].length;i++){
          lt.add(arr[0][i]);
        }
        for (int i=1;i<arr.length-1;i++){
          lt.add(arr[i][arr[0].length-1]);
        }
        for (int i=0;i<arr[0].length;i++){
            lt.add(arr[arr.length-1][arr[0].length-i-1]);
        }
        for (int i=1;i<arr.length-1;i++){
            lt.add(arr[arr.length-1-i][0]);
        }
    }
static void DFS(int arr[][] ,int i,int j){

        if (i<0 || j<0 || i>arr.length-1 || j>arr[0].length-1 || arr[i][j]==-1){
            return;
        }

        lt.add(arr[i][j]);
        arr[i][j]=-1;
//    System.out.println(lt);
        DFS(arr,i,j+1);
        DFS(arr,i+1,j);
        DFS(arr,i,j-1);
        DFS(arr,i-1,j);



}
    public static void main(String[] args) {
        int a=(int)Math.pow(2,31)-1;
        int b=2;
        int c=a+b;
        System.out.println(c);
        int arr[][]={{1,2,3,4},
                     {5,6,7,8},
                  {9,10,11,12}
                ,{13,14,15,16},
                {17,18,19,20},
                {21,22,23,24}};
//        firstRow(arr);
        DFS(arr,0,0);
        System.out.println(lt);

    }
}
