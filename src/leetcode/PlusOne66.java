package leetcode;
public class PlusOne66 {
    public static void main(String[] args) {
        int arr[]={9,9,9};
        arr[arr.length - 1]++;
            int i=0;
            while (i!=arr.length-1){
    if (arr[arr.length-1-i]==10){
        arr[arr.length-1-i]=0;
        arr[arr.length-2-i]++;
    }
                i++;
        }
            if (arr[0]==10){
                arr=new int[arr.length+1];
                arr[0]=1;

            }
        for (int j=0;j< arr.length;j++){
            System.out.println(arr[j]);
        }
    }
}
