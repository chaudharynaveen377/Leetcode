package Daily_Leetcodde.java.Medium;

public class Seperate_black_white_2938 {
    public static void main(String[] args) {
        String str="100";
        char[] chr=str.toCharArray();
        //        0101001  0011001  0001101  0001101 0000111 0000111
//boolean flag=false;
//int ans=0;
//for (int j=0;j<chr.length;j++) {
//    for (int i = 0; i < chr.length - 1; i++) {
//        if (chr[i] == '1' && chr[i + 1] == '0') {
//            ans++;
//            flag=true;
//            char temp = chr[i];
//            chr[i] = chr[i + 1];
//            chr[i + 1] = temp;
//        }
//    }
//    if (flag==false){
//        break;
//    }
//}
//        System.out.println(ans);
         int ans=0,count=0;
         int i=0;
         while (i< chr.length){
             if (chr[i]=='1'){
                 break;
             }
             i++;
         }
        System.out.println(i);
         int j=i+1;
//        String str="1001001";
         while (j<chr.length){
             if ( chr[j] == '0') {
                 count=j-i;
                 ans=ans+count;
                 i++;
             }
             j++;
         }
        System.out.println(ans);




    }
}
