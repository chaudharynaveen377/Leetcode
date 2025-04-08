package Daily_Leetcodde.java.Easy;

public class sum_string_1945 {
    static String sums(String s){
        int sum=0;
        for (int i=0;i<s.length();i++){
            sum=sum+s.charAt(i)-'1'+1;
        }
        return ""+sum;
    }
    public static void main(String[] args) {
        String s="iiii";
        String sum="";
        for (int i=0;i<s.length();i++){
          sum=sum+(s.charAt(i)-'a'+1);
        }
        for (int k=0;k<1;k++){
            sum=sums(sum);
        }
        System.out.println(Integer.parseInt(sum));


    }
}
