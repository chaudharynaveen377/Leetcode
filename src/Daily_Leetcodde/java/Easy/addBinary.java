package Daily_Leetcodde.java.Easy;

public class addBinary {
    static StringBuilder logic2(StringBuilder st,int i) {
        int idx = i ;
        while (true) {
            if (idx>=st.length()){
               st.append('1');
                break;
            }
            if (st.charAt(idx)=='1'){
                st.setCharAt(idx,'0');
            }
            else{
                st.setCharAt(idx,'1');
                break;
            }
          idx++;
        }
        return st;
    }
    static char logic(char a,char b){
        if (a=='0' && b=='0') return '0';
        if (a=='0' && b=='1') return '1';
        if (a=='1' && b=='0') return '1';
        return '0';
    }
    static String binaryadd(String a,String b){
        StringBuilder a1=new StringBuilder(a).reverse();
        StringBuilder b1=new StringBuilder(b).reverse();
       if (a1.length()<b1.length()){
           StringBuilder temp=new StringBuilder();
           temp= a1;
           a1=b1;
           b1=temp;
       }
        int maxidx= Math.max(a.length(), b.length());
        int minidx= Math.min(a.length(), b.length());
        int i=0;
        String ans="";


//        merging
       while (i<maxidx){
           if (i>=minidx){
               ans=ans+a1.charAt(i);
           }
           else {
               if (a1.charAt(i)!='1' || b1.charAt(i)!='1'){
               ans=ans+logic(a1.charAt(i),b1.charAt(i));
               }
               else {
                  logic2(a1,i);

                   ans=ans+'0';
               }
           }
           i++;
            maxidx= a1.length();
       }
StringBuilder an=new StringBuilder(ans);
        return an.reverse().toString();
    }
    public static void main(String[] args) {
      String  a = "1", b = "111";
        System.out.println(binaryadd(a,b));


    }
}
