package Daily_Leetcodde.java.Medium;

public class A_875 {
    static int min(int arr[]){
        int ans=min(arr);
        for (int val:arr){
            ans=Math.min(ans,val);
        }
        return ans;
    }
    static int logic(int arr[],int h){
        int val=min(arr);
        boolean flag=true;
        while (true) {
            int k=0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % val == 0) {
                    k = k + arr[i] / val;
                } else if (arr[i] % val != 0) {
                    k = k + arr[i] / val + 1;
                }
                if (k > h) {
                    break;
                }
            }
            if (k<h){
                flag=false;
            }
            if (k==h){
                return val;
            }
            val= flag==false ? val-1 : val+1;
        }

    }
    public static void main(String[] args) {
        int arr[]={3,6,7,11};int h=8;
        System.out.println(logic(arr,h));
    }
}
