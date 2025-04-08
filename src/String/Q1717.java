package String;

import java.util.Objects;

public class Q1717 {
    public static void main(String[] args) {

        int x=5;
        int y=4;
        int p1=0;
        int p2=1;
        int ans=0;
        StringBuilder s=new StringBuilder();
        System.out.println(s.length());
        while(p2!=s.length()){
            String ch1="ba";
            int cons=y;
            if (x>y){
            ch1="ab";
            cons=x;
            }
            String ch=s.substring(p1,p2+1);
            if (Objects.equals(ch, ch1) ){
                ans=ans+cons;
               s= s.delete(p1,p2+1);
               p1=Math.max(0,p1-1);
               p2=Math.max(1,p2-1);

            }
            else {
                p1++;
                p2++;
            }
        }
         p1=0;
         p2=1;
        while(p2!=s.length()){
            String ch1="ab";
            int cons=x;
            if (x>y){
                ch1="ba";
                cons=y;
            }
            String ch=s.substring(p1,p2+1);
            if (Objects.equals(ch, ch1) ){
                ans=ans+cons;
                s= s.delete(p1,p2+1);
                p1=Math.max(0,p1-1);
                p2=Math.max(1,p2-1);
            }
            else {
                p1++;
                p2++;
            }}
        System.out.println(ans);
        System.out.println(s);

    }
}
