package PriorityQueue.CodewithMike;

import java.util.PriorityQueue;
import java.util.Stack;

public class ugly_numberII_264 {
    static boolean check_PrimeFactor(int n){
        while (n%2==0){
            n=n/2;
        } while (n%3==0){
            n=n/3;
        } while (n%5==0){
            n=n/5;
        }
        if (n==1){
            return true;
        }
      return false;
    }
    public static void main(String[] args) {
//        Input: n = 10
//        Output: 12
//        Explanation: [1, 2, 3, 4, 5, 6, 8, 9, 10, 12] is the sequence of the first 10 ugly numbers.
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(1);
        int n=11;
        int n1=2;
        while (pq.size()!=n){
            if (check_PrimeFactor(n1) ){
                pq.add(n1);
            }
            n1++;
        }
        System.out.println(pq);
        System.out.println(check_PrimeFactor(12));
    }
}
