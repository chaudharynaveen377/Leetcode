package Backtracking.Code_story;

public class Word_search_79 {
   static boolean check(char[][]arr,int i,int j,int idx,char[] wrd){
        if (idx== wrd.length){
            return true;
        }
        if (i<0 || j<0 || i>=arr.length || j>=arr[0].length || arr[i][j]=='$' || arr[i][j]!=wrd[idx]){
            return false;
        }
        char temp=arr[i][j];
        arr[i][j]='$';
      boolean a=  check(arr,i+1,j,idx+1,wrd);
     boolean b=   check(arr,i-1,j,idx+1,wrd);
      boolean c=  check(arr,i,j+1,idx+1,wrd);
       boolean d= check(arr,i,j-1,idx+1,wrd);
        arr[i][j]=temp;
        return a|| b||c||d;
    }
    public static void main(String[] args) {
//        a char 2d array
        String word="b";
        char[] wrd=word.toCharArray();
         char arr[][]={{'a','b','c','e'},{'s','f','c','s'},{'a','d','e','e'}};
         for (int i=0;i<arr.length;i++){
             for (int j=0;j<arr[0].length;j++){
                 if (arr[i][j]==wrd[0] && check(arr,i,j,0,wrd)){
                     System.out.println(true);
                     return;
                 }
             }
         }

    }
}
