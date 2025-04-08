package Daily_Leetcodde.java;

public class MinOperation_3191 {
//    static void makeReverse(int arr[],int i)
    static int window(int arr[]){
        int i=0;
        int  j=2;
        int count=0;
//        rtest first three numbers

        if (arr[0]==0) {
            arr[0] = 1;
            if (arr[1] == 0) {
                arr[1] = 1;
            }if (arr[1] == 1) {
                arr[1] = 0;
            }
            if (arr[2] == 0) {
                arr[2] = 1;
            }if (arr[2] == 1) {
                arr[2] = 0;
            }
            count++;
        }

        i++;
        j++;
        while (j<arr.length){
           if (arr[i]==0){
               arr[i]=1;
               count++;
           }
           if (arr[j]==0){
               arr[j]=1;
           }
           i++;
           j++;
        }
        while (i<arr.length){
            if (arr[i]==0){
                return -1;
            }
            i++;
        }

        return count;

    }
    public static void main(String[] args) {
//        Input: nums = [0,1,1,1,0,0]

//        Output: 3
        int nums[]={0,1,1,1,0};
        System.out.println(window(nums));
    }
}
