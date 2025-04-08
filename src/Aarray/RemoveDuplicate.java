package Aarray;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[]={1,1,2};
        int brr[]=new int[arr.length];
        int p1=0,x=0;
         brr[0]=arr[0];
        while(p1+1!=arr.length){
            if (arr[p1]!=arr[p1+1]){
                brr[x]=arr[p1];
                brr[x+1]=arr[p1+1];
                x++;
               p1++;
                }
            else {
                p1++;
            }
        }
        System.out.println(x);
        for (int i=0;i<brr.length;i++){
            System.out.println(brr[i]);
        }
    }
}
