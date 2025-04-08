package forPrectice;

import java.util.ArrayList;

public class Nrounds {
    static ArrayList<Integer> makelst(int n){
        ArrayList<Integer> lt=new ArrayList<>();
        for (int i=1;i<=n;i++){
            lt.add(i);
        }
        return lt;
    }

    static void nrounds(ArrayList<Integer> lt,int n, int k){
        System.out.println(lt.get(1));
        int idx=0;
        while (lt.size()!=1){
            idx=((idx+k-1)%lt.size());
            lt.remove(idx);

        }
        System.out.println(lt);

    }
    public static void main(String[] args) {
        nrounds(makelst(5),5,3);

    }
}
