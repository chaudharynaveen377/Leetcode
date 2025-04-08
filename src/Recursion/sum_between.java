package Recursion;

public class sum_between {
    static int sum(int start,int end){
        if (end==start){
            return end;
        }
        return start+sum(start+1,end);
    }
    public static void main(String[] args) {
        System.out.println(sum(3,3));
        int arr[]=new int[]{1,3,5,78};
    }

}
