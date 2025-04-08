package String.CodeStorywithMIke;

import java.util.ArrayList;
import java.util.Collections;

public class Min_Minutes {
    public static void main(String[] args) {

      String str[]={"23:59","00:00"};
        int H_count = 0;
        int M_count = 0;
        ArrayList<Integer>lt=new ArrayList<>();
      for (int j=0;j< str.length;j++) {
          char[] chr = str[j].toCharArray();
          int i = 0;
         H_count = 0;
         M_count = 0;
          while (chr[i] != ':') {
              H_count = H_count * 10 + (chr[i] - '0');
              i++;
          }
          while (++i < chr.length) {
              M_count = M_count * 10 + (chr[i] - '0');
          }
          int T_minute=H_count*60+M_count;
          lt.add(T_minute);
      }
        Collections.sort(lt);
      int ans= Integer.MAX_VALUE;
      for (int i=0;i<lt.size()-1;i++){
          ans=Math.min(ans,lt.get(i+1)-lt.get(i));
      }
      int n=lt.size();
      ans=Math.min(ans,1440-(lt.get(n-1)- lt.get(0)));
        System.out.println(ans);

    }
}
