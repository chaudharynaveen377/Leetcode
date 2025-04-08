package PriorityQueue;

import java.util.PriorityQueue;

public class objClass {
    static class student implements Comparable<student>{
        String name;
        int rank;
        student(String name,int rank){
            this.name=name;
            this.rank=rank;
        }
      @Override
      public int compareTo(student s2){
            return this.rank-s2.rank;
      }

    }
    public static void main(String[] args) {
        PriorityQueue<student> pq=new PriorityQueue<>();
        pq.add(new student("a",1));
        pq.add(new student("b",11));
        pq.add(new student("c",15));
        pq.add(new student("d",10));
        while (!pq.isEmpty()){
            System.out.println(pq.peek().rank);
            pq.remove();
        }
    }
}
