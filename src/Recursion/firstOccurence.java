package Recursion;

public class firstOccurence {
    static int fstoccr(int arr[],int i,int x){
        if (i== arr.length){
            return -1;
        }
        if (arr[i]==x){
            return i;
        }
        return fstoccr(arr,i+1,x);

    }

    public static void main(String[] args) {
        int arr[]={1,4,6,8,0,7};
        int occ=8;
        System.out.println(fstoccr(arr,0,occ));
    }
}
