package Daily_Leetcodde.java.Medium;

public class Take_k_2516 {
    static int take(String s,int arr[],int count ,int i,int j,int k){
        if (arr[0]>=k &&arr[1]>=k && arr[2]>=k){
            return count;
        }
        if (i>=j){
            return Integer.MAX_VALUE;
        }
        int left=0;
        if (s.charAt(i)=='a' ){arr[0]++;
            left=take(s,arr,count+1,i+1,j,k);

        }
            if (s.charAt(i)=='b' ){arr[1]++;
                left=take(s,arr,count+1,i+1,j,k);
            }
            if (s.charAt(i)=='c' ){arr[2]++;      left=take(s,arr,count+1,i+1,j,k);
            }
            int right =0;
            if (s.charAt(j)=='a'  ){arr[0]++;  right=take(s,arr,count+1,i,j-1,k);}
            if (s.charAt(j)=='b'  ){arr[1]++;  right=take(s,arr,count+1,i,j-1,k);}
            if (s.charAt(j)=='c'){arr[2]++;  right=take(s,arr,count+1,i,j-1,k);}

        return Math.min(left,right);

    }
    public static void main(String[] args) {
        String s="aabaacabc";
        System.out.println(take(s,new int[3],0,0,s.length()-1,2));

    }
}
