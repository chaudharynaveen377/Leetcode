package String.CodeStorywithMIke;

public class Extra_Character_string_2707 {
    static String [] circuler_array(String arr[] ,int i){
        int temp=i;
        int curr=0;
        String newrr[]=new String[arr.length];
        while (curr<arr.length-i){
           newrr[curr++]=arr[temp++];
        }
        while (i>0){
            newrr[curr++]=arr[--i];

        }
        return newrr;
    }
    static void desp(String arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
//        Input: s = "leetscode", dictionary = ["leet","code","leetcode"]
        String s="dwmodizxvvbosxxw";
        String dict[]={"ox","lb","diz","gu","v","ksv","o","nuq","r","txhe","e","wmo","cehy","tskz","ds","kzbu"};
      circuler_array(dict,6);
        int ans=s.length();
        for (int i=0;i< dict.length;i++){
dict=circuler_array(dict,i);
            String p=s;
            for (int j=0;j< dict.length;j++){
                if (p.contains(dict[j])){
                    p=p.replace(dict[j],"");
                    System.out.println(p);
                    ans=Math.min(ans,p.length());
                }
            }
        }
        System.out.println(ans);

    }
}
