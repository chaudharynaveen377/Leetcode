package Aarray;

public class mergearray {
    public static void merge(int arr[],int brr[]){
        int crr[]=new int[arr.length+brr.length];
        int x=0,y=0,i=0;
        while (x<arr.length && y<brr.length){
            if (arr[x]<=brr[y]){
                crr[i]=arr[x];
                x++;
                i++;
            }
            else  if (brr[y]<arr[x]){
                crr[i]=brr[y];
                y++;
                i++;
            }
        }
        while (x<arr.length ){
            crr[i]=arr[x];
            i++;
            x++;
        }
        while (y<brr.length ){
            crr[i]=brr[y];
            i++;
            y++;
        }
        for(int j=0;j<crr.length;j++){
            System.out.println(crr[j]);
        }
    }
    public static void main(String[] args) {
        int arr[]={9,11,12,12,};
        int brr[]={3,5,9};
        merge(arr,brr);
    }
}
