package Recursion;

public class LastOccurence {
    static int lastoccur(int arr[],int i,int x){
        if (i==arr.length){
            return -1;
        }
        int lst=lastoccur(arr,i+1,x);
        if (lst==-1 && arr[i]==x){
            return i;
        }
        return lst;
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,7,9,6,3};
        int target=3;
        System.out.println(lastoccur(arr,0,target));
    }
}
