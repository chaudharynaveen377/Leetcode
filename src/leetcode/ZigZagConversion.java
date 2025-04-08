package leetcode;

import java.util.ArrayList;
import java.util.List;

public class ZigZagConversion {
    static void zig(String s, int rows, int x, int y, String[] lst){
        char ch=s.charAt(x);
        if (x>=s.length()){
            return ;
        }
        lst[y]=lst[y]+ch;
        if (y==rows){

            return ;
        }

        zig(s,rows,x+1,y+1,lst);
        while (y!=0){
            lst[y]=lst[y]+ch;
            y--;
        }
return ;
    }
    public static void main(String[] args) {
//        P   A   H   N
//        A P L S I I G
//        Y   I   R
//        Input: s = "PAYPALISHIRING", numRows = 3
//        Output: "PAHNAPLSIIGYIR"
    }
}
