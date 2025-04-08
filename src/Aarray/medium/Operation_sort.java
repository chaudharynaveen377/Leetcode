package Aarray.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Operation_sort {
    public static void main(String[] args) {
        List<Integer> lt=new ArrayList<>(Arrays.asList(4,3,2,1,-1));
//        5--3
//        6--1
//        7--0
//        8--2
//        step one create a hashmap --> getting the old indexes
        HashMap<Integer,Integer> mp=new HashMap<>();
        for (int i=0;i<lt.size();i++){
            mp.put(lt.get(i),i);
        }
        lt.sort((a,b)->a-b);
        int count=0;
        for (int i=0;i<lt.size();i++){
             if (mp.get(lt.get(i))!=i){
                 count++;
                 int temp=mp.get(lt.get(mp.get(lt.get(i))));
                mp.put(lt.get(mp.get(lt.get(i))),mp.get(lt.get(i)));
                mp.put(lt.get(i),temp);
             }
        }
        System.out.println(mp);
        System.out.println(count);
    }
}
