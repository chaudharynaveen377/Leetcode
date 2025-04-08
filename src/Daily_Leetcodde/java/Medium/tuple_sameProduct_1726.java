package Daily_Leetcodde.java.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class tuple_sameProduct_1726 {
    static int logic(int arr[]){
        ArrayList<Integer>lt=new ArrayList<>();

        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                lt.add(arr[i]*arr[j]);
            }
        }
        Collections.sort(lt);
        System.out.println(lt);
        int ans=0;
        int count=0;
        boolean flag=true;
        for (int i=1;i<lt.size();i++){
            if (Objects.equals(lt.get(i - 1), lt.get(i))){
                flag=true;
                if (flag){
                    count++;
                }


            }
            else {
                if (count>=2){
                    ans=ans+count+1;
                }
                else if(count==1){
                    ans=ans+1;
                }
                count=0;
                flag=false;
            }
        }

        return ans*8;
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,8,16,32};
        System.out.println( logic(arr));
    }
}
