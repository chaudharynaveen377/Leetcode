package ToDArray;

import java.util.ArrayList;

public class Sperical_traversal {
   static ArrayList<Integer> lt=new ArrayList<>();
    static void sperical(int arr[][],int idx1){
        for (int i=0 +idx1;i<arr[0].length -idx1;i++){
            lt.add(arr[idx1][i]);
        }
        for (int i=1+idx1;i<arr.length-1-idx1;i++){
            lt.add(arr[i][arr[0].length-1-idx1]);
        }
        for (int i=0 +idx1;i<arr[0].length-idx1;i++){
            lt.add(arr[arr.length-1-idx1][arr[0].length-1-i]);
        }
        for (int i=1+idx1;i<arr.length-1-idx1;i++){
            lt.add(arr[arr.length-1-i][0+idx1]);
        }
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},
                     {5,6,7,8},
                  {9,10,11,12}};

        sperical(arr,0);
        System.out.println(lt);
        System.out.println(-3<<-2);
        System.out.println(-16>>2);
    }
}
