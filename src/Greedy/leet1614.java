package Greedy;

public class leet1614 {
    public static void main(String[] args) {
        String s="(1)+((2))+(((3)))";
        int ans=0;
        int max=0;
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (ch=='('){
                ans++;
            }
            max=Math.max(max,ans);
            if (ch==')'){
                ans--;
            }
        }
        System.out.println(max);
    }
}
