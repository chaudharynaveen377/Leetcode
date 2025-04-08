package leetcode;

import java.util.HashMap;

public class Lemonade_change {
    static boolean lemonade(int [] bills,HashMap<Integer,Integer> mp){
        for (int i=0;i<bills.length;i++){
            if (!mp.containsKey(bills[i])){
                mp.put(bills[i],1 );
            }
            else {
                mp.put(bills[i],mp.get(bills[i])+1 );
            }
//          ****  condition for bill ==10  *****
                if (bills[i]==10 && mp.containsKey(5) && mp.get(5)>=1){
                   mp.put(5,mp.get(5)-1);
                }
                else {
                    return false;
                }

                if (bills[i]==20 &&mp.containsKey(10) && mp.get(10)>=1 && mp.containsKey(5) && mp.get(5)>=1){
                    mp.put(10,mp.get(10)-1);
                    mp.put(5,mp.get(5)-1);
                }
                 else if (mp.containsKey(5) && mp.get(5)>=3){
                    mp.put(5, mp.get(5)-3);
                }
                 else return false;

        }
        return true;
    }
    public static void main(String[] args) {
       int [] bills = {5,5,5,10,20,20};
        HashMap<Integer,Integer> mp=new HashMap<>();

        System.out.println(lemonade(bills,mp));

    }
}
