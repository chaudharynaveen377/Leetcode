package Recursion;

public class ReverseString {
    static String reverse(String arr,int x){
    if (x>=arr.length()){
    return "";
}
        return   reverse(arr,x+1)+arr.charAt(x);

    }
    public static void main(String[] args) {
        String arr="abcdefghijklmnopqrstuvwxyz";
        System.out.println( reverse(arr,0));
    }
}
