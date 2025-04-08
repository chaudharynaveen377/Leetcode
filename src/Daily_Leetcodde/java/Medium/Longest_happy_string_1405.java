package Daily_Leetcodde.java.Medium;

public class Longest_happy_string_1405 {
    static String ans="";
    static String happy(String str , int a,int b,int c){
        if (str.contains("aaa") || str.contains("bbb") || str.contains("ccc")){
            return "";
        }
        if (a<0 || b<0 || c<0){
            return "";
        }
        return "";
    }
    public static void main(String[] args) {
//        Input: a = 1, b = 1, c = 7
//        Output: "ccaccbcc"
//        Explanation: "ccbccacc" would also be a correct answer.
    }
}
