package HashSet.java;

import java.util.HashSet;

public class longestCOnsecutive {
    public static void main(String[] args) {
       int [] nums ={-1,-2,-3};
        HashSet<Integer>ht=new HashSet<>();
       for (int add:nums){
           ht.add(add);
       }
       int ans=1,ans1=1;
       for (int add:ht){
           if (ht.contains(add+1)) {
               while (ht.contains(add + 1)) {
                   ans++;
//              System.out.println(ans);
                   add++;
               }
               if (ans >= ans1) {
                   ans1 = ans;
                   ans = 0;
               }
               ans = 0;
           }

       }
        System.out.println(ans1);
    }
}
