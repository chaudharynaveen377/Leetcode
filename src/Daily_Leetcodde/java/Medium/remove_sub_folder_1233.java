package Daily_Leetcodde.java.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class remove_sub_folder_1233 {
    public static int count1(String  s){
        int count=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='/'){
                count=count+1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
//        Input: folder = ["/a","/a/b","/c/d","/c/d/e","/c/f"]
//        Output: ["/a","/c/d","/c/f"]
       String folder[] = {"/c","/d/c/e"};
     Arrays.sort(folder);
HashMap<String,Integer> mp=new HashMap<>();
        for (int i = 0; i < folder.length; i++) {
           mp.put(folder[i],count1(folder[i]));
        }
ArrayList<String>lt=new ArrayList<>();
        for (String i:folder){
            lt.add(i);
        }
        int i=1;

      while (i<lt.size()){
             if ((lt.get(i)+"/").contains(lt.get(i-1)) && lt.get(i).substring(0,lt.get(i-1).length()).equals(lt.get(i-1))){
                 lt.remove(lt.get(i));
             }
              i++;
          System.out.println(lt.size());

      }
        System.out.println(lt);


    }
}
