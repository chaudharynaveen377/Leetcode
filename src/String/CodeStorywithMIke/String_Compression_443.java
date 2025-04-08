package String.CodeStorywithMIke;

import java.util.ArrayList;

public class String_Compression_443 {
    public static void main(String[] args) {
//        Input: chars = ["a","a","b","b","c","c","c"]
//        Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
//        Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".
        char chars[] = {'a','a','b','b','c','c','c'};

       
        char ch=chars[0];
        int count=0;
        int indx=0;
        ArrayList<Character> lt=new ArrayList<>();
        for (int i=0;i< chars.length;i++){
         if (ch==chars[i]){
                count++;
            }
            else {
                lt.add(ch);
                lt.add((char)(count+'0'));
                count=0;
                ch=chars[i];

            }
        }
        System.out.println(lt);
        System.out.println((char)(5+'0'));
    }
}
