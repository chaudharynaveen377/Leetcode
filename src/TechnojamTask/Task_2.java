package TechnojamTask;

public class Task_2 {
    static int climb(int n){
      if (n<0){
          return 0;
      }
      if (n==0){
          return 1;
      }
      int lt=climb(n-1);
      int rt=climb(n-2);
      return lt+rt;
    }
    public static void main(String[] args) {
        System.out.println(climb(6));

    }
}
