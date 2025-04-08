package leetcode;
public class romanToNum{
    public static void main(String[] args) {
       String s="MIX";
        System.out.println( s.indexOf("c"));
        StringBuilder st=new StringBuilder(s);

       int count=0;
       for (int i=0;i<s.length();i++){
         if (s.charAt(i)=='I'){count=count+1;} if (s.charAt(i)=='V'){ count=count+5;}if (s.charAt(i)=='X'){count=count+10;}
           if (s.charAt(i)=='L'){count=count+50;}if (s.charAt(i)=='C'){count=count+100;}if (s.charAt(i)=='D'){count=count+500;}
           if (s.charAt(i)=='M'){count=count+1000;}
       }
       if (st.indexOf("IV")>=0){
            count=count-2;}
        if (st.indexOf("IX")>=0){
            count=count-2;}

        if (st.indexOf("XC")>=0){
            count=count-2*10;}
        if (st.indexOf("XL")>=0){
            count=count-2*10;}
        if (st.indexOf("CD")>=0){
            count=count-200;}
        if (st.indexOf("CM")>=0){
            count=count-200;}
        if (st.indexOf("DM")>=0){
            count=count-1000;}


        System.out.println(count);
    }
}
