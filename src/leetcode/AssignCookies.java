package leetcode;

public class AssignCookies {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int gt[]={1,1};
        int count=0;
        int pt[]=arr;
   if (arr.length<=gt.length){
       for (int i=0;i<arr.length;i++){
           for (int j=0;j<gt.length;j++){
               if (arr[i]<=gt[j]){
                   count++;
                   break;
               }
           }
       }
   }
   else {
       for (int i=0;i<gt.length;i++){
           for (int j=0;j<arr.length;j++){
               if (arr[j]<=gt[i]){
                   count++;
                   break;
               }
           }
       }
   }
        System.out.println(count);

        }
    }

