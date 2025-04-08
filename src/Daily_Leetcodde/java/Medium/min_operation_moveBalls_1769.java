package Daily_Leetcodde.java.Medium;

import java.util.Arrays;

public class min_operation_moveBalls_1769 {

    public static void main(String[] args) {
        String boxes="001011";
        int ans[]=new int[boxes.length()];
        for (int i=0;i<boxes.length();i++){
            int oper=0;
            for (int j=0;j<boxes.length();j++){
               if (boxes.charAt(j)=='1'){
                   oper=oper+Math.abs(j-i);
               }
            }
            ans[i]=oper;
        }
        System.out.println(Arrays.toString(ans));
    }
}
