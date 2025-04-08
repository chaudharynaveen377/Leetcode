package Backtracking.medium;
public class Arraybkt {
     static void add(int []arr,int i,int val){
         if (i==arr.length){
        return;
         }
         arr[i]=val;
         add(arr,i+1,val+1);
         arr[i]=arr[i]-2;

     }
    public static void main(String[] args) {
        int arr[]=new int[6];
        add(arr,0,0);
        for (int val:arr){
            System.out.println(val);
        }
    }
}
