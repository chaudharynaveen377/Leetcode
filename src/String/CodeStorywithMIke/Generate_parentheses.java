package String.CodeStorywithMIke;


import java.util.*;

public class Generate_parentheses {
    static String swap(String s,int i,int j){
      char [] chr=s.toCharArray();
      char temp=chr[i];
      chr[i]=chr[j];
      chr[j]=temp;
      return new String(chr);
    }
    static char reverse(char ch){
        if (ch==')')return '(';
        else return '(';

    }
    static boolean check(String s){
//        s=((()))
        Stack sc=new Stack<>();
        sc.add(s.charAt(0));
      for (int i=1;i<s.length();i++){
          if (!sc.isEmpty()){
              if (sc.peek().equals(reverse(s.charAt(i))) && !sc.peek().equals(s.charAt(i))){sc.pop();}
              else {sc.add(s.charAt(i));}
          }
          else {
              sc.add(s.charAt(i));
          }
      }
return sc.isEmpty();
    }
    static List<String> logic(String s){
        List<String> st=new ArrayList<>();
        st.add(s);
        for (int x=0;x<st.size();x++) {
            s=st.get(x);
            for (int i = 0; i < s.length(); i++) {
                int j = i + 1;
                while (j < s.length()) {
                    String ans = swap(s, i, j);
                    if (check(ans) && !st.contains(ans)) {
                        st.add(new String(ans));
                    }
                    j++;
                }
            }
        }
       return st;
    }
    static String int_to_String(int n){
        String s="";
        for (int i=0;i<n;i++){
            s=s+"(";
        } for (int i=0;i<n;i++){
            s=s+")";
        }
        return s;
    }

    static Set<String> st1=new HashSet<>();
    static String generate_parenthese(String s,int j){
        if (j>=s.length())return s;
        if (check(s)){ st1.add(s);}
        for (int i=0;i<s.length();i++){
           String s1= swap(s,i,j);
            generate_parenthese(s1,j+1);
            swap(s1,i,j);
        }
        return s;
    }
    public static void main(String[] args) {
        String s="(((())))";
        generate_parenthese(s,1);
        System.out.println(st1);
//        System.out.println(int_to_String(4));
//        System.out.println(logic(int_to_String(4)));
    }
}
