package Aarray;

public class Medium_153 {
    public static void main(String[] args) {
        int arr[]={1};
        int st=0;
        int end=arr.length-1;
        int min=Integer.MAX_VALUE;
        int dummy1=arr[st];
        int dummy2=arr[end];
        
        boolean flag=true;
        if (arr.length==1){
            System.out.println(arr[0]);
        }
        flag=(arr[st]>arr[end])?true:false;
        while (st!=end){
            if (dummy1>=arr[end] && flag==true){
                min=Math.min(min,arr[end]);
                dummy1=min;
                end--;
            }
          else  if (arr[st]<=dummy2 && flag==false){
                min=Math.min(min,arr[st]);
                arr[end]=min;
                st++;
            }
            else {
                break;
            }
        }
        System.out.println(min);
    }
}
