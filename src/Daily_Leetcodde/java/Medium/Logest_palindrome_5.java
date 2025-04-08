package Daily_Leetcodde.java.Medium;

public class Logest_palindrome_5 {
    public static boolean check(String s, int i, int j) {

        if (i >= j) return true;

        if (s.charAt(i) != s.charAt(j)) return false;

        return check(s, i + 1, j - 1);
    }


    public static String logic(String s, int i, int j,int dp[][]) {
        if (i > j || dp[i][j]!=0) return "";
          dp[i][j]=1;
        if (check(s, i, j)) {
            return s.substring(i, j + 1);
        }

        String r = logic(s, i, j - 1,dp);
        String l = logic(s, i + 1, j,dp);

        return r.length() > l.length() ? r : l;
    }
    public static void main(String[] args) {
        String s="ababdd";
        int[][] dp=new int[s.length()][s.length()];
        System.out.println(logic(s,0,s.length()-1,dp));
        System.out.println(check(s,0,5));
    }
}
