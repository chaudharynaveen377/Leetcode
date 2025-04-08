package Daily_Leetcodde.java.Easy;

public class fancyString_1957 {
    public static void main(String[] args) {
      String s = "aaabbbbavaaa";

      StringBuilder str=new StringBuilder(s);
      for (int i=s.length()-1;i>=2;i--){
          if (str.charAt(i-2)==str.charAt(i-1) && str.charAt(i-1)==s.charAt(i)){
             str.deleteCharAt(i);
          }
      }
        System.out.println(str.toString());
    }
}
