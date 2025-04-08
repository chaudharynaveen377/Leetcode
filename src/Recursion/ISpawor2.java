package Recursion;

public class ISpawor2 {
//    check is power of 2 or not
  public   static boolean ispower(int n){
      if (n==1){
          return true;
      }
      if (n==0 || n%2!=0){
          return false;
      }
       return ispower(n/2);
}
public static void main(String[] args) {
    System.out.println(ispower(17));
}
}
