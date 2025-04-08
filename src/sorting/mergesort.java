package sorting;

public class mergesort {
    static void merge(int arr[],int l,int mid,int r){
        int n1=mid-l+1;
        int n2=r-mid;
        int[]left=new int[n1];
        int[]right=new int[n2];
        int i,j,k;
        for(i=0;i<n1;i++) {left[i]=arr[l+i];}
        for (j=0;j<n2;j++) {right[j]=arr[mid+1+j];}
        i=0;j=0;k=l;
        while (i<n1 && j<n2){
            if(left[i]<right[j]){
                arr[k++]=left[i++];
            }
            else {
                arr[k++]=right[j++];
            }
        }
            while (i<n1){
                arr[k++]=left[i++];
            }
            while (i<n2){
                arr[k++]=right[j++];
            }
        }
    static void displayArr(int[] arr){
        for (int val: arr){
            System.out.println(val);
        }
    }
    public static void mergesortalg(int arr[],int l,int r){
       if (l>=r) return;
       int mid= (l+r)/2;
        mergesortalg(arr,l,mid);
        mergesortalg(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
    public static void main(String[] args) {
int arr[]={9,8,7,6,5,4,3,2,1,0};
//merge sorting algorithm  worstcase--> nlogn
        mergesortalg(arr,0,arr.length-1);
        displayArr(arr);
    }
}
