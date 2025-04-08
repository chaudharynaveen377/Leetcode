package String;

import java.util.Arrays;
import java.util.HashMap;

public class DistinctString {
    static String newArray(String arr[],int k){
        int k1=0;
        for (int i=0;i<arr.length;i++){
            boolean flag=true;
            for (int j=0;j<arr.length;j++){
                if (j==i){
                    continue;
                }
                if (arr[i]==arr[j]){
                    flag=false;
                    break;
                }
            }
            if (flag==true){
                k1=k1+1;
                if(k==k1){
                    return arr[i];
                }
            }
        }


       return   "";
    }
//    method 2 using hash map
    static HashMap<String,Boolean> newarray(String arr[],int val){
      HashMap<String,Boolean> mp =new HashMap<>();
      for (int i=0;i<arr.length;i++){
          if (!mp.containsKey(arr[i])){
              mp.put(arr[i],true);
          }
          else mp.put(arr[i],false);
      }
       return mp;
    }
    public static void main(String[] args) {
        String str[]={"d","b","c","b","c","a"};
        int k=2;
        String str1= newArray(str,k);
        System.out.println(str1);
        HashMap<String,Boolean> mp=new HashMap<>();
        mp=newarray(str,k);
        for (String val:mp.keySet()){
            System.out.println("key :- "+val +"  value :- "+mp.get(val));
        }

    }
}
