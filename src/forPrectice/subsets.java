package forPrectice;

public class subsets {
    static String sub(String s,int i,String ans){
        if (i>=s.length()){
            return "";
        }
        ans=ans+s.charAt(i);
        if (ans.length()==3){
            System.out.println(ans);
        }
        System.out.println(ans);
        sub(s,i+1,ans);
        sub(s,i+2,ans);
return ans;
    }
    public static void main(String[] args) {
        String s="ABC";
sub(s,0,"");
    }
}
