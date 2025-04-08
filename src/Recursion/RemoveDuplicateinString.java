package Recursion;

public class RemoveDuplicateinString {
    static void remove(String s,int i,StringBuilder str,boolean map[]){
if (i==s.length()){
    System.out.println(str);
    return;
}
char currhar=s.charAt(i);
if (map[currhar-'a']==true){
    remove(s,i+1,str,map);

}
else {
    map[currhar-'a']=true;
    remove(s,i+1,str.append(currhar),map);
}


    }

    public static void main(String[] args) {
        String s="apnacollage";
        String ans="";
        remove(s,0 ,new StringBuilder(""),new boolean[26]);
    }
}
