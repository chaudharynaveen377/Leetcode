package sorting;

public class Practice {
    static void merge(int[] arr,int firstIdx,int mid,int last){
        int []firstarr=new int[mid-firstIdx+1];
        int []lastarr=new int[last-mid];
        for (int i=0;i<firstarr.length;i++){
            if (i<mid){
                firstarr[i]=arr[firstIdx+i];
            }else {
                lastarr[i-mid]=arr[i];
            }
        }
        int newarr[]=new int[firstarr.length +lastarr.length];
        int p1=0,p2=0;
        int idx=0;
        while (p1<firstarr.length && p2<lastarr.length){
            if (firstarr[p1]<lastarr[p2]){
                newarr[idx++]=firstarr[p1++];

            }else {
                newarr[idx++]=lastarr[p2++];
            }
        }
        while (p1<firstarr.length){
            newarr[idx++]=firstarr[p1++];
        }while (p2<lastarr.length){
            newarr[idx++]=lastarr[p2++];
        }

        

//        print(newarr);
//        return newarr;
    }
    static void print(int arr[]){
        for (int val :arr){
            System.out.print(" "+val+" ");
        }
    }
    static void mergesort(int []arr,int fstidx ,int lstidx){

        if (fstidx>=lstidx){
            return;
        }
        int mid=(fstidx+lstidx)/2;
        mergesort(arr,fstidx,mid);
        mergesort(arr,mid+1,lstidx);
      merge(arr,fstidx,mid,lstidx);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,1,6,7,8,9,10};
        int brr[]={0,3,5,7,8,9};
//        merge(arr,0,4,arr.length-1);
        mergesort(arr,0,arr.length-1);
        print(arr);
//        case 1 :- when both have same length
//        by using binary search
//

        System.out.println("india");
////        Bubble Sort
//        //            int max=Integer.MIN_VALUE;
//        for (int i=0;i<arr.length;i++){
//            for (int j=i+1;j<arr.length;j++){
//                if (arr[i]>arr[j]){
//                    int temp=arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                }
//            }
//        }
//        print(arr);
    }
}
