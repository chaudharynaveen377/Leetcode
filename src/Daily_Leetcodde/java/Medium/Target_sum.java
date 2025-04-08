package Daily_Leetcodde.java.Medium;

public class Target_sum {
    static int count=0;
    static void target(int arr[],int i,int sum,int target){
        if (i>=arr.length){
            return;
        }
        if (sum==target){
            count++;
            return;
        }
        for (int k=0;k<arr.length;k++){
            arr[k]=-arr[k];
            target(arr,i+1,sum+2*arr[k],target);

            arr[k]=-arr[k];
        }
    }
    static int logic(int arr[],int i,int sum,int target){

        if (i>=arr.length){
            if (sum==target)return 1;
            return 0;
        }
           int  left = logic(arr, i + 1, sum -  arr[i], target);
           int  right = logic(arr, i + 1, sum +arr[i] , target);
        return left + right;
    }
    static int sum(int arr[]){
        int sum=0;
        for(int val:arr){
            sum=sum+val;
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[]={0,0,0,0,0,1};
        int target=0;
            target=target+logic(arr,0,0,1);

//        System.out.println(logic(arr,0,1,1));\
        System.out.println(target);
    }
}
