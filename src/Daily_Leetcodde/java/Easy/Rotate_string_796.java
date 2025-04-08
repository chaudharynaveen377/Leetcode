package Daily_Leetcodde.java.Easy;

public class Rotate_string_796 {
    static boolean rotate(String s,String goal){
        if (s.length()!=goal.length())return false;
        int start=0;
        for (int j=0;j<s.length();j++) {
            boolean flag=true;
            if (goal.charAt(j)==( s.charAt(0))) {
                start = j;
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) != goal.charAt(start++)) {
                        flag=false;
                        break;
                    }
                    if (start >= goal.length()) {
                        start = 0;
                    }
                }
            }
            else {
                flag=false;
            }
            if (flag==true){
               return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
       String s = "abcde", goal = "cdeab";
        System.out.println(rotate(s,goal));
        s=s+s;
        System.out.println(s.contains(goal));


    }
}
