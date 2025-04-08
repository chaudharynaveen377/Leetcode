package Daily_Leetcodde.java.Medium;

import java.util.HashMap;

public class Bitwise_AND_2275 {
    public static void main(String[] args) {
       int [] candidates = {10,72,58,33,36,70,12,88,9,48,78,97,87,19,78,9,47,73};
        int ans=0;
        int ans1=0;
        for (int i=0;i<candidates.length;i++){
            ans=0;
            int x=candidates[i];
            for (int j=i;j<candidates.length;j++){
                if ((x&candidates[j])>0){
                    x=(x&candidates[j]);
                    ans++;
                    ans1=Math.max(ans1,ans);

                }
            }
        }
        System.out.println(ans1);

        }

    }

