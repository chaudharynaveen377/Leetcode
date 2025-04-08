package Daily_Leetcodde.java.Medium;

import java.util.Arrays;

public class operation_3223 {
    static void freq(String s,int[]arr){
        for (int i = 0; i < s.length(); i++) {
         arr[s.charAt(i)-97]++;
        }
    }
    public static void main(String[] args) {
        String s = "aa";
        int arr[]=new int[26];
        freq(s,arr);
        System.out.println(Arrays.toString(arr));
        int ans=0;
//        for (int i = 0; i < s.length(); i++) {
//            int  end=s.length()-1 ;
//            while (i<end){
//                if (arr[s.charAt(i)-97]>=3){
//                    if (s.charAt(i)==s.charAt(end)){
//                        arr[s.charAt(i)-97]=arr[s.charAt(i)-97]-2;
//                    ans=ans+2;
//
//                        break;
//                    }
//                    end--;
//                }
//                else {break;}
//            }
//        }
//        System.out.println(s.length()-ans);
        for(int i=0;i<s.length();i++){
            if (arr[s.charAt(i)-97]>=3 && arr[s.charAt(i)-97]%2!=0){
                ans=ans+(arr[s.charAt(i)-97]-1);
                arr[s.charAt(i)-97]=1;
            }
          else   if (arr[s.charAt(i)-97]>=3 && arr[s.charAt(i)-97]%2==0){
                ans=ans+(arr[s.charAt(i)-97]-2);
                arr[s.charAt(i)-97]=2;
            }

        }
        System.out.println(s.length()-ans);
    }
}
