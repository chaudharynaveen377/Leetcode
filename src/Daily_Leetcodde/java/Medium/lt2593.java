package Daily_Leetcodde.java.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class lt2593 {
//    static boolean check1(boolean[]arr){
//        for (int i=0;i<arr.length;i++){
//            if (arr[i]==false){
//                return false;
//            }
//        }
//        return true;
//    }
//    static boolean[] check(boolean arr[],int idx){
//        if (idx+1<arr.length && idx-1>=0){
//            arr[idx]=true;
//            arr[idx+1]=true;
//            arr[idx-1]=true;
//        }  else if (idx+1<arr.length && idx-1<0){
//            arr[idx]=true;
//            arr[idx+1]=true;
//        }
//        else if (idx+1>=arr.length && idx-1>=0){
//            arr[idx]=true;
//            arr[idx-1]=true;
//        }
//        else {
//            arr[idx]=true;
//        }
//        return arr;
//    }
//    static int find_score(int arr[]){
//        int sum=0;
//        int index=0;
//        boolean arr1[]=new boolean[arr.length];
//        while (check1(arr1)==false){
//            index=min(arr,arr1);
//            sum=sum+arr[index];
//         arr1= check(arr1,index);
//        }
//return sum;
//    }
//
//    private static int min(int[] arr,boolean [] arr1) {
//        int index=Integer.MAX_VALUE;
//        int idx=0;
//        for (int i=0;i<arr.length;i++){
//            if (arr[i]<=index && !arr1[i]){
//                index=arr[i];
//                idx=i;
//            }
//        }
//        return idx;
//    }

    static int binarySearch(ArrayList<ArrayList<Integer>> lt,int target){
        int left=0;
        int right=lt.size()-1;
        while (left<=right){
            int mid=left+(right-left)/2;
            if (lt.get(mid).get(0)==target){
                int x=lt.get(mid).get(1);
                  lt.remove(mid);
                return x;
            }else if (lt.get(mid).get(0)>target){
                right=mid-1;
            }else {
                left=mid+1;
            }
        }
        return -1;
    }
static long m2(int arr[]){
        ArrayList<ArrayList<Integer>> lt=new ArrayList<>();
        for (int i=0;i<arr.length;i++){
         ArrayList<Integer>lt1=new ArrayList<>();
         lt1.add(arr[i]);
         lt1.add(i);
         lt.add(lt1);
        }
    Collections.sort(lt, (a, b) -> Integer.compare(a.get(0), b.get(0)));
    PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->a-b);
    for (int i=0;i<arr.length;i++){ pq.add(arr[i]);}
   long count=0;
   while (!pq.isEmpty()){
       boolean flag=false;
       int min=pq.poll();

       int idx=binarySearch(lt,min);
       if (idx+1<arr.length && idx-1>=0 && arr[idx]!=-1){
           arr[idx]=-1;
           arr[idx+1]=-1;
           arr[idx-1]=-1;
           flag=true;
       }  else if (idx+1<arr.length && idx-1<0 && arr[idx]!=-1){
           arr[idx]=-1;
           arr[idx+1]=-1;
           flag=true;
       }
       else if (idx+1>=arr.length && idx-1>=0 && arr[idx]!=-1){
           arr[idx]=-1;
           flag=true;
           arr[idx-1]=-1;
       }
       else if (arr[idx]!=-1){
           flag=true;
           arr[idx]=-1;
       }

       if (flag==true){
           count=count+min;
       }
   }
return count;
}
    public static void main(String[] args) {
int[] nums = {2,1,3,4,5,2};
        ArrayList<Integer> lt=new ArrayList<>();

        System.out.println(m2(nums));
    }
}
