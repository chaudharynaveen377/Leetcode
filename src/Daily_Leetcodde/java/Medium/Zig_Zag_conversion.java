package Daily_Leetcodde.java.Medium;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java .util.*;
//import static jdk.internal.org.jline.reader.impl.LineReaderImpl.CompletionType.List;

public class Zig_Zag_conversion {
    static String logic(String s,int rows){
        if (rows==1){return s;};
        ArrayList<ArrayList<Character>> lt=new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            ArrayList<Character> lt1=new ArrayList<>();
            lt.add(lt1);
        }
        boolean flag=true;
        int i=0,j=0;
        while (j<s.length()){
            lt.get(i).add(s.charAt(j));
            if (flag==true){
                i++;
            }
            if (flag==false){
                i--;
            }
            if (i==rows-1){
                flag=false;
            }
            if (i==0){
                flag=true;
            }

            j++;
        }


        String ans = lt.stream()
                .flatMap(List::stream)
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println(ans);
       return (ans);

    }
    public static void main(String[] args) {
        String s="PAYPALISHIRING";
        int rows=3;
        logic(s,4);
    }

}
