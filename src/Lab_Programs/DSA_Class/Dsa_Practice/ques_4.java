package Lab_Programs.DSA_Class.Dsa_Practice;

public class ques_4 {
    public static void main(String[] args) {
        int arr[]={3,4,2,5,3,6,2,4,0};
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            if (min1>arr[i]){
                min1=arr[i];
            }

        }
        System.out.println(min1);
        for (int i=0;i<arr.length;i++){
            if (min2>arr[i] && arr[i]>min1){
                min2=arr[i];
            }
        }
        System.out.println(min2);
    }
}
