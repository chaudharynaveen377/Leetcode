package Daily_Leetcodde.java.Medium;

public class sefting_letters_2_2381 {
static String logic(StringBuilder str,int arr[][]){
    for (int i=0;i<arr.length;i++){
        for (int j=arr[i][0];j<=arr[i][1];j++){
            if (arr[i][2]==1){
                if (str.charAt(j)=='z'){
                    str=str.replace(j,j+1,((char)(str.charAt(j) - 25))+"");
                }
                else {
                    str=str.replace(j,j+1,((char)(str.charAt(j) +1))+"");
                }
            }
            else {
                if (str.charAt(j)=='a'){
                    str=str.replace(j,j+1,((char)(str.charAt(j) + 25))+"");
                }
                else {
                    str=str.replace(j,j+1,((char)(str.charAt(j) - 1))+"");
                }
            }
        }
    }
    return str.toString();
}

    public static void main(String[] args) {
       String s = "dztz";
        int n=s.length();
       int [][]shifts ={{0,0,0},{1,1,1}};

       int diff[]=new int[s.length()];
       for (int [] val:shifts){
           int l=val[0];
           int r=val[1];
           int dir=val[2];
           int x;
           if (dir==0){
               x=-1;
           }else {x=1;}
           diff[l]+=x;
           if (r+1<n){
               diff[r+1]-=x;
           }
       }
//       find cumulative sum to find the resultant change inn index i;
        for (int i = 1; i < n; i++) {
            diff[i]+=diff[i-1];
        }

//    now apply shift change
StringBuilder ans=new StringBuilder();
for (int i=0;i<n;i++){
    int shift=diff[i]%26;
    if (shift<0){
        shift+=26;
    }
    char newChar = (char) ('a' + (s.charAt(i) - 'a' + shift) % 26);
    ans.append(newChar); // Append the shifted chara
}
        System.out.println(ans);
    }
}
