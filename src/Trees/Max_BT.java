package Trees;

public class Max_BT {
   static class node{
        int data;
        node left;
        node right;
        node(){

        }
        node(int data){
           this.data=data;
           this.left=null;
           this.right=null;
        }
    }
    static int maxnum(int arr[],int idx1,int idx2){
        if (idx1>=idx2){
            return -1;
        }
        int max=0;
        for (int i=idx1;i<idx2;i++){
            max=Math.max(max,arr[i]);
        }
        return max;
    }
    static int maxidx(int arr[],int max){

        for (int i=0;i<arr.length;i++){
            if (arr[i]==max){
                return i;
            }
        }
        return -1;
    }

static node maxxi(int []arr){
       if (arr==null){
           return null;
       }
       return maxbt(arr,0,arr.length);
}
    static node maxbt(int []arr,int start,int last){
       if (start>=last)return null;
       int max=Integer.MIN_VALUE;
       int maxidx=0;
       for (int i=start;i<last;i++ ){
           if (arr[i]>=max){
               max=arr[i];
               maxidx=i;
           }
       }

        node ansnode=new node(arr[maxidx]);
       ansnode.left=maxbt(arr,start,maxidx);
       ansnode.right=maxbt(arr,maxidx+1,last);
       return ansnode;


    }
    static void traversal(node root){
       if (root==null){
           return;
       }
        System.out.println(root.data);
       traversal(root.left);
       traversal(root.right);
    }
    public static void main(String[] args) {
        int arr[]={3,2,1,6,0,5};

        node root=maxxi(arr);
        traversal(root);
    }
}
