package Bit_m;

public class Binary_to_Decimal {
    public static void main(String[] args) {
        String binary="1111";
        char arr[]=binary.toCharArray();
        int ans=0;
       for (int i=0;i<arr.length;i++){
           if (arr[arr.length-1-i]=='1'){
               ans=ans+(int)Math.pow(2,i);
           }

       }
        System.out.println(ans);
    }
}
