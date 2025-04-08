package Daily_Leetcodde.java.Medium;

import java.util.HashMap;

public class beautiful_String_2914 {
    static int count(String s,char ch){
        int ans=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)==ch){
                ans++;
            }
        }
        return ans;
    }
    static int solve(String s){
        int count1 =count(s,'1');
        int count0=count(s,'0');
int i=0,j=1;
int ans=0;
int k=0;
boolean flag=true;
while (j<s.length()){
    if ((s.charAt(i)=='0' && s.charAt(j)=='1') || (s.charAt(i)=='1' && s.charAt(j)=='0')){
        ans++;
    }
    i=j+1;
    j=i+1;


}
return ans;
    }
    public static void main(String[] args) {
        String s="100011";
//        1001 -> 1101 -> 1100
//        1001  -> 0001 ->0000

//       int count1=(mp.get('
        System.out.println(solve(s));

    }
}
