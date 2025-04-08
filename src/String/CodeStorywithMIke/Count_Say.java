package String.CodeStorywithMIke;

public class Count_Say {
    static int i=0;
    static String Count(String s){
        int count=0;
        char ch=s.charAt(i);
        while (i!=s.length()){
            if (ch!=s.charAt(i)){
                break;
            }
            count++;
            i++;
        }
        return ""+count;
    }
    public static void main(String[] args) {
        String s="1";
        String ans="";
for(int j=1;j<2;j++) {
    ans="";
    while (i < s.length()) {
        char ch = s.charAt(i);
        ans = ans + Count(s) + ch;
    }
    s=ans;
    i=0;
}
        System.out.println(ans);
    }
}
