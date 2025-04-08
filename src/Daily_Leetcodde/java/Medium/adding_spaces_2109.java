package Daily_Leetcodde.java.Medium;

public class adding_spaces_2109 {
    static String add(String str,int arr[]){
        int idx=0;
        String ans="";
        for (int i=0;i<str.length();i++){

            if (idx<arr.length && i==arr[idx]){
                ans=ans+" ";
                idx++;
            }
            ans=ans+str.charAt(i);

        }
        return ans;
    }
    static String substring(String str,int arr[]){
//        8 9 10
        int idx=0;
        String ans="";
        for (int i:arr){
           ans=ans+ str.substring(idx,i)+" ";
           idx=i;
        }
        return ans+str.substring(idx,str.length());
    }

    public static void main(String[] args) {
//        Input: s = "LeetcodeHelpsMeLearn",
        int []spaces = {8, 13, 15};
//        Output: "Leetcode Helps Me Learn"
        System.out.println(add("LeetcodeHelpsMeLearn",spaces));
        System.out.println(substring("LeetcodeHelpsMeLearn",spaces));
    }
}
