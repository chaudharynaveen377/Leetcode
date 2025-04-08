package leetcode;

public class MinimumRemovetoMakeValidParentheses1249 {
    static String vldprthesis(String s,String ans){
        int x=0;
//        a))((b(c)d"
        boolean flag=true;
        for (int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if (ch == ')' && flag == true) {
                x = 0;
                continue;
            }
            if (ch == '(' && flag == true) {
                x = 0;
                continue;
            }
                if (ch==')' && flag==false){

                    if (x > 0) {
                        ans = ans + ch;
                    }
                    x--;
                    continue;
                }
            if (ch=='(' && flag==false){

                if (x > 0) {
                    ans = ans + ch;
                }
                x++;
                continue;
            }


            if (ch == '(') {
                flag = false;
                ans=ans+ch;
                x++;
                continue;
            }

            if (x > 0) {
                ans = ans + ch;
                continue;
            }
            if (ch!=')'&& ch!='(' ){
                ans=ans+ch;
            }
        }
        System.out.println(ans);
        return ans;
    }
    public static void main(String[] args) {
        vldprthesis("a))((b(c)d","");
//        a)b(c)d"

    }
}
