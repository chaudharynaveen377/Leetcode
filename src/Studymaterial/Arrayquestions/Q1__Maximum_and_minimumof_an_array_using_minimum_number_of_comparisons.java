package Studymaterial.Arrayquestions;

public class Q1__Maximum_and_minimumof_an_array_using_minimum_number_of_comparisons {
    public static void main(String[] args) {

        int arr[]={17,6,5,4,3,2};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
                max=Math.max(max,arr[i]);
                min=Math.min(min,arr[i]);

        }
        System.out.println(max);
        System.out.println(min);
    }
}
